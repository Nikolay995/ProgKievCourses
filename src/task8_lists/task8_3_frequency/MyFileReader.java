package task8_lists.task8_3_frequency;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {


    public static String readText(File file) {
        String str;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((str = br.readLine()) != null) {
                sb.append(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }


    public static ArrayList strToArray(String str) {
        ArrayList<Character> charList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            charList.add(c);
        }
        return charList;
    }

}
