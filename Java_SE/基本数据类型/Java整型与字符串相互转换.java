1如何将字串 String 转换成整数 int?

　　A. 有两个方法:

　　1). int i = Integer. parseInt  ([String]); 或

　　i = Integer.parseInt  ([String],[int radix]);

　　2). int i = Integer.valueOf([String]);

　　注: 字串转成 Double, Float, Long 的方法大同小异.

2 如何将整数 int 转换成字串 String ?

　　A. 有叁种方法:

　　1.) String s = String.valueOf(i);

　　2.) String s = Integer.toString(i);

　　3.) String s = "" + i;

　　注: Double, Float, Long 转成字串的方法大同小异.

　　Java数据类型转换 ynniebo [收藏]

　（toString：将数值转换成字符串）

   （valueOf：字符串于数值之间的转换）
