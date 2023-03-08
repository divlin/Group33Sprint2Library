package com.library.step_defs;

import com.library.pages.LoginPage;
import com.library.pages.UsersPage_RP;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class US05_StepDefs {


    private UsersPage_RP usersPage_rp;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        BrowserUtils.sleep(1);
    }


    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsLibrarian();

        BrowserUtils.sleep(1);

    }

    @When("I click on {string} link")
    public void i_click_on_link(String string) {

        //Assert.assertEquals(string, usersPage_rp.Users.getText());
        //usersPage_rp.Users.click();

        if (string.equals(usersPage_rp.Users.getText())) {
            usersPage_rp.Users.click();
        }

        if (string.equals(usersPage_rp.Books.getText())) {
            usersPage_rp.Books.click();
        }

        BrowserUtils.sleep(1);

    }


    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer expectedDefaultValue) {

        Select select = new Select(usersPage_rp.selectDropdown);

        String expectedOption = String.valueOf(expectedDefaultValue);
        //System.out.println(expectedOption);

        String defaultOption = select.getFirstSelectedOption().getText(); //getAttribute("value");
        //System.out.println(defaultOption);

        Assert.assertEquals(expectedOption, defaultOption);

        BrowserUtils.sleep(1);

    }


    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> dataTable) {

        Select select = new Select(usersPage_rp.selectDropdown);

        List<WebElement> options = select.getOptions();

        List<String> items = new ArrayList<>();

        for (WebElement eachItem : options) {
            items.add(eachItem.getText());
        }

        //System.out.println(dataTable);
        //System.out.println(items);

        Assert.assertEquals(dataTable, items);


    }
}





