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

　

　（toString：将数值转换成字符串）

   （valueOf：字符串于数值之间的转换）
   
   
   
   这是一个例子,说的是JAVA中数据数型的转换.供大家学习引

　　package cn.com.lwkj.erts.reGISter;

　　import java.sql.Date;

　　public class TypeChange {

　　public TypeChange() {

　　}

　　//change the string type to the int type

　　public static int stringToInt(String intstr)

　　{

　　Integer integer;

　　integer = Integer.valueOf(intstr);

　　return integer.intValue();

　　}

　　//change int type to the string type

　　public static String intToString(int value)

　　{

　　Integer integer = new Integer(value);

　　return integer.toString();

　　}

　　//change the string type to the float type

　　public static float stringToFloat(String floatstr)

　　{

　　Float floatee;

　　floatee = Float.valueOf(floatstr);

　　return floatee.floatValue();

　　}

　　//change the float type to the string type

　　public static String floatToString(float value)

　　{

　　Float floatee = new Float(value);

　　return floatee.toString();

　　}

　　//change the string type to the sqlDate type

　　public static java.sql.Date stringToDate(String dateStr)

　　{

　　return java.sql.Date.valueOf(dateStr);

　　}

　　//change the sqlDate type to the string type

　　public static String dateToString(java.sql.Date datee)

　　{

　　return datee.toString();

　　}

　　public static void main(String[] args)

　　{

　　java.sql.Date day ;

　　day = TypeChange.stringToDate("2003-11-3");

　　String strday = TypeChange.dateToString(day);

　　System.out.println(strday);

　　}

　　}

　　JAVA中常用数据类型转换函数

　　虽然都能在JAVA API中找到，整理一下做个备份。

　　string->byte

　　Byte static byte parseByte(String s)

　　byte->string

　　Byte static String toString(byte b)

　　char->string

　　Character static String to String (char c)

　　string->Short

　　Short static Short parseShort(String s)

　　Short->String

　　Short static String toString(Short s)

　　String->Integer

　　Integer static int parseInt(String s)

　　Integer->String

　　Integer static String tostring(int i)

　　String->Long

　　Long static long parseLong(String s)

　　Long->String

　　Long static String toString(Long i)

　　String->Float

　　Float static float parseFloat(String s)

　　Float->String

　　Float static String toString(float f)

　　String->Double

　　Double static double parseDouble(String s)

　　Double->String

　　Double static String toString(Double d)
