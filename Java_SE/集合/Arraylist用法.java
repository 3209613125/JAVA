Arraylist
1、什么是ArrayList
    ArrayList就是传说中的动态数组，用MSDN中的说法，就是Array的复杂版本，它提供了如下一些好处：

动态的增加和减少元素
实现了ICollection和IList接口
灵活的设置数组的大小

2、如何使用ArrayList
    最简单的例子：
ArrayList List = new ArrayList();
for( int i=0;i<10;i++ ) //给数组增加10个Int元素
List.Add(i);
//..程序做一些处理
List.RemoveAt(5);//将第6个元素移除
for( int i=0;i<3;i++ ) //再增加3个元素
  List.Add(i+20);
Int32[] values = (Int32[])List.ToArray(typeof(Int32));//返回ArrayList包含的数组

这是一个简单的例子，虽然没有包含ArrayList所有的方法，但是可以反映出ArrayList最常用的用法

3、ArrayList重要的方法和属性
（1）构造器
    ArrayList提供了三个构造器：
public ArrayList();
默认的构造器，将会以默认（16）的大小来初始化内部的数组
public ArrayList(ICollection);
用一个ICollection对象来构造，并将该集合的元素添加到ArrayList
public ArrayList(int);
用指定的大小来初始化内部的数组

（2）IsSynchronized属性和ArrayList.Synchronized方法
    IsSynchronized属性指示当前的ArrayList实例是否支持线程同步，而ArrayList.Synchronized静态方法则会返回一个ArrayList的线程同步的封装。
    如果使用非线程同步的实例，那么在多线程访问的时候，需要自己手动调用lock来保持线程同步，例如：
ArrayList list = new ArrayList();
//...
lock( list.SyncRoot ) //当ArrayList为非线程包装的时候，SyncRoot属性其实就是它自己，但是为了满足ICollection的SyncRoot定义，这里还是使用SyncRoot来保持源代码的规范性
{
list.Add( “Add a Item” );
}

     如果使用ArrayList.Synchronized方法返回的实例，那么就不用考虑线程同步的问题，这个实例本身就是线程安全的，实际上ArrayList内部实现了一个保证线程同步的内部类，ArrayList.Synchronized返回的就是这个类的实例，它里面的每个属性都是用了lock关键字来保证线程同步。

****

但是，使用这个方法（ArrayList.Synchronized）并不能保证枚举的同步，例如，一个线程正在删除或添加集合项，而另一个线程同时进行枚举，这时枚举将会抛出异常。所以，在枚举的时候，你必须明确使用 SyncRoot 锁定这个集合。



Hashtable与ArrayList关于线程安全性的使用方法类似。

****

（3）Count属性和Capacity属性
    Count属性是目前ArrayList包含的元素的数量，这个属性是只读的。
Capacity属性是目前ArrayList能够包含的最大数量，可以手动的设置这个属性，但是当设置为小于Count值的时候会引发一个异常。

（4）Add、AddRange、Remove、RemoveAt、RemoveRange、Insert、InsertRange
    这几个方法比较类似
Add方法用于添加一个元素到当前列表的末尾
AddRange方法用于添加一批元素到当前列表的末尾
Remove方法用于删除一个元素，通过元素本身的引用来删除
RemoveAt方法用于删除一个元素，通过索引值来删除
RemoveRange用于删除一批元素，通过指定开始的索引和删除的数量来删除
Insert用于添加一个元素到指定位置，列表后面的元素依次往后移动
InsertRange用于从指定位置开始添加一批元素，列表后面的元素依次往后移动

    另外，还有几个类似的方法：
Clear方法用于清除现有所有的元素
Contains方法用来查找某个对象在不在列表之中

    其他的我就不一一累赘了，大家可以查看MSDN，上面讲的更仔细
（5）TrimSize方法
    这个方法用于将ArrayList固定到实际元素的大小，当动态数组元素确定不在添加的时候，可以调用这个方法来释放空余的内存。
（6）ToArray方法
    这个方法把ArrayList的元素Copy到一个新的数组中。


4、ArrayList与数组转换
    例1：
ArrayList List = new ArrayList();
List.Add(1);
List.Add(2);
List.Add(3);

Int32[] values = (Int32[])List.ToArray(typeof(Int32));

    例2：
