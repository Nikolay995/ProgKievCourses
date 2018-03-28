package task5_IO.task5_1_FileCopy;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File baseDir = new File("D:\\MyDir");       //здесь заранее созданы несколько файлов, в том числе *.doc
        File copyDir = new File("D:\\TargetDir");   //сюда копируем

        MyFilter filter = new MyFilter("doc");         //фильтр по расширению

        Copy.copyWithFilter(baseDir, copyDir, filter);         //копируем файлы

        }

}
