import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Author: secondriver
 * Created: 2019/5/9
 */
 class TestThreadPool {

 public static void main(String[] args) {

  ExecutorService executorService = new ThreadPoolExecutor(
          5,
          8,
          1,
          TimeUnit.MINUTES,
          new ArrayBlockingQueue<>(10),
          new ThreadFactory() {
           private final AtomicInteger id = new AtomicInteger(0);

           @Override
           public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setName("Thread-Execute-Task-" + id.getAndIncrement());
            return thread;
           }
          }
  );
//        for (int i = 0; i < 20; i++) {
//            executorService.execute(new Runnable() {
//                @Override
//                public void run() {
//
//                    System.out.println(Thread.currentThread().getName() + " " + LocalDateTime.now());
//                }
//            });
//        }
  final List<Future<String>> futureList = new ArrayList<>();
  for (int i = 0; i < 10; i++) {
   Future<String> future = executorService.submit(() -> {
    Thread.sleep(new Random().nextInt(3000));
    return Thread.currentThread().getName() + " " + LocalDateTime.now();
   });
   futureList.add(future);
  }

  for (Future<String> future : futureList) {
   try {
    System.out.println(future.get());
   } catch (InterruptedException e) {
    e.printStackTrace();
   } catch (ExecutionException e) {
    e.printStackTrace();
   }
  }

  executorService.shutdownNow();

  System.out.println("是否shutdown:" + executorService.isShutdown());
  System.out.println("是否terminated:" + executorService.isTerminated());

  while (true){
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
   System.out.println("是否terminated:" + executorService.isTerminated());
  }
 }
}
