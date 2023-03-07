package com.library.step_defs;

import com.library.pages.UsersPage_SG;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

public class US06_StepDefs {

   UsersPage_SG usersPage_sg = new UsersPage_SG();

    @When("I search for {string}")
    public void i_search_for(String string) {
        UsersPage_SG.searchBox.sendKeys("test"+ Keys.ENTER);
     BrowserUtils.sleep(5);

    }

    @Then("table should contain rows with “tests\"")
    public void tableShouldContainRowsWithTests() throws Throwable {// Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}



    }

    @Then("table should have following column names:")
    public void tableShouldHaveFollowingColumnNames(List<String> expectedNames) {
     List<String> columnNames = new ArrayList<String>();
     columnNames.add("Actions");
     columnNames.add("User ID");
     columnNames.add("Full Name");
     columnNames.add("Email");
     columnNames.add("Group");
     columnNames.add("Status");

     String actualNames = usersPage_sg.columnNames.getText();
     Assert.assertEquals(expectedNames, actualNames);





    }
}



