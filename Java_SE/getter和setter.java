//getter setter用法

class Test{
    public static void main(String[]args){
        Person person=new Person();
        person.age=22;
        person.setName("何浩源");
        person.setSalary(390000);

        System.out.println("姓名为:"+person.getName());
        System.out.println("年龄为:"+person.age);
        System.out.println("年薪为:"+person.getSalary());
    }
}
class Person{
    int age;
    String name;
    int salary;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
