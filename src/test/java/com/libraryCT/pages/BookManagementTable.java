package com.libraryCT.pages;

import com.libraryCT.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BookManagementTable extends BasePage {

    @FindBy(xpath = "//tr//th")
    public List<WebElement> tableNames;



}
