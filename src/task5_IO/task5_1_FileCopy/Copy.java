package task5_IO.task5_1_FileCopy;

import java.io.*;

public class Copy {
    public static void copy(File original, File copy) {
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
}
