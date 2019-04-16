//观察子类对象创建，注意执行顺序
class Person{

    public Person(int i){
        System.out.println(i);
         i=0;
        System.out.println("**Person类对象产生**");
        i++;
        System.out.println(i);
    }
}
class Student extends Person{
    public Student(int i){
      super( i) ; //若无参数时，此语句在无参时写于不写一样注意：
 //实际上在子类的构造方法之中，相当于隐含了一个语句 super();
 //同时需要注意的是，如果父类里没有提供无参构造，
 //那么这个时候就必须使用super()明确指明你要调用的父类构造 方法
               System.out.println("**Student类对象产生**");
        System.out.println(i);
           }
}
class Test{
    public static void main(String[] args) {
        new Student(6);
    }
}


