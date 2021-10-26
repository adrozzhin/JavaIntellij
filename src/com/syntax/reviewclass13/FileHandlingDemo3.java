package com.syntax.reviewclass13;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileHandlingDemo3 {
    public static void main(String[] args) {
        String path = "C:\\Users\\drozz\\Desktop\\Syntax\\ExcelFiles\\TestFile.xlsx";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheet("Sheet1");
            int noOfRows = sheet.getPhysicalNumberOfRows();
            int rowIndex = sheet.getLastRowNum();
//            System.out.println(noOfRows);
//            System.out.println(rowIndex);
            ArrayList<Person> table = new ArrayList<>();


            for (int i = 1; i <= rowIndex; i++) {
                Row row = sheet.getRow(i);
                String firstName = sheet.getRow(i).getCell(0).toString();
                String lastName = sheet.getRow(i).getCell(1).toString();
                String age = sheet.getRow(i).getCell(2).toString();
                String salary = sheet.getRow(i).getCell(3).toString();
                Person person = new Person(firstName,lastName,age,salary);
                table.add(person);

            }
            System.out.println(table);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
