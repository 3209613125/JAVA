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
