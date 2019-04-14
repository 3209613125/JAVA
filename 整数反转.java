import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        System.out.println("最大值:"+Integer.MAX_VALUE);
        System.out.println("最小值:"+Integer.MIN_VALUE);
        System.out.println("请输入:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        function(i);

    }
    public static int function(int i) {
        int[] data = new int[1000];
        for (int k = 0; k < data.length; k++) {
            if(i>0){
                data[k] = i % 10;
                i = i / 10;
                if (i < 10) {
                    data[k + 1] = i;
                    for(int l:data){
                            System.out.print(l+"");
                            if(l==data[k+1]){
                                break;
                        }
                    }
                    break;
                }
            }
            if(i<0){
                System.out.print("-");
            }
            if(i<0){
                i=(i>0)?i:-i;
                data[k] = i % 10;
                i = i / 10;
                if (i < 10) {
                    data[k + 1] = i;
                    for(int l:data){
                        System.out.print(l+"");
                        if(l==data[k+1]){
                            break;

                        }

                    }
                    break;
                }
            }

        }
return  1;
    }
}
