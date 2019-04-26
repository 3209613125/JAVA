public class TestPriority {
    
    public static void main(String[] args) {
//        Thread thread1 = new MyPriorityThread();
//        thread1.setName("Thread-1");
//        thread1.setPriority(Thread.MAX_PRIORITY); //oldPriority ?
//        Thread thread2 = new MyPriorityThread();
//        thread2.setName("Thread-2");
//        thread2.setPriority(Thread.NORM_PRIORITY);
        Thread thread3 = new MyPriorityThread();
        thread3.setName("Thread-3");
        thread3.setPriority(Thread.MIN_PRIORITY);
        
//        thread1.start();
//        thread2.start();
        thread3.start();
        
        
        System.out.println("main priority : " + Thread.currentThread().getPriority());
    }
    
}

class MyPriorityThread extends Thread {
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + this.getPriority());
            
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
                }
            }, Thread.currentThread().getName() + i);
            thread.start();
            
        }
    }
}
