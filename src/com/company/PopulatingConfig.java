package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PopulatingConfig {



    public static Properties readProp(String fileName) throws IOException {
        FileInputStream Fi = null;
        Properties pr = null;
        try {
            Fi = new FileInputStream(fileName);
            pr = new Properties();
            pr.load(Fi);
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException io) {
            io.printStackTrace();
        } finally {
            Fi.close();
        }
        return pr;
    }
}
