1.2F*2 = 2.4,Float比Integer大,小变大自动提升.


System.out.println(1.1*1.1); 1.2100000000000002，默认精度为double,此时如果强转为float,结果为1.21,会丢失精度.


int a = 10; int b = 4;System.out.println(a/b);结果为2,System.out.println((double) a/b);结果为2.5;


Integer最大最小值的转换: Integer.MAX_VALUE+1=-2147483648,Integer.MIN_VALUE-1=2147483647,Integer:-2147483648到2147483647;


(long) Integer.MAX_VALUE+1=2147483648,(long) Integer.MIN_VALUE-1=-2147483649


'A'的int之为65,char c = 'A';int num = c;System.out.println(num);结果为65;
int num = 97;char c = (char) num;System.out.println(c); 此处int到char强转，上面char到int不需要强转
小'a'为97，Ascll int91到97对应的char，   [,\,],^,-,`,a，65-90：A-Z，91-96：[,\,],^,-，97-122:a-z，Ascll:整形0-127一共128个字符
'A'到'a',为(char) ('A'+32)，需要强转，否则答案为97，即64+32，因为int比char大
