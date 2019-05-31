什么叫集合：集合就是Java API所提供的一系列类的实例，可以用于动态存放多个对象。这跟我们学过的数组差不多，那为什么我们还要学集合，我们看看数组跟集合有什么区别：

数组：长度固定，遍历速度快 可以存储基本类型和引用类型；

集合：长度不固定，只能存储引用类型对象；

从数组跟集合的特点我们很明显的看出，数组有一定的局限性，如果我们需要不定期的往我们的数据中存储数据，数组就满足不了我们的要求。

Java集合框架提供了一套性能优良、使用方便的接口和类，它们位于java.util包中 

Collection 接口存储一组不唯一，无序的对象 ；List 接口存储一组不唯一，有序（插入顺序）的对象；

Set 接口存储一组唯一，无序的对象；Map接口存储一组键值对象，提供key到value的映射

对于collection接口中的一些方法，我们用实际代码来学习一下吧：

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection
 * 集合基本操作
 * 添加
 * 删除
 * 遍历
 * 判断
 * 查找
 * @author shen_hua
 *
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<String>();
        System.out.println("元素个数："+collection.size());
        
        //添加元素
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        System.out.println("增加后元素的个数："+collection.size());
//        //删除元素
//        collection.remove("bbb");
//        System.out.println("删除后元素的个数："+collection.size());
//        collection.clear();
//        System.out.println("清空后元素的个数："+collection.size());
        //增强for循环遍历
        System.out.println("增强for循环输出：");
        for (Object object : collection) {
            System.out.println(object);
        }
        //迭代器遍历
        System.out.println("迭代器遍历：");
        Iterator<String> iterator=collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //判断是否包含
        Boolean boolean1=collection.contains("aaa");
        System.out.println(boolean1);
        //判断是否为空
        Boolean boolean2=collection.isEmpty();
        System.out.println(boolean2);
    }
}


Iterator接口：所有实现了Collection接口的集合类都有一个iterator()方法用以返回一个实现了Iterator接口的对象： Iterator it = coll.iterator();

Iterator迭代器的工作原理：Iterator是专门的迭代输出接口。所谓的迭代输出就是将元素进行判断，判断是否有内容，如果有内容则把内容取出。 Iterator对象称作迭代器，用以方便的实现对集合内元素的遍历操作。

凡是能用 Iterator 迭代的集合都可以用JDK5.0中增强的for循环来更简便的遍历。

List接口：
