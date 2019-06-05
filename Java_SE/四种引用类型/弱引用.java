弱引用
弱引用是一种比软引用较弱的引用类型。在系统GC时，只要发现弱引用，不管系统堆空间是否足够，都会将对象进行回收。在java中，可以用java.lang.ref.WeakReference实例来保存对一个Java对象的弱引用。

    public void test3(){
        MyObject obj = new MyObject();
        WeakReference sf = new WeakReference(obj);
        obj = null;
        System.out.println("是否被回收"+sf.get());
        System.gc();
        System.out.println("是否被回收"+sf.get());
    }
运行结果：

是否被回收cn.zyzpp.MyObject@42110406
是否被回收null
软引用，弱引用都非常适合来保存那些可有可无的缓存数据，如果这么做，当系统内存不足时，这些缓存数据会被回收，不会导致内存溢出。而当内存资源充足时，这些缓存数据又可以存在相当长的时间，从而起到加速系统的作用。

