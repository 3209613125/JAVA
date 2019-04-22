import java.util.Date;
class Test{
    public static void main(String[] args) {
        Date date=new Date();
        //1 通过对象的get class（）方法获取
        Class class1=date.getClass();
        //2 通过类名.class获取类的对象
        Class class2=Date.class;
        //3 通过Class类的静态方法.forname(String)获取Class对象
        try {
            Class class3=Class.forName("java.util.Date");
            System.out.print("class2==class3,"); System.out.println(class2==class3);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(class1==class2);

    }

}
