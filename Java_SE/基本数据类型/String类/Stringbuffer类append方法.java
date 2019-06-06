append方法用来累积字符串的,
如: StringBuffer a = new StringBuffer();
a.append("a");
a.append("b");
System.out.println(a.toString());
这个时候就会输出ab .
用途是当需要大量的字符串拼接时使用 优点效率比+=要高很多 （+=内存中是相当于创建副本重新赋值，StringBuffer是指针的引用
