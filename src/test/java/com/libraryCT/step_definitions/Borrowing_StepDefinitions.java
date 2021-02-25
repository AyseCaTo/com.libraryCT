package com.libraryCT.step_definitions;

import com.libraryCT.pages.BorrowingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Borrowing_StepDefinitions {


    BorrowingPage bPage = new BorrowingPage();
    @When("the user click Borrowing Books module")
    public void theUserClickBorrowingBooksModule() {
        bPage.BorrowLink.click();
    }
    @Then("the user should see the following column names:")
    public void theUserShouldSeeTheFollowingColumnNames(List<String> expectedTableNames) {
        List<String> actualTableNames = new ArrayList<>();
        for(WebElement each: bPage.tableNames1){
            actualTableNames.add(each.getText());
            each.isDisplayed();
        }
        Assert.assertEquals(expectedTableNames,actualTableNames);
        System.out.println("actualTableNames = " + actualTableNames);
        System.out.println("expectedTableNames = " + expectedTableNames);
    }



}
