package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage_MI {

    public BooksPage_MI(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

     @FindBy(xpath ="//span[.='Books']")
   public  WebElement bookLink ;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//tbody//tr[1]//td[2]")
    public WebElement isbnNumber;

    @FindBy(xpath = "//tbody//tr[1]//td[3]")
    public WebElement name;

    @FindBy(xpath = "//tbody//tr[1]//td[4]")
    public WebElement author;

    @FindBy(xpath = "//tbody//tr[1]//td[5]")
    public WebElement category;

    @FindBy(xpath = "//tbody//tr[1]//td[6]")
    public WebElement year;






}
