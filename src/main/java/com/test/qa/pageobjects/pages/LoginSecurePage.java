package com.test.qa.pageobjects.pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginSecurePage.java - class to verify LoginSecure Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class LoginSecurePage extends PageBase {
    private static By loginSecurePage = By.xpath("//h2");
    private static By btnLogout=By.xpath("//a[@href='/logout']");
    private static By alertMessage=By.xpath("//div[@id='flash']");

    public static boolean isLoginSecurePageDisplayed() {
        return getDriver().findElement(loginSecurePage).isDisplayed();
    }

    public static boolean isAlertDisplayed() {
        return getDriver().findElement(alertMessage).isDisplayed();
    }

    public static String getAlertContent() {
        return getDriver().findElement(alertMessage).getText();
    }

    public static void clickLogout() {
        getDriver().findElement(btnLogout).click();
    }
}
