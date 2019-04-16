//java 值传递，交换两个变量的值，没有成功
 class Test {

    //交换两个变量的值

    public static void Swap(int a,int b){

        int c=a;

        a=b;

        b=c;

        System.out.println("a: "+a);

        System.out.println("b: "+b);

    }



    public static void main(String[] args){

        int c=10;

        int d=20;

        Swap(c,d);

        System.out.println("After Swap:");

        System.out.println("c: "+c);

        System.out.println("d: "+d);

    }

}
