package com.libraryCT.pages;

import com.libraryCT.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.util.ArrayList;
import java.util.List;

public class BookRecordsPage extends BasePage {

    @FindBy(xpath="//a[@href='#users']")
    public WebElement getUsersLink;

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement showRecordsDropDown;
    public int defaultValue(){
        Select showRecords = new Select(showRecordsDropDown);
        return Integer.parseInt(String.valueOf(showRecords.getFirstSelectedOption().getText()));
    }

    public List<String> actualList(){
        Select showRecords = new Select(showRecordsDropDown);
        List<WebElement> options = showRecords.getOptions();
        List<String> actualList = new ArrayList<>();
        for (WebElement webElement : options) {
            actualList.add(webElement.getText());
        }
        return actualList;
    }


}


