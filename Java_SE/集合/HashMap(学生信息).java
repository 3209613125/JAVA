import  java.util.*;
class HashMapDemon{
    public static void main(String[] args) {
        List<HashMap<Integer,Student>>list=new ArrayList<>();
        int num=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生信息 y表示继续，n表示退出");
        while ("y".equalsIgnoreCase(scanner.next())){
            num++;
            System.out.println("请输入学号:");
            Integer Id=scanner.nextInt();
            System.out.println("请输入姓名:");
            String name=scanner.next();

            Student student=new Student(Id,name);
            HashMap<Integer,Student> map=new HashMap<>();
            map.put(num,student);
            list.add(map);
            System.out.println("请输入学生信息 y表示继续，n表示退出");
            if("n".equalsIgnoreCase(scanner.next())){
                break;
            }
            else{
                System.out.println("请输入学生信息 y表示继续，n表示退出");

            }
        }
        System.out.println("学生信息为:");
        for(int i=0;i<list.size();i++){
            HashMap<Integer,Student>map=list.get(i);
            Student student=map.get(i+1);
            System.out.println("学号:"+student.getId()+" "+"姓名:"+student.getName());
        }
    }
}
class Student{
    private Integer Id;
    private String name;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
