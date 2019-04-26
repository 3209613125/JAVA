public class TestSleep {
    
    public static void main(String[] args) {
        Runnable runnable = new MySleepRunnable();
        new Thread(runnable, "Thread-A").start();
        new Thread(runnable, "Thread-B").start();
        new Thread(runnable, "Thread-C").start();
    }
}


class MySleepRunnable implements Runnable {
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            Thread.yield();
            System.out.println("当前线程是：" + Thread.currentThread().getName() + " " + i);
        }
    }
}
