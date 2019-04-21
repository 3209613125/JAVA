import java.util.List; import java.util.Vector;

 class TestDemo {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("hello");
        list.add("hello");
        list.add("嘤嘤嘤");
        list.add("hello");
        list.add("bit");
        list.add("hello");
        list.add("hello");
        System.out.println(list);

       // remove()方法删掉的是相同元素中的第一个元素，并且只删除一个（第一个）
        //remove()括号内放接收类型为Object，包括整形，数组
        //而removeall删除所有元素
        list.remove("hello");
        System.out.println(list);
    }
}
