package com.library.step_defs;

import com.library.pages.LoginPage;
import com.library.pages.UsersPage_KT;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US09_StepDefs {

    LoginPage login = new LoginPage();
   UsersPage_KT usersPage_kt = new UsersPage_KT();

    @Given("user is logged in as librarian")
    public void user_is_logged_in_as_librarian() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(2);

        login.loginAsLibrarian();
        BrowserUtils.sleep(2);
    }

    @Given("user clicks the {string} link")
    public void user_clicks_the_link(String string) {
        Assert.assertEquals(string, usersPage_kt.Users.getText());
        usersPage_kt.Users.click();
        BrowserUtils.sleep(1);
    }

    @When("user selects Show {int} records")
    public void userSelectsShowRecords(Integer expectedNum) {

        String expectedNum1 = String.valueOf(expectedNum);

        Select select = new Select(usersPage_kt.dropDown);
        select.selectByVisibleText(expectedNum1);

    }

    @Then("the records value should be {int}")
    public void theRecordsValueShouldBe(Integer expectedRecord) {

        Select select = new Select(usersPage_kt.dropDown);

        String expectedOption = String.valueOf(expectedRecord);
        String actualOption = select.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedOption, actualOption);

    }

    @And("table must display {int} records")
    public void tableMustDisplayRecords(Integer expectedRecord) {

        List<WebElement> infoShown = usersPage_kt.infoShown;
        Integer actualSize = infoShown.size();

        Assert.assertEquals(expectedRecord, actualSize);

        BrowserUtils.sleep(3);

    }





}
