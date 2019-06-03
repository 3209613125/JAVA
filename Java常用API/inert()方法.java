java.lang.StringBuilder.insert(int offset, String str) 方法插入字符串到这个字符序列。
	String参数字符按顺序插入到这个序列中的指定位置，向上移动原来的字符的位置和参数的长度增加该序列的长度。

	声明

	以下是java.lang.StringBuilder.insert()方法的声明
public StringBuilder insert(int offset, String str)

	参数

	
		
			offset -- 这是偏移量。
	
	
		
			str -- 这是字符串值。
	


	返回值

	该方法返回这个对象的一个引用。

	异常

	
		
			StringIndexOutOfBoundsException -- 如果偏移量是无效的。
	


	例子

	下面的例子显示java.lang.StringBuilder.insert()方法的使用。
package com.yiibai;

import java.lang.*;

public class StringBuilderDemo {

  public static void main(String[] args) {
  
    StringBuilder str = new StringBuilder("tutorials website");
    System.out.println("string = " + str);
        
    // insert string value at offset 9
    str.insert(9, "yiibai");

    // prints StringBuilder after insertion
    System.out.print("After insertion = ");
    System.out.println(str.toString());
  }      
}  

	让我们来编译和运行上面的程序，这将产生以下结果：
string = tutorials website
After insertion = yiibai website
