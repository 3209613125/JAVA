package com.hhy;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @Information:
 * @Author: HeHaoYuan
 * @Date: Created at 17:20 on 2020/2/4
 * @Package_Name: com.hhy
 */
public class DS_Client1 {
    public static void main(String[] args) throws Exception {
        //建立Socket，服务器在本机的8888端口进行侦听
        Socket socket = new Socket("127.0.0.1",8080);//建立套接字
        System.out.println("客户端套接字信息:"+socket);
        try {
            //套接字建立成功后，建立字节输入流dis和输出流dos对象
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            //调用其对应方法进行网络通信
            for (int i = 0; i < 6; i++) {
                dos.writeUTF("客户端测试"+i);//向服务器发送数据
                dos.flush();//刷新输出缓冲区，以便于立即发送
                System.out.println(dis.readUTF());//将从服务端接收到的数据输出
            }
            dos.writeUTF("end");
            dos.flush();
            //关闭对象
            dos.close();//关闭输入输出流对象
            dis.close();

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("客户端结束");
            socket.close();
        }




    }
}




class MyThread extends  Thread{
    int num;
    int count;
    public MyThread(int num){
        this.num = num;
        System.out.println("创建线程"+num);
    }
    @Override
    public void run() {
        while (true){
            System.out.println("线程:"+num+"   "+"倒计时:"+count);
            if (count++ == 5){
                return;
            }
        }

    }
}
class Main{
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new MyThread(i+1).start();
        }
    }
}
