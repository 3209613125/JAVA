import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Java");
        queue.add("C++");
        queue.add("PHP");

        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());//Java
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        //如果队列为空，继续出队列，返回null
        System.out.println(queue.poll());

    }
}
