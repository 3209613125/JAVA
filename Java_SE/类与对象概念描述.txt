抽象方法，指的是声明而未实现的方法，它只不过是在普通的类的基础上扩充了一些抽象类罢了，没有方法体，他所在的类中和方法都要
用abstract来修饰
抽象类不象具体类那样描述一类具体事物，它是提取多种具有相似性的具体事物的共同特征而产生的
 比如，helicoptor, jet, fighter父类plane，有start(),takeOff(),speedUp(),changeDirection()等方法，
 这是共性，但现实中有一个具体的plane吗？没有，它是抽象出来的，根本不存在。所以实例化一个plane是没有意义的，
 因此面向对象程序设计机制禁止对象实例化，抽象类中禁止实例化对象
抽象类一定不能用final声明，因为final不能有子类，而抽象类一定含有子类，相应的，抽象方法也不能含有private来修饰
因为private修饰的方法不能被覆写，而抽象方法则一定要被覆写
private和abstract不能同时使用
抽象类必须有子类，且子类必须重新覆写该抽象父类的抽象方法，例如抽象类Person，子类Student，
 Person per=new Student（),per.play()(实例化子类，向上转型）
普通方法可以有返回值也可以没有返回值，而构造方法一定没有返回值，也没有static，final，abstract等词的修饰，
 分为有参构造和无参构造
abstract class Test {
    private String name; // 属性

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

    }
}
