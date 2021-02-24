package com.libraryCT.step_definitions;

import com.libraryCT.pages.BookRecords_Page;
import com.libraryCT.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class bookRcords_Def {

    BookRecords_Page bookRecords_page= new BookRecords_Page();
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

    }

    @When("User login as a librarian")
    public void userLoginAsALibrarian() {
    }
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

    }}
