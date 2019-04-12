import java.io.*;

/**
 * FileCopy：sourceFilePath   destFilePath
 */

 class FileCopy {

    public static void copy(String sourceFilePath, String destFilePath) {

        //1.检验参数
        checkNotEmpty(sourceFilePath, "sourceFilePath must be not null/empty");
        checkNotEmpty(destFilePath, "destFilePath must be not null/empty");

        //2.校验源文件
        File sourceFile = new File(sourceFilePath);
        checkFile(sourceFile, "sourceFile must be exist and file");

        //3.校验和准备目的文件路径
        File destFile = new File(destFilePath);
        checkFileAndMkdir(destFile, "destFile parent file must exists");

        //4.拷贝（记录拷贝所需时间）
        long start = System.currentTimeMillis();
        handler(sourceFile, destFile);
        long end = System.currentTimeMillis();
        System.out.println("cp cast time :" + (end - start) + "ms");

    }


    public static void checkNotEmpty(String str, String message) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkFile(File file, String message) {
        if (!file.exists() || !file.isFile()) {

            throw new IllegalArgumentException(message);
        }
    }

    public static void checkFileAndMkdir(File file, String message) {
        File parent = file.getParentFile();
        if (!parent.exists()) {
            boolean rs = parent.mkdirs();
            if (!rs) {
                throw new RuntimeException(message);
            }
        }
    }

    public static void handler(File sourceFile, File destFile) {

        //输入sourceFile，输出destFile
        try(InputStream in = new FileInputStream(sourceFile);
            OutputStream out = new FileOutputStream(destFile)) {

            //in -> read -> write -> out
            byte[] buff = new byte[1024*1024];
            int len = -1;
            while((len = in.read(buff)) != -1) {
                out.write(buff, 0, len);
            }
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copy(File.separator + "Users" + File.separator + "acer" +
                File.separator + "Desktop"+ File.separator + "雄芯.txt",
                File.separator + "Users" + File.separator + "acer" +
                        File.separator + "Desktop"+ File.separator + "乾坤.txt");
    }
}
