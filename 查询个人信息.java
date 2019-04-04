//java查询个人信息
//每个员工都会有自己的档案，
// 主管可以查看在职员工的档案。
// 使用 Java 创建一个员工实体类，
// 然后通过构造方法创建一个名为“何浩源”的员工，最后打印出员工档案信息。
// 示例步骤如下

class Person
{
    private String name;    //姓名
    private int age;    //年龄
    private String sex;    //性别
    private String birthday;    //出生日期
    private String constellation;    //星座
    public Person(String name,int age,String sex,String birthday,String constellation)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.birthday=birthday;
        this.constellation=constellation;
    }
    public String intro()
    {
        return"姓名："+name+"\n年龄："+age+"\n性别："+sex+"\n出生日期："+birthday+"\n星痤："+constellation;
    }
}
class Test2
{
    public static void main(String[] args)
    {
        Person person=new Person("何浩源",21,"男","1997-11-23","射手座");
        String hehaoyuan=person.intro();
        System.out.println(hehaoyuan);
    }
}
