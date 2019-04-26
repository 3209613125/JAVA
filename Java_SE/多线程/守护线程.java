public class TestDaemon {
    
    public static void main(String[] args) {
        
        Thread threadA = new Thread(new MyDaemonRunnable(), "Thread-A");
        //创建线程默认就是用户线程
        //设置线程为守护线程需要调用setDaemon(true),必须在start之前调用
        System.out.println("主线程开始");
        threadA.setDaemon(true);
        threadA.start();
        
        Thread threadB = new Thread(new MyDaemonRunnable(), "Thread-B");
        threadB.start();
        
        //主线程休眠
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.interrupt();//中断
        //threadB结束
        System.out.println("主线程结束");
    }
    
    
}

class MyDaemonRunnable implements Runnable {
    
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(Thread.currentThread().getName() + "发生中断");
                break;
            }
            System.out.println("线程名-" + Thread.currentThread().getName() + " 是否是守护线程：" +
                    Thread.currentThread().isDaemon());
        }
    }
}
