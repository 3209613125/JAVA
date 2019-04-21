//java创建删除文件
import java.io.File;
import java.io.IOException;

class Test{
    public static void main(String[] args) throws IOException{
        File file=new File(File.separator + "Users" + File.separator + "acer" + File.separator + "Desktop"+ File.separator + "Test.java");
            if(file.exists()){
            file.delete();

            }
            else{
            file.createNewFile();
            }

    }
}
