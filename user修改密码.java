import java.util.Scanner;
class Member {
    private String mima;
    private  String name;

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member(String mima, String name) {
        this.mima = mima;
        this.name=name;
    }
}
class Test2{
    public static void main(String[] args) {
        Member member=new Member("hhyuan123456","核桃圆");
        while(true){
            System.out.println("**************************");
            System.out.println("用户名称："+member.getName());
            System.out.println("请输入原始密码:");
            Scanner scanner=new Scanner(System.in);
            String str=scanner.next();
            if(str.equalsIgnoreCase("hhyuan123456")){
            System.out.println("输入正确!");
            break;
        }
        else{

                System.out.println("您的输入有误，请重新输入:");
                continue;

            }
        }
        System.out.println("请输入您的新密码:");
        Scanner scanner1=new Scanner(System.in);
        String str1=scanner1.next();
        member.setMima(str1);
        member.getMima();
        System.out.println("修改成功:"+"\n"+"*******************");
        System.out.println("\n"+"用户名称:核桃圆"+"\n"+"新密码为:"+str1);

    }
}
