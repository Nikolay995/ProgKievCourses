package task5_IO.task5_2_Txt_copy;

import java.io.*;

public class Finder {

    public void findWords(File fileOne, File fileTwo, File result) {

        try (Reader readerOne = new FileReader(fileOne);
             Reader readerTwo = new FileReader(fileTwo)) {
            BufferedReader brOne = new BufferedReader(readerOne);
            BufferedReader brTwo = new BufferedReader(readerTwo);

            String[] arrayOne = brOne.readLine().split("\\s+");
            String[] arrayTwo = brTwo.readLine().split("\\s+");

            writeToFile(wordScan(arrayOne, arrayTwo), result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String[] wordScan(String[] arrayOne, String arrayTwo[]) {     //сканирует слова и возвращает массив совпадений
        int i = 0;
        for (String a : arrayOne) {
            for (String b : arrayTwo) {
                if (a.equals(b)) {
                    i++;
                }
            }
        }
        String[] res = new String[i];
        int j = 0;
        for (String a : arrayOne) {
            for (String b : arrayTwo) {
                if (a.equals(b)) {
                    res[j++] = a;
                }
            }
        }
        return res;
    }

    private void writeToFile(String[] resultArray, File resultFile) {

        try (PrintWriter resultWriter = new PrintWriter(resultFile)) {
            if (resultArray.length > 0) {
                for (String word : resultArray) {
                    resultWriter.print(word + " ");
                }
                System.out.println("Слова сохранены в файл " + resultFile.getName());
            } else {
                System.out.println("Совпадений не найдено.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
