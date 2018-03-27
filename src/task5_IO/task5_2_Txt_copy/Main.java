package task5_IO.task5_2_Txt_copy;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        File fileOne = new File("d:/first.txt");
        File fileTwo = new File("d:/second.txt");
        File result = new File("d:/result.txt");

        Finder find = new Finder();
        find.findWords(fileOne, fileTwo, result);
    }

}


