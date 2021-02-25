package com.libraryCT.step_definitions;

import com.libraryCT.pages.BookCategories;
import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BookCategories_StepDefinitions {

    BookCategories bookCategories = new BookCategories();

    @When("the user click the book categories dropdown")
    public void the_user_click_the_book_categories_dropdown() {
        bookCategories.bookCategoriesDropDown.click();
    }

    @Then("User should be able to see all categories")
    public void user_should_be_able_to_see_all_categories(List<String> expectedBookCategories) {
        BrowserUtils.sleep(3);
        Assert.assertEquals(bookCategories.bookCategories(), expectedBookCategories);
    }

    @Then("user should be able to filter the {string}")
    public void user_should_be_able_to_filter_the(String category) {
        Select categoryOfBook = new Select(bookCategories.bookCategoriesDropDown);
        categoryOfBook.selectByVisibleText(category);
        BrowserUtils.sleep(3);
        for (String s : bookCategories.filterByCategory()) {
            Assert.assertEquals(s, category);
        }

    }
}
