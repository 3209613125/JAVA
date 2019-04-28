import java.util.LinkedList;
        import java.util.Queue;
        import java.util.concurrent.atomic.AtomicInteger;
/**
 * 消费者：
 * 1. 消费商品
 * 2. 从容器中取出商品
 * 3. 如果容器为空，通知生产者生产
 */

class Customer implements Runnable{
    private final Queue<Goods> queue;

    public Customer(Queue<Goods> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this.queue){
                if(this.queue.isEmpty()){
                    System.out.println(Thread.currentThread().getName()+"容器已空，请继续生产");
                    this.queue.notifyAll();
                }else{
                    Goods goods = this.queue.poll();
                    if(goods != null){
                        System.out.println(Thread.currentThread().getName()+"正在消费商品"+goods);
                    }
                }
            }
        }
    }
}

/**
 * 商品
 */
class Goods{
    private final String id;
    private final String name;

    public Goods(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

/**
 *  生产者：
 * 1. 生产商品
 * 2. 将生产的商品添加到容器
 * 3. 如果容器已经满了，等待消费（等通知）
 */
class Producer implements Runnable{
    private final Queue<Goods> queue;
    private final Integer maxCapacity = 10;
    private final AtomicInteger id = new AtomicInteger(0);
    public Producer(Queue<Goods> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }synchronized(this.queue) {
                if (this.queue.size() == maxCapacity) {
                    //wait
                    System.out.println(Thread.currentThread().getName() + " 容器满了  等待消费");
                    try {
                        this.queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    Goods goods = new Goods(
                            String.valueOf(id.getAndIncrement()),
                            "商品"
                    );
                    System.out.println(Thread.currentThread().getName() + " 生产商品 " + goods);
                    this.queue.add(goods);
                }
            }
        }
    }

}

public class text_Subject {
    public static void main(String[] args) {
        //容器  file ,db , kafka, redis, mq , zookeeper
        final Queue<Goods> queue = new LinkedList<>();
        //生产者的业务类
        final Runnable produce = new Producer(queue);
        //消费者的业务类
        final Runnable customer = new Customer(queue);

        //生产者线程
        for (int i = 0; i < 5; i++) {
            new Thread(produce, "Thread-Produce-" + i).start();
        }
        //消费者线程
        for (int i = 0; i < 8; i++) {
            new Thread(customer, "Thread-Customer-" + i).start();
        }
    }
}
