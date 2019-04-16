abstract class A{//5
    public A(){
        this.print() ;//6
    }
    public abstract void print() ;
}
class B extends A{
    private int num = 100 ;//2
    public B(int num) {//3
        super() ;//4
        this.num = num ;//9
        System.out.println(this.num) ;//10
    }
    public void print() {//7
        System.out.println(this.num) ;//8
    }
}
 class Test2{
    public static void main(String[] args) {
        new B(40) ;//1
    }
}


--------------------------------------------------
0
40
