package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebElementActions {
    public static void clickOnElement(WebElement element) {
        element.click();
    }
    public static void typeOnWebElement(String text,WebElement element) {
        element.sendKeys(text);
    }
    public static void verifyText(String actual,String Expected) {
        Assert.assertEquals(actual, Expected, Expected);
    }
    public static void verifyTextContains(String actual,String Expected) {
        actual.contains(Expected);
    }
    public static String getTitle(WebDriver driver) {
        return driver.getTitle();
    }
    public static String getText(WebElement element) {
        return element.getText();
    }
}
