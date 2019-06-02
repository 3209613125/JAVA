可以使用Java中\n和\r的换行，不过也是有区别的，如下：
　　1.\r 叫回车 Carriage Return
　　2.\n 叫新行 New Line
　　但是都会造成换行,使用System.getProperty("line.separator")来获取当前OS的换行符


常用：第一种：使用System.out.println()//这是换一行。

第二种：使用System.out.print("\n");//这也是换一行.

第一种和第二种差不多。只是，如果你要换两行，三行，多行的话。
就用：System.out.println("\n\n");换两行
换三行：System.out.println("\n\n"\n);



关于换行的Java代码：
1.问题

windows平台的换行符为/r/n;

linux平台的换行符为/n;

java程序中如何将不同平台用户输入的换行符转换成特定系统的换行符.

2.解答
java 代码

1. String userInputString = userInput; 
2. userInputString = userInputString.replaceAll ( "\r", "" ); 
3. userInputString = userInputString.replaceAll ( "\n", "\\\\"+System.getPropert("line.separator"));
1 //没明白啥意思
2 String userInputString = userInput; 
3  userInputString = userInputString.replaceAll ( "\r", "" );
