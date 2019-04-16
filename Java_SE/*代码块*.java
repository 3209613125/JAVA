//一道阿里校招题
class HelloA {

       public HelloA(){
           System.out.println("Hello A!父类构造方法");
       }

      {        System.out.println("i'm A class.父类非静态代码块");


      }
      static{
           System.out.println("static A 父类静态代码块");
       }
}

     class HelloB extends HelloA {
        public HelloB(){
            System.out.println("Hello B! 构造方法");
        }
        {
            System.out.println("i'm B class.非静态代码块");
        }
        static{
            System.out.println("static B 静态代码块");
        }
        public static void main(String[] args) {
            System.out.println("---start---");
            new HelloB();
            new HelloB();
            System.out.println("---end---");
        }
}

结果：
static A 父类静态代码块
static B 静态代码块
---start---
i'm A class.父类非静态代码块
Hello A!父类构造方法
i'm B class.非静态代码块
Hello B! 构造方法
i'm A class.父类非静态代码块
Hello A!父类构造方法
i'm B class.非静态代码块
Hello B! 构造方法
---end---

结论：主函数执行前先加载静态代码块（先父后子，静态代码块仅仅加载一次），然后是父类非静态代码块，父类构造方法->子类非静态代码块，子类构造方法；

