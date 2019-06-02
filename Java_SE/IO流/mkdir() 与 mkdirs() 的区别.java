官方解释：

boolean mkdir() 创建此抽象路径名指定的目录。
boolean mkdirs() 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。

我通过Demo通俗的解释一下：

    String path ="E:\\data\\a\\b\\c";
    Boolean result = new File(path).mkdir();
    System.out.println(result); 
当c的父目录存在时 返回true
当c的父目录不存在时 返回false

        String path ="E:\\data\\a\\b\\c";
        Boolean result = new File(path).mkdirs();
        System.out.println(result);
        System.in.read();
当c父的目录不存在时，mkdirs会创建父目录 返回true

 

mkdir()是创建子目录。

mkdirs()是创建多级目录。
