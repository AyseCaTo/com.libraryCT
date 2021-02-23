package com.libraryCT.pages;

import com.libraryCT.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class BookRecords_Page extends BasePage {

@FindBy(xpath=("//div[@id='tbl_books_wrapper']//option[@value=10]"))
    public WebElement  records10;

@FindBy(xpath = ("//div[@id='tbl_books_wrapper']//option"))
    public WebElement allOptions;

}
