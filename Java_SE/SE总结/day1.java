反射原理:
JAVA语言编译之后会生成一个.class文件，反射就是通过字节码文件找到某一个类、类中的方法以及属性等。
反射的实现主要借助以下四个类：
Class：类的对象
Constructor：类的构造方法
Field：类中的属性对象
Method：类中的方法对象

 Date date = new Date(); System.out.println(date.getTime()); 返回1970/01/01距离当今的时间毫秒数
       
