java中exit表示的关闭JVM程序，但是不释放内存，举例：
System.exit(0);//表示正常程序的关闭，执行的是以下操作：
public static void exit(int status) {
Runtime.getRuntime().exit(status);
}
备注：如果是 0表示正常关闭，如果是非0表示异常关闭，如果想释放内存的话，用“dispose()”关闭当前程序，并释放资源。
