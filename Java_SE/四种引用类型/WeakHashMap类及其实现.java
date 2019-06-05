WeakHashMap类及其实现
WeakHashMap类在java.util包内，它实现了Map接口，是HashMap的一种实现，它使用弱引用作为内部数据的存储方案。WeakHashMap是弱引用的一种典型应用，它可以作为简单的缓存表解决方案。

一下两段代码分别使用WeakHashMap和HashMap保存大量的数据：

    @Test
    public void test4(){
        Map map;
        map = new WeakHashMap<String,Object>();
        for (int i =0;i<10000;i++){
            map.put("key"+i,new byte[i]);
        }
//        map = new HashMap<String,Object>();
//        for (int i =0;i<10000;i++){
//            map.put("key"+i,new byte[i]);
//        }
    }
使用-Xmx2M限定堆内存，使用WeakHashMap的代码正常运行结束，而使用HashMap的代码段抛出异常

java.lang.OutOfMemoryError: Java heap space
由此可见，WeakHashMap会在系统内存紧张时使用弱引用，自动释放掉持有弱引用的内存数据。

但如果WeakHashMap的key都在系统内持有强引用，那么WeakHashMap就退化为普通的HashMap，因为所有的表项都无法被自动清理。
