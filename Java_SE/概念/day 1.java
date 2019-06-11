1.java 的字符类型采用的是 Unicode 编码方案，每个 Unicode 码占用（16）个比特位。



2.下列哪些语句关于 java 内存回收的说明是正确的？

 A  程序员必须创建一个线程来释放内存 
 B 内存回收程序负责释放无用内存 
 C 内存回收程序允许程序员直接释放内存
 D 内存回收程序可以在指定的时间释放内存对象
 
 正确答案:B
 
 
 
3. 在 java 中，一个类可同时定义为许多同名的方法，这些方法的形式参数个数，类型或顺序各不相同，传回的
值可能各不相同，这种面向对象的特性称为（）
A 隐藏
B 覆盖
C 重载
D 无此特性

正确答案：C



4.如果希望某个变量只可以被类本身访问和调用，则应该使用下列哪一种访问控制修饰？
A public
B private
C private protected
D protected
正确答案：B


5.有如下4条语句：()
Integer i01=59;
int i02=59;
Integer i03=Integer.valueOf(59);
Integer i04=new Integer(59);
以下输出结果为false的是:
A System.out.println(i01==i02);
B System.out.println(i01==i03);
C System.out.println(i03==i04);
D System.out.println(i02==i04);
正确答案：C



6.关于以下程序代码的说明正确的是()
public class HasStatic {// 1
private static int x = 100;// 2
public static void main(String args[]) {// 3
HasStatic hsl = new HasStatic();// 4
hsl.x++;// 5
HasStatic hs2 = new HasStatic();// 6
hs2.x++;// 7
hsl = new HasStatic();// 8
hsl.x++;// 9
HasStatic.x- ;// 10
System.out.println(" x=" + x);// 11
}
}

A 程序通过编译，输出结果为:x=102
B 程序通过编译，输出结果为:x=103
C 10行不能通过编译.因为x星私有静态变量
D 5行不能通过编译.因为引用了私有静态变量

正确答案：A


7.以下代码输出的是：
public class SendValue{
public String str="6";
public static void main(String[] args) {
SendValue sv=new SendValue();
sv.change(sv.str);
System.out.println(sv.str);
}
public void change(String str) {
str="10";
}
}

A 6
B 10
C 都不对
D 16


正确答案：A

8.以下关于java封装的描述中，正确的是：
A 封装的主要作用在于对外隐藏内部实现细节，增强程序的安全性
B 封装的意义不大，因此在编码中尽量不要使用
C 如果子类继承父类，对于父类中进行封装的方法，子类仍然可以直接调用
D 只能对一个类中的方法进行封装，不能对属性进行封装

正确答案：A


9. 对于一个已经不被任何变量引用的对象，当垃圾回收器准备回收该对象所占用的内存时，将自动调用该对
象的哪个方法（）

A finalize
B notify
C notifyAll
D hashCode

正确答案：A

10.考虑下面这个简单的例子，让我们看看reflection是如何工作的。
import java.lang.reflect.*;
public class DumpMethods{
public static void main(String[] args) {
try {
Class c=Class.forName(args[0]);
Method m[]=c.getDeclaredMethods();
for (int i = 0; i < m.length; i++) {
System.out.println(m[i].toString());
}
} catch (Throwable e) {
System.err.println(e);
}
}
}
其中"c.getDeclaredMethods"的作用是:

A 取得类的公有方法对象
B 取得类的所有公有方法名称
C 取得类的所有方法对象
D 以上选项都不正确

正确答案：D


