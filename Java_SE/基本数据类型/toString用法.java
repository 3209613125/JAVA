toString() 方法返回此对象本身（它已经是一个字符串）。

语法
public String toString()
参数
无

返回值
字符串本身。

实例
public class Test {
    public static void main(String args[]) {
        String Str = new String("WWW.RUNOOB.COM");

        System.out.print("返回值 :" );
        System.out.println( Str.toString() );
    }
}
以上程序执行结果为：

返回值 :WWW.RUNOOB.COM
