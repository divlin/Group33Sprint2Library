package com.library.pages;

/*
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

 */



import com.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UsersPage_JM extends BasePage {

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement showRecords;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> records;


    public void showRecords(String records){
        WebElement element = Driver.getDriver().findElement(By.xpath("//select[@name='tbl_users_length']"));
        Select select = new Select(element);
        select.selectByVisibleText(records);

    }




}
