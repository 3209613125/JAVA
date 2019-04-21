//java列出目录的全部组成
import java.io.File;
import java.io.IOException;
import java.util.Date;
 class Test{
    public static void main(String[] args)throws IOException {
        File file=new File(File.separator+"Users"+File.separator+"acer"+
        File.separator+"Desktop");
    if(file.exists()&&file.isDirectory()){
        File[]result=file.listFiles();
        for(File file1:result){
            System.out.println(file1);
        }
    }

    }
}
