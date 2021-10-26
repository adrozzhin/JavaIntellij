package com.syntax.class32.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo1 {
    public static void main(String[] args) throws IOException {
        //locating the file
        String path = "C:\\Users\\drozz\\IdeaProjects\\JavaIntellij\\Files\\Config.properties";
        //creating a coonection btw class or navigation to that file
        FileInputStream fileInputStream = new FileInputStream(path);
        //choosing a program to open that file
        Properties properties = new Properties();
        //opening the file
        properties.load(fileInputStream);
        //reading the data
        System.out.println(properties.get("UserName"));
        System.out.println(properties.get("Password"));
    }
}
