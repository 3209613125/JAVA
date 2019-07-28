一、getInstance在单例模式中，用于静态方法，目的是防止创建多个实例对象，当调用getInstance方法的时候，可以去返回所有的现有实例，也有可能是其他处理，但new
的话，则是每次都会创建一个新的实例

二、throws和throw
throws用在方法声明的后面，跟的是异常 "类名"
可以跟多个异常类名，用逗号隔开
表示抛出异常，异常有该方法的调用者来处理，层层上抛，最后丢给Jvm虚拟机
throws表示出现异常的可能性，并不代表真的会出现异常

throw用在方法体内部，跟的是异常 "对象名" ( throw new Exception() )
只能抛出异常对象名
表示主动抛出异常，由方法体内的语句处理
执行throw则表示一定抛出了某种异常


public class Throws_Throw {
	public static void main(String[] args) {
		// method();//调用此方法没必要try-catch因为抛得是运行时期的异常
		
		try {
			method2();//调用此方法必须要try-catch因为抛得的编译器
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	public static void method() {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}
	}
 
	public static void method2() throws Exception {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new Exception();
		} else {
			System.out.println(a / b);
		}
	}
}
