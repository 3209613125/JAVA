//接口Person

 interface Person {
    public void eat();
}

//实现类People

 class People implements Person {
    private int a=0;
    @Override
    public void eat() {
        System.out.println("======"+a);

    }

}

//子类xiaoming：

 class xiaoming extends People {
    private String name;

    @Override
    public void eat() {
        System.out.println("+++++++++");
    }
}

//主函数
class  Test {
    public static void main(String[] args) {
        People p = new People();
        xiaoming x = new xiaoming();
        System.out.println(p instanceof Person);
        System.out.println(p instanceof xiaoming);
        System.out.println(x instanceof Person);
        System.out.println(x instanceof People);
    }
}

