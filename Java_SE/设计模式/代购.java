//代理模式 模拟代购
interface ISubject {
//核心业务是买电脑
  void buyComputer();
}

//真实业务, 相当于实际上要付款的客户
class RealSubject implements ISubject {
    public void buyComputer() {
        System.out.println("2.买一台mac电脑，付款");
    }
}

//辅助真实业务的实现, 相当于代购
class ProxySubject implements ISubject {
    //传入的是接口对象
    private ISubject subject;
    //传入真实业务对象
    public ProxySubject(ISubject subject) {
        this.subject = subject;
    }

    public void beforeBuyComputer() {
        System.out.println("1.到美国苹果店排队");
    }
    public void afterBuyComputer() {
        System.out.println("3.将电脑快递回客户手中");
    }

    //业务流程
    public void buyComputer() {
        this.beforeBuyComputer();
        this.subject.buyComputer();
        this.afterBuyComputer();
    }
}
 class Test {
    public static void main(String[] args) {
        ISubject subject = new ProxySubject(new RealSubject());
        subject.buyComputer();
    }
}
