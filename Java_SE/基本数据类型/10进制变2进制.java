//十进制数变为二进制数

//1.移位操作
public class Main {
    public static void main(String[] args) {
       int n = 10;
        for (int i = 31; i >= 0; i--) {
            // >>>表示无符号右移，负数的补码等于源码最高位不变的反码再加1
           System.out.print(n >>> i & 1);
       }
        System.out.println();
        //左移 ，低位补0
        System.out.println(3<<2 );
        System.out.println(3>>2);
        System.out.println(Math.pow(3,7));
        System.out.println("------------");
        //调用API
        String result = Integer.toBinaryString(n);
        System.out.println(Integer.parseInt(result));
    }
}
