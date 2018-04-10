package task8_lists.task8_3_frequency;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        File input = new File("text.txt");

        int freq = Collections.frequency(MyFileReader.strToArray(MyFileReader.readText(input)), "a");

        System.out.println(freq);

    }
}
