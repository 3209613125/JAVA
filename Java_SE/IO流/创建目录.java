//java创建目录，并创建java文件
import java.io.File; import java.io.IOException;

 class Test {

    public static void main(String[] args) throws IOException {
        // separator由不同操作系统下的JVM来决定到底是哪个杠杠！
          File file = new File(File.separator + "Users" + File.separator + "acer" + File.separator + "Desktop" + File.separator + "javaIO"+File.separator+"bit"+File.separator+"TestIO.java");
          if (!file.getParentFile().exists()) { // 创建父目录
                     file.getParentFile().mkdirs() ; // 有多少级父目录就创建多少级
                 }
                 if (file.exists()) {
              // 文件存在，进行删除
                          file.delete();
          }
          else {
              file.createNewFile();
          }
    }
}
