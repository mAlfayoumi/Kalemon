package org.kalemon.pages;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;

public class PageBase {
    protected WebDriver driver ;
    private WebDriverWait wait;

    public PageBase (WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait
    }


    public static  void Clicking (WebElement element)
    {
        element.click();
    }




    public static void sendText (WebElement element , String text)
    {
        element.sendKeys(text);
    }
    public String getElementText(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }




    public static void selectByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static void selectByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }


    public static void selectByVisibleText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void uploadFile(WebDriver driver, By fileLocator, String filePath) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement fileInputField = wait.until(ExpectedConditions.presenceOfElementLocated(fileLocator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", fileInputField);
            fileInputField.sendKeys(filePath);
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.ESCAPE).perform();

        } catch (Exception e) {
            System.out.println("File upload failed: " + e.getMessage());
        }
    }


}
