package testProjects;

import java.io.IOException;
import java.net.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.ru/?gws_rd=ssl");
            HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
            System.out.println("Метод запроса на сервер " + urlc.getRequestMethod());
            System.out.println("Тип ответа " + urlc.getResponseMessage());
            Map<String, List<String>> hm = urlc.getHeaderFields();
            Set<String> hdrf = hm.keySet();
            for (String k : hdrf) {
                System.out.println("Key = " + k + " : " + "Value = " + hm.get(k));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
