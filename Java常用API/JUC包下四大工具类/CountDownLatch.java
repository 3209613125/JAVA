import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Information:
 * @Author: HeHaoYuan
 * @Date: Created at 13:18 on 2019/10/11
 * @Package_Name: Main
 */

class Test implements Runnable{
    CountDownLatch countDownLatch;
    public Test(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始跑步!");
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName()+"到达终点!");
           // System.out.println(countDownLatch.getCount());
            countDownLatch.countDown();//将count的值每次减1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class TestDemo{
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        Test test = new Test(countDownLatch);
        System.out.println("比赛开始!");
        new Thread(test,"运动员A").start();
        new Thread(test,"运动员B").start();
        new Thread(test,"运动员C").start();
        new Thread(test,"运动员D").start();
        countDownLatch.await();//当count的值为0的时候执行以下代码
        System.out.println("比赛结束!");
    }

}
