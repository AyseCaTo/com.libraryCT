package com.libraryCT.pages;

import com.libraryCT.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardTitle;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksTitle;

}
