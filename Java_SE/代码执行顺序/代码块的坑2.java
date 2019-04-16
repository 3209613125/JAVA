//理解代码的执行顺序
class Person{
    {
          String  name=" Tommy";
        System.out.println(name);
    }

String name;
 public String getName() {
     this.name=name;
     return name;
 }
 public void setName(String name) {
     this.name = name;
 }
}
class Student extends Person{
    public void fun(){
        System.out.println(getName());
          }
}

 class Test {
    public static void main(String[] args) {
        Student student = new Student();
       // student.setName("Steven");
        System.out.println(student.getName());
        student.fun();
    }
}
