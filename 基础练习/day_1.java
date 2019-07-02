package  www.hhy;

public class Main {
    public static void main(String[] args) throws Exception {
        //反射实例化对象
//        Class<?> cls = Class.forName("java.util.Date");
//      Object object = cls.newInstance();
//        System.out.println(object);

        //直接输出日期
//        Date date  = new Date();
//        System.out.println(date);

        //距离1970/1/1 单位：毫秒
//        Date date  = new Date();
//        System.out.println(date.getTime());


        //反射vs工厂
        IComputer iComputer = Factory.get("www.hhy.Lenovo");
        iComputer.buy();

    }
}
    interface IComputer{
        public void buy();
    }
    class Lenovo implements IComputer{
        @Override
        public void buy(){
            System.out.println("买一台联想电脑");
        }
    }

    class acer implements IComputer{
        @Override
        public void buy(){
            System.out.println("买一台acer电脑");
        }
    }

    class Factory{
        private Factory(){};
        public static IComputer get(String className) throws Exception {
         IComputer  computer = (IComputer) Class.forName(className).newInstance();
           return computer;
        }
    }

