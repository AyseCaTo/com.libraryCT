package com.libraryCT.step_definitions;

import com.libraryCT.pages.UsersPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class UserManagementTable_StepDefinitions {

    UsersPage usersPage = new UsersPage();

    @Then("the user should see the following management table column names:")
    public void the_user_should_see_the_following_management_table_column_names(List<String> expectedHeaderList) {
        Assert.assertEquals(usersPage.actualHeaderList(), expectedHeaderList);
    }
}
