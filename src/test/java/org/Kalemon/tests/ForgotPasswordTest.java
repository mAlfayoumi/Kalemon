package org.Kalemon.tests;

import io.qameta.allure.Description;
import org.kalemon.pages.ForgotPasswordPage;
import org.kalemon.pages.HomePage;
import org.kalemon.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {

    private ForgotPasswordPage forgotPasswordPage;
    private HomePage homePage;
    private LoginPage loginPage;

    @Description("verify Phone For Password Change")

    @Test(priority = 1, dataProvider = "verifyPhoneForPasswordChange")
    public void verifyPhoneForPasswordChange(String Phone_Number) {
        homePage = new HomePage(driver);
        forgotPasswordPage = homePage.clickOnLoginButtonForgotPassword();
        forgotPasswordPage.ClickOnForgotPasswordButton();
        forgotPasswordPage.EnterPhoneNumberForChangePassword(Phone_Number);
        forgotPasswordPage.ClickOnSendCodeButton();
        Assert.assertEquals(forgotPasswordPage.getActualTextIsValidPhoneNumberForChangePassword(), "The selected phone is invalid.");
    }

    @Test(priority = 2,dataProvider = "setNewPassword")
    public void setNewPassword(String Phone_Number , String Otp ,String New_Password , String Confirm_Password) {
        homePage = new HomePage(driver);
        forgotPasswordPage = homePage.clickOnLoginButtonForgotPassword();
        forgotPasswordPage.ClickOnForgotPasswordButton();
        forgotPasswordPage.EnterPhoneNumberForChangePassword(Phone_Number);
        forgotPasswordPage.ClickOnSendCodeButton();
        forgotPasswordPage.EnterPhoneNumberForgotPassword(Otp);
        forgotPasswordPage.ClickOnCheckOtpButton();
        forgotPasswordPage.EnterNewPassword(New_Password);
        forgotPasswordPage.EnterConfirmPassword(Confirm_Password);
        forgotPasswordPage.ClickOnConfirmButton();
        Assert.assertEquals(forgotPasswordPage.getActualTextAfterSuccessfullyChangePassword(), "Welcome back");
    }

    @Test(priority = 3,dataProvider = "changePasswordIfMatched")
    public void changePasswordIfMatched(String Phone_Number , String Otp ,String New_Password , String Confirm_Password)  {
        homePage = new HomePage(driver);
        forgotPasswordPage = homePage.clickOnLoginButtonForgotPassword();
        forgotPasswordPage.ClickOnForgotPasswordButton();
        forgotPasswordPage.EnterPhoneNumberForChangePassword(Phone_Number);
        forgotPasswordPage.ClickOnSendCodeButton();
        forgotPasswordPage.EnterPhoneNumberForgotPassword(Otp);
        forgotPasswordPage.ClickOnCheckOtpButton();
        forgotPasswordPage.EnterNewPassword(New_Password);
        forgotPasswordPage.EnterConfirmPassword(Confirm_Password);
        Assert.assertEquals(forgotPasswordPage.getActualTextOfPasswordNotMatch(), "Passwords do not match");
    }

    @Test(priority = 4,dataProvider = "isPasswordSameAsOld")
    public void isPasswordSameAsOld(String Phone_Number , String Otp ,String New_Password , String Confirm_Password)  {
        homePage = new HomePage(driver);
        forgotPasswordPage = homePage.clickOnLoginButtonForgotPassword();
        forgotPasswordPage.ClickOnForgotPasswordButton();
        forgotPasswordPage.EnterPhoneNumberForChangePassword(Phone_Number);
        forgotPasswordPage.ClickOnSendCodeButton();
        forgotPasswordPage.EnterPhoneNumberForgotPassword(Otp);
        forgotPasswordPage.ClickOnCheckOtpButton();
        forgotPasswordPage.EnterNewPassword(New_Password);
        forgotPasswordPage.EnterConfirmPassword(Confirm_Password);
        forgotPasswordPage.ClickOnConfirmButton();
        Assert.assertEquals(forgotPasswordPage.getActualTextIsNewPasswordEqualToOld(), "The new password must be different to current one !");
    }

}
