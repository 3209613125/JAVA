在有些情况下，程序设计者在设计一个类的时候为需要重写equals方法，比如String类，但是千万要注意，
在重写equals方法的同时，必须重写hashCode方法。为什么这么说呢？
虽然通过重写equals方法使得逻辑上姓名和年龄相同的两个对象被判定为相等的对象（跟String类类似），但是要知道默认情况下，
hashCode方法是将对象的存储地址进行映射。那么上述代码的输出结果为“null”就不足为奇了。原因很简单，p1指向的对象和
System.out.println(hashMap.get(new People("Jack", 12)));这句中的new People("Jack", 12)生成的是两个对象，它们的存储地址肯定不同
以在hashmap进行get操作时，因为得到的hashcdoe值不同（注意，上述代码也许在某些情况下会得到相同的hashcode值，
不过这种概率比较小，因为虽然两个对象的存储地址不同也有可能得到相同的hashcode值），所以导致在get方法中for循环不会执行，直接返回null。
因此如果想上述代码输出结果为“1”，很简单，只需要重写hashCode方法，让equals方法和hashCode方法始终在逻辑上保持一致性


import java.util.HashMap;

class People{
    private String name;
    private int age;

    public People(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return name.hashCode()*37+age;
    }


    @Override
    public boolean equals(java.lang.Object obj) {
        return this.name.equals(((People)obj).name) && this.age== ((People)obj).age;
    }
}

 class Main {

    public static void main(String[] args) {

        People p1 = new People("Jack", 12);
        System.out.println(p1.hashCode());

        HashMap<People, Integer> hashMap = new HashMap();
        hashMap.put(p1, 1);

        System.out.println(hashMap.get(new People("Jack", 12)));
    }
}



在程序执行期间，只要equals方法的比较操作用到的信息没有被修改，那么对这同一个对象调用多次，hashCode方法必须始终如一地返回同一个整数。
如果两个对象根据equals方法比较是相等的，那么调用两个对象的hashCode方法必须返回相同的整数结果。
如果两个对象根据equals方法比较是不等的，则hashCode方法不一定得返回不同的整数
设计hashCode()时最重要的因素就是：无论何时，对同一个对象调用hashCode()都应该产生同样的值。
如果在讲一个对象用put()添加进HashMap时产生一个hashCdoe值，而用get()取出时却产生了另一个hashCode值，
那么就无法获取该对象了。所以如果你的hashCode方法依赖于对象中易变的数据，
用户就要当心了，因为此数据发生变化时，hashCode()方法就会生成一个不同的散列码


下面一段代码：

import java.util.HashMap;



class People{
    private String name;
    private int age;

    public People(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return name.hashCode()*37+age;
    }


    public boolean equals(java.lang.Object obj) {
        // TODO Auto-generated method stub
        return this.name.equals(((People)obj).name) && this.age== ((People)obj).age;
    }
}

 class Main {

    public static void main(String[] args) {

        People p1 = new People("Jack", 12);
        System.out.println(p1.hashCode());
        
        HashMap<People, Integer> hashMap = new HashMap();
        hashMap.put(p1, 1);
        p1.setAge(13);

        System.out.println(hashMap.get(p1));

    }
}
//结果为null，-> p1.setAge(13);
// 因此，在设计hashCode方法和equals方法的时候，如果对象中的数据易变，
// 则最好在equals方法和hashCode方法中不要依赖于该字段。
