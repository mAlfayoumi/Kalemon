package org.kalemon.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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





}
