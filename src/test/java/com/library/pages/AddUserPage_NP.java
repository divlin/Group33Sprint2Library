package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AddUserPage_NP extends BasePage {

    //    @FindBy(xpath = "//label[.='Full Name']")
    @FindBy(name = "full_name")
    public WebElement fullName;


    //@FindBy(xpath = "//label[.='Password']")
    @FindBy(name = "password")
    public WebElement password;

    //@FindBy(xpath = "//label[.='Email']")
    @FindBy(name = "email")
    public WebElement email;

    //@FindBy(xpath = "//label[.='User Group']")
    //public WebElement userGroup;

//    @FindBy(xpath = "//label[.='Status']")
//    public WebElement status;
//
//    @FindBy(xpath = "//label[.='Start Date']")
//    public WebElement startDate;
//
//    @FindBy(xpath = "//label[.='End Date']")
//    public WebElement endDate;

    //@FindBy(xpath = "//label[.='Address']")
    @FindBy(id = "address")
    public WebElement address;


}