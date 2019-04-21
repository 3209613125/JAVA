////内存流
////通过内存流实现大小写的转换
//这个时候发生了IO操作，但是没有文件产生，可以理解为一个临时文件处理。
// 最初Ajax刚形成的时候此类操作非常多。后来出现了许多新的工具，这类代码出现的几率就比较低了。
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import jdk.internal.util.xml.impl.Input;

import java.io.*;
class Test{
    public static void main(String[] args)throws IOException {
        InputStream in=new ByteArrayInputStream("i love you".getBytes());
        OutputStream out=new ByteArrayOutputStream();
        int temp=0;
        while ((temp=in.read())!=-1){
            //out.write(temp);
            out.write(Character.toUpperCase(temp));
        }
        System.out.println(out);
        in.close();
        out.close();
    }
}
