class hundryperson{
    //private修饰的方法是私有方法，只能在类的内部去使用，而不能继承
  private static final hundryperson man=new hundryperson();
   private hundryperson(){};
  final static hundryperson getinstance(){
      return man;
  }
  public void eat(){
      System.out.println("饿汉式单例模式");
  }

}
class Test{
    public static void main(String[] args) {
        hundryperson man1=hundryperson.getinstance();
        hundryperson man2=hundryperson.getinstance();
        System.out.println(man1);
        System.out.println(man2);
        man1.eat();
    }

}
