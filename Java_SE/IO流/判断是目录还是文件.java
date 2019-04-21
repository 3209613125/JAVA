//java综合案例，目录列表
//先判断给定的是目录还是目录文件，如果是目录则遍历打印该目录下的所有文件名称，
// 否则(是文件不是目录)，则直接打印该文件,\Users\acer\Desktop\hello.txt
import java.io.File;
        import java.io.IOException;
        import java.util.Date;
import java.util.List;

class Test{
    public static void main(String[] args)throws IOException {
        File file=new File(File.separator+"Users"+File.separator+"acer"+
                File.separator+"Desktop");
        ListAllFiles(file);

    }
public static void ListAllFiles(File file){
        if(file.isDirectory() ){
            File result[]=file.listFiles();
            if(result!=null){
                for(File file1:result){
                    System.out.println(file1);
                }
            }
        }
        else{
            System.out.println(file);
        }

}

}
