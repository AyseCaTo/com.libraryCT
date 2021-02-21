package com.libraryCT.pages;

import com.libraryCT.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BorrowingPage extends BasePage {

    @FindBy(xpath = "(//li)[2]")
    public WebElement BorrowLink;
    @FindBy(xpath = "//tr/th")
    public List<WebElement> tableNames1;





}
