//如何在dos命令下启动
//javac -encoding UTF-8 Solution.java
//java Solution
//注意事项：！！！将包注释掉：
//否则在Dos命令下会报错：
//错误：找不到或无法加载主类 原因: java.lang.ClassNotFoundException 的方法

class send extends Thread{
    @Override
    public void run() {
    try {
        Scanner scanner = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();
        while (true){
            String str = scanner.nextLine();
            if (str.equals("quit")){
                break;
            }
            else{
                DatagramPacket packet = new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("127.0.0.1"),6666);
                socket.send(packet);
            }
        }
        socket.close();
    }catch (Exception e){
        e.printStackTrace();
    }
    }
}
class receive extends Thread {
    @Override
    public void run() {
  try {
      DatagramSocket socket = new DatagramSocket(6666);
      DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
      while (true){
          socket.receive(packet);
          byte[] arr = packet.getData();
          int len = packet.getLength();
          String ip = packet.getAddress().getHostAddress();
          int port = packet.getPort();
          System.out.println("ip "+ip+":"+"port "+port+" "+new String(arr,0,len));
      }
  }catch (Exception e){
      e.printStackTrace();
  }
    }
}
public class Solution{
    public static void main(String[] args) throws InterruptedException {
        new receive().start();
        Thread.sleep(10);
        new send().start();
    }
}



/////////////////////////////////////////////////////////////////////////////


class send implements Runnable{
    @Override
    public void run() {
       try {
           Scanner scanner = new Scanner(System.in);
           DatagramSocket socket = new DatagramSocket();
           while (true){
               String str = scanner.nextLine();
               DatagramPacket packet = new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("127.0.0.1"),6666);
               if (str.equals("quit")){
                   break;
               }
               else{
                   socket.send(packet);
               }
           }
           socket.close();
       }catch (Exception e){
           e.printStackTrace();
       }
    }

}
class receive implements Runnable{
    @Override
    public void run() {
     try {
         DatagramSocket socket = new DatagramSocket(6666);
         DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
         while (true){
             socket.receive(packet);
             byte[] str = packet.getData();
             int len = packet.getLength();
             String ip = packet.getAddress().getHostAddress();
             int port = packet.getPort();
             System.out.println("ip "+ip+":"+"port "+port+" "+new String(str,0,len));
         }
     }catch (Exception e){
         e.printStackTrace();
     }
    }
}

class Test{
    public static void main(String[] args) throws InterruptedException {
        new Thread(new receive()).start();
        Thread.sleep(10);
        new Thread(new send()).start();
    }
}


