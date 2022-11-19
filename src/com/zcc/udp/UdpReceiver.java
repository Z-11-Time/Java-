package com.zcc.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Dr.Z
 * @version demo
 */
public class UdpReceiver {
    public static void main(String[] args) throws IOException {
        //创建接收端的端口对象
        DatagramSocket socket = new DatagramSocket(9998);
        //预设接收的包对象
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //接收包
        socket.receive(packet);
        //拆包
        int len = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data,0,len);
        System.out.println(s);
        //发送,包里面包含接收端口和地址
        data = "hello,sender".getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.5.4"),9999);
        //发送
        socket.send(packet);
        //关闭资源
        socket.close();
    }
}
