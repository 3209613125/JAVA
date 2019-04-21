
import java.util.ArrayList; import java.util.Arrays; import java.util.Collection;

 class TestDemo {

     public static void main(String[] args) {
         // 此时集合里面只保存String类型
         Collection<String> list = new ArrayList<>() ;
         list.add("Hello") ;
         // 重复数据 ?
         list.add("Hello") ;
         list.add("Bit") ;
         // 操作以Object为主，有可能需要向下转型，就有可能产生ClassCastException
         Object[] result = list.toArray() ;
         System.out.println(Arrays.toString(result)) ;
     }
 }
 
 
 
 
 
 ----------------------------------------------------------------------------------
 
 
 
 import java.util.ArrayList; import java.util.List; import java.util.Objects;

class Person2{
    private String name;
    private Integer age;

    public Person2(String name, Integer age) {
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
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person = (Person2) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }


}

 class TestDemo {
     public static void main(String[] args) {
         List<Person2> personList = new ArrayList<>() ;
         personList.add(new Person2("张三",10)) ;
         personList.add(new Person2("李四",11)) ;
         personList.add(new Person2("王五",12)) ;


         //集合类中contains()、remove()方法需要equals()支持
         personList.remove(new Person2("李四",11)) ;
         System.out.println( personList.contains(new Person2("王五",12)));
         for (Person2 p: personList) {
             System.out.println(p) ;  }
         System.out.println(new Person2(
                 "李四",11).equals(new Person2("李四",11)));

     }

 }
 
 
 
 ************************************************
 结果:
 
 true
Person2{name='张三', age=10}
Person2{name='王五', age=12}
true
