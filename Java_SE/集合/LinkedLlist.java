//LinkedList子类
//在List接口中还有一个LinkedList子类，这个子类如果向父接口转型的话，使用形式与之前没有任何区别。
import java.util.LinkedList; import java.util.List;

class TestDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>() ;
        list.add("hello") ;
        list.add("hello") ;
        list.add("bit") ;
        System.out.println(list) ;
        list.remove("hello") ;
        System.out.println(list) ;

 } }
