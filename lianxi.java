//此java.class文件只用来练习代码
//interface  Isubject{
//
//    void buycomputer();
//}
//class realsubject implements Isubject{
//
//    public void buycomputer(){
//        System.out.println("买一台电脑，付款");
//    }
//}
//class proxysubject implements Isubject{
//    private Isubject isubject;
//    public proxysubject(Isubject isubject){
//        this.isubject=isubject;
//
//    }
//void berforebuy(){
//    System.out.println("去美国mac店排队");
//}
//void afterbuy(){
//    System.out.println("快递给顾客");
//}
//    @Override
//    public void buycomputer() {
//       this. berforebuy();
//       isubject.buycomputer();
//       this.afterbuy();
//
//        }
//    }
//class Test{
//    public static void main(String[] args) {
//        Isubject isubject=new proxysubject(new realsubject());
//        isubject.buycomputer();
//    }
//
//}


//咖啡机
//import java .util.Scanner;
//class Test{
//    public static void main(String[] args) {
//
//      kafei i=new kafei();
//      i.daoshui();
//      i.jiapeifang();
//      i.star();
//      i.dicha();
//
//    }
//
//}
//abstract class bverage{
//
//     abstract void daoshui();
//     abstract void jiapeifang();
//       void star(){
//         System.out.println("搅拌冲泡");
//     }
//    abstract void dicha();
//}
//class kafei extends bverage {
//    void kafei() {
//
//    }
//
//    void daoshui() {
//        System.out.println("加热水");
//    }
//
//    void jiapeifang() {
//        System.out.println("加入咖啡粉");
//    }
//
//    void star() {
//        System.out.println("搅拌冲泡");
//    }
//
//    @Override
//    void dicha() {
//        System.out.println("需要加牛奶吗");
//
//        while (true) {
//            //把输入放到循环内部，当输入非法的时候可以给用户再次输入的机会，否则一旦输错，将循环打印无限次
//            Scanner scanner = new Scanner(System.in);
//            String str1 = scanner.nextLine();
//            if (str1.equalsIgnoreCase("y")) {
//                System.out.println("加牛奶，给大佬递咖啡");
//                break;
//            } else if (str1.equalsIgnoreCase("n")) {
//                System.out.println("不加牛奶，给大佬递咖啡");
//                break;
//            } else {
//                System.out.println("输入非法");
//                continue;
//            }
//
//        }
//    }
//}

//将代购和抽象类练习完

//简单工厂设计模式
//import java.util.Scanner;
////测试类加客户端
//class Client{
//    public void buycom(Icomputer icomputer){
//        icomputer.printcom();
//    }
//    public static void main(String[] args)throws Exception {
//       Client client=new Client();
//        System.out.println("输出你想要的电脑型号");
//       Scanner scanner=new Scanner(System.in);
//       String str=scanner.nextLine();
//       Icomputer icomputer=factory.getinstance(str);
//       client.buycom(icomputer);
//    }
//}
//接口
//interface Icomputer{
//   void printcom();
//}
//class factory{
//    public  static Icomputer getinstance(String str) throws Exception{
//        if(str.equals("mac")){
//            return new mac();
//        }
//        else if(str.equals("acer")){
//            return new acer();
//        }
//        else if(str.equals("lenovo")){
//            return new lenovo();
//        }
//        else{
//            try {
//                System.out.println("没有找到指定商品");
//            }
//            catch (Exception e){
//                e.getStackTrace();
//            }
//            return  null;
//        }
//    }
//}
////mac
//class mac implements  Icomputer{
//    public void printcom(){
//        System.out.println("this is a mac");
//    }
//}
////lenovo
//class lenovo implements Icomputer{
//    public void printcom(){
//        System.out.println("this is a lenovo");
//    }
//}
////acer
//class acer implements Icomputer{
//    public  void printcom(){
//        System.out.println("this is an acer");
//    }
//}


