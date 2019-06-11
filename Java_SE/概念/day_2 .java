int i=5;
int s=(i++)+(++i)+(i- )+(--i);
s=( )//s 的值是什么？

A 28
B 25
C 21
D 26
E 24
F 23

正确答案：E

//s=(i++)+(++i)+(i--)+(--i);
int s1=(i++); //s1=5
int s2=(++i); //s2=7
int s3=(i--); //s3=7
int s4=(--i); //s4=5
int s=s1+s2+s3+s4;
System.out.println(s);
这样或许更容易理解。
s=24；
