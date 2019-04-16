///泛型
//从JDK1.5以后引入了三大常用新特性：泛型、枚举(enum)、注解（Annotation）。
// 其中在JDK1.5中泛型是一件非常重要的实现技术，它可以帮助我们解决程序的参数转换问题。

//假设需要你定义一个描述坐标的程序类Point，需要提供两个属性x、y。对于这两个属性的内容可能有如下选择：
//1. x = 10、y = 20 ；
// 2. x = 10.1、y = 20.1 ；
// 3. x = 东经80度、y = 北纬20度
//那么现在首先要解决的问题就是Point类中的x、y的属性类型问题，
// 此时需要保存的有int、double、String，
// 所以 在java中只有一种类型可以保存所有类型：Object型
//class fanxing{
//    private Object x;
//
//    private Object y;
//
//    public Object getX() {
//        return x;
//    }
//
//    public void setX(Object x) {
//        this.x = x;
//    }
//
//    public Object getY() {
//        return y;
//    }
//
//    public void setY(Object y) {
//        this.y = y;
//    }
//
// }
// class test{
//     public static void main(String[] args) {
//         fanxing p=new fanxing();
//         p.setX(10);
//         p.setY(30);
//         int x=(Integer)p.getX();
//         int y=(Integer)p.getY();
//         System.out.println("x:"+x+"\n"+"y:"+y);
//         fanxing b=new fanxing();
//         b.setX("北纬123度");
//         b.setY("东经32.1度");
//         String j=(String)b.getX();
//         String k=(String)b.getY();
//         System.out.println("x:"+j+"\n"+"y:"+k);
//以上代码看起来已经解决问题，但是现在解决问题的关键在于Object，于是问题也就出现在Object上
//如若将上述代码中的  b.setY("东经32.1度")不小心写成 b.setY(30.0);
//这个时候由于设置方的错误，将坐标内容设置成了double与String，但是接收方不知道，
// 于是在执行时就会出现 ClassCastException 。
// ClassCastException 指的是两个没有关系的对象进行强转出现的异常。
// 这个时候语法不会对其做任何限制，但执行的时候出现了程序错误，所以得出结论：向下转型是不安全的操作，会带来隐患。

//  }
// }

//那么针对以上问题我们怎么就解决呢？
//我们引入了泛型
//泛型的基本使用
//泛型指的就是在类定义的时候并不会设置类中的属性或方法中的参数的具体类型，而是在类使用时再进行定义。
//如果要想进行这种泛型的操作，就必须做一个类型标记的声明。
//范例：泛型类的基本语法：
//class MyClass<T> {
//  T value1;
// }
//尖括号 <> 中的 T 被称作是类型参数，用于指代任何类型。实际上这个T你可以任意写，
// 但出于规范的目的，Java 还是建议我们用单个大写字母来代表类型参数。常见的如：
// T 代表一般的任何类。 E 代表 Element 的意思，或者 Exception 异常的意思。
// K 代表 Key 的意思 V 代表 Value 的意思，通常与 K 一起配合使用。 S 代表 Subtype 的意思，文章后面部分会讲解示意。
//如果一个类被 <T> 的形式定义，那么它就被称为是泛型类。定义泛型类之后如何使用呢？来看下面的代码:
//范例：使用泛型类
//MyClass<String> myClass1 = new MyClass<String>();
// MyClass<Integer> myClass2 = new MyClass<Integer>();
//注意：泛型只能接受类，所有的基本数据类型必须使用包装类！
//这里需要注意的是，泛型类可以接收多个类型参数，如下所示:
//范例：泛型类引入多个类型参数以及使用
class MyClass<T,E> {
    T value1;
    E value2;

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public E getValue2() {
        return value2;
    }

    public void setValue2(E value2) {
        this.value2 = value2;
    }
}
class test   {
    public static void main(String[] args) {
        MyClass<String,Integer> myClass1 = new MyClass<String,Integer>();
        myClass1.setValue1("小明年龄:"+"\n");
        myClass1.setValue2(21);
        myClass1.getValue2();
        String hh= myClass1.getValue1();
        System.out.print(hh);
        int hhh= myClass1.getValue2();
        System.out.print(hhh);
    }
}
