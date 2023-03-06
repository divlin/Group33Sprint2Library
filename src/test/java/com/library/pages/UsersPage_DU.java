package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UsersPage_DU {

    public UsersPage_DU(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchButton;


    @FindBy(xpath = "//table//td[2]")
    public WebElement userID;

    @FindBy(xpath = "//table//td[3]")
    public WebElement fullName;

    @FindBy(xpath = "//table//td[4]")
    public WebElement email;



    Map<String,String> actualResult = new LinkedHashMap<>();
    public Map<String,String> getMap(){
        actualResult.put("User ID", userID.getText());
        actualResult.put("Full Name", fullName.getText());
        actualResult.put("Email", email.getText());

        return actualResult;
    }
















}
