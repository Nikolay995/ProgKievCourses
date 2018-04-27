package task10_Web.task10_1_siteList;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("text.txt");
        List<URL> urls = new ArrayList<>(FileOperator.readFromFile(input));
        FileOperator.checkUrl(urls);
    }
}
