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


---------------------------------------------------------------------------------------

    
    
//将用字节流写的hello.txt与用字符流写的hello1.txt都用字符流的输入Reader读，结果一样都为：读取内容【泰勒斯威夫特】
//字节流vs字符流
//        通过上述这一系列流的讲解可以发现，使用字节流和字符流从代码形式上区别不大。
//        但是如果从实际开发来讲，字节流一定是优先考虑的，只有在处理中文时才会考虑字符流。
//        因为所有的字符都需要通过内存缓冲来进行处理。
//        所有字符流的操作，无论是写入还是输出，数据都先保存在缓存中。
//        范例：示范字节流输出与字符流输出区别
//        如果字符流不关闭，数据就有可能保存在缓存中并没有输出到目标源。这种情况下就必须强制刷新才能够得到完整数据。

import java.io.*;

 class TestWriter {

    public static void main(String[] args) throws Exception {

        File file = new File(File.separator + "Users" + File.separator + "acer" +
                File.separator + "Desktop"+ File.separator + "hello2.txt");
        if (!file.getParentFile().exists()) {
            // 必须保证父目录存在
            file.getParentFile().mkdirs() ; // 创建多级父目录
                  }
                  String msg = "泰勒斯威夫特" ;
        Writer out = new FileWriter(file,true) ;
        out.write(msg) ;
        out.flush(); // 写上此语句表示强制清空缓冲内容，所有内容都输出。
          }

        }
