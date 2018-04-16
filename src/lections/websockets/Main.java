package lections.websockets;

import com.sun.jdi.Value;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String address = "https://cdn.vox-cdn.com/thumbor/FDD76YJZJFPyNUfT3ZBHcnMA0Ec=/43x0:593x367/1200x800/filters:focal(43x0:593x367)/cdn.vox-cdn.com/uploads/chorus_image/image/48667835/dbgxt2rvpd26udoyzcqn.0.0.jpg";
        File folder = new File("LOCAL_CACHE");
        folder.mkdirs();
        //InetWork.saveToFile(address,folder);
        //System.out.println(InetWork.getTextFromURL("https://prog.kiev.ua/"));

        Map<String, List<String>> result = InetWork.getHeaderFromURL("https://prog.kiev.ua/");
        result.forEach((key, value) -> System.out.println(key + " - " + value));


    }
}
