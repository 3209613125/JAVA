java.util.LinkedList.pollFirst() 方法检索并移除此列表的第一个元素，或者如果此列表为空，则返回null。

	声明

	以下是java.util.LinkedList.pollFirst()方法的声明
public E pollFirst()

	参数

	
		
			NA
	


	返回值

	此方法返回此列表的第一个元素，则返回null如果此列表为空

	异常

	
		
			NA
	


	例子

	下面的示例演示java.util.LinkedList.pollFirst()方法的用法。
package com.yiibai;

import java.util.*;

public class LinkedListDemo {

   public static void main(String[] args) {

      // create a LinkedList
      LinkedList list = new LinkedList();

      // add some elements
      list.add("Hello");
      list.add(2);
      list.add("Chocolate");
      list.add("10");

      // print the list
      System.out.println("LinkedList:" + list);

      // retrieve and remove the first element of the list
      System.out.println("First element of the list:" + list.pollFirst());

      // print the list
      System.out.println("LinkedList:" + list);
   }
}


	让我们来编译和运行上面的程序，这将产生以下结果：
LinkedList:[Hello, 2, Chocolate, 10]
First element of the list:Hello
LinkedList:[2, Chocolate, 10]

