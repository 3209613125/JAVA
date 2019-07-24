import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Test2{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list1.add(6);
        list1.add(7);
        //第一个addall方法，添加元素的集合调用addall方法，在该集合某下标位置(下标从0开始)，加入另一个集合全部的元素
       list.addAll(0,list1);
       //第二个addall方法，添加元素的集合调用addall方法，直接添加另一个集合名字即可
        
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("list:  "+list.size());
        System.out.println("list1: "+list1.size());
    }
}
