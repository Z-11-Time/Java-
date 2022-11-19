package com.zcc.tcp.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Dr.Z
 * @version demo
 * 文件上传服务端
 */
public class PictureUpload01Server {
    public static void main(String[] args) throws IOException {
        //创建服务端端口对象
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        //读取客户端传来的图片，然后传到本地
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        String filePath = "C:\\Users\\86178\\Desktop\\Java实例\\src\\com\\zcc\\tcp\\upload\\copy.png";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath));
        byte[] bytes = new byte[1024];
        int readlen;
        while ((readlen = bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,readlen);
        }
        //发送消息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("收到图片");
        //刷新和结束
        bufferedWriter.flush();
        socket.shutdownOutput();
        //关闭资源
        bufferedWriter.close();
        bufferedOutputStream.close();
        bufferedInputStream.close();
        socket.close();
    }
}
