//通过对象 的值的交换

class Te{
    int x;
    {
        System.out.println(x);
    }
    public  Te(int x) {
        this.x = x;
        System.out.println("...");
        System.out.println(x);
    }

}
class Test {

    public static void main(String[] args)  {
        Te test=new Te(1);
        System.out.println("交换值之前："+test.x);
        change(test, 4);
        System.out.println("交换值之后："+test.x);
    }
    public static void change(Te test1,int x){
        test1.x=x;
    }
}
