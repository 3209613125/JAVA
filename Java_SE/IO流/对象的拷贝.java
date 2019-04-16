import java.lang.reflect.Field;
import java.util.Date;

/**
 * 将源对象中与目的对象相同属性，源对象的属性值copy赋值给目的对象
 * source 源对象: name, age, birthday
 * target 目标对象: name, age
 */

class Teacher {

    private String name;
    private Integer age;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}

class Students {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class BeanCopy {

    public static void copy(Object source, Object target) {

        //1.获取Class对象
        Class sourceClass = source.getClass();
        Class targetClass = target.getClass();

        //2.获取属性值
        Field[] sourceFields = sourceClass.getDeclaredFields();
        Field[] targetFields = targetClass.getDeclaredFields();

        //3.属性拷贝
        for(Field s : sourceFields) {
            for(Field t : targetFields) {
                //类型和名称都得判断
                if(s.getType() == t.getType() &&
                        s.getName().equals(t.getName())) {

                    try {
                        //赋值 s -> value -> t
                        s.setAccessible(true);
                        Object value = s.get(source);
                        t.setAccessible(true);
                        t.set(target, value);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.setName("张三");
        teacher.setAge(22);
        teacher.setBirthday(new Date());

        Students students = new Students();

        copy(teacher, students);

        System.out.println(students);

    }
}
