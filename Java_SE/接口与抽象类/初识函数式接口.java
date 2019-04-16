@FunctionalInterface
interface Ijiafa{
    int add(int a,int b);
}
@FunctionalInterface
interface Type{
    void printtype();
}
class Test{
    public static void main(String[] args) {
        Ijiafa ijiafa=(a,b) ->a+b;{
            System.out.println(ijiafa.add(3, 6));
        }
        Type type=() -> {
            System.out.println("我是函数接口");
            System.out.println("我也是函数接口");
        };
        type.printtype();

    }
}
