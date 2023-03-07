package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage_CG extends LoginPage{
    public MainPage_CG() {
 PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#navbarDropdown>span")
    public WebElement accountHolderName;

}
