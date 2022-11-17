package com.zcc.tcp.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Dr.Z
 * @version demo
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLine;
        while ((readLine = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLine));
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        socket.shutdownOutput();
        outputStream.close();
        inputStream.close();
        serverSocket.close();
        socket.close();
    }
}
