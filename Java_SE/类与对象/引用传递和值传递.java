//值传递
----------------------------------------------------------------
public class Test{
    public static void main(String[] args) {
        int b=20;
        hehe(b);
        System.out.println("b:"+b);

    }
    public static void hehe(int a){
        a+=10;
        System.out.println("a:"+a);

    }
}
---------------------------------------------------------------
//引用传递
public class Test {

    public static void Sample(StringBuffer a){

        a.append(" Changed ");

        System.out.println("a: "+a);

    }



    public static void main(String[] args){

        StringBuffer b=new StringBuffer("This is a test!");

        Sample(b);

        System.out.println("b: "+b);

    }

}
