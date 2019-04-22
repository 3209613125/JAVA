import java.lang.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Isubject{
    void eat(String msg,Integer num);
}

class Realsubject implements Isubject{
    @Override
    public void eat(String msg, Integer num) {
        System.out.println("我要吃"+num+"的"+msg);
    }
}
//调用处理器
class Proxysubject implements InvocationHandler{
    private Object target;
    public Object bind(Object target){
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }
    public void preHandle() {
        System.out.println("[ProxySubject] 方法处理前") ;
    }
    public void afterHandle(){
        System.out.println("[ProxySubject] 方法处理后") ;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.preHandle() ;
        // 反射调用方法
        Object ret = method.invoke(this.target,args) ;
        this.afterHandle() ;
        return ret;
    }
}

class Test{
    public static void main(String[] args) {
        Isubject subject=(Isubject)new Proxysubject().bind(new Realsubject());
        subject.eat("宫保鸡丁",20);
    }
}
