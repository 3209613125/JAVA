//set中不能有重复元素
import java.util.HashSet; import java.util.Set;

class TestDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>() ;
        set.add("Hello") ;
        // 重复元素
        set.add("apple");
        set.add("Hello") ;
        set.add("Bit") ;
        set.add("Hello") ;
        set.add("Java") ;
        System.out.println(set) ;
        }
}


--------------------------------------------------------------------------
