package org.kalemon.pages;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
import java.io.File;
import java.io.IOException;


public class ReadExcelData {
    public String [][] ReadSheet (String sheetName) throws IOException, InvalidFormatException {
      File myFile = new File(".\\test_data\\" + sheetName);
        XSSFWorkbook wb = new XSSFWorkbook (myFile) ;
        XSSFSheet mySheet = wb.getSheet("Sheet1");
        int numberOfRows = mySheet.getPhysicalNumberOfRows();
        int numberOfColumns = mySheet.getRow(0).getLastCellNum() ;
        String [][] myArray = new String[numberOfRows-1][numberOfColumns];

        for (int i = 1; i < numberOfRows; i++) {
            for (int a = 0; a < numberOfColumns; a++) {
                XSSFRow row = mySheet.getRow(i);
                XSSFCell cell = row.getCell(a);

                if (cell != null) {
                    switch (cell.getCellType()) {
                        case STRING:
                            myArray[i - 1][a] = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            myArray[i - 1][a] = String.valueOf((long) cell.getNumericCellValue()); // Convert to String
                            break;
                        case BOOLEAN:
                            myArray[i - 1][a] = String.valueOf(cell.getBooleanCellValue());
                            break;
                        case FORMULA:
                            myArray[i - 1][a] = cell.getCellFormula();
                            break;
                        case BLANK:
                            myArray[i - 1][a] = "";
                            break;
                        default:
                            myArray[i - 1][a] = "";
                    }
                }
            }
        }

        wb.close();
        return myArray;
    }




}
