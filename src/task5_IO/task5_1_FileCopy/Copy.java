package task5_IO.task5_1_FileCopy;

import java.io.*;

public class Copy {

    private static void copyFiles(File original, File copy) {

        try (InputStream is = new FileInputStream(original);
             OutputStream os = new FileOutputStream(copy)) {
            byte[] buffer = new byte[1024];
            int i = 0;
            while ((i = is.read(buffer)) > 0) {
                os.write(buffer, 0, i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyWithFilter(File baseDir, File copyDir, MyFilter filter) {
        if (!copyDir.exists()) {
            copyDir.mkdir();
        }
        File[] fileList = baseDir.listFiles(filter);

        if (fileList == null || fileList.length == 0) {
            System.out.println("Файлов с данным расширением не найдено");
        } else {
            for (File originalFile : fileList) {
                copyFiles(originalFile, new File(copyDir.getPath() + "//" + originalFile.getName()));
            }
            System.out.println("Следующие файлы были скопированы в каталог " + copyDir.getPath());
            showFiles(copyDir);
        }
    }

    public static void showFiles(File directory) {
        String[] array = directory.list();
        if (array != null) {
            for (String file : array) {
                System.out.println(file);
            }
        }
    }


}
