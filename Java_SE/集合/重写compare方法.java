import java.util.*;

class Test{
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(3);
        array.add(5);
        Collections.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<o2){
                    return  1;
                }
                if(o1>o2){
                    return  -1;
                }
                return 0;
            }
        });
        for(Integer i:array){
            System.out.println(i);
        }
    }



}


//执行结果：
//按从大到小的顺序排序
//5，3，2，1
