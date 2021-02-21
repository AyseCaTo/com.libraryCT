package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksPageTitle;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardPageTitle;


}
