class TestWait {

    public static void main(String[] args) {
        Object object = new Object();
        synchronized(object) {
            System.out.println("开始执行");
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束执行");
        }

    }
}
