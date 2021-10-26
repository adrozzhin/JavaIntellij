package com.syntax.class32.excelFiles;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadingDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\drozz\\Desktop\\Syntax\\ExcelFiles\\TestFile.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.getRow(0);
        System.out.println(row.getCell(0));
        System.out.println(row.getCell(1));
        System.out.println(row.getCell(2));


    }
}
