package task5_IO.task5_2_Txt_copy;

import java.io.*;

public class Finder {
    public File findWords(File fileOne, File fileTwo, File result) {

        try (Reader readerOne = new FileReader(fileOne);
             Reader readerTwo = new FileReader(fileTwo);
             PrintWriter resultWriter = new PrintWriter(result)) {

            BufferedReader brOne = new BufferedReader(readerOne);
            BufferedReader brTwo = new BufferedReader(readerTwo);

            String[] arrayOne = brOne.readLine().split("\\s+");
            String[] arrayTwo = brTwo.readLine().split("\\s+");

            int i = 0;                                 //счётчик одинаковых слов
            for (String a : arrayOne) {                //проходим по обоим массивам слов
                for (String b : arrayTwo) {
                    if (a.equals(b)) {
                        resultWriter.print(a + " ");    // и находим общие
                        i++;
                    }
                }
            }

            if (i == 0) {
                System.out.println("Одинаковых слов не найдено.");
            } else System.out.println("Слова сохранены в файл " + result.getName());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
