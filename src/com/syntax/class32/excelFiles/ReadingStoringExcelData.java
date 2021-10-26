package com.syntax.class32.excelFiles;

import com.syntax.class31HW.Person.Person;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingStoringExcelData {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\drozz\\Desktop\\Syntax\\ExcelFiles\\TestFile.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();
        ArrayList<Person> arrayList = new ArrayList<>();
        for (int i = 1; i < rowCount; i++) {
            String firstName = sheet.getRow(i).getCell(0).toString();
            String lastName = sheet.getRow(i).getCell(1).toString();
            String age = sheet.getRow(i).getCell(2).toString();
            //Person person = new Person(firstName, lastName,age);

        }

    }
}
