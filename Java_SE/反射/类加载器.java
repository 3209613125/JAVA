class Person{
    int age;
    String name;

//Person.class.getClassLoader().loadClass("Person").newInstance()
//此处若加上构造方法，则必须包含无参构造，因为默认会有无参构造，不能仅有有参构造
//否则会覆盖无参构造，但可以既有有参构造，又含有无参构造


    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
 class Test{
    //需要抛出异常，实例化异常，类找不到异常等
    public static void main(String[] args)throws Exception {
        Class<?> cls = Person.class;
        System.out.println(cls.getClassLoader());
        System.out.println(cls.getClassLoader().getParent());
        System.out.println(cls.getClassLoader().getParent().getParent());
        //此处的newInstance可以传递参数，因为是通过包含传递参数的构造方法实例化的对象
        System.out.println(Person.class.getClassLoader().loadClass("Person").
                getConstructor(int.class,String.class).newInstance(21,"何浩源"));
        //此处的newInstance则不可以传递参数，因为是通过类加载器得到加载类从而实例化的对象，默认调用了无参构造
        System.out.println(Person.class.getClassLoader().loadClass("Person").newInstance());


    }
}
