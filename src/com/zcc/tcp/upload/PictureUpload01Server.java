package com.zcc.tcp.upload;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Dr.Z
 * @version demo
 * 文件上传服务端
 */
public class PictureUpload01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
    }
}
