package com.library.step_defs;

import com.library.pages.MainModulesPage_EC;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11_StepDefs {


    MainModulesPage_EC mainModulesPageEc = new MainModulesPage_EC();

    @Given("Librarian is on the Login page")
    public void librarian_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("Librarian enter username {string}")
    public void librarian_enter_username(String string) {
        mainModulesPageEc.username.sendKeys(ConfigurationReader.getProperty("librarianUsername13"));
    }

    @When("Librarian enter password {string}")
    public void librarian_enter_password(String string) {
        mainModulesPageEc.password.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
    }

    @When("Librarian click the Sign In button")
    public void librarian_click_the_sign_in_button() {
        mainModulesPageEc.signInButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("Librarian should be on the dashboard page")
    public void librarian_should_be_on_the_dashboard_page() {
        String expectedPage = "dashboard";
        String actualPage = Driver.getDriver().getCurrentUrl();
        System.out.println("actualPage = " + actualPage);
        System.out.println("expectedPage = " + expectedPage);
        Assert.assertTrue(actualPage.contains(expectedPage));



    }

}
