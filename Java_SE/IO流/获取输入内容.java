//获取输入内容
import java.io.*;
class Test{
    public static void main(String[] args) {
        byte[]data=new byte[1000];
        System.out.println("请输入英文:");
        try{
            System.in.read(data);
        }
        catch (IOException e){
            e.fillInStackTrace();
        }
        System.out.println("输入如下:");
        for (int i:data){
//用print可以在界面上省略换行，打印出来的字符更直观
            System.out.print((char) i);
        }
    }
}
