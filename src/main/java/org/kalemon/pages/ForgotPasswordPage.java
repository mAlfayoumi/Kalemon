package org.kalemon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage extends PageBase{
    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    //All Button in Login Page
    By CheckOtpButton = By.xpath("//form//button[text()='Verify']\n");
    By ConfirmButton = By.xpath("//form//button[text()='Confirm']\n");

    //All Fields in Login Page
    By OtpField = By.name("pin");
    By newPasswordField = By.name("password");
    By confirmPasswordField = By.name("password_confirmation");

    By IsValidPhoneForChangePassword = By.xpath("//p[@data-testid='phone-input-invalid-message' and contains(text(), 'The selected phone is invalid.')]");
    By WelcomeBackLocator = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/p");
    By PasswordNotMatch = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/div/form/fieldset[2]/p[2]");
    By isSameAsOldPassword = By.xpath("//*[@id=\"__next\"]/main/div/div[2]/ol/li/div/div[2]/div");
    By LoginButton = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/div/button");
    By ForgotPasswordButton = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/a");
    By PhoneNumberForChangePasswordName = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/div/form/fieldset/div/input");
    By SendCodeButton = By.xpath("//button[@type='submit']\n");


    WebElement LoginButtonElement;
    WebElement ForgotPasswordElement;
    WebElement PhoneChangePasswordElement;
    WebElement sendCodeElement;
    WebElement checkOtpElement;
    WebElement checkOtpButtonElement;
    WebElement newPasswordElement;
    WebElement confirmPasswordElement;
    WebElement confirmButtonElement;

    public String getActualTextIsValidPhoneNumberForChangePassword() {
        return getElementText(IsValidPhoneForChangePassword);
    }
    public String getActualTextAfterSuccessfullyChangePassword() {
        return getElementText(WelcomeBackLocator);
    }

    public String getActualTextOfPasswordNotMatch() {
        return getElementText(PasswordNotMatch);
    }

    public String getActualTextIsNewPasswordEqualToOld() {
        return getElementText(isSameAsOldPassword);
    }

    public void ClickOnLoginButton() {
        LoginButtonElement = driver.findElement(LoginButton);
        PageBase.Clicking(LoginButtonElement);

    }
    public void EnterNewPassword(String NewPassword) {
        newPasswordElement = driver.findElement(newPasswordField);
        PageBase.sendText(newPasswordElement, NewPassword);
    }

    public void ClickOnForgotPasswordButton() {
        ForgotPasswordElement = driver.findElement(ForgotPasswordButton);
        PageBase.Clicking(ForgotPasswordElement);
    }
    public void EnterConfirmPassword(String NewPassword) {
        confirmPasswordElement = driver.findElement(confirmPasswordField);
        PageBase.sendText(confirmPasswordElement, NewPassword);
    }


    public void ClickOnSendCodeButton() {
        sendCodeElement = driver.findElement(SendCodeButton);
        PageBase.Clicking(sendCodeElement);
    }
    public void EnterPhoneNumberForgotPassword(String otp) {
        checkOtpElement = driver.findElement(OtpField);
        PageBase.sendText(checkOtpElement, otp);
    }
    public void ClickOnConfirmButton() {
        confirmButtonElement = driver.findElement(ConfirmButton);
        PageBase.Clicking(confirmButtonElement);
    }
    public void ClickOnCheckOtpButton() {
        checkOtpButtonElement = driver.findElement(CheckOtpButton);
        PageBase.Clicking(checkOtpButtonElement);
    }
    public void EnterPhoneNumberForChangePassword (String PhoneChangePassword) {
        PhoneChangePasswordElement = driver.findElement(PhoneNumberForChangePasswordName);
        PageBase.sendText(PhoneChangePasswordElement, PhoneChangePassword);
    }

}
