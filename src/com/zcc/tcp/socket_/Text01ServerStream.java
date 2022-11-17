package com.zcc.tcp.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author Dr.Z
 * @version demo
 */
public class Text01ServerStream {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        //向客户端输出
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes(StandardCharsets.UTF_8));
        socket.shutdownOutput();//结束输出的标记
        //接受客户端的数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readLen;
        while ((readLen = inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,readLen));
        }
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
