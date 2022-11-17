package com.zcc.tcp.upload;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Dr.Z
 * @version demo
 * 文件上传客户端
 */
public class PictureUpload01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String filePath = "C:\\Users\\86178\\Desktop\\屏幕截图(102).png";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));

    }
}
