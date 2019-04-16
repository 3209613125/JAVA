//自定义异常类
class AddException extends Exception{
    public AddException(String msg){
        super(msg);

    }

}
class Test {
    public static void main(String[] args) throws Exception {
        int num1=20;
        int num2=30;
        if(num1+num2==50){
            throw new AddException("错误的相加");

        }
    }

}
