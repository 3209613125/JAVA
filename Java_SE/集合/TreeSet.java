import java.util.Iterator;
import java.util.Set; import java.util.TreeSet;

 class TestDemo {

     public static void main(String[] args) {
         Set<Integer> set = new TreeSet<>() ;
         set.add(9);
         set.add(6);
         set.add(3);
         set.add(2);
         set.add(0);
         Integer[] data= new Integer[set.size()];
         set.toArray(data);
         System.out.println("数组:");
         for(Integer i:data){
             System.out.print(i+" ");
         }

         Iterator iterator1=set.iterator();
         while(iterator1.hasNext()){
             System.out.println("iterator迭代器遍历打印集合:"+iterator1.next());
         }
         System.out.println("\n"+"set的TreeSet集合打印结果:");
        System.out.println(set) ;
     }
 }


--------------------------------------------------------------------------


// //TreeSet排序分析
////既然TreeSet子类可以进行排序，所以我们可以利用TreeSet实现数据的排列处理操作。
//// 此时要想进行排序实际上是 针对于对象数组进行的排序处理，
//// 而如果要进行对象数组的排序，对象所在的类一定要实现Comparable接口并且
//// 覆写compareTo()方法，只有通过此方法才能知道大小关系。
//// 需要提醒的是如果现在试用Comparable接口进行大小关系匹配，所有属性必须/*全部*/进行比较操作
//
import java.util.*;
class Person implements Comparable<Person>{
    private String name;
    private  Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //当年龄相同时的时候比较名字的笔划数字
    public int compareTo(Person o) {
        if (this.age > o.age ) {
            return 1;
        }
        else if (this.age < o.age ){
            return -1 ;
        }else {
            return this.name.compareTo(o.name) ;
        }
        }



}
class TestDemo {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>() ;
        set.add(new Person("张三",20)) ;
        set.add(new Person("二二",20)) ;
        set.add(new Person("二二",20)) ;
        set.add(new Person("二一",20)) ;
        set.add(new Person("王五",19)) ;
        System.out.println(set) ;
    }
}




****
结果：
[Person{name='王五', age=19}, Person{name='二一', age=20}, Person{name='二二', age=20}, Person{name='张三', age=20}]
