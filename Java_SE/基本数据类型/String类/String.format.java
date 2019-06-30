public class Practice {
    public static void main(String[] args) {
        String s = new String("hello");
        String s1 = new String("World");
        System.out.println(String.format("%s,%s!%s",s1,s,s1));
        
        System.out.printf("Hello %s%s%s", "jerry-", "li", ",welcome!");
        //两者相似，前者直接打印，后者则方便修改，和append一样作为字符串的修改方法，优点则是
        //更容易规定一种格式规范
        System.out.println(String.format("Hello %s%s%s", "jerry-", "li", ",welcome!"));
        }
}



World,hello!World
Hello jerry-li,welcome!
