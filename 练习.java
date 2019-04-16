



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
