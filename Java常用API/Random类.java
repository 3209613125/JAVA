#import java.util.Random;
public class April_9 {

    public static void main(String[] args) {
        Random suiji=new Random();
        double d1=suiji.nextDouble();
        int d2=suiji.nextInt(1) -8;
        //随机数生成时，bound括号外面值默认为0，但是如果设置了别的数，
        // 那么bound括号内的数减去外部的值作为右半边开区间,所以上述范围在[-8,-7)
       Boolean d3=suiji.nextBoolean();
        System.out.println(d1+"\n"+d2+"\n"+d3);
        System.out.println("生成9位开奖彩票号码为:");
        for (int i=1;i<10;i++){
            int d4=suiji.nextInt(9);
            System.out.print(d4);
        }

    }
}
---------------------------------------------------------------------------------------------------------------

 class Test{
    public static void main(String[] args){

        int min=2;    //定义随机数的最小值
        int max=102;    //定义随机数的最大值
        //产生一个2~100的数
        int s=(int) min+(int)(Math.random()*(max-min));
        if(s%2==0)    //如果是偶数就输出
            System.out.println("随机数是："+s);
        else    //如果是奇数就加1后输出
            System.out.println("随机数是："+(s+1));
    }
}
