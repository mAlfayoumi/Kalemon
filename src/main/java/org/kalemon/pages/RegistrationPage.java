package org.kalemon.pages;

import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;


public class RegistrationPage extends PageBase {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


    //All Fields in Registration Page
    By RoleField = By.xpath("//*[@id=\"2\"]");
    By nameField = By.name("name");
    By phoneField = By.name("phone");
    By passwordField = By.name("password");
    By imageProfileButton = By.xpath("//*[@id=\"radix-:ra:\"]");

    // All Locators Buttons
    By messageLocatorRegisterButton = By.xpath("//form/div[3]/button\n");
    By messageLocatorVerifyButton = By.xpath("//button[@type='submit']\n");
    By messageLocatorStartButton = By.xpath("//button[contains(@class, 'bg-primary-k-blue') and contains(@class, 'text-primary-foreground') and text()=\"Start\"]\n");


    // All Locators Fields
    By messageLocatorPasswordConfirmationField = By.name("password_confirmation");
    By messageLocatorAfterSuccessfully = By.xpath("//p[text()='Enter the Code']\n");
    By messageLocatorInValidPhoneNumber = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/div[2]/fieldset[2]/p");
    By messageLocatorLongName = By.xpath("//form/div[1]/fieldset[2]/p\n");
    By messageLocatorCredentialName = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/div[1]/fieldset[2]/p");
    By messageLocatorDuplicateName = By.xpath("//form//fieldset[2]/p\n");
    By messageLocatorMinName = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/div[1]/fieldset[2]/p");
    By messageLocatorExistsUser = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/div[2]/fieldset[2]/p");
    By messageLocatorPasswordsMatch = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/fieldset[2]/p");
    By messageLocatorOtp = By.xpath("//*[@id=':r9:-form-item']");
    By messageLocatorAfterVerifySuccessfully = By.xpath("//*[@id=\"__next\"]/main/div[2]/div[1]/div/p");
    By messageLocatorCompleteRegistration = By.xpath("//*[@id=\"__next\"]/main/div[1]/span");
    By messageLocatorAfterInvalidOtp = By.id(":r9:-form-item-message");


    //Locator Messages of Validation Password
    By messageLocatorPasswordUpperCase = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/fieldset[1]/div[2]/div[1]/p");
    By messageLocatorPasswordLowerCase = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/fieldset[1]/div[2]/div[3]/p");
    By messageLocatorPasswordSpecialCharacters = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/fieldset[1]/div[2]/div[4]/p");
    By messageLocatorPasswordLessThanCharacters = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/fieldset[1]/div[2]/div[5]/p");
    By messageLocatorPasswordDigit = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/fieldset[1]/div[2]/div[3]/p");


    // Declaration of WebElement variables used for interacting with specific UI elements
    WebElement RoleElement;
    WebElement nameElement;
    WebElement phoneElement;
    WebElement passwordElement;
    WebElement passwordConfirmationElement;
    WebElement registerButtonElement;
    WebElement OtpElement;
    WebElement registerVerifyElement;
    WebElement StartVerifyElement;


    public void EnterName(String name) {
        nameElement = driver.findElement(nameField);
        PageBase.sendText(nameElement, name);
    }
    public void EnterPhoneNumber(String phoneNumber) {
        phoneElement = driver.findElement(phoneField);
        PageBase.sendText(phoneElement, phoneNumber);
    }
    public void EnterPassword(String password) {
        passwordElement = driver.findElement(passwordField);
        PageBase.sendText(passwordElement, password);
    }
    public void EnterPasswordConfirmation(String passwordConfirmation) {
        passwordConfirmationElement = driver.findElement(messageLocatorPasswordConfirmationField);
        PageBase.sendText(passwordConfirmationElement, passwordConfirmation);
    }
    public void chooseRole() {
        RoleElement = driver.findElement(RoleField);
        PageBase.Clicking(RoleElement);
    }
    public void ClickOnRegisterButton() {
        registerButtonElement = driver.findElement(messageLocatorRegisterButton);
        PageBase.Clicking(registerButtonElement);
    }
    public void ClickOnStartButton() {
        StartVerifyElement = driver.findElement(messageLocatorStartButton);
        PageBase.Clicking(StartVerifyElement);
    }
    public void EnterValidOtp(String otp) {
        OtpElement = driver.findElement(messageLocatorOtp);
        PageBase.sendText(OtpElement, otp);
    }
    public void ClickOnVerifyButton() {
        registerVerifyElement = driver.findElement(messageLocatorVerifyButton);
        PageBase.Clicking(registerVerifyElement);
    }
    public String getActualTextAfterSuccessfully() {
        return getElementText(messageLocatorAfterSuccessfully);
    }
    public String getActualTextInValidPhoneNumber() {
        return getElementText(messageLocatorInValidPhoneNumber);
    }
    public String getActualTextLongName() {
        return getElementText(messageLocatorLongName);
    }
    public String getActualTextCredentialName() {
        return getElementText(messageLocatorCredentialName);
    }
    public String getActualTextPasswordUpperCase() {
        return getElementText(messageLocatorPasswordUpperCase);
    }
    public String getActualTextPasswordLowerCase() {
        return getElementText(messageLocatorPasswordLowerCase);
    }
    public String getActualTextPasswordSpecialCharacters() {
        return getElementText(messageLocatorPasswordSpecialCharacters);
    }
    public String getActualTextPasswordLessThanCharacters() {
        return getElementText(messageLocatorPasswordLessThanCharacters);
    }
    public String getActualTextPasswordDigit() {
        return getElementText(messageLocatorPasswordDigit);
    }
    public String getActualTextVerifySuccessfully() {
        return getElementText(messageLocatorAfterVerifySuccessfully);
    }
    public String getActualTextInvalidOtp() {
        return getElementText(messageLocatorAfterInvalidOtp);
    }
    public String getLongName() {
        return "Ahmad ".repeat(50).trim(); // Generates a name longer than 250 characters
    }
    public String getActualTextDuplicateName() {
        return getElementText(messageLocatorDuplicateName);
    }
    public String getActualTextMinName() {
        return getElementText(messageLocatorMinName);
    }
    public String getActualUserExists() {
        return getElementText(messageLocatorExistsUser);
    }
    public String getActualPasswordsMatch() {
        return getElementText(messageLocatorPasswordsMatch);
    }
    public String getActualCompleteRegistration() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return getElementText(messageLocatorCompleteRegistration);
    }


}
