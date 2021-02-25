package com.libraryCT.step_definitions;

import com.libraryCT.pages.BookRecords_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class BookRecords_StepDefinitions {

    BookRecords_Page bookRecords_page= new BookRecords_Page();
   
    @When("User click on {string} link")
    public void user_click_on_link(String string) {
     bookRecords_page.getUsersLink.click();
    }

    @Then("show records default value should be {string}")
    public void show_records_default_value_should_be(int expectedDefault) {
        Assert.assertEquals(expectedDefault, bookRecords_page.defaultValue());
    }

    @And("show records should have following options:")
    public void show_records_should_have_following_options(List<String> expectedList) {
        Assert.assertEquals(bookRecords_page.actualList(), expectedList);
    }
}
