package com.library.step_defs;

import com.library.pages.DashboardPage_DU;
import com.library.pages.LoginPage;
import com.library.pages.UsersPage_DU;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.LinkedHashMap;
import java.util.Map;

public class US08_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage_DU dashboardPage_du = new DashboardPage_DU();
    UsersPage_DU usersPage_du = new UsersPage_DU();

    @Given("user is already logged in")
    public void user_is_already_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAsLibrarian();
        BrowserUtils.sleep(2);
    }

    @When("user click the {string} link")
    public void user_click_the_link(String link) {
        dashboardPage_du.usersLink.click();
        BrowserUtils.sleep(2);
    }


    @When("user write {string} as an id number into the search box")
    public void user_write_as_an_id_number_into_the_search_box(String id) {
        usersPage_du.searchButton.sendKeys(id);
        BrowserUtils.sleep(2);
    }


    @Then("user should be able to see below information")
    public void user_should_be_able_to_see_below_information(Map<String,String> expectedResult) {

//        Map<String,String> actualResult = new LinkedHashMap<>();
//        actualResult.put("User ID", usersPage_du.userID.getText());
//        actualResult.put("Full Name", usersPage_du.fullName.getText());
//        actualResult.put("Email", usersPage_du.email.getText());
        BrowserUtils.sleep(2);

        Assert.assertEquals(usersPage_du.getMap(), expectedResult);
    }



}
