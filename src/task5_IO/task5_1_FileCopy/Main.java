package task5_IO.task5_1_FileCopy;

import java.io.*;

import task5_IO.task5_1_FileCopy.MyFilter;

public class Main {
    public static void main(String[] args) throws IOException {

        File baseDir = new File("/d:/MyDir");
        File copyDir = new File("/d:/TargetDir");

        MyFilter filter = new MyFilter("doc");

        File[] fileList = baseDir.listFiles(filter);


        try (InputStream is = new FileInputStream(baseDir);
             OutputStream os = new FileOutputStream(copyDir)) {
            int i;
            for (File f : fileList) {
                do {
                    i = is.read();
                    if (i != -1) os.write(i);
                } while (i != -1);
            }


//        showFiles(baseDir);
//        showFiles(copyDir);


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
