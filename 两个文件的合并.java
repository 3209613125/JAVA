import java.io.*;

class Test{
    public static void main(String[] args) {
        File part1=new File(File.separator+"Users"+File.separator+"acer"+File.separator
        +"Desktop"+File.separator+"新建文件夹1.txt");
        File part2=new File(File.separator+"Users"+File.separator+"acer"+File.separator
                +"Desktop"+File.separator+"新建文件夹2.txt");
        File part=new File(File.separator+"Users"+File.separator+"acer"+File.separator
                +"Desktop"+File.separator+"新建文件夹.txt");
        try(
                FileInputStream in1=new FileInputStream(part1);
                FileInputStream in2=new FileInputStream(part2);
                ByteArrayOutputStream out=new ByteArrayOutputStream();
                FileOutputStream out2=new FileOutputStream(part)
                )
        {
            byte[] buff=new byte[1024];
            int len=-1;
            while((len=in1.read(buff))!=-1){
                out.write(buff,0,len);
            }
            while((len=in2.read(buff))!=-1){
                out.write(buff,0,len);
            }
            out.flush();
            byte[]data=out.toByteArray();
            out2.write(data);
            out2.flush();
        }
        catch (IOException e){

        }
    }

}
