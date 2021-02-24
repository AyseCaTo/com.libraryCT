package com.libraryCT.pages.base;

import com.libraryCT.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class UserStatusFeaturePage extends BasePage{


    @FindBy(xpath="//*[@id='menu_item']/li[2]/a")
    public WebElement userButton;
    @FindBy(xpath = "//*[@id='user_status']")
    public WebElement statusDropdown;

    public void clickUser(){
        userButton.click();
    }
    public List<String> userStatus(){
        Select userStatus = new Select(statusDropdown);
        List<WebElement> webElementList = userStatus.getOptions();
        List<String> list = new ArrayList<>();
        for (WebElement webElement : webElementList) {
            list.add(webElement.getText());
        }
        return list;
    }




}


