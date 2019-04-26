public class TestJoin {
    
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getName() + " main方法开始执行");
        
        Runnable runnable = new MyJoinRunnable();
        Thread thread = new Thread(runnable, "Thread-A");
        thread.start();
        
        //希望Thread-A执行完成之后，继续执行main方法中的代码
        try {
            thread.join();//等待线程thread执行完毕
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
    
        System.out.println(Thread.currentThread().getName() + " main方法结束执行");
    }
}

class MyJoinRunnable implements Runnable {
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 执行开始");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 执行完成");
    }
}
