package com.libraryCT.pages;

import com.libraryCT.pages.base.BasePage;
import com.libraryCT.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "inputEmail")
    public WebElement inputEmail;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    public void loginAsLibrarian(){
        inputEmail.sendKeys(ConfigurationReader.getProperty("LibrarianUserName"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        submitButton.click();
    }

    public void loginAsStudent(){
        inputEmail.sendKeys(ConfigurationReader.getProperty("studentUserName"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("studentPassword"));
        submitButton.click();
    }
}
