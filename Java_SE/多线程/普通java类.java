class MyRunnable3 implements Runnable {

    private int tick = 10;

    @Override
    public void run() {
        while (this.tick > 0) {
            System.out.println("剩余：" + --this.tick + " 票");
        }
    }
}

class MyThread extends Thread {

    private String title;

    public MyThread(String title) {
        this.title = title;
    }


    @Override
    public void run() {
        System.out.println("run 开始");//1
        for (int i = 0; i < 10; i++) {//2
            System.out.println(this.title + "  " + i);
        }
        System.out.println("run 结束");//3
    }


    public static void main(String[] args) {

        System.out.println("这是主方法开始");//1

        MyThread myThread1 = new MyThread("My-Thread1");
//        MyThread myThread2 = new MyThread("My-Thread2");
//        MyThread myThread3 = new MyThread("My-Thread3");

//        myThread1.run();
//        myThread2.run();
//        myThread3.run();
        myThread1.start();//2
//        myThread2.start();
//        myThread3.start();
        for (int i = 0; i < 10; i++) {//3
            System.out.println("这是主方法的循环：" + i);
        }
        myThread1.start();
        System.out.println("这是主方法结束");//4

    }
}
