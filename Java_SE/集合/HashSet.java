//set中不能有重复元素
import java.util.HashSet; import java.util.Set;

class TestDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>() ;
        set.add("Hello") ;
        // 重复元素
        set.add("apple");
        set.add("Hello") ;
        set.add("Bit") ;
        set.add("Hello") ;
        set.add("Java") ;
        System.out.println(set) ;
        }
}


--------------------------------------------------------------------------

    
//覆写hashCode()与equals()方法消除重复
import java.util.*;
class human implements Comparable<human>{
    private String name;
    private Integer age;

    public human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        human human = (human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(age, human.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
@Override
        public int compareTo(human o) {
        if (this.age > o.age ) {
            return 1;
        }
        else if (this.age < o.age ){
            return -1 ;
        }else {
            return this.name.compareTo(o.name) ;
        }
        }
}
class Test{
    public static void main(String[] args) {
        Set<human> set=new HashSet<>();

        set.add(new human("张三",19));
        set.add(new human("张三",19));

        System.out.println(set);
    }
}



***
结果:
[human{name='张三', age=19}]
