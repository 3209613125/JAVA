//按如下要求编写Java程序：
//        （1）定义接口A，里面包含值为3.14的常量PI和抽象方法double area()。
//        （2）定义接口B，里面包含抽象方法void setColor(String c)。
//        （3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。
//        （4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、
//        圆柱体的高height、颜色color。
//        （5）创建主类来测试类Cylinder




interface A
{
    static double PI = 3.14;
    abstract double area();
}

interface B
{
    abstract void setColor(String c);
}

interface C extends A,B
{
    abstract void volume();
}

class Cylinder implements C
{
    double radius;
    int height;
    String color;
    public void setColor(String color)
    {
        this.color = color;
        System.out.println("The cylinder's color is "+color);
    }
    public void volume()
    {
        System.out.println("The cylinder's volume is "+PI* radius*radius* height);
    }
    public double area()
    {
        System.out.println("The cylinder's area is "+2*PI *radius*radius
                + 2*PI *radius*height);
        return 0;
    }

}

class Test
{
    public static void main(String[] args)
    {
        Cylinder cylinder = new Cylinder();
        //cylinder.color = "red";
        cylinder.height = 15;
        cylinder.radius = 3.3;
        cylinder.area();
        cylinder.setColor(cylinder.color = "red");
        cylinder.volume();
    }
}
