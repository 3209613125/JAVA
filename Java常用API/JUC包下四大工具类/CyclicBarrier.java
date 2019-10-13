import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * @Information:
 * @Author: HeHaoYuan
 * @Date: Created at 13:18 on 2019/10/11
 * @Package_Name: Main
 */

class Test implements Runnable{
   private CyclicBarrier cyclicBarrier;
    public Test(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在写入数据。。。");
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName()+"数据已经写入完毕，等待其他线程写入。。。");
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("所有线程已经写入完毕，继续恢复执行！");


    }
}
class TestDemo{
        public static void main(String[] args) {
            CyclicBarrier cyclicBarrier = new CyclicBarrier(4
                    ,() -> {
                System.out.println("当前线程为:"+Thread.currentThread().getName());
            });
         Test test = new Test(cyclicBarrier);
            for (int i = 0; i < 4; i++) {
                new Thread(test,"写线程"+(i+1)).start();
            }
        }
}
