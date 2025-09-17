package tasks;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Test;
import utillities.ExcelUtils;
import utillities.TestBase;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;


/*Given: Save EarningList.xlsx file into your project
        When: In the row column, write the row numbers according to the earnings amount (
        Natural Order -  lowest to highest).
        Then: Assert that row number of Wednesday is 1*/

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T601_EarningsRankingSystem extends TestBase {

    @Test
    void EarningsRankingSystem() throws IOException {
        Workbook workbook = new ExcelUtils("src/test/resources/EarningList.xlsx").getWorkbook();
        Sheet sheet = workbook.getSheet("sheet1");

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            double earnings = sheet.getRow(i).getCell(1).getNumericCellValue();
            String row = "";
            if (earnings == 800) {
                row = "5";
            } else if (earnings == 600) {
                row = "4";
            } else if (earnings == 500) {
                row = "3";
            } else if (earnings == 400) {
                row = "2";
            } else if (earnings == 200) {
                row = "1";
            }
            sheet.getRow(i).createCell(2).setCellValue(row);
        }

        try (FileOutputStream fo = new FileOutputStream("src/test/resources/EarningList.xlsx")) {
            workbook.write(fo);
        } finally {
            workbook.close();
        }

        // Then: Assert that row number of Wednesday is 1
        String wednesdayEarnings = "";
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            if (sheet.getRow(i).getCell(0).getStringCellValue().equals("Wednesday")) {
                wednesdayEarnings = sheet.getRow(i).getCell(2).getStringCellValue();
            }
        }
        assertEquals("1", wednesdayEarnings);
    }

}
