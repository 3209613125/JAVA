//文件内容的追加，
//当需要重复执行时会用到
//需要调用FileOutputStraem的另一种构造方法
import java.io.*;
class Test{
    public static void main(String[] args)throws IOException {
        File file = new File(File.separator + "Users" + File.separator + "acer" + File.separator + "Desktop"+ File.separator + "hello.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        OutputStream output=new FileOutputStream(file,true);
        String msg="泰勒斯威夫特";
        output.write(msg.getBytes());
        output.close();
    }
}
