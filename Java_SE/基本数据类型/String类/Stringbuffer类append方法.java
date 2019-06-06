append方法用来累积字符串的,
如: StringBuffer a = new StringBuffer();
a.append("a");
a.append("b");
System.out.println(a.toString());
这个时候就会输出ab .
用途是当需要大量的字符串拼接时使用 优点效率比+=要高很多 （+=内存中是相当于创建副本重新赋值，StringBuffer是指针的引用


package www.bit.tech;


//append用于stringbuffer中，trim()用于String中，而不能用于StringBuffer中
public class little_test {
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer("hello");
        a.append(" world");
        System.out.println("StringBuffer a=new StringBuffer(\"hello\");\n" + "a.append(\" world\"):"+a);
//下列语句执行完并不能保存在a内
        a.toString().trim().toUpperCase();
        //System.out.println(a.toString());
        System.out.println("a.toString().trim().toUpperCase():"+a.toString().trim().toUpperCase());
        //a执行完trim().toUpperCase()方法后若不进行赋值则不能保存，除非直接打印该执行方法，否则再次输入
        //字符串a时，还是原来的样子
        String b=a.toString().trim().toUpperCase();

        System.out.println("执行完方法没有赋值的a:"+a);
        System.out.println("赋值后的b:"+b);

    }
}
