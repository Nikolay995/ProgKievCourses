package task5_IO.task5_2_Txt_copy;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Reader readerOne = new FileReader("d:/first.txt");
             Reader readerTwo = new FileReader("d:/second.txt");
             PrintWriter result = new PrintWriter("d:/result.txt");
             BufferedReader bufferOne = new BufferedReader(readerOne);
             BufferedReader bufferTwo = new BufferedReader(readerTwo)) {
            findCommonWords(bufferOne, bufferTwo, result);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findCommonWords(BufferedReader brOne, BufferedReader brTwo,
                                       PrintWriter result) throws IOException {
        String[] arrayOne = brOne.readLine().split("\\s+");
        String[] arrayTwo = brTwo.readLine().split("\\s+");

        for (String a : arrayOne) {
            for (String b : arrayTwo) {
                if (a.equals(b)) {
                    result.println(a);
                }
            }
        }
    }

}


