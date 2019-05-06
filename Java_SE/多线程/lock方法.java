import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
* @Author: HeHaoYuan
* @Date: 2019/5/6
* @Description:


*/
class TestLockThread {

 public static void main(String[] args) {
  //lock锁不能随便被修改，所以要加上final来修饰
  final Lock lock  = new ReentrantLock();
  Runnable runnable = new MyLockRunnable(lock);
  new Thread(runnable, "黄牛A").start();
  new Thread(runnable, "黄牛B").start();
  new Thread(runnable, "黄牛C").start();

  //A B C lock
  //lock 通过构造方法传入
  lock.lock();
  try {
   System.out.println(Thread.currentThread().getName());
   Thread.sleep(2000);
  } catch (InterruptedException e) {
   e.printStackTrace();
  } finally {
   lock.unlock();
   System.out.println("main结束");
  }

 }

}

class MyLockRunnable implements Runnable {

 private final Lock lock ;//= new ReentrantLock();
 private int tick = 10;

 MyLockRunnable(Lock lock) {
  this.lock = lock;
 }

 @Override
 public void run() {
  while (this.tick > 0) {
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }

   //tick 访问并且修改
   lock.lock();
   try {
    //要进行同步的代码
    if (this.tick > 0) {
     System.out.println(Thread.currentThread().getName() + " 卖票， 剩余 ：" + (--this.tick));
    }
   } finally {
    lock.unlock();
   }

  }
 }
}
