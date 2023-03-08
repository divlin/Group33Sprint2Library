package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersPage_KT {

    public UsersPage_KT(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//span[text() ='Users']")
    public WebElement Users;

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement dropDown;

    @FindBy (xpath = "//tbody/tr")
    public List<WebElement> infoShown;
}
