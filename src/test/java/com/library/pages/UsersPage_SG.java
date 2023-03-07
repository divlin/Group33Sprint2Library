package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage_SG {

    public UsersPage_SG(){ PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//input[@type='search']")
    public static WebElement searchBox;


    @FindBy(xpath = "//table[contains(., 'Test')]")
    public WebElement testsRow;

    @FindBy(xpath = "//*[@id=\"tbl_users\"]/thead/tr")
    public WebElement columnNames;


}
