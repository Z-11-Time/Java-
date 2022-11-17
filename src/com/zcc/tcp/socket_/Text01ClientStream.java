package com.zcc.tcp.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author Dr.Z
 * @version demo
 */
public class Text01ClientStream {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 9999);
        //接受服务器的数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readLen;
        while ((readLen = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,readLen));
        }
        //向服务器输出数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server".getBytes(StandardCharsets.UTF_8));
        socket.shutdownOutput();//结束输出的标记
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
