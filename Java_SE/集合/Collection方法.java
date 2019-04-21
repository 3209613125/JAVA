//collection方法
import java.util.*;
//collection接口的使用
class Test{
    public static void main(String[] args) throws UnsupportedOperationException{
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList list1=new ArrayList();
        list.add(1);
        list.add(2);
        list1.addAll(list);
        list1.add(3);
        System.out.print(list);
        System.out.println();
        //求长度并不能用length方法，而是size方法
        //打印list1集合
        System.out.println(list1);

        Integer[] data = new Integer[list1.size()];

        list1.toArray(data);
        //将list1转化为Integer数组data
        System.out.println(data[2]);
        //再将Integer数组转化为list2集合，打印
        List list2=Arrays.asList(data);
        System.out.println(list2);

        //Iterator<E>iterator()	返回一个 Iterator 对象，用于遍历集合中的元素
        // System.out.println("list2结合中的元素如下:");
        Iterator it1=list2.iterator();
        //该对象本身仍要遍历才能将其打印
//       while(it1.hasNext()){
//           System.out.print(it1.next()+" ");
//       }
        //用iterator的hasNext()确认该集合中是否有元素
        System.out.println(it1.hasNext());
        System.out.println("list2 get(2):"+list2.get(2));
        list2.set(2,8);
        System.out.println("list2 get(2):"+list2.get(2));




        //使用next()获得序列中的下一个元素
        it1.next();
//Integer a=(Integer) it1.next();
//        System.out.println("a:"+a);
// a=2
        System.out.println(it1.next());

    }
}
