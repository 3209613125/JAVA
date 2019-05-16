//submit()方法用于提交需要返回值的任务。线程池会返回一个future类型的对象，通过这个future对象可以判断任务是
否执行成功，并且可以通过future的get()方法来获取返回值，get()方法会阻塞当前线程直到任务完成，而使用
get（long timeout，TimeUnit unit）方法则会阻塞当前线程一段时间后立即返回，这时候有可能任务没有执行完。



import java.util.concurrent.*;
class CallableThread implements Callable<String> {
 @Override
 public String call() throws Exception {
  for (int i = 0; i < 50; i++) {
   System.out.println(Thread.currentThread().getName() + "、" + i);
  }
  return Thread.currentThread().getName()+"任务执行完毕";
 }
}
class Test {
 public static void main(String[] args){
  CallableThread callableThread = new CallableThread();
  ThreadPoolExecutor threadPoolExecutor =
          new ThreadPoolExecutor(3,5,2000,TimeUnit.MILLISECONDS,
                  new LinkedBlockingDeque<Runnable>());
  for (int i = 0; i < 5; i++) {
   Future<String> future = threadPoolExecutor.submit(callableThread);
   try {
    String str = future.get();
    System.out.println(str);
   } catch (InterruptedException e) {
    e.printStackTrace();
   } catch (ExecutionException e) {
    e.printStackTrace();
   }
  }
 }
}


