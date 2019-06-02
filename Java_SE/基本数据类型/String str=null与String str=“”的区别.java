String str=null

    这句话的意思就是定义一个字符串，变量str，字符串的内容为空值。

String str=“”

    定义一个String类型的变量str，并为其赋值。



String str=null与String str=“”区别

1.""分配了内存；null没有分配内存。

2.""是一个字符串(String).它在内存中是存在的.而null它是一个空对象.在内存中是不存在的。

3.""占内存，在内存中会分配一个空间。

    null不占内存. 为空引用.



String str1= null; str引用为空

String str2= ""; str应用一个空字符串



也就是null没有分配空间，""分配了空间，因此str1还不是一个实例化的对象，而str2已经实例化。

注意null不是对象，""是对象。

总结：

    null表示的是一个对象的值，而并不是一个字符串。例如声明一个对象的引用，String a = null ;

“”表示的是一个空字符串，也就是说它的长度为0。例如声明一个字符串String str = “” ;

内存分配

String str= null ; 表示声明一个字符串对象的引用，但指向为null，也就是说还没有指向任何的内存空间；

String str= “”; 表示声明一个字符串类型的引用，其值为”“空字符串，这个str引用指向的是空字符串的内存空间；
