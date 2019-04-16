//简单的实例化对象直接赋值
class Test{
    public static void main(String[]args){
        Person person=new Person("何浩源",21,380000);
        System.out.println(person.toString());

    }
}
     class Person {
         String name;
         int age;
         int salary;

         public Person(String name, int age, int salary) {
             this.name = name;
             this.age = age;
             this.salary = salary;
         }

         @Override
         public String toString() {


//             System.out.println("Person{" +
//                     "name='" + name + '\'' +
//                     ", age=" + age +
//                     ", salary=" + salary +
//                     '}');
             return "Person{" +
                     "name='" + name + '\'' +
                     ", age=" + age +
                     ", salary=" + salary +
                     '}';


         }
     }

