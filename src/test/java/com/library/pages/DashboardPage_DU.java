package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage_DU {

    public DashboardPage_DU(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//span[.='Users']")
    public WebElement usersLink;
}
