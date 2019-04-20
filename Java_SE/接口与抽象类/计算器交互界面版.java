//利用java接口实现计算器，实现加减乘除的功能
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        fun i = new fun();
        jiafa s1 = new jiafa();
        jianfa s2 = new jianfa();
        chengfa s3 = new chengfa();
        chufa s4 = new chufa();
        System.out.println("请输入你要计算的两个数字:");
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int str2 = scanner.nextInt();
        int a = str;
        int b = str2;
        System.out.println("请输入您想要计算的方式(+，-，*，/):");
        String zifu1 = scanner.next();
        //next()不能读取空格，nextline()可以读取
        //在实现字符窗口的输入时，我个人更喜欢选择使用扫描器Scanner，它操作起来比较简单。
        // 在写作业的过程中，我发现用Scanner实现字符串的输入有两种方法，一种是next（），
        // 一种nextLine(),但是这两种方法究竟有什么区别呢？
        // 首先，next（）一定要读取到有效字符后才可以结束输入，对输入有效字符之前遇到的空格键、Tab键或Enter键等结束符，
        // next（）方法会自动将其去掉，只有在输入有效字符之后，next（）方法才将其后输入的空格键、
        // Tab键或Enter键等视为分隔符或结束符。简单地说，next（）查找并返回来自此扫描器的下一个完整标记。
        // 完整标记的前后是与分隔模式匹配的输入信息，
        // 所以next方法不能得到带空格的字符串而nextLine（）方法的结束符只是Enter键，
        // 即nextLine（）方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。
        //nextLine（）自动读取了被next（）去掉的Enter作为他的结束符，所以没办法给s2从键盘输入值。
        // 经过验证，其他的next的方法，如double nextDouble()  ，
        // float nextFloat() ， int nextInt() 等与nextLine（）连用时都存在这个问题，
        // 解决的办法是：在每一个 next（）、nextDouble()  、 www.gzlij.com（）、nextFloat()、nextInt()
        // 等语句之后加一个nextLine（）语句，将被next（）去掉的Enter结束符过滤掉
        scanner.nextLine();
        while(true) {
            if (zifu1.equals("+")) {

                System.out.print("加法结果:");
                i.func(s1, a, b);
                break;

            } else if (zifu1.equals("-")) {
                System.out.print("减法结果:");
                i.func(s2, a, b);
                break;

            } else if (zifu1.equals("*")) {
                System.out.print("乘法结果:");
                i.func(s3, a, b);
                break;
            } else if (zifu1.equals("/")) {
                System.out.print("除法结果:");
                i.func(s4, a, b);
                break;

            }
            else {
                System.out.println("非法输入!");
                break;
            }
        }

    }
}

    interface Ijisuanqi {
        int jisuan(int a, int b);

    }

    class fun {
        public void func(Ijisuanqi per, int a, int b) {
            System.out.println(per.jisuan(a, b));
        }

    }

    class jiafa implements Ijisuanqi {
        public int jisuan(int a, int b) {
            return a + b;
        }
    }

    class jianfa implements Ijisuanqi {
        public int jisuan(int a, int b) {
            return a - b;
        }
    }

    class chengfa implements Ijisuanqi {
        public int jisuan(int a, int b) {
            return a * b;
        }
    }

    class chufa implements Ijisuanqi {
        public int jisuan(int a, int b) {
            if (b == 0) {

                return -1;
            } else {
                return a / b;
            }
        }
    }
