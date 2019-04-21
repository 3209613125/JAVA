import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

class TestArrayList {
    TestArrayList() {
    }

    public static void code1() {
        List<String> list = new ArrayList();
        list.add("Java");
        list.add("C++");
        list.add(0, "PHP");
        list.add(2, "Python");
        list.add("Java");
        System.out.println("原List：" + list);
        System.out.println("Lis是否为空：" + list.isEmpty());
        System.out.println("List的长度：" + list.size());
        System.out.println("List是否包含PHP：" + list.contains("PHP"));
        System.out.println("List移除Java：" + list.remove("Java"));
        System.out.println("List移除index=0：" + (String)list.remove(0));
        System.out.println("当前的List：" + list);
        System.out.println(list.lastIndexOf(2));
        System.out.println("获取index=0：" + (String)list.get(0));

        for(int i = 0; i < list.size(); ++i) {
            System.out.println((String)list.get(i));
        }

    }

    public static void code2() {
        Collection<String> collection = new ArrayList();
        collection.add("Java");
        collection.add("C++");
        collection.add("PHP");
        Object[] values = collection.toArray();
        Object[] var2 = values;
        int var3 = values.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Object value = var2[var4];
            System.out.println(value);
        }

        System.out.println(Arrays.toString(values));
    }

    public static void main(String[] args) {
        List<String> vector = new Vector();
        vector.add("Java");
        vector.add("C++");
        code1();
        System.out.println("*****************");
        code2();
    }
}




--------------------------------------------------------------------------


结果：

原List：[PHP, Java, Python, C++, Java]
Lis是否为空：false
List的长度：5
List是否包含PHP：true
List移除Java：true
List移除index=0：PHP
当前的List：[Python, C++, Java]
-1
获取index=0：Python
Python
C++
Java
*****************
Java
C++
PHP
[Java, C++, PHP]



