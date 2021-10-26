package com.syntax.Repl;

import com.syntax.class26.abstractionDemo.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Repl212 {
    public static void exth() throws FileNotFoundException {
        FileNotFoundException ex = new FileNotFoundException("No such file or directory");
        ex.printStackTrace();
    }

    public static void main(String []args) throws IOException {
        String path = "C:\\Users\\drozz\\IdeaProjects\\JavaIntellij\\Files\\Config22.properties";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            exth();
        }
    }
}
