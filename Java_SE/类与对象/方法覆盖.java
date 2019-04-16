//**抽象类的方法用final修饰是因为不想让子类覆盖这个方法

//属性重写，若属性没有被用private词汇修饰，那么才去就近原则，选择就近被覆盖的属性
class Person{
    public String info = "Person";
}

class Student extends Person{
    // 按照就近取用原则，肯定找被覆盖的属性。
   public String info = "Student";
 }
  class Test{
    public static void main(String[] args) {
        System.out.println(new Student().info);
    }
}







--------------------------------------------------------------------------------------------------------------------








class Person{
    public void print(){
        System.out.println("1.I am father");
    }
}

class Student extends Person{
    //下列并非构造方法，
    // 所以没有 new student();->public Student(){}->super()->public Person(){}
    //但是写法类似 new student().print()->public void print(){}->super.print()
    public void print(){
        super.print();
        System.out.println("2.I am child");
    }
}
class Test{
    public static void main(String[] args) {
        new Student().print();
    }
}
