package com.ecommerce.WebApp.StepDefinationFiles;

import com.ecommerce.WebApp.Factory.WebDriverFactory;
import com.ecommerce.WebApp.Pages.HomePage;
import com.ecommerce.WebApp.Pages.LoginPage;
import io.cucumber.java.en.And;

public class LoginStepDefination {

    private HomePage objHomePage=new HomePage(WebDriverFactory.getDriver());

    private LoginPage loginPage = new LoginPage(WebDriverFactory.getDriver());

    @And("User pass login credentials username as {string} and password as {string} for {string} login")
    public void loginToApp(String user,String pass,String action){
        loginPage.loginToVeepee(user,pass,action);
    }

}
