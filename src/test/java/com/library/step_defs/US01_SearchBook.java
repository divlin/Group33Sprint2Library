package com.library.step_defs;

import com.library.pages.BooksPage_MI;
import com.library.pages.LoginPage;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US01_SearchBook {

    LoginPage loginPage=new LoginPage();
    @Given("I login to application as a student")
    public void i_login_to_application_as_a_student() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        loginPage.loginAsStudent();

    }
    @When("I navigate to {string} page")
    public void iNavigateToPage(String string) {





    }
    @Then("books table should contain results matching The Goldfinch")
    public void books_table_should_contain_results_matching_the_goldfinch( ) {



    }


}
