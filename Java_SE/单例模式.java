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
