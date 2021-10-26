package com.syntax.class32.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadWriteDataDemo2 {
    public static void main(String[] args) throws IOException {
        String readPath = "C:\\Users\\drozz\\IdeaProjects\\JavaIntellij\\Files\\Config1.properties";
        String writePath = "C:\\Users\\drozz\\IdeaProjects\\JavaIntellij\\Files\\Config.properties";

        FileInputStream fileInputStream = new FileInputStream(readPath);
        FileInputStream fileInputStream1 = new FileInputStream(writePath);

        Properties properties = new Properties();
        properties.load(fileInputStream);


        Properties properties1 = new Properties();
        properties1.load(fileInputStream);

        String URL = properties.get("URL").toString();

        properties1.put("URL", URL);
        FileOutputStream fileOutputStream = new FileOutputStream(writePath);
        properties1.store(fileOutputStream, "The URL added from Config1");

    }
}
