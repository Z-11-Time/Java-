package com.zcc.tcp.socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Dr.Z
 * @version demo
 */
public class Text02Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 9999);
        //接受服务器的数据
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String readLine;
        while ((readLine = bufferedReader.readLine())!=null){
            System.out.println(readLine);
        }
        //向服务器输出数据
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
    }
}
