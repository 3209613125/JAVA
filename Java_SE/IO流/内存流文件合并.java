//内存操作流还有一个很小的功能，可以实现两个文件的合并处理(文件量不大)
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import java.io.*;
class Test{
    public static void main(String[] args)throws IOException {
        ByteArrayInputStream in=new ByteArrayInputStream("i love you".getBytes());
        ByteOutputStream out=new ByteOutputStream();
        try{
            int temp=-1;
            while((temp=in.read())!=-1){
                temp=temp-32;
                out.write(temp);
            }
            out.flush();
            byte[] newmessage=out.toByteArray();
            System.out.println(new String(newmessage));
         //   System.out.println(out);
        }
        catch (IOException e){
            e.fillInStackTrace();
        }
//        String n=out.toString();
//        System.out.println(n.getClass());
        System.out.println(out.getClass());
    }
}
