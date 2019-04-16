package www.bit.tech;
import www.bit.tech.Fanshe1;
class Test3 {
    public static void main(String[] args) {
        Class reflect = Fanshe1.class;
        Fanshe1 fanshe = new Fanshe1();
        Class reflect1 = fanshe.getClass();
        try {
            Class reflect3 = Class.forName("www.bit.tech.Fanshe1");
            System.out.println(reflect3);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("没有找到");
        }
        System.out.println(reflect);
        System.out.println(reflect1);
        // System.out.println(reflect3);
        System.out.println(reflect == reflect1);
        System.out.println(reflect.equals(reflect1));

    }
}


---------------------------------------------------------------------
    
    
    class www.bit.tech.Fanshe1
class www.bit.tech.Fanshe1
class www.bit.tech.Fanshe1
true
true
