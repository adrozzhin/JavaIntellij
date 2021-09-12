package com.syntax.class26.abstractionDemo;

public class FileTester {
    public static void main(String[] args) {
        File file = new JavaFile();
        file.open();
        file.Edit();
        file.close();
        File file1 = new WordFile();
        file1.open();
        file1.Edit();
        file1.close();
        File file2 = new PdfFile();
        file2.open();
        file2.Edit();
        file2.close();
    }
}
