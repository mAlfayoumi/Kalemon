package org.Kalemon.tests;
import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import org.kalemon.pages.HomePage;
import org.kalemon.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Step;


public class LoginTest extends TestBase {


    private LoginPage loginPage;
    private HomePage homePage;


 // Apply listener at the class level
 @Description("Login with valid credentials")
 @Test(priority = 1, dataProvider = "validLogin")
    public void validLogin( String Phone_Number, String Password) {
        homePage = new HomePage(driver);
        loginPage = homePage.clickOnLoginButton(    );
        loginPage.EnterPhoneNumber(Phone_Number);
        loginPage.EnterPassword(Password);
        loginPage.ClickOnLoginButton();
        Assert.assertTrue(loginPage.getActualTextValidLogin().contains("Welcome"));
    }


    @Test(priority = 2, dataProvider = "invalidLogin")
    public void invalidLogin( String Phone_Number, String Password) {
        homePage = new HomePage(driver);
        loginPage = homePage.clickOnLoginButton();
        loginPage.EnterPhoneNumber(Phone_Number);
        loginPage.EnterPassword(Password);
        Assert.assertEquals(loginPage.getActualTextInvalidLogin(), "Invalid number");
    }

    @Test(priority = 3, dataProvider = "checkUserValidity")
    public void checkUserValidity( String Phone_Number, String Password) {
        homePage = new HomePage(driver);
        loginPage = homePage.clickOnLoginButton();
        loginPage.EnterPhoneNumber(Phone_Number);
        loginPage.EnterPassword(Password);
        loginPage.ClickOnLoginButton();
        Assert.assertEquals(loginPage.getActualTextIsCredential(), "The mobile number or password is invalid!");
    }


    @Test(priority = 4, dataProvider = "isValidPhoneNumberForLogin")
    public void isValidPhoneNumberForLogin (String Phone_Number, String Password)  {
        homePage = new HomePage(driver);
        loginPage = homePage.clickOnLoginButton();
        loginPage.EnterPhoneNumber(Phone_Number);
        loginPage.EnterPassword(Password);
        Assert.assertEquals(loginPage.getActualTextIsInvalidNumber(), "Invalid number");

    }

    @Test(priority = 5, dataProvider = "isRegistrationPhoneNumber")
    public void isRegistrationPhoneNumber (String Phone_Number, String Password) {
        homePage = new HomePage(driver);
        loginPage = homePage.clickOnLoginButton();
        loginPage.EnterPhoneNumber(Phone_Number);
        loginPage.EnterPassword(Password);
        loginPage.ClickOnLoginButton();
        Assert.assertEquals(loginPage.getActualTextIsRegistrationPhoneNumber(), "The mobile number or password is invalid!");
    }




}
