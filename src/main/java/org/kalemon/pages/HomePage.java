package org.kalemon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;


public class HomePage extends PageBase {

    //Locator Button In Home Page
    By RegistrationButton = By.xpath("//button[text()='Register']\n");
    By LoginButton = By.xpath("//button[text()='Login']\n");


    //Declaration of WebElement variables used for interacting with specific UI elements
    WebElement RegistrationButtonElement;
    WebElement LoginButtonElement;




    public HomePage(WebDriver driver) {
        super(driver);
    }
    public RegistrationPage clickOnRegisterButton() {
        RegistrationButtonElement = driver.findElement(RegistrationButton);
        PageBase.Clicking(RegistrationButtonElement);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return new RegistrationPage(driver);
    }
    public LoginPage clickOnLoginButton() {
        LoginButtonElement = driver.findElement(LoginButton);
        PageBase.Clicking(LoginButtonElement);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return new LoginPage(driver);

    }
    public ForgotPasswordPage clickOnLoginButtonForgotPassword() {
        LoginButtonElement = driver.findElement(LoginButton);
        PageBase.Clicking(LoginButtonElement);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return new ForgotPasswordPage(driver);

    }
}
