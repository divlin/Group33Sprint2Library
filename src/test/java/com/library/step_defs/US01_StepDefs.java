package com.library.step_defs;

import com.library.pages.BooksPage_MI;
import com.library.pages.LoginPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.LinkedHashMap;
import java.util.Map;

public class US01_StepDefs {

    LoginPage loginPage=new LoginPage();
    BooksPage_MI booksPageMi=new BooksPage_MI();

    @Given("student is already logged in")
    public void student_is_already_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAsStudent();

    }
    @When("student navigate to {string} page")
    public void student_navigate_to_page(String string) {

        Assert.assertEquals(string,booksPageMi.bookLink.getText());
        booksPageMi.bookLink.click();



    }
    @When("student search for  {string}")
    public void student_search_for(String string) {
        booksPageMi.searchBox.sendKeys(string);


    }
    @Then("books table should contain results matching Neverland")
    public void books_table_should_contain_results_matching_neverland(Map<String,String> dataTable) {
        Map<String,String> actualDataTable= new LinkedHashMap<>();

        actualDataTable.put("ISBN",booksPageMi.isbnNumber.getText());
        actualDataTable.put("Name",booksPageMi.name.getText());
        actualDataTable.put("Author",booksPageMi.author.getText());
        actualDataTable.put("Category",booksPageMi.category.getText());
        actualDataTable.put("Year",booksPageMi.year.getText());
        BrowserUtils.sleep(2);

        Assert.assertEquals(dataTable,actualDataTable);







    }








}
