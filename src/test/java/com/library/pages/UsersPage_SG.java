package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersPage_SG {

    public UsersPage_SG(){ PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;


    @FindBy(xpath = "//table//tr//td")
    public WebElement table;

    @FindBy(xpath = "//tr/th")
    public List<WebElement> columnNames;




}
