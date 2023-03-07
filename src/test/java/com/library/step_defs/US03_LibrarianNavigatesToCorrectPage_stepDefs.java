package com.library.step_defs;

import com.library.pages.BooksPage_AZ;
import com.library.pages.DashBoardPage_AZ;
import com.library.pages.LoginPage;
import com.library.pages.UsersPage_AZ;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class US03_LibrarianNavigatesToCorrectPage_stepDefs {

    LoginPage login = new LoginPage();
    DashBoardPage_AZ dashBoardPage = new DashBoardPage_AZ();
    UsersPage_AZ usersPage = new UsersPage_AZ();
    BooksPage_AZ booksPage = new BooksPage_AZ();

    @FindBy(css = "html > body > header > nav > div > ul:nth-of-type(1) > li:nth-of-type(3) > a > span:nth-of-type(1)")
    public WebElement spanBooks;


    @Given("Librarian is already logged in")
    public void librarian_is_already_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login.loginAsLibrarian();
    }

    @Then("Librarian should see 3 categories")
    public void librarian_should_see_3_categories(List<String> expectedCategories) {

        List<String> actualCategories = new ArrayList<>();
        for (WebElement category : dashBoardPage.categories) {
            actualCategories.add(category.getText());
        }

        Assert.assertEquals(expectedCategories, actualCategories);

    }


    @Given("Librarian clicks DashBoard from the top main menu")
    public void librarian_clicks_users_from_the_top_main_menu() {
        login.navigateTo("Dashboard");
    }

    @Then("Librarian should see User Management header")
    public void librarian_should_see_user_management_header() {
        Assert.assertEquals(usersPage.txt_header.getText(), "User Management");
    }


    @Given("Librarian clicks Books from the top main menu")
    public void librarian_clicks_books_from_the_top_main_menu() {
        login.navigateTo("Books");
    }

    @Then("Librarian should see Book Management header")
    public void librarian_should_see_book_management_header() {
        Assert.assertEquals(booksPage.txt_header.getText(), "Book Management");
    }


    @Given("Librarian is already in Users page")
    public void librarian_is_already_in_users_page() {
        login.navigateTo("Users");
    }

    @When("Librarian clicks Users from the top main menu")
    public void librarian_clicks_dash_board_from_the_top_main_menu() {
        login.navigateTo("Users");
    }

    @Given("Librarian is already in Books page")
    public void librarian_is_already_in_books_page() {
        login.navigateTo("Books");
    }


    @Given("Librarian is on any {string}")
    public void librarian_is_on_any(String page) {
        login.navigateTo(page);
    }

    @When("Librarian clicks log out")
    public void librarian_clicks_log_out() {

        dashBoardPage.btn_accountName.click();
        dashBoardPage.btn_logout.click();
    }

    @Then("Librarian should be in the login page")
    public void librarian_should_be_in_the_login_page() {
        String expectTitle = "Login - Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectTitle, actualTitle);
    }
}
