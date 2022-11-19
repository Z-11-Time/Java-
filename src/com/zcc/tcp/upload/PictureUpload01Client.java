package com.zcc.tcp.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Dr.Z
 * @version demo
 * 文件上传客户端
 */
public class PictureUpload01Client {
    public static void main(String[] args) throws Exception {
        //创建链接对应服务器位置的客户端端口
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String filePath = "C:\\Users\\86178\\Desktop\\屏幕截图(102).png";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
        //将本地的文件转成数组
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        //然后传送给服务器
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(bytes);
        //刷新和结束
        bufferedOutputStream.flush();
        socket.shutdownOutput();
        //接受信息
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);
        //结束传送和关闭资源
        socket.close();
        bufferedOutputStream.close();
        bufferedInputStream.close();
        bufferedReader.close();


    }
}
