//字符输出流
//字符适合处理中文数据，Writer是字符输出流的处理类
//Writer类与OutputStream的结构与方法非常相似，只是Writer类对中文的支持好，直接写入String类即可
import java.io.*;
class Test{
    public static void main(String[] args)throws IOException {
        File file = new File(File.separator + "Users" + File.separator + "acer" + File.separator + "Desktop"+ File.separator + "hello1.txt");
   if(!file.getParentFile().exists()){
       file.getParentFile().mkdirs();
   }
   String msg="泰勒斯威夫特";
  Writer writer=new FileWriter(file);
  writer.write(msg);
  //若果忽略了字符流的关闭，那么内容就没有输出到hello1.text文件夹，但是文件夹依然会建立，只是没有输出内容
  //writer.close();
        //但是可以加上flush()来强制清空缓存，来刷新，结果输出依然可以显示到文件夹
        writer.flush();
    }
}
