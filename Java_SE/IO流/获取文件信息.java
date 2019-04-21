//java文件信息：
//判断路径是否是文件 public boolean isFile()
//判断路径是否是目录 public boolean isDirectory()
//取得文件大小（字节） public long length()
//获取文件最近一次修改信息 public long lastmodified()
import java.io.File;
import java.io.IOException;
import java.util.Date;
 class Test{
    public static void main(String[] args)throws IOException {
        File file=new File(File.separator+"Users"+File.separator+"acer"+
        File.separator+"Desktop"+File.separator+"test.png");
        if(file.exists()&&file.isFile()){
            System.out.println("文件大小"+file.length());
            System.out.println(new Date(file.lastModified()));
        }
        else{
            System.out.println("不存在");
        }

    }
}
