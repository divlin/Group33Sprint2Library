package com.library.step_defs;

import com.library.pages.AddUserPage_NP;
import com.library.pages.LoginPage;
import com.library.pages.UsersPage_NP;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class US10_LibrarianAddNewUser {

    LoginPage loginPage = new LoginPage();
    UsersPage_NP usersPageNp = new UsersPage_NP();

    AddUserPage_NP addUserPageNp = new AddUserPage_NP();

    @Given("Librarian is on the login page")
    public void librarian_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAsLibrarian();
    }

    @Given("Librarian click on user module")
    public void librarian_click_on_module() {
        usersPageNp.usersTab.click();
    }

    @When("Librarian click on the Add Users")
    public void librarian_click_on_the_add_users() {
        usersPageNp.addUserButton.click();
    }

    @Then("dialog fields must have matching placeholder")
    public void dialog_fields_must_have_matching_placeholder(Map<String, String> expected) {

        Map<String, String> actual = new LinkedHashMap<>();
        actual.put("fullname", addUserPageNp.fullName.getAttribute("placeholder"));
        actual.put("email", addUserPageNp.email.getAttribute("placeholder"));
        actual.put("password", addUserPageNp.password.getAttribute("placeholder"));
        //actual.put("address", addUserPageNp.address.getText());

        Assert.assertEquals(expected, actual);

//        addUserPageNp.address.getText().equals("");
//        addUserPageNp.password.getText().equals("Password");
//        addUserPageNp.fullName.getText().equals("Full Name");
//        addUserPageNp.email.getText().equals("Email");

//        Assert.assertEquals(addUserPageNp.address.getText(), expected);
//        Assert.assertEquals(addUserPageNp.password.getText(), expected);
//        Assert.assertEquals(addUserPageNp.fullName.getText(), expected);
//        Assert.assertEquals(addUserPageNp.email.getText(), expected);
    }
}
