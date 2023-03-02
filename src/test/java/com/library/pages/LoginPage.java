package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Watchable;

public class LoginPage extends BasePage{


    @FindBy(id = "inputEmail")
    public WebElement inputUsername;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;



    public void loginAsStudent(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("studentUsername1"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("studentPassword"));
        signInButton.click();
    }


    public void loginAsLibrarian(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("librarianUsername1"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        signInButton.click();
    }







}
