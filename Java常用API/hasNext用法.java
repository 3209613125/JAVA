  Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            System.out.println("键盘输入的内容是："

                + sc.next());
        }

////hasNext()返回的是boolean类型
//下面我们去查一下API
//方法解释：如果此扫描器的输入（缓冲区）中有另一个token(输入的字符或数字)，则返回true。what？ 
//根本没有提到什么时候返回false。其实执行过程是这样的(重点：），当执行到hasNext（）时，它会先扫描缓冲区中是否有字符，
//有则返回true,继续扫描。直到扫描为空，这时并不返回false,而是将方法阻塞，等待你输入内容然后继续扫描。这样的话，它岂不是吃了**口香糖根本停不下来。

//通常解决方法：
Scanner sc = new Scanner(System.in);
        while(!sc.hasNext("#"))  //匹配#返回true,然后取非运算。即以#为结束符号，这样当读取到#时读取字符的操作就会结束
        {
            System.out.println("键盘输入的内容是："

                + sc.next());
        }
