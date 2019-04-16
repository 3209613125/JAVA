//简单工厂设计模式
import java.util.Scanner;
//测试类加客户端
class Client{
    public void buycom(Icomputer icomputer){
        icomputer.printcom();
    }
    public static void main(String[] args)throws Exception {
       Client client=new Client();
        System.out.println("输出你想要的电脑型号");
       Scanner scanner=new Scanner(System.in);
       String str=scanner.nextLine();
       Icomputer icomputer=factory.getinstance(str);
       client.buycom(icomputer);
    }
}

interface Icomputer{
   void printcom();
}
class factory{
    public  static Icomputer getinstance(String str) throws Exception{
        if(str.equals("mac")){
            return new mac();
        }
        else if(str.equals("acer")){
            return new acer();
        }
        else if(str.equals("lenovo")){
            return new lenovo();
        }
        else{
            try {
                System.out.println("没有找到指定商品");
            }
            catch (Exception e){
                e.getStackTrace();
            }
            return  null;
        }
    }
}
//mac
class mac implements  Icomputer{
    public void printcom(){
        System.out.println("this is a mac");
    }
}
//lenovo
class lenovo implements Icomputer{
    public void printcom(){
        System.out.println("this is a lenovo");
    }
}
//acer
class acer implements Icomputer{
    public  void printcom(){
        System.out.println("this is an acer");
    }
}
