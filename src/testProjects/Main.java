package testProjects;


import java.io.IOException;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            InetAddress googleIp = InetAddress.getByName("www.google.com");
            System.out.println(googleIp);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
