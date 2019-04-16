早期加法的实现
public class fanxing {
    public static void main(String[] args) {
        System.out.println(add(new int []{3,5,6,8}));
    }
    public static int add(int []data){
        int result=0;
        for(int i=0;i<data.length;i++){
            result+=data[i];
        }
        return result;
    }
}

这种方式本身就存在缺陷，现在要设计的不是数组，而是多个可变参数，从jdk1.5之后引入了可变参数的概念
public [static] [final] 返回值 方法名称([参数类型 参数名称][参数类型 ... 参数名称]){}

再写一遍上面的代码
class fanxing{
    public static void main(String[] args) {
        System.out.println(add(3,5,6,8));
        System.out.println(add(new int[]{3,5,6,8}));
    }
    public static int add(int...str){
        int result=0;
        for(int i=0;i<str.length;i++){
            result+=str[i];
        }
                return result;
    }
}

现阶段可以通过类库观察到使用
 注意点：如果要传递多类参数，可变参数一定放在最后，并且只能设置一个可变参数


范例：传递多类参数
class fanxing{
    public static void main(String[] args) {
        System.out.println(add("我爱你中国",3,5,6,8));
        System.out.println(add("我爱你中国",new int[]{3,5,6,8}));
    }
    public static int add(String arr,int...data){
        int result=0;
        for(int i=0;i<data.length;i++){
            result+=data[i];
        }
return result;
    }
}
现在只能打印int类，而无法打印String类
问题来了，以上有两个参数，String类和int类，且返回值只能有一个，int类必然无法返回String类，反之亦然

foreach循环
class fanxing{
    public static void main(String[] args) {
        int data[]=new int[]{3,5,6,8};
        for(int i:data){
            System.out.println(i);
        }
    }
}
