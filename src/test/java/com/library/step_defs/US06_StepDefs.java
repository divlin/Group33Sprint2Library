package com.library.step_defs;

import com.library.pages.LoginPage;
import com.library.pages.UsersPage_SG;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US06_StepDefs {


 LoginPage loginPage = new LoginPage();

 UsersPage_SG usersPage_sg = new UsersPage_SG();
 @Given("Librarian is on the login page")
 public void librarianIsOnTheLoginPage() {
  Driver.getDriver().get(ConfigurationReader.getProperty("url"));

  loginPage.loginAsLibrarian();
 }

 @When("I search for {string}")
 public void i_search_for(String string) {
  usersPage_sg.searchBox.sendKeys(string);
  BrowserUtils.sleep(2);

 }


 @Then("table should contain rows with {string}")
 public void tableShouldContainRowsWith(String arg0) {
  BrowserUtils.sleep(2);
  List<WebElement> list = new ArrayList<>();
  list.add(usersPage_sg.table);

  for (WebElement each : list) {
   if (each.getText().contains(arg0)){
    Assert.assertTrue(usersPage_sg.table.getText().contains(arg0));
    break;
   }
  }


 }



 @Then("table should have following column names:")
 public void table_should_have_following_column_names(List<String> dataTable) {
  List<String> actual= new ArrayList<>();
  for (WebElement each : usersPage_sg.columnNames) {
   actual.add(each.getText());
  }
  Assert.assertEquals(dataTable, actual);

 }



}

