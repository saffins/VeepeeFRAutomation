package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;
import utility.SeleniumMethods;

import static utility.SeleniumMethods.getElement;
import static utility.SeleniumMethods.waitForElementToBePresent;

public class HomePage extends BrowserDriver {

    public static By loginBtn = By.xpath("//*[@data-testid='login-button']");

    public HomePage(BrowserDriver driver) {
        super(driver);
    }

    public static WebElement getLoginBtn() {
        waitForElementToBePresent(loginBtn);
        return getElement(loginBtn);
    }

    public static void login(){
        getLoginBtn().click();
    }



}
