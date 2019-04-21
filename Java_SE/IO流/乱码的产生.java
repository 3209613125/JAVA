//乱码的产生
//本质：编码和解码不统一
import java.io.*;
class Test{
    public static void main(String[] args) throws UnsupportedEncodingException, IOException  {
//        Writer out = new FileWriter(new File("/Users/acer/Desktop/hello.txt")) ;
//        out.write("比特科技欢迎你") ;
        try (OutputStream out = new FileOutputStream(new File("/Users/acer/Desktop/hello.txt"))) {
            out.write("比特科技欢迎你".getBytes("ISO-8859-1"));
            out.close();
        }
    }
}
