import java.lang.reflect.Constructor;
class  Test{
    public static void main(String[] args) {
        Class<?> cls=Person.class;
        Constructor[] constructors1=cls.getConstructors();
        for(Constructor constructors2:constructors1){
            System.out.println(constructors2);
        }
        Constructor[] constructor=cls.getDeclaredConstructors();
        System.out.println("----------------------------");
        for(Constructor constructors:constructor){
            System.out.println(constructors);
        }
    }
}
class Person{
    private String name;
    private String sex;
    private Integer age;

    private Person(String nmae, String sex, Integer age) {
        this.name = nmae;
        this.sex = sex;
        this.age = age;
    }

    public Person(String namee) {
        this.name = name;
    }

    public Person(Integer age) {
        this.age = age;
    }
}
