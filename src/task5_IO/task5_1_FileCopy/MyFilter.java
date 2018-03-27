package task5_IO.task5_1_FileCopy;

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {
    private String[] array;

    public MyFilter(String... array) {
        this.array = array;
    }

    private boolean check(String ext) {
        for (String fileExtension : array) {
            if (fileExtension.equals(ext)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File pathname) {
        int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        String ext = pathname.getName().substring(pointerIndex + 1);
        return check(ext);
    }
}
