package com.library.step_defs;


import com.library.pages.LoginPage;
import com.library.pages.UserRecordPage_JM;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class US04_UserRecordSteps {

    LoginPage loginPage = new LoginPage();
    UserRecordPage_JM userRecordPage_jm = new UserRecordPage_JM();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();



    @Given("the librarian is on the login page and logged succes")
    public void the_librarian_is_on_the_login_page_and_logged_succes() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAsLibrarian();


    }
    @Given("Librarian click on the {string} link")
    public void librarian_click_on_the_link(String string ) {

        userRecordPage_jm.Books.click();

        BrowserUtils.sleep(2);
        userRecordPage_jm.UserRows10.click();

        BrowserUtils.sleep(2);
        js.executeScript("window.scrollBy(0,750)");



    }
    @When("I select Show <{int}> records")
    public void i_select_show_records(Integer int1) {
        Select select;
        userRecordPage_jm.UserRows15.click();
        for (int i = 0; i < 2; i++) {
            BrowserUtils.sleep(2);


            js.executeScript("window.scrollBy(0,750)");
        }

    }

    @Then("show records value should be <{int}>")
    public void show_records_value_should_be(Integer int1) {
        userRecordPage_jm.UserRows50.click();
        for (int i = 0; i < 2; i++) {
            BrowserUtils.sleep(2);


            js.executeScript("window.scrollBy(0,750)");
        }

    }
    @Then("the users table must display <{int}> records")
    public void the_users_table_must_display_records(Integer expectedNumberOfRecords) {
        userRecordPage_jm.UserRows100.click();
        for (int i = 0; i < 2; i++) {
            BrowserUtils.sleep(2);


            js.executeScript("window.scrollBy(0,750)");





        }

    }

}





























