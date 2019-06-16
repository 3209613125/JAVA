import java.util.Arrays;

class Test{
    public static void main(String[] args) {
        int arr[] = {9,8,7,6};
        Arrays.sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}


//sort方法默认按照升序排列，即从小到大
