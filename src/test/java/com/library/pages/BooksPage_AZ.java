package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage_AZ extends BasePage{

    @FindBy(xpath = "//h3[.='Book Management']")
    public WebElement txt_header;
}
