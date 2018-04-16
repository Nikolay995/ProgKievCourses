package lections.websockets;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class InetWork {
    public static void saveToFile(String address, File folder) {
        try {
            URL url = new URL(address);                                              //установка соединения
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); //возможность доступа
            InputStream is = connection.getInputStream();                            //поток
            int n = address.lastIndexOf("/");                                    //после последнего слеша будет имя файла
            String fileName = address.substring(n + 1);                              //записываем сюда имя файла
            File file = new File(folder, fileName);                                  //сохраняем в каталоге фолдер с именем файлНейм
            OutputStream os = new FileOutputStream(file);
            byte[] array = new byte[1024 * 1024];                                    //буфферный массив
            int readByte = 0;                                                        //сколько байт уже прочитано
            while ((readByte = is.read(array)) > 0) {
                os.write(array, 0, readByte);
            }
            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getTextFromURL(String address) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL(address);                 //установка соединения
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); //возможность доступа
            InputStream is = connection.getInputStream();                            //поток
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String temp = "";
            while ((temp = br.readLine()) != null) {
                sb.append(temp);
                sb.append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static Map<String, List<String>> getHeaderFromURL(String address) {
        Map<String, List<String>> result = null;
        try {
            URL url = new URL(address);                                              //установка соединения
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); //возможность доступа
            result = connection.getHeaderFields();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
/*
        1) экземпляр класса URL. если создался - url доступен, создаем httpurl connection и получаем респонс код, если 200 - ресурс доспуен, всё норм, пихаем его в 1й файл
        2) runtime.getruntime......


 */