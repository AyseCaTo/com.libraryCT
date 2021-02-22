package com.libraryCT.pages;

import com.libraryCT.pages.base.BasePage;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModulePage extends BasePage {
    public ModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Books")
    public WebElement booksButton;

    @FindBy(xpath = "//a[@href='#dashboard']")
    public WebElement dashboardButton;
    @FindBy(linkText = "Borrowing Books")
    public WebElement borrowingBooksButton;

    @FindBy(id = "books")
    public WebElement headerBooks;
    @FindBy(id = "borrowing-books")
    public WebElement headerBorrowingBooks;
    @FindBy(xpath = "//a[@href='#users']")
    public WebElement usersButton;
    @FindBy(xpath = "//a[@href='#dashboard']")
    public WebElement dashButton;



}
