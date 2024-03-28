package StepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class HomePage {

    @Given("user navigates to Veepee")
    public static void navigate_to_veepee(){
        getLoginBtn().click();
    }

 }
