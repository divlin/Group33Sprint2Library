package com.library.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

// page_url = https://library3.cydeo.com/#dashboard
public class DashBoardPage_AZ extends BasePage{
    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement btn_dashboard;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement btn_users;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement btn_books;

    @FindBy(xpath = "//span[contains(.,'Librarian')]")
    public WebElement btn_accountName;

    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement btn_logout;

    @FindBy(xpath = "//h6")
    public List<WebElement> categories;
    
    


   
    
    
    
}