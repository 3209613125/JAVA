public class TestTickThread {
    
    public static void main(String[] args) {
        Runnable runnable = new MyTickRunnable();
        new Thread(runnable, "Thread-黄牛A").start();
        new Thread(runnable, "Thread-黄牛B").start();
        new Thread(runnable, "Thread-黄牛C").start();
        
    }
}


class MyTickRunnable implements Runnable {
    
    private int tick = 10;
    
    @Override
    public void run() {
        while (this.tick > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            //--this.tick
            //this.tick-1
            //this.tick = this.tick-1
            //this.tick
            //多线程现在共享Runnable
            synchronized(this) {
                if (this.tick > 0) {
                    System.out.println(Thread.currentThread().getName() + " 买票， 剩余 " + (--this.tick));
                }
            }
        }
    }
}
