package com.libraryCT.pages;

import com.libraryCT.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class UsersPage extends BasePage {

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement usersLink;

    @FindBy(id = "user_groups")
    public WebElement userGroupDropdown;

    @FindBy(xpath = "//table//th")
    public List<WebElement> tableHeaderList;

    public List<String> actualList(){
        Select userCategories = new Select(userGroupDropdown);
        List<WebElement> categories = userCategories.getOptions();
        List<String> actualList = new ArrayList<>();
        for (WebElement category : categories) {
            actualList.add(category.getText());
        }
        return actualList;
    }

    public List<String> actualHeaderList(){
        List<String> actualHeaderList = new ArrayList<>();
        for (WebElement webElement : tableHeaderList) {
            actualHeaderList.add(webElement.getText());
        }
        return actualHeaderList;
    }




}
