//java 方法重写，与实例化对象的向上转型
class person {
    public  void print() {
        System.out.println("我是爸爸");
    }
    }
    class Student extends  person{
        @Override
        public void print() {

            System.out.println("我是儿子");
        }
    }
public class Test{
    public static void main(String[] args) {
         person per =new Student();
            per.print();
    }
}
