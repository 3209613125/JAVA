//通过数组交换数值
class Test {

    public static void swap(int[] d) {
        int c = d[0];
        d[0] = d[1];
        d[1] = c;
        System.out.println(d[0]);
        System.out.println(d[1]);

    }
    public static void main(String[] args) {
        int[] a = new int[2];
        a[0] = 10;
        a[1] = 20;
        swap(a);
        System.out.println("---------------");
        System.out.println(a[0]);
       System.out.println(a[1]);
       //下面的代码时编译不过的，形参中单东西在形参所在函数执行完毕后，便被java垃圾内存回收站回收了
        //此代码所做的事情，是通过上面形参函数交换实参里面数组内的两个值。
       // System.out.println(d[0]);
        //System.out.println(d[1]);

    }
}
