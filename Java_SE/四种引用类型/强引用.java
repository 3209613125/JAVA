Java中的引用，类似C语言中最难的指针。（我是C语言入门编程，指针的概念还是很深入我心。）通过引用，可以对堆中的对象进行操作。如：

StringBuffer stringBuffer = new StringBuffer("Helloword");
变量str指向StringBuffer实例所在的堆空间，通过str可以操作该对象。

强引用的特点：

强引用可以直接访问目标对象。
强引用所指向的对象在任何时候都不会被系统回收。JVM宁愿抛出OOM异常，也不会回收强引用所指向的对象。
强引用可能导致内存泄漏。

栈空间     堆空间

str        stringbuffer
