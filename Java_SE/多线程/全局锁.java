class Sync {
    public void test() {
        synchronized(Sync.class) {
            System.out.println("test方法开始，当前线程为 " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test方法结束，当前线程为 " + Thread.currentThread().getName());
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        Sync sync = new Sync() ;
        sync.test();
    }
}

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 4 ; i++) {
            Thread thread = new MyThread() ;
            thread.start();
        }
    }
}
