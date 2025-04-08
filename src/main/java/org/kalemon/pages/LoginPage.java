package org.kalemon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //All Button in Login Page
    By LoginButton = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/div/button");


    //All Fields in Login Page
    By phoneField = By.name("phone");
    By passwordField = By.name("password");


    //All Locators Fields
    By InvalidNumber = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/fieldset[1]/p");
    By WelcomeAfterLogin = By.xpath("//h2[contains(text(), 'Welcome')]\n");
    By IsCredential = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/fieldset[2]/p");
    By ISRegistration = By.xpath("//*[@id=\"__next\"]/main/div/div[1]/form/fieldset[2]/p");


    // Declaration of WebElement variables used for interacting with specific UI elements
    WebElement phoneElement;
    WebElement passwordElement;
    WebElement LoginButtonElement;

    public void ClickOnLoginButton() {
        LoginButtonElement = driver.findElement(LoginButton);
        PageBase.Clicking(LoginButtonElement);
    }

    public void EnterPhoneNumber(String Phone) {
        phoneElement = driver.findElement(phoneField);
        PageBase.sendText(phoneElement, Phone);
    }


    public void EnterPassword(String password) {
        passwordElement = driver.findElement(passwordField);
        PageBase.sendText(passwordElement, password);
    }


    public String getActualTextInvalidLogin() {
        return getElementText(InvalidNumber);
    }

    public String getActualTextValidLogin() {

        return getElementText(WelcomeAfterLogin);
    }

    public String getActualTextIsCredential() {

        return getElementText(IsCredential);
    }

    public String getActualTextIsInvalidNumber() {

        return getElementText(InvalidNumber);
    }

    public String getActualTextIsRegistrationPhoneNumber() {

        return getElementText(ISRegistration);
    }


}
