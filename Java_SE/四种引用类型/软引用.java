软引用是除了强引用外，最强的引用类型。可以通过java.lang.ref.SoftReference使用软引用。一个持有软引用的对象，不会被JVM很快回收，JVM会根据当前堆的使用情况来判断何时回收。当堆使用率临近阈值时，才会去回收软引用的对象。因此，软引用可以用于实现对内存敏感的高速缓存。

SoftReference的特点是它的一个实例保存对一个Java对象的软引用， 该软引用的存在不妨碍垃圾收集线程对该Java对象的回收。也就是说，一旦SoftReference保存了对一个Java对象的软引用后，在垃圾线程对 这个Java对象回收前，SoftReference类所提供的get()方法返回Java对象的强引用。一旦垃圾线程回收该Java对象之后，get()方法将返回null。

下面举一个例子说明软引用的使用方法。

在你的IDE设置参数 -Xmx2m -Xms2m规定堆内存大小为2m。

 @Test
    public void test3(){
        MyObject obj = new myObject();
        SoftReference sf = new SoftReference<>(obj);
        obj = null;
        System.gc();
//        byte[] bytes = new byte[1024*100];
//        System.gc();
        System.out.println("是否被回收"+sf.get());
    }
运行结果：

是否被回收cn.zyzpp.MyObject@42110406
打开被注释掉的new byte[1024*100]语句，这条语句请求一块大的堆空间，使堆内存使用紧张。并显式的再调用一次GC，结果如下：

是否被回收null
说明在系统内存紧张的情况下，软引用被回收。
