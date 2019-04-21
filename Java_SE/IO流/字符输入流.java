//字符输入流Reader
//Reader依然也是一个抽象类。如果要进行文件读取，同样的，使用FileReader。
// 在上面讲到的Writer类中提供有方法直接向目标源写入字符串，
// 而在Reader类中没有方法可以直接读取字符串类型，这个时候只能通过字符数组进行读取操作
import java.io.*;
class Test{
    public static void main(String[] args)throws IOException {
        File file = new File(File.separator + "Users" + File.separator + "acer" + File.separator + "Desktop"+ File.separator + "hello1.txt");
   if(file.exists()){
       Reader reader=new FileReader(file);
      char[]data=new char[1024];
       int len=reader.read(data);
       String result=new String(data,0,len);
       System.out.println("读取内容【"+result+"】") ;
       reader.close();


   }

    }
}
