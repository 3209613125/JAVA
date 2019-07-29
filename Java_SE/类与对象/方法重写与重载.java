java方法的重写

1.目前的问题：父类的功能无法满足子类的需求。

2.方法重写的前提： 必须要存在继承的关系。

3.方法的重写: 子父类出了同名的函数，这个我们就称作为方法的重写。

4.什么是时候要使用方法的重写：父类的功能无法满足子类的需求时。

5.方法重写要注意的事项：

1.方法重写时， 方法名与形参列表必须一致。 
2.方法重写时，子类的权限修饰符必须要大于或者等于父类的权限修饰符。 
3.方法重写时，子类的返回值类型必须要小于或者 等于父类的返回值类型。 
4.方法重写时， 子类抛出的异常类型要小于或者等于父类抛出的异常类型。 Exception(最坏) RuntimeException(小坏)

6.方法的重载：在一个类中 存在两个或者两个 以上的同名函数,称作为方法重载。

7.方法重载的要求

1.函数名要一致。
2.形参列表不一致（形参的个数或形参 的类型不一致）
3.与返回值类型无关。


class Animal{  //大的数据 类型 
}

class Fish extends Animal{  //Fish小 的数据类型。
}


实例1：


class Fu{

    String name;

    public Fu(String name){
        this.name = name;
    }

    public Animal eat() throws RuntimeException {
        System.out.println(name+"吃番薯...");
        return new Animal();
    }
}


class Zi extends Fu{

    String num;

    public Zi(String name){
        super(name);//指定调用 父类带参的构造方法
    }


    //重写父类的eat方法
    public Animal eat() throws Exception{
        System.out.println("吃点开胃菜..");
        System.out.println("喝点汤....");
        System.out.println("吃点龙虾....");
        System.out.println("吃青菜....");
        System.out.println("喝两杯....");
        System.out.println("吃点甜品...."); 
        return new Animal();
    }

}

class Demo{

    public static void main(String[] args) 
    {
        Zi z = new Zi("大头儿子");
        z.eat();

    }
}
 
 
实例2：

class Student{

    String name;

    //构造函数
    public Student(String name){
        this.name = name;
    }

    public void study(){
        System.out.println(name+"学习马克思列宁主义");
    }
}

//基础班的学生是属于学生中一种
class BaseStudent extends Student{


    public BaseStudent(String name){
        super(name);//指定调用父类构造函数
    }

    //重写
    public void study(){
        System.out.println(name+"学习javase..");
    }
}


//就业班学生 也是属于普通学生中一种
class WorkStudent extends Student{

    //构造 函数
    public WorkStudent(String name){
        super(name);
    }
        //重写
    public void study(){
        System.out.println(name+"学习javaee+android..");
    }
}


class Demo
{
    public static void main(String[] args) 
    {
        //System.out.println("Hello World!");

        BaseStudent s = new BaseStudent("居东东");
        s.study();

        //创建一个就业班的学生
        WorkStudent w = new WorkStudent("张三");
        w.study();
    }
}
