package com.test.qa.pageobjects.pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginPage.java - class to verify Login Page functions Created by SrirankanK
 * on 10/3/2018.
 */
public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By loginPage = By.xpath("//h2[text()='Login Page']");
    private static By txtUsername = By.id("username");
    private static By txtPassword = By.id("password");
    private static By btnSubmit = By.xpath("//button[@type='submit']");
    private static By alertMessage=By.xpath("//div[@id='flash']");

    public static boolean isLoginPageDisplayed() {
        return getDriver().findElement(loginPage).isDisplayed();
    }

    public static void setUsernamePassword(String userName, String password) {
        getDriver().findElement(txtUsername).sendKeys(userName);
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public static void clickSubmit() {
        getDriver().findElement(btnSubmit).click();
    }

    public static boolean isAlertDisplayed() {
        return getDriver().findElement(alertMessage).isDisplayed();
    }

    public static String getAlertContent() {
        return getDriver().findElement(alertMessage).getText();
    }
}
