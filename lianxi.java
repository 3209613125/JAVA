//��java.class�ļ�ֻ������ϰ����
//interface  Isubject{
//
//    void buycomputer();
//}
//class realsubject implements Isubject{
//
//    public void buycomputer(){
//        System.out.println("��һ̨���ԣ�����");
//    }
//}
//class proxysubject implements Isubject{
//    private Isubject isubject;
//    public proxysubject(Isubject isubject){
//        this.isubject=isubject;
//
//    }
//void berforebuy(){
//    System.out.println("ȥ����mac���Ŷ�");
//}
//void afterbuy(){
//    System.out.println("��ݸ��˿�");
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


//���Ȼ�
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
//         System.out.println("�������");
//     }
//    abstract void dicha();
//}
//class kafei extends bverage {
//    void kafei() {
//
//    }
//
//    void daoshui() {
//        System.out.println("����ˮ");
//    }
//
//    void jiapeifang() {
//        System.out.println("���뿧�ȷ�");
//    }
//
//    void star() {
//        System.out.println("�������");
//    }
//
//    @Override
//    void dicha() {
//        System.out.println("��Ҫ��ţ����");
//
//        while (true) {
//            //������ŵ�ѭ���ڲ���������Ƿ���ʱ����Ը��û��ٴ�����Ļ��ᣬ����һ�������ѭ����ӡ���޴�
//            Scanner scanner = new Scanner(System.in);
//            String str1 = scanner.nextLine();
//            if (str1.equalsIgnoreCase("y")) {
//                System.out.println("��ţ�̣������еݿ���");
//                break;
//            } else if (str1.equalsIgnoreCase("n")) {
//                System.out.println("����ţ�̣������еݿ���");
//                break;
//            } else {
//                System.out.println("����Ƿ�");
//                continue;
//            }
//
//        }
//    }
//}

//�������ͳ�������ϰ��

//�򵥹������ģʽ
//import java.util.Scanner;
////������ӿͻ���
//class Client{
//    public void buycom(Icomputer icomputer){
//        icomputer.printcom();
//    }
//    public static void main(String[] args)throws Exception {
//       Client client=new Client();
//        System.out.println("�������Ҫ�ĵ����ͺ�");
//       Scanner scanner=new Scanner(System.in);
//       String str=scanner.nextLine();
//       Icomputer icomputer=factory.getinstance(str);
//       client.buycom(icomputer);
//    }
//}
//�ӿ�
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
//                System.out.println("û���ҵ�ָ����Ʒ");
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
//        System.out.println("����������Ҫ�ĵ���Ʒ��");
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
////factory���ǳ���ģ�Ҳ����Ҫ�̳нӿ�
//class factory {
////getinstance����Ҫ�ó��󷽷�
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
//            System.out.println("û���ҵ�������Ʒ");
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
        //��������浥��д�������ƣ���ӡ���ǵ�ַ��
        System.out.println(j);
        //��java�ڴ�ӡ\0�ַ��Ľ��Ϊ��
        System.out.println("\0");
        System.out.println(j);
        System.out.println(c[2]);
String str2="hello";
        System.out.println(str2.replace("l","x"));
//��������޸��޹أ����Ǵ�ӡhello
        //�޸ĵ��ַ��������ݣ�str.replace("��Ҫ�滻������""�滻��ʲô")
        //������ʽ�����ַ�������ַ�ȫ��Ĭ�ϳ�.,Ȼ��ȫ���滻Ϊĳ���ַ�
//������ʽĬ�Ͻ����������Ԫ��Ĭ��Ϊ.
        System.out.println(str2.replaceAll(".","s"));
        System.out.println(str2.replaceFirst(".","s"));
        //�ַ����Ĳ��
//        String str3 = "hello world hello bit" ;
//        String[] result = str3.split(" ") ; // ���տո���
//                 for(String s: result) {
//                     System.out.println(s);
//                 }
        String str3="lll ll l";
        //
        //��˫������ʲô��û�е�ʱ���ʾ�����ַ�֮��Ŀ�϶��֡���Ҳ����������
//        String[] result=str3.split("");
//        for(String xiugai:result){
//            System.out.println(xiugai);
//        }
        String[] result=str3.split("",3);
        //split��˫������֣�ԭ���һƪ���ͣ�
        //https://blog.csdn.net/pigdreams/article/details/70449891
        for(String xiugai:result){
            System.out.println(xiugai);
        }
        //����.�����������ĺ��壬����Ҫת���ַ�����������192.168.1.1��ֳ���Ϊ��
String str4="192.168.1.1";
        String[]dd=str4.split("\\.");
        for(String s2:dd){
            System.out.println(s2);
        }
//��β�֣����Ժ󿪷��о������������ֶ�β�ֵ��ַ���
       String str5="hhy:22|her:20";
       String result3[]=str5.split("\\|");
       for(int i=0;i<result3.length;i++){
           String s3[]=result3[i].split(":");
           System.out.println(s3[0]+"="+s3[1]);
       }

String str6=" hehaoyuan ";
        System.out.println(str6);
        //�ַ����Ľ�ȡ���ӵ������ʼ�����һ���ַ�֮ǰ���������������һ���ַ�
        //Ҳ�������Ϊ��0��ʼֻȡ6�������ϵ�0������ȡ������Ԫ��
        System.out.println(str6.substring(0,6));
        //��3��ʼȡ������Ԫ��
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
        //���ַ�������Ϊchar����
      //  char [] stringArr = string.toCharArray();

        //���Ҫ����byte�����ֱ��ʹ��getBytes����
      byte[]stringArr=string.getBytes();
      for(int n=0;n<stringArr.length;n++){
          System.out.println(stringArr[n]);
      }
        System.out.println(stringArr[stringArr.length-1]);


    }
}
