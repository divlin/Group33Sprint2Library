package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UsersPage_KF {

    public UsersPage_KF(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchTab;


   /* @FindBy(xpath = "//table//td[2]")
    public WebElement user_ID;
    */

    @FindBy(xpath = "//table//td[3]")
    public WebElement full_Name;

    @FindBy(xpath = "//table//td[4]")
    public WebElement user_Email;



    @FindBy(className = "tbl_users_length")
    public WebElement show_records;

    @FindBy(xpath = "//tr/td[2]")
    public List<WebElement> user_Id;

    Map<String,String> actualResult = new LinkedHashMap<>();
    public Map<String,String> getMap(){
        //actualResult.put("User ID", user_ID.getText());
        actualResult.put("Full Name", full_Name.getText());
        actualResult.put("Email", user_Email.getText());

        return actualResult;
    }



}
