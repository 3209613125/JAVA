//内外部类的调用
    class Father {

        private String name = "zhangjun";


        class Child {

            public String intoFather() {

                return Father.this.name;
            }

        }



    }
 class Test{
    public static void main(String[] args) {
        Father.Child per = new Father().new Child();

        System.out.println(per.intoFather());
    }
}



-------------------------------------------------------------------------

 class A {

     int y = 6;

   class Inner {
          int y = 3;

        void show() {
            System.out.println(y);
            //优先找内部类，若没有y的值，然后外部类
        }
    }


    public static void main(String[] args) {

        A.Inner inner = new A().new Inner();
        inner.show();
    }
}

-------------------------------------------------------------------------------
//构造对象首先要访问该类的构造方法，又因为B继承A，所以先访问A，在是构造方法B
class A{
        A(){
        System.out.println("A");
        }
        }

class B extends A{
    B(){
        System.out.println("B");
    }

    public static void main(String[] args){
        B b=new B();
    }
}
