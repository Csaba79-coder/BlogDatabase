package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TxtReader {

    File file = new File(
            "src/main/resources/banner.txt");

    String banner;

    public void readTxt() {
        try {
            BufferedReader reader = null;
            reader = new BufferedReader(new FileReader(file));

            while ((banner = reader.readLine()) != null) {
                System.out.println(banner);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
