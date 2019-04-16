//练习
class Test{
    public static void main(String[] args) {
        tom per=new tom();
        per.fangfa(6);
        System.out.println("per.n："+per.n);

    }
}
class tom{
    static Integer n;
    public tom(){

    }

    public static Integer fangfa(Integer n){
       System.out.println(n);
        return n;

    }
}


结果:
6
per.n：null
