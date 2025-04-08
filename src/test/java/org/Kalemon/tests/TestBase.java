package org.Kalemon.tests;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.kalemon.data.CourseData;
import org.kalemon.pages.ReadExcelData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import java.io.IOException;

public class TestBase {
    protected WebDriver driver;


    @BeforeMethod
    public void setup ()
    {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://kalemon.vercel.app/en");
    }


    @AfterMethod
    public  void quitPage()
    {
        driver.quit();
    }






    // All Data Provider that Used on Pages
    @DataProvider(name = "validRegisterInValidOtp")
    public Object[][] validRegisterInValidOtp() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "validRegisterInValidOtp.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }


    @DataProvider(name = "validRegisterValidOtp")
    public Object[][] validRegisterValidOtp() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "validRegisterValidOtp.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "validRegister")
    public Object[][] validRegister() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "validRegister.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "isValidPhoneNumber")
    public Object[][] isValidPhoneNumber() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "isValidPhoneNumber.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "isValidLongName")
    public Object[][] isValidLongName() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "isValidLongName.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }


    @DataProvider(name = "verifyValidNameCredentials")
    public Object[][] verifyValidNameCredentials() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "verifyValidNameCredentials.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "verifyValidPassword")
    public Object[][] verifyValidPassword() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "verifyValidPassword.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "isDuplicateName")
    public Object[][] isDuplicateName() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "isDuplicateName.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }


    @DataProvider(name = "checkMinLength")
    public Object[][] checkMinLength() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "checkMinLength.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "checkUserExists")
    public Object[][] checkUserExists() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "checkUserExists.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "validRegisterValidLogin")
    public Object[][] validRegisterValidLogin() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "validRegisterValidLogin.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "checkPasswordsMatch")
    public Object[][] checkPasswordsMatch() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "checkPasswordsMatch.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }




    @DataProvider(name = "validLogin")
    public Object[][] validLogin() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "validLogin.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "invalidLogin")
    public Object[][] invalidLogin() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "invalidLogin.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "checkUserValidity")
    public Object[][] checkUserValidity() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "checkUserValidity.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "isValidPhoneNumberForLogin")
    public Object[][] isValidPhoneNumberForLogin() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "isValidPhoneNumberForLogin.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "isRegistrationPhoneNumber")
    public Object[][] isRegistrationPhoneNumber() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "isRegistrationPhoneNumber.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "verifyPhoneForPasswordChange")
    public Object[][] verifyPhoneForPasswordChange() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "verifyPhoneForPasswordChange.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }


    @DataProvider(name = "setNewPassword")
    public Object[][] setNewPassword() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "setNewPassword.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }


    @DataProvider(name = "changePasswordIfMatched")
    public Object[][] changePasswordIfMatched() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "changePasswordIfMatched.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

    @DataProvider(name = "isPasswordSameAsOld")
    public Object[][] isPasswordSameAsOld() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "isPasswordSameAsOld.xlsx";
        return readExcelData.ReadSheet(SheetName);
    }

//    @DataProvider(name = "validCourses")
//    public Object[][] validCourses() throws IOException, InvalidFormatException {
//        ReadExcelData readExcelData = new ReadExcelData();
//        String SheetName = "validCourses.xlsx";
//        Object[][] data = readExcelData.ReadSheet(SheetName);
//
//        // Print out the data to verify
//        for (Object[] row : data) {
//            for (Object val : row) {
//                System.out.print(val + "\t");
//            }
//            System.out.println();
//        }
//
//        return data;
//    }
//

    @DataProvider(name = "validCourses")
    public Object[][] validCourses() throws IOException, InvalidFormatException {
        ReadExcelData readExcelData = new ReadExcelData();
        String SheetName = "validCourses.xlsx";
        Object[][] rawData = readExcelData.ReadSheet(SheetName);

        Object[][] courseDataArray = new Object[rawData.length][1];

        for (int i = 0; i < rawData.length; i++) {
            Object[] row = rawData[i];
            CourseData course = new CourseData(
                    (String) row[0], // phoneNumber
                    (String) row[1], // password
                    (String) row[2], // titleAR
                    (String) row[3], // titleEN
                    (String) row[4], // subTitleAR
                    (String) row[5], // subTitleEN
                    (String) row[6], // descriptionAR
                    (String) row[7], // descriptionEN
                    (int) row[8],    // level
                    (int) row[9],    // courseStatus
                    (String) row[10],// price
                    (String) row[11],// requirements
                    (String) row[12],// targetAudience
                    (String) row[13],// learningOutcomes
                    (String) row[14],// sectionName
                    (String) row[15] // lessonName
            );
            courseDataArray[i][0] = course;
        }

        return courseDataArray;
    }




}
