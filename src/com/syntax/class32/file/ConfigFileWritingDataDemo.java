package com.syntax.class32.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWritingDataDemo {
    public static void main(String[] args) throws IOException {
        //Path where i want to crea
        String path = "C:\\Users\\drozz\\IdeaProjects\\JavaIntellij\\Files\\Config1.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.put("URL", "www.google.com");
        properties.store(fileOutputStream, "new data added");

    }
}
