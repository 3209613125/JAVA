//new instance调用无参构造，若不存在，报instantiation异常，若有，但是为私有不公开，则报illegalaccess异常
//所以new instance只能调用无参构造，且无参构造必须为public权限
class  Test{
    public static void main(String[] args) {
        Class<?> cls=Person.class;

        try{
            Person person=(Person) cls.newInstance();
            System.out.println(person);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Person{
    private String name;
    private String sex;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

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

//    private Person() {
//    }
}
