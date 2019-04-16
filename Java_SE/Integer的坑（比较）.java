//阿里面试题，判断interger的两个值是否相同
class Test{
    public static void main(String[] args) {
        //引入常量池的概念，当Interger的值在[-127，128)之间时候，Interger不必开辟新的空间去给新的变量赋值，而是
        //引入常量池的概念，直接从常量池中去找-218到127之间的值赋给新的变量，那么地址也必然是一样的
        //equals比的是值的大小，==比较的是地址
        Integer a=1279;
        Integer b=1279;
        //这两种Integer赋值一样，个人不喜欢 new Integer()的方法，喜欢直接 integer value
//        Integer a=new Integer(22);
//        Integer b=new Integer(22);


//结果：无论是==还是equals全是true
        Integer a=Integer.valueOf(123);
        Integer b=Integer.valueOf(123);

////结果：equals是true，==为false
//       System.out.println(a.equals(b));
//        System.out.println(a==b);
    }
}
