//toString不是静态方法，而是Object方法，任何类都能覆写此方法
class Test{
    public static void main(String[] args) {
        Object object1=456;
        Person person=new Person();
        //对象属性.toString
        System.out.println(person.object.toString());
        //String.valueof(对象属性)
        System.out.println(String.valueOf(object1));
    }
}
  class  Person{
    static Object object=123;
    public Person(){};
}
