package com.libraryCT.pages;

import com.libraryCT.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BookCategories extends BasePage {

    @FindBy(xpath = "//select[@id='book_categories']")
    public WebElement bookCategoriesDropDown;

    @FindBy(xpath = "//table[@id='tbl_books']//td[5]")
    public List<WebElement> bookCategories;

    public List<String> bookCategories(){
        Select bookCategories = new Select(bookCategoriesDropDown);
        List<WebElement> listOfBooks = bookCategories.getOptions();
        List<String> list = new ArrayList<>();
        for (WebElement book : listOfBooks) {
            list.add(book.getText());
        }
        return list;
    }

    public List<String> filterByCategory(){
        List<String> filtered = new ArrayList<>();
        for (WebElement bookCategory : bookCategories) {
            filtered.add(bookCategory.getText());
        }
        return filtered;
    }


}
