//toString不是静态方法，而是Object方法，任何类都能覆写此方法
class Test{
    public static void main(String[] args) {
        Object object1=456;
        Person person=new Person();
        //对象属性.toString
        System.out.println(person.object.toString());
        String str=person.object.toString();
        System.out.println(str);
        char[]data=str.toCharArray();
        System.out.println(data[0]);
        //String.valueof(对象属性)
        //通过valueof（）方法将object1变为String类型
        System.out.println(String.valueOf(object1));
    }
}
class  Person{
    static Object object=123;
    public Person(){};
}


总结:integer也是Object的子类，其对象可以用Object的toString方法，将integer类型转化为String类型，但是int则不行
