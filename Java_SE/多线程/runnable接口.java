class TestThread1 {

    public static void main(String[] args) {
        //tick 成员属性
//        Thread thread1 = new MyThread3();
//        Thread thread2 = new MyThread3();
//        Thread thread3 = new MyThread3();
//        thread1.start();
//        thread2.start();
//        thread3.start();

        Runnable runnable = new MyRunnable3();
        //多线程共享同一个对象
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }


}




class MyRunnable3 implements Runnable {

    private int tick = 10;

    @Override
    public void run() {
        while (this.tick > 0) {
            System.out.println("剩余：" + --this.tick + " 票");
        }
    }
}



