package com.library.step_defs;

import com.library.pages.AddUserPage_NP;
import com.library.pages.LoginPage;
import com.library.pages.UsersPage_NP;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LibrarianAddNewUser {

    LoginPage loginPage = new LoginPage();
    UsersPage_NP usersPageNp = new UsersPage_NP();

    AddUserPage_NP addUserPageNp = new AddUserPage_NP();
    @Given("Librarian is on the login page")
    public void librarian_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAsLibrarian();
    }

    @Given("Librarian click on {string} module")
    public void librarian_click_on_module(String string) {
        usersPageNp.usersTab.click();
    }

    @When("Librarian click on the Add Users")
    public void librarian_click_on_the_add_users() {
        usersPageNp.addUserButton.click();
    }

    @Then("dialog fields must have matching placeholder")
    public void dialog_fields_must_have_matching_placeholder() {

    }

}
