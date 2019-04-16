//请解释enum与Enum区别：
// enum是一个关键字，使用enum定义的枚举类本质上就相对于一个类继承了Enum这个抽象类而已。
//在枚举中定义结构（属性，方法，以及接口）
enum color{
    blue("蓝色"), red("红色"), green("绿色");
private String title;
private color(String title){
    this.title=title;
}
    @Override
    public String toString() {
        return this.title;
    }
}
class Test{
    public static void main(String[] args) {
        //取得枚举对象所在的序号
        System.out.println(color.blue.ordinal());
        //取得枚举的名称
        System.out.println(color.blue.name());
        //在枚举操作中还有一个方法可以取得所有的枚举数据：values()返回的是一个枚举的对象数组
        System.out.println(color.blue.values());
        System.out.println(color.red.values());

        System.out.println(color.blue);

    }

}

//枚举还可以实现接口
interface Icolor{
    public String getcolor();
}
enum color implements Icolor{
    red("红色"),green("绿色"),blue("蓝色");
    private String title;
    private color(String title){
        this.title=title;
    }


    @Override
    public String toString() {
       return this.title;
    }
    public String getcolor(){
        return this.title;
    }

}
class Test{
    public static void main(String[] args) {
        Icolor icolor=color.blue;
        System.out.println(icolor.getcolor());
    }
}
