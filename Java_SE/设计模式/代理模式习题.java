interface Isubject{
    void jiaoqian();
}
class Student implements Isubject{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void jiaoqian() {
        System.out.println("学生交钱");
    }
}
 class Monitor implements Isubject{
    Student stu;

    public Monitor(Student stu) {
        if(stu.getClass()==Student.class){
            this.stu=stu;
        }

    }


     @Override
     public void jiaoqian() {
        before();
        stu.jiaoqian();
        after();
     }

     public void before(){
        System.out.println("班长收钱");
    }

    public void after(){
        System.out.println("交钱给老师");
    }
}




public class Test {
    public static void main(String[] args) {
        Isubject isubject1=new Student("张三");
        Isubject isubject2=new Monitor((Student) isubject1);
        isubject2.jiaoqian();

    }
}
