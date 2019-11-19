package com.seleniumeasy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class exceldata {

    public exceldata() throws FileNotFoundException {
        File file = new File("./testdata.xlsx");
        FileInputStream fis = new FileInputStream(file);
//        XSSFWorkbook wb = new XSSFWorkbook(fis);
//        XSSFSheet sheet = wb.getSheetAt();
//        sheet.getSheetAt();
    }
}
