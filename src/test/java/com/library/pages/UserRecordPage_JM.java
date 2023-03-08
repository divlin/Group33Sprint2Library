package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRecordPage_JM extends BasePage {

    public WebElement selectDropdown;

    public UserRecordPage_JM () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement Books;

    @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement UserRows10;



    @FindBy(xpath = "//*[@id=\"tbl_books_length\"]/label/select/option[3]")
    public WebElement UserRows15;

    @FindBy(xpath = "//*[@id=\"tbl_books_length\"]/label/select/option[4]")
    public WebElement UserRows50;

    @FindBy(xpath = "//*[@id=\"tbl_books_length\"]/label/select/option[5]\n")
    public WebElement UserRows100;








}
