package com.libraryCT.step_definitions;

import com.libraryCT.pages.BookManagementTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ColumnNames_StepDefinitions {

        BookManagementTable bookManagementTable = new BookManagementTable();


        @Then("the user should see the following column names")
        public void the_user_should_see_the_following_column_names( List<String>  ExpectedTablesNames) {
                List<String> actualTableNames = new ArrayList<>();
                for(WebElement each: bookManagementTable.tableNames){
                        each.isDisplayed();
                        actualTableNames.add(each.getText());

                }

                System.out.println(ExpectedTablesNames);
                System.out.println(actualTableNames);
                Assert.assertEquals(actualTableNames, ExpectedTablesNames);

        }
}