ArrayList List = new ArrayList();
List.Add(1);
List.Add(2);
List.Add(3);

Int32[] values = new Int32[List.Count];
List.CopyTo(values);

    上面介绍了两种从ArrayList转换到数组的方法

    例3：
ArrayList List = new ArrayList();
List.Add( “string” );
List.Add( 1 );
//往数组中添加不同类型的元素

object[] values = List.ToArray(typeof(object)); //正确
string[] values = (string[])List.ToArray(typeof(string)); //错误

和数组不一样，因为可以转换为Object数组，所以往ArrayList里面添加不同类型的元素是不会出错的，但是当调用ArrayList方法的时候，要么传递所有元素都可以正确转型的类型或者Object类型，否则将会抛出无法转型的异常。


5、ArrayList最佳使用建议
    这一节我们来讨论ArrayList与数组的差别，以及ArrayList的效率问题
  （1）ArrayList是Array的复杂版本
ArrayList内部封装了一个Object类型的数组，从一般的意义来说，它和数组没有本质的差别，甚至于ArrayList的许多方法，如Index、IndexOf、Contains、Sort等都是在内部数组的基础上直接调用Array的对应方法。
  （2）内部的Object类型的影响
         对于一般的引用类型来说，这部分的影响不是很大，但是对于值类型来说，往ArrayList里面添加和修改元素，都会引起装箱和拆箱的操作，频繁的操作可能会影响一部分效率。
但是恰恰对于大多数人，多数的应用都是使用值类型的数组。
消除这个影响是没有办法的，除非你不用它，否则就要承担一部分的效率损失，不过这部分的损失不会很大。
  （3）数组扩容
这是对ArrayList效率影响比较大的一个因素。
每当执行Add、AddRange、Insert、InsertRange等添加元素的方法，都会检查内部数组的容量是否不够了，如果是，它就会以当前容量的两倍来重新构建一个数组，将旧元素Copy到新数组中，然后丢弃旧数组，在这个临界点的扩容操作，应该来说是比较影响效率的。
     例1：比如，一个可能有200个元素的数据动态添加到一个以默认16个元素大小创建的ArrayList中，将会经过：
16*2*2*2*2 = 256
四次的扩容才会满足最终的要求，那么如果一开始就以：
ArrayList List = new ArrayList( 210 );
的方式创建ArrayList，不仅会减少4次数组创建和Copy的操作，还会减少内存使用。

     例2：预计有30个元素而创建了一个ArrayList：
ArrayList List = new ArrayList(30);
在执行过程中，加入了31个元素，那么数组会扩充到60个元素的大小，而这时候不会有新的元素再增加进来，而且有没有调用TrimSize方法，那么就有1次扩容的操作，并且浪费了29个元素大小的空间。如果这时候，用：
ArrayList List = new ArrayList(40);
那么一切都解决了。
所以说，正确的预估可能的元素，并且在适当的时候调用TrimSize方法是提高ArrayList使用效率的重要途径。
   （4）频繁的调用IndexOf、Contains等方法（Sort、BinarySearch等方法经过优化，不在此列）引起的效率损失
首先，我们要明确一点，ArrayList是动态数组，它不包括通过Key或者Value快速访问的算法，所以实际上调用IndexOf、Contains等方法是执行的简单的循环来查找元素，所以频繁的调用此类方法并不比你自己写循环并且稍作优化来的快，如果有这方面的要求，建议使用Hashtable或SortedList等键值对的集合。
ArrayList al=new ArrayList();

al.Add("How");
al.Add("are");
al.Add("you!");

al.Add(100);
al.Add(200);
al.Add(300);

al.Add(1.2);
al.Add(22.8);

.........

//第一种遍历 ArrayList 对象的方法
foreach(object o in al)
{
Console.Write(o.ToString()+" ");
}

//第二种遍历 ArrayList 对象的方法
IEnumerator ie=al.GetEnumerator();
while(ie.MoveNext())
{
Console.Write(ie.Curret.ToString()+" ");
}

//第三种遍历 ArrayList 对象的方法
我忘记了,好象是 利用 ArrayList对象的一个属性,它返回一此对象中的元素个数.

然后在利用索引
for(int i=0;i<Count;i++)
{
Console.Write(al[i].ToString()+" ");
}
