//单例模式
class Singleton{
    // 在类的内部可以访问私有结构，所以可以在类的内部产生实例化对象
   private static Singleton instance = new Singleton() ;
   private Singleton() {
       // private声明构造
         }
         public static Singleton getInstance() {
       return instance ;
   }
   public void print() {
       System.out.println("Hello World");
   }
}
 class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = null ; // 声明对象
            singleton = Singleton.getInstance() ;
            singleton.print();
    }
}


--------------------------------------------------------------------------------------
    
    
    class Test{
    public static void main(String[] args) {
        singleton s1=singleton.getinstance();
        singleton s2=singleton.getinstance();
        System.out.println(s1);
        System.out.println(s2);

    }
}
class singleton{

 private final static singleton per=new singleton();
    private singleton (){};
下面这个取得内部类实例对象的getinstance方法前面必须有类singleton修饰，否则编译会报错，java方法声明无效，需要返回
类型
    public  static singleton getinstance(){
        return per;
    }

}
