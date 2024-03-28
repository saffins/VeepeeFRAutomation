package com.ecommerce.WebApp.Pages;

import com.ecommerce.WebApp.Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By emailInput = By.name("email");

    private By continueWithEmail = By.xpath("//*[@data-testid='signin-submit-button']");

    private By passInput = By.name("password");

    private By loginBtn = By.xpath("//*[@data-testid='signin-submit-button']");

    private By loggedInLbl = By.xpath("//*[text()='Parrainage']");

    private By signuptBtn = By.xpath("//*[text()='Créer un compte Veepee']");
    public void loginToVeepee(String user,String pass,String action){

        waitForElementToBePresent(emailInput);
        getElement(emailInput).sendKeys(user);
        getElement(continueWithEmail).click();
        waitForElementToBePresent(passInput);

        if(action.equalsIgnoreCase("valid")) {
            getElement(passInput).sendKeys(pass);
            waitForElementToBePresent(loginBtn);
            getElement(loginBtn).click();
            waitForElementToBePresent(loggedInLbl);

            Assert.assertTrue(getElement(loggedInLbl).isDisplayed());
        }else{
            waitForElementToBeClickable(signuptBtn);
            Assert.assertTrue(getElement(signuptBtn).isDisplayed());
        }
    }
}
