public class TestThreadStop {
    
    public static void main(String[] args) {
        
        Runnable runnable = new MyRunnableStopFlag();
        Thread thread = new Thread(runnable);
        thread.setName("Thread-Flag");
        thread.start();
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //CCE
        //((MyRunnableStopFlag) runnable).setFlag(false);
//        thread.stop();
        thread.interrupt();
        System.out.println("主方法结束");
    }
    
}

class MyRunnableStopFlag implements Runnable {
    
    private boolean flag = true;
    
    @Override
    public void run() {
        int i = 0;
        while (flag) {
            try {
                //阻塞
                Thread.sleep(1000);
                
                //code1
                //code2
                //判断当前线程是否中断
                boolean bool = Thread.currentThread().isInterrupted();
                if (bool) {
                    System.out.println("非阻塞状态下的线程状态：" + bool);
                    //通过中断的状态，自己来决定如何处理程序
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " " + i++);
            } catch (InterruptedException e) {
                e.printStackTrace();//sleep中断
                boolean bool = Thread.currentThread().isInterrupted();
                System.out.println(bool);
                return;
            }
            
        }
    }

//    public boolean isFlag() {
//        return flag;
//    }
    
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
