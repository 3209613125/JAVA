//字节输入流
//利用了OutputStream实现了程序输出内容到文件的处理，
// 下面使用InputStream类在程序中读取文件内容。
import java.io.*;
class Test{
    public static void main(String[] args)throws IOException {
        File file = new File(File.separator + "Users" + File.separator + "acer" + File.separator + "Desktop"+ File.separator + "hello.txt");
   if(file.exists()){
       InputStream input=new FileInputStream(file);
       byte[]data=new byte[1024];
       int len=input.read(data);
       String result=new String(data,0,len);
       System.out.println("读取内容【"+result+"】") ;

   }

    }
}