//import java.util.Scanner;
//class Client{
//    void shixian(Icomputer icomputer){
//        icomputer.printcom();
//
//    }
//    public static void main(String[] args) {
//        Client client=new Client();
//
//        System.out.println("请输入您想要的电脑品牌");
//        Scanner scanner=new Scanner(System.in);
//        String str=scanner.nextLine();
//       Icomputer icomputer=factory.getinstance(str);
//       client.shixian(icomputer);
//    }
//
//}
//interface Icomputer{
//    void printcom();
//
//}
////factory不是抽象的，也不需要继承接口
//class factory {
////getinstance方法要用抽象方法
//    public static Icomputer getinstance(String str){
//        if(str.equals("acer")){
//            return new acer();
//        }
//        else if(str.equals("mac")){
//            return  new mac();
//        }
//        else if(str.equals("lenovo")){
//            return new lenovo();
//        }
//        else{
//            System.out.println("没有找到该类商品");
//            return null;
//        }
//    }
//
//}
//class acer implements  Icomputer{
//    public void printcom(){
//        System.out.println("this is an acer");
//    }
//}
//class lenovo implements Icomputer{
//    public void printcom(){
//        System.out.println("this is a lenovo");
//    }
//}
//class mac implements Icomputer{
//    public void printcom(){
//        System.out.println("this is a mac");
//    }
//}

class lianxi {
    public static void main(String[] args) {

        int[] h = new int[10];
        int[]j=new int[5];
        for (int i = 0; i < 10; i++) {
            h[i] = i;
            System.out.print(h[i]);
        }


        char[] b = {'h', 'e', 'l', '\0', 'o'};
        double[]c=new double[10];
        System.out.println();
        System.out.print(b[3]);
        System.out.println();
        //在输出里面单独写数组名称，打印的是地址·
        System.out.println(j);
        //在java在打印\0字符的结果为空
        System.out.println("\0");
        System.out.println(j);
        System.out.println(c[2]);
String str2="hello";
        System.out.println(str2.replace("l","x"));
//与上面的修改无关，仍是打印hello
        //修改的字符串的内容，str.replace("需要替换的内容""替换成什么")
        //正则表达式，将字符串里的字符全部默认成.,然后全部替换为某个字符
//正则表达式默认将数组里面的元素默认为.
        System.out.println(str2.replaceAll(".","s"));
        System.out.println(str2.replaceFirst(".","s"));
        //字符串的拆分
//        String str3 = "hello world hello bit" ;
//        String[] result = str3.split(" ") ; // 按照空格拆分
//                 for(String s: result) {
//                     System.out.println(s);
//                 }
        String str3="lll ll l";
        //
        //当双引号内什么都没有的时候表示按照字符之间的空隙拆分。，也就是逐个拆分
//        String[] result=str3.split("");
//        for(String xiugai:result){
//            System.out.println(xiugai);
//        }
        String[] result=str3.split("",3);
        //split的双参数拆分，原则见一篇博客：
        //https://blog.csdn.net/pigdreams/article/details/70449891
        for(String xiugai:result){
            System.out.println(xiugai);
        }
        //由于.本身就有特殊的含义，所以要转移字符，否则上述192.168.1.1拆分出来为空
String str4="192.168.1.1";
        String[]dd=str4.split("\\.");
        for(String s2:dd){
            System.out.println(s2);
        }
//多次拆分，在以后开发中经常会遇到这种多次拆分的字符串
       String str5="hhy:22|her:20";
       String result3[]=str5.split("\\|");
       for(int i=0;i<result3.length;i++){
           String s3[]=result3[i].split(":");
           System.out.println(s3[0]+"="+s3[1]);
       }

String str6=" hehaoyuan ";
        System.out.println(str6);
        //字符串的截取，从第零个开始到最后一个字符之前结束，不包含最后一个字符
        //也可以理解为从0开始只取6个，算上第0个，即取完第五个元素
        System.out.println(str6.substring(0,6));
        //从3开始取完所有元素
        System.out.println(str6.substring(3));
        System.out.println(str6.trim());
//char []b={}
       char [] g={'s','s','d','f'};
        System.out.println(new String(g));
        System.out.println(new String(g,0,3));
Integer str7=10;
String a5=str7.toString();
        System.out.println(a5);
        char[]g1={'7','5','5','9','8'};
        System.out.println(new String(g1));
        System.out.println(new String(g1,2,1));
        String string="gjhghg";
        //将字符串返回为char数组
      //  char [] stringArr = string.toCharArray();

        //如果要返回byte数组就直接使用getBytes方法
      byte[]stringArr=string.getBytes();
      for(int n=0;n<stringArr.length;n++){
          System.out.println(stringArr[n]);
      }
        System.out.println(stringArr[stringArr.length-1]);


    }
}
