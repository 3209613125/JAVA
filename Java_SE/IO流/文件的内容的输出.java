//范例:实现文件的内容输出
//io.*导入io包下的所有类
import java.io.*;
//OutputStream抽象类是表示字节输出流的所有类的超类，它以字节为单位将数据写入数据源
//OutputStream派生的常用子类

class Test{
    public static void main(String[] args)throws IOException {
        File file = new File(File.separator + "Users" + File.separator + "acer" + File.separator + "Desktop"+ File.separator + "hello.txt");
   if(!file.getParentFile().exists()){
       file.getParentFile().mkdirs();
   }
   OutputStream output=new FileOutputStream(file);
   String msg="泰勒斯威夫特";
   output.write(msg.getBytes());
   output.close();
    }
}
