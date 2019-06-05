虚引用
虚引用是所有类型中最弱的一个。一个持有虚引用的对象，和没有引用几乎是一样的，随时可能被垃圾回收器回收。当试图通过虚引用的get()方法取得强引用时，总是会失败。并且，虚引用必须和引用队列一起使用，它的作用在于跟踪垃圾回收过程。

当垃圾回收器准备回收一个对象时，如果发现它还有虚引用，就会在垃圾回收后，销毁这个对象，将这个虚引用加入引用队列。程序可以通过判断引用队列中是否已经加入了虚引用，来了解被引用的对象是否将要被垃圾回收。如果程序发现某个虚引用已经被加入到引用队列，那么就可以在所引用的对象的内存被回收之前采取必要的行动。

    public void test3(){
        MyObject obj = new MyObject();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference sf = new PhantomReference<>(obj,referenceQueue);
        obj = null;
        System.out.println("是否被回收"+sf.get());
        System.gc();
        System.out.println("是否被回收"+sf.get());
    }
运行结果：

是否被回收null
是否被回收null
对虚引用的get()操作，总是返回null，因为sf.get()方法的实现如下：

    public T get() {
        return null;
    }
