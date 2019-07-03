package www.hhy;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
* @Author: HeHaoYuan
* @Date: 2019/7/3
* @Description:
取得类中构造方法，简单java类中一定要有一个无参构造

*/
import java.lang.reflect.Constructor;

public class Main{
    public static void main(String[] args) {
        Class<?> cls = Person.class;
        Constructor<?>[] constructor = cls.getConstructors();
        for(Constructor<?>constructor1:constructor){
            System.out.println(constructor1);
        }
    }

}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }
}

//---------------------------------------------------


    反射只能调用无参构造
public class Main{
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class <?> cls = Person.class;
        System.out.println(cls.newInstance());
    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//反射调用具体构造方法
public class Main{
    public static void main(String[] args) throws Exception{
        Class <?> cls = Person.class;
        Constructor<?> constructor = cls.getConstructor(String.class,int.class);
        System.out.println(constructor.newInstance("何浩源",21));
    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Person.class ;
        Method[] methods = cls.getMethods() ;
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}


class Person {
    private String name ;
    private int age ;
    public Person() {}
    public Person(String name,int age) {
        this.name = name ;
        this.age = age ;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

