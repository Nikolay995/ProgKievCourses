package task5_IO.task5_1_FileCopy;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File baseDir = new File("D:\\MyDir");
        File copyDir = new File("D:\\TargetDir");

        MyFilter filter = new MyFilter("doc");

        File[] fileList = baseDir.listFiles(filter);

        if (fileList == null || fileList.length == 0) {
            System.out.println("Файлов с данным расширением не найдено");
        } else {
            for (File originalFile : fileList) {
                Copy.copy(originalFile, new File(copyDir.getPath() + "//" + originalFile.getName()));
            }
            System.out.println("Следующие файлы были скопированы: ");
            showFiles(copyDir);
        }
    }

    private static void showFiles(File directory) {
        String[] array = directory.list();
        if (array != null) {
            for (String file : array) {
                System.out.println(file);
            }
        }
    }
}
