package org.kalemon.pages;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
import java.io.File;
import java.io.IOException;


public class ReadExcelData {


    public Object[][] ReadSheet(String sheetName) throws IOException, InvalidFormatException {
        File myFile = new File(".\\test_data\\" + sheetName);
        XSSFWorkbook wb = new XSSFWorkbook(myFile);
        XSSFSheet mySheet = wb.getSheet("Sheet1");
        int numberOfRows = mySheet.getPhysicalNumberOfRows();
        int numberOfColumns = mySheet.getRow(0).getLastCellNum();
        Object[][] myArray = new Object[numberOfRows - 1][numberOfColumns];

        for (int i = 1; i < numberOfRows; i++) {
            XSSFRow row = mySheet.getRow(i);

            if (row != null) { // Ensure the row is not null
                for (int a = 0; a < numberOfColumns; a++) {
                    XSSFCell cell = row.getCell(a);

                    if (cell != null) {  // Ensure the cell is not null
                        switch (cell.getCellType()) {
                            case STRING:
                                myArray[i - 1][a] = cell.getStringCellValue();
                                break;
                            case NUMERIC:
                                // Treat large numbers (e.g., phone numbers) as strings to avoid scientific notation
                                if (a == 0) {  // Assuming phoneNumber is in the first column (column index 0)
                                    myArray[i - 1][a] = String.valueOf(cell.getNumericCellValue());  // Get numeric value and convert it to String
                                } else if (a == 8 || a == 9) { // Assuming column 8 and 9 represent int parameters (level, courseStatus)
                                    myArray[i - 1][a] = (int) cell.getNumericCellValue(); // Convert to int
                                } else {
                                    myArray[i - 1][a] = String.valueOf(cell.getNumericCellValue()); // For other columns, keep as string
                                }
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
                    } else {
                        // Handle empty cell (if the cell is null or blank)
                        myArray[i - 1][a] = "";
                    }
                }
            }
        }

        wb.close();
        return myArray;
    }

}

