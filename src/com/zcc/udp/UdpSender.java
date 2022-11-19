package com.zcc.udp;

import java.io.IOException;
import java.net.*;

/**
 * @author Dr.Z
 * @version demo
 */
public class UdpSender {
    public static void main(String[] args) throws IOException {
        //发送端的端口对象
        DatagramSocket socket = new DatagramSocket(9999);
        //数据
        byte[] data = "hello,receiver".getBytes();
        //创建发送的包里面包含接收端口和地址
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.5.4"), 9998);
        //发送包
        socket.send(packet);
        //
        byte[] buff = new byte[1024];
        packet = new DatagramPacket(buff, buff.length);
        //接收包
        socket.receive(packet);
        //拆包，记得包长
        int length = packet.getLength();
        data = packet.getData();
        String s = new String(data, 0,length);
        System.out.println(s);
        //关闭资源
        socket.close();
    }
}
