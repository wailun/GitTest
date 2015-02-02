package com.wm.pj01;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wm on 14-10-22.
 */
public class XlsTest {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        File file = new File("src/main/3.xlsx");
        InputStream ins = new FileInputStream(file);
        Workbook wkbook = WorkbookFactory.create(ins);
        Sheet sheet = wkbook.getSheetAt(0);
        String str="";
        for (int rowNum =1; rowNum <= sheet.getLastRowNum(); rowNum++) {
            Row row = sheet.getRow(rowNum);
            if (row == null) {
                continue;
            }
//            int productID=(int)row.getCell(5).getNumericCellValue();
//            int shopID=(int)row.getCell(4).getNumericCellValue();
//            int eventPrice=(int)row.getCell(7).getNumericCellValue();
//            String article=row.getCell(10).getStringCellValue();
//            int order=(int)row.getCell(9).getNumericCellValue();
//            String picPath=row.getCell(11).getStringCellValue();
//            int originPrice=(int)row.getCell(6).getNumericCellValue();
//            String shopName=row.getCell(3).getStringCellValue();
//            String appPicPath=row.getCell(12).getStringCellValue();
////            str+=productID+":::"+shopID+":::"+eventPrice+":::"+article+":::"+order+":::"+picPath+":::"+shopName+":::"+originPrice+":::"+appPicPath+";;;";
//            str+=productID+":"+shopID+":"+eventPrice+",";
            int cityID=(int)row.getCell(0).getNumericCellValue();
            String cityStr=row.getCell(1).getStringCellValue();
            str+=cityID+":"+cityStr+",";
        }
        System.out.println(str);
    }
}
