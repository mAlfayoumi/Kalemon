package org.Kalemon.tests;

import org.kalemon.pages.HomePage;
import org.kalemon.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class  RegistrationTest extends TestBase {


    private RegistrationPage registrationPage;
    private HomePage homePage;

    @Test(priority = 1, dataProvider = "validRegister")
    public void validRegister(String Name, String Phone_Number, String Password,
                              String Password_Confirmation) {
        homePage = new HomePage(driver);
        registrationPage = homePage.clickOnRegisterButton();
        registrationPage.chooseRole();
        registrationPage.EnterName(Name);
        registrationPage.EnterPhoneNumber(Phone_Number);
        registrationPage.EnterPassword(Password);
        registrationPage.EnterPasswordConfirmation(Password_Confirmation);
        registrationPage.ClickOnRegisterButton();
        Assert.assertEquals(registrationPage.getActualTextAfterSuccessfully(), "Enter the Code");
    }


    @Test(priority = 2, dataProvider = "validRegisterValidOtp")
    public void validRegisterValidOtp(String Name, String Phone_Number, String Password,
                                      String Password_Confirmation, String Otp) {
        homePage = new HomePage(driver);
        registrationPage = homePage.clickOnRegisterButton();
        registrationPage.chooseRole();
        registrationPage.EnterName(Name);
        registrationPage.EnterPhoneNumber(Phone_Number);
        registrationPage.EnterPassword(Password);
        registrationPage.EnterPasswordConfirmation(Password_Confirmation);
        registrationPage.ClickOnRegisterButton();
        Assert.assertEquals(registrationPage.getActualTextAfterSuccessfully(), "Enter the Code");
        registrationPage.EnterValidOtp(Otp);
        registrationPage.ClickOnVerifyButton();
        Assert.assertEquals(registrationPage.getActualTextVerifySuccessfully(), "Registered successfully!");
        registrationPage.ClickOnStartButton();
        Assert.assertEquals(registrationPage.getActualCompleteRegistration(), "Complete your registration as a teacher on our platform");
    }


    @Test(priority = 3, dataProvider = "validRegisterInValidOtpTestData")
    public void validRegisterInValidOtp(String Name, String Phone_Number, String Password,
                                        String Password_Confirmation, String Otp){
        homePage = new HomePage(driver);
        registrationPage = homePage.clickOnRegisterButton();
        registrationPage.chooseRole();
        registrationPage.EnterName(Name);
        registrationPage.EnterPhoneNumber(Phone_Number);
        registrationPage.EnterPassword(Password);
        registrationPage.EnterPasswordConfirmation(Password_Confirmation);
        registrationPage.ClickOnRegisterButton();
        Assert.assertEquals(registrationPage.getActualTextAfterSuccessfully(), "Enter the Code");
        registrationPage.EnterValidOtp(Otp);
        registrationPage.ClickOnVerifyButton();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals(registrationPage.getActualTextInvalidOtp(),
                "The verification code does not match with any record or is already verified!");
    }


    @Test(priority = 4, dataProvider = "isValidPhoneNumber")
    public void isValidPhoneNumber(String Name, String Phone_Number, String Password,
                                   String Password_Confirmation) {
        homePage = new HomePage(driver);
        registrationPage = homePage.clickOnRegisterButton();
        registrationPage.chooseRole();
        registrationPage.EnterName(Name);
        registrationPage.EnterPhoneNumber(Phone_Number);
        registrationPage.EnterPassword(Password);
        registrationPage.EnterPasswordConfirmation(Password_Confirmation);
        Assert.assertEquals(registrationPage.getActualTextInValidPhoneNumber(), "Invalid number");

    }


    @Test(priority = 5, dataProvider = "isValidLongName")
    public void isValidLongName(String Phone_Number, String Password,
                                String Password_Confirmation) {
        homePage = new HomePage(driver);
        registrationPage = homePage.clickOnRegisterButton();
        registrationPage.chooseRole();
        registrationPage.EnterName(registrationPage.getLongName());
        registrationPage.EnterPhoneNumber(Phone_Number);
        registrationPage.EnterPassword(Password);
        registrationPage.EnterPasswordConfirmation(Password_Confirmation);
        registrationPage.ClickOnRegisterButton();
        Assert.assertEquals(registrationPage.getActualTextLongName(), "The name field must not be greater than 255 characters.");
    }


    @Test(priority = 6, dataProvider = "verifyValidNameCredentials")
    public void verifyValidNameCredentials(String Name, String Phone_Number, String Password,
                                           String Password_Confirmation) {
        homePage = new HomePage(driver);
        registrationPage = homePage.clickOnRegisterButton();
        registrationPage.chooseRole();
        registrationPage.EnterName(Name);
        registrationPage.EnterPhoneNumber(Phone_Number);
        registrationPage.EnterPassword(Password);
        registrationPage.EnterPasswordConfirmation(Password_Confirmation);
        registrationPage.ClickOnRegisterButton();
        Assert.assertEquals(registrationPage.getActualTextCredentialName(), "The name must doesn't have the special charachters !");
    }


    @Test(priority = 7, dataProvider = "verifyValidPassword")
    public void verifyValidPassword(String Name, String Phone_Number, String Password,
                                    String Password_Confirmation) {
        homePage = new HomePage(driver);
        registrationPage = homePage.clickOnRegisterButton();
        registrationPage.chooseRole();
        registrationPage.EnterName(Name);
        registrationPage.EnterPhoneNumber(Phone_Number);
        registrationPage.EnterPassword(Password);
        registrationPage.EnterPasswordConfirmation(Password_Confirmation);
        Assert.assertEquals(registrationPage.getActualTextPasswordUpperCase(), "At least 1 uppercase letter");
        Assert.assertEquals(registrationPage.getActualTextPasswordDigit(), "At least 1 digit");
        Assert.assertEquals(registrationPage.getActualTextPasswordSpecialCharacters(), "At least 1 special character (e.g., @#$%&)");
        Assert.assertEquals(registrationPage.getActualTextPasswordLessThanCharacters(), "At least 8 characters long");
        Assert.assertNotEquals(registrationPage.getActualTextPasswordLowerCase(), "At least 1 lowercase letter");

    }

    @Test(priority = 8, dataProvider = "isDuplicateName")
    public void isDuplicateName(String Name, String Phone_Number, String Password,
                                String Password_Confirmation) {
        homePage = new HomePage(driver);
        registrationPage = homePage.clickOnRegisterButton();
        registrationPage.chooseRole();
        registrationPage.EnterName(Name);
        registrationPage.EnterPhoneNumber(Phone_Number);
        registrationPage.EnterPassword(Password);
        registrationPage.EnterPasswordConfirmation(Password_Confirmation);
        registrationPage.ClickOnRegisterButton();
        Assert.assertEquals(registrationPage.getActualTextDuplicateName(), "Teacher name already exists");

    }

    @Test(priority = 9, dataProvider = "checkMinLength")
    public void checkMinLength(String Name, String Phone_Number) {
        homePage = new HomePage(driver);
        registrationPage = homePage.clickOnRegisterButton();
        registrationPage.chooseRole();
        registrationPage.EnterName(Name);
        registrationPage.EnterPhoneNumber(Phone_Number);
        Assert.assertEquals(registrationPage.getActualTextMinName(), "Minimum allowed characters/digits is 2");


    }

    @Test(priority = 10, dataProvider = "checkUserExists")
    public void checkUserExists(String Name, String Phone_Number, String Password,
                                String Password_Confirmation) {
        homePage = new HomePage(driver);
        registrationPage = homePage.clickOnRegisterButton();
        registrationPage.chooseRole();
        registrationPage.EnterName(Name);
        registrationPage.EnterPhoneNumber(Phone_Number);
        registrationPage.EnterPassword(Password);
        registrationPage.EnterPasswordConfirmation(Password_Confirmation);
        registrationPage.ClickOnRegisterButton();
        Assert.assertEquals(registrationPage.getActualUserExists(), "User already exists");
    }


    @Test(priority = 11, dataProvider = "checkPasswordsMatch")
    public void checkPasswordsMatch(String Name, String Phone_Number, String Password,
                                    String Password_Confirmation) {
        homePage = new HomePage(driver);
        registrationPage = homePage.clickOnRegisterButton();
        registrationPage.chooseRole();
        registrationPage.EnterName(Name);
        registrationPage.EnterPhoneNumber(Phone_Number);
        registrationPage.EnterPassword(Password);
        registrationPage.EnterPasswordConfirmation(Password_Confirmation);
        Assert.assertEquals(registrationPage.getActualPasswordsMatch(), "Passwords do not match");
    }



    @Test(priority = 12, dataProvider = "validRegisterValidOtp")
    public void validRegisterValidLogin(String Name, String Phone_Number, String Password,
                                      String Password_Confirmation, String Otp) {
        homePage = new HomePage(driver);
        registrationPage = homePage.clickOnRegisterButton();
        registrationPage.chooseRole();
        registrationPage.EnterName(Name);
        registrationPage.EnterPhoneNumber(Phone_Number);
        registrationPage.EnterPassword(Password);
        registrationPage.EnterPasswordConfirmation(Password_Confirmation);
        registrationPage.ClickOnRegisterButton();
        Assert.assertEquals(registrationPage.getActualTextAfterSuccessfully(), "Enter the Code");
        registrationPage.EnterValidOtp(Otp);
        registrationPage.ClickOnVerifyButton();
        Assert.assertEquals(registrationPage.getActualTextVerifySuccessfully(), "Registered successfully!");
        registrationPage.ClickOnStartButton();
        Assert.assertEquals(registrationPage.getActualCompleteRegistration(), "Complete your registration as a teacher on our platform");

    }
}
