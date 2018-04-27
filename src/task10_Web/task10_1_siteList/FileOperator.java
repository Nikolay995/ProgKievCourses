package task10_Web.task10_1_siteList;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class FileOperator {
    static List<URL> readFromFile(File input) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(input));
        List<URL> urls = new ArrayList<>();
        String temp;
        while ((temp = br.readLine()) != null) {
            urls.add(new URL(temp));
        }
        return urls;
    }

    static void checkUrl(List<URL> urls) {
        try {
            for (URL url : urls) {
                HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
                if (HttpURLConnection.HTTP_OK == urlc.getResponseCode()) {
                    System.out.println("OK");
                } else System.out.println("ERR");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}