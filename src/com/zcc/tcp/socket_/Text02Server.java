package com.zcc.tcp.socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Dr.Z
 * @version demo
 */
public class Text02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        //向客户端输出
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client");
        bufferedWriter.flush();
        socket.shutdownOutput();//结束输出的标记
        //接受客户端的数据
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String readLine;
        while ((readLine = bufferedReader.readLine())!=null){
            System.out.println(readLine);
        }
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
    }
}
