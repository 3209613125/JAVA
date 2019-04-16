//内外部类，观察打印顺序
class Outer {
    private String msg = "Hello World";

    static {
        System.out.println("1");
    }

    public Outer() {
        System.out.println("5");
    }

    {
        System.out.println("3");
    }
    public void he(){
        System.out.println("不打印");
    }
    public String getMsg(){
              return this.msg ;
    }
    public void fun(){
             Inner in = new Inner(this);
             in.print();
         }
}

    class Inner{
    private Outer out;
    static {
        System.out.println("2");
    }
        {
            System.out.println("4");
        }
    public  Inner(Outer out){
        this.out = out ;
        System.out.println("6");
    }
    public void print(){
            System.out.println("7.父类方法调用子类方法");
    }
}
class Test{
    public static void main(String[] args) {
        Outer out1 = new Outer();
              out1.fun();
                 }
}
