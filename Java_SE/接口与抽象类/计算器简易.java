interface Ijisuanqi {
public int jisuan(int a,int b);
}

class jiafa implements Ijisuanqi {
   public  int jisuan(int a,int b){
       return  a+b;
   }

}
class jianfa implements Ijisuanqi {
public int jisuan(int a,int b){
    return a-b;
}
}
class chengfa implements Ijisuanqi {

    public int jisuan(int a,int b){
        return a*b;
    }
}
class chufa implements Ijisuanqi {

    public int jisuan(int a,int b){
        if(b==0){
            return -1;
        }
        else {
            return a/b;
        }
    }
}
class Test{
    public static void main(String[] args) {

        jiafa s1=new jiafa();
        jianfa s2=new jianfa();
        chengfa s3 =new chengfa();
        chufa s4=new chufa();
        System.out.print("加法结果:");fun(s1,8,3);
        System.out.print("减法结果:");fun(s2,8,3);
        System.out.print("乘法结果:");fun(s3,8,3);
        System.out.print("除法结果:");fun(s4,8,3);

    }
    public static void fun(Ijisuanqi ijisuanqi,int a,int b){
        System.out.println(ijisuanqi.jisuan(a,b));

    }
}
