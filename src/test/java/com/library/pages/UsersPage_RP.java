package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

// page_url = https://library3.cydeo.com/#dashboard
public class UsersPage_RP {

    public UsersPage_RP() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[text()='Users']")
    public WebElement Users;
    @FindBy(xpath = "//span[text()='Books']")
    public WebElement Books;
    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement selectDropdown;
















}
