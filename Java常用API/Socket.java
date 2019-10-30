class send{
    public static void main(String[] args) throws IOException {
        String str = "hello!";
        DatagramSocket socket = new DatagramSocket();
        DatagramPacket packet = new 
        DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("127.0.0.1"),6666);
        socket.send(packet);
        socket.close();
    }
}
class receive{
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
        socket.receive(packet);
        byte[] arr = packet.getData();
        int len = packet.getLength();
        System.out.println(new String(arr,0,len));
    }
}
