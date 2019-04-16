//用抽象类模拟星巴克咖啡机制作过程
import java.util.Scanner;
class Test {


    public static void main(String[] args) {
        coffee per = new coffee();
        per.shaoshui();
        per.receipt();
        per.custom();
        per.jiaoban();
        per.dicha();
    }
}

    abstract  class beverage{
       private  void shaoshui(){
            System.out.println("烧开水");
    }
        abstract  void receipt();
      private  void jiaoban(){
            System.out.println("搅拌饮料");
        }

        void dicha(){
            System.out.println("给大佬递饮料");
        }
    }
    class coffee extends beverage{
          void shaoshui(){
            System.out.println("烧开水");

        }
         void receipt() {
             System.out.println("加一包秘制咖啡粉");
         }

         public static boolean custom(){

             //String a=null;
             //System.out.println(a);
            System.out.println("需要加牛奶吗？");
            Scanner scanner=new Scanner(System.in);
            String str=scanner.nextLine();
//             Scanner scanner1=new Scanner(System.in);
//             String str1=scanner1.nextLine();
            // String str1=null;
//             System.out.println(str1.equals(null));

            if(str!=" "&&str==null&&str.equalsIgnoreCase("y")){
                System.out.println("加一包牛奶");
                return true;
            }
            else if (str.equalsIgnoreCase("n")){
                System.out.println("客户不需要加牛奶");
                return false;
            }
            else{
                System.out.println("非法输入");
                return false;
            }

        }
        void jiaoban(){
            System.out.println("搅拌饮料");
        }
        void dicha(){
            System.out.println("给大佬递咖啡");
        }
    }
