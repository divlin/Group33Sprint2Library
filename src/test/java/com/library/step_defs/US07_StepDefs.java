package com.library.step_defs;

import com.library.pages.MainPage_CG;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US07_StepDefs {
    MainPage_CG mainPage_cg = new MainPage_CG();


    @Given("user is on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("I login using {string} and {string}")
    public void i_login_using_and(String email, String password) {
        mainPage_cg.inputUsername.sendKeys(email);
        BrowserUtils.sleep(1);
        mainPage_cg.inputPassword.sendKeys(password);

    }
    @And("I click on Sign in button")
    public void iClickOnSignInButton() {
        mainPage_cg.signInButton.click();
        BrowserUtils.sleep(2);

        }

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String holderName) {
    Assert.assertEquals(holderName, mainPage_cg.accountHolderName.getText());
    }
}

