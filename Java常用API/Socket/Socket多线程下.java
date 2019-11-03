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
