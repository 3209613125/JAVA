BigInteger概述
可以让超过Integer范围内的数据进行运算

构造方法
public BigInteger(String val)

成员方法
public BigInteger add(BigInteger val)
public BigInteger subtract(BigInteger val)
public BigInteger multiply(BigInteger val)
public BigInteger divide(BigInteger val)
public BigInteger[] divideAndRemainder(BigInteger val)

案例
import java.math.BigInteger;

public class test {

    public static void main(String[] args) {
        
        BigInteger bi1=new BigInteger("100");
        BigInteger bi2=new BigInteger("2");
        
        System.out.println(bi1.add(bi2));   //+
        System.out.println(bi1.subtract(bi2));   //-
        System.out.println(bi1.multiply(bi2));   //*
        System.out.println(bi1.divide(bi2));    //(除)
        
        BigInteger[] arr=bi1.divideAndRemainder(bi2);    //取商和余数
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
            
    }
    
}

输出：
102
98
200
50
50
0
