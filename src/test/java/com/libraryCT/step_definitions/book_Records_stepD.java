package com.libraryCT.step_definitions;

import com.libraryCT.pages.BookRecords_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class book_Records_stepD {

    BookRecords_Page bookRecords_page= new BookRecords_Page();

   @When("verify that the default record is {int}")
    public void verifyThatTheDefaultRecordIs(int arg0) {
        bookRecords_page.records10.isDisplayed();
    }

    @When("Show records for <count> options")
    public void showRecordsForCountOptions() {

bookRecords_page.allOptions.click();

    }

}
