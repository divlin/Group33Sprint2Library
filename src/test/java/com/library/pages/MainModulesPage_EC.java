package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainModulesPage_EC {

    public MainModulesPage_EC(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardPage;


}
