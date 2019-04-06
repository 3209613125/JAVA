interface Computer {
    void printpc();
}

class lenovo implements Computer {
    @Override
    public void printpc() {
        System.out.println("选择lenovo电脑");
    }
}
class Deil implements Computer{
    @Override
    public void printpc() {
        System.out.println("选择Deil电脑");
    }
}
class ComputerFactory{
    public static Computer getComputerInstance(String computername){
        try{

            Class classz = Class.forName(computername);
            return (Computer) classz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}

 class TestFactory {
    public static void main(String[] args) {
       Computer computer = ComputerFactory.getComputerInstance("www.bit.tech.lenovo");
        if (computer != null) {
            computer.printpc();
        }
    }
}
