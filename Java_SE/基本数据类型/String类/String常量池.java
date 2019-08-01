public class test1{
    public static void main(String[] args) {
        String a = "123";
        String b = "123";
        System.out.println(a==b);
        //true
    }
}

那通过结果我们可以看到  只创建了一个String 对象 为什么会这样呢这就是java中的常量池   

当创建一个常量对象时  先判断 常量池是否存在 相同内容的常量   如果存在就不再继续创建 而是将找到常量的引用 给 要创建的字符串常量    他们其实是一个对象



class test2{
    public static void main(String[] args) {
        String a = "123";
        String b = new String("123");
        System.out.println(a==b);
        //false
    }
}

  从运行结果我们可以看到这是两个不同的字符串对象

  那是因为 常量池中本身存在"123" 这个字符串对象    在 执行new String("123" ) 时  只是将常量池中的"123"复制到 堆中 

然后对象的引用 交给b  这其实就是两个字符串对象  一个在 常量池 一个在 堆中  所以运行结果为false
