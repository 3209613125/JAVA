import java.lang.reflect.Constructor;
class Test01
{
    public static void main(String[] args)
    {
        //获取动态类Book
        Class book=Book.class;
        //获取Book类的所有构造方法
        Constructor[] declaredContructors=book.getDeclaredConstructors();
        //遍历所有构造方法
        for(int i=0;i<declaredContructors.length;i++)
        {
            Constructor con=declaredContructors[i];
            //判断构造方法的参数是否可变
            System.out.println("查看是否允许带可变数量的参数："+con.isVarArgs());
            System.out.println("该构造方法的入口参数类型依次为：");
            //获取所有参数类型
            Class[] parameterTypes=con.getParameterTypes();
            for(int j=0;j<parameterTypes.length;j++)
            {
                System.out.println(" "+parameterTypes[j]);
            }
            System.out.println("该构造方法可能拋出的异常类型为：");
            //获取所有可能拋出的异常类型
            Class[] exceptionTypes=con.getExceptionTypes();
            for(int j=0;j<exceptionTypes.length;j++)
            {
                System.out.println(" "+parameterTypes[j]);
            }
            //创建一个未实例化的Book类实例
            Book book1=null;
            while(book1==null)
            {
                try
                {    //如果该成员变量的访问权限为private，则拋出异常
                    if(i==1)
                    {
                        //通过执行带两个参数的构造方法实例化book1
                        book1=(Book)con.newInstance("Java 教程",10);
                    }
                    else if(i==2)
                    {
                        //通过执行默认构造方法实例化book1
                        book1=(Book)con.newInstance();
                    }
                    else
                    {
                        //通过执行可变数量参数的构造方法实例化book1
                        Object[] parameters=new Object[]{new String[]{"100","200"}};
                        book1=(Book)con.newInstance(parameters);
                    }
                }
                catch(Exception e)
                {
                    System.out.println("在创建对象时拋出异常，下面执行 setAccessible() 方法");
                    con.setAccessible(true);    //设置允许访问 private 成员
                }
            }
            book1.print();
            System.out.println("=============================\n");
        }
    }
}
class Book
{
    String name;    //图书名称
    int id,price;    //图书编号和价格
    //空的构造方法
    private Book(){}
    //带两个参数的构造方法
    protected Book(String _name,int _id)
    {
        this.name=_name;
        this.id=_id;
    }
    //带可变参数的构造方法
    public Book(String...strings)throws NumberFormatException
    {
        if(0<strings.length)
            id=Integer.valueOf(strings[0]);
        if(1<strings.length)
            price=Integer.valueOf(strings[1]);
    }
    //输出图书信息
    public void print()
    {
        System.out.println("name="+name);
        System.out.println("id="+id);
        System.out.println("price="+price);
    }
}
