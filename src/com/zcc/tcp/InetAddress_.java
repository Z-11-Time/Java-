package com.zcc.tcp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Dr.Z
 * @version demo
 */
public class InetAddress_ {
    public static void main(String[] args) throws UnknownHostException {
        //本地的对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //获取对应的对象
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        String hostAddress = byName.getHostAddress();
        String hostName = byName.getHostName();
        System.out.println("主机地址" + hostAddress +" 域名 "+hostName);
    }
}
