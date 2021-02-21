package com.libraryCT.step_definitions;

import com.libraryCT.pages.UsersPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class GroupCategory_StepDefinitions {

    UsersPage usersPage = new UsersPage();

    @When("the user click users module")
    public void the_user_click_users_module() {
        usersPage.usersLink.click();
    }

    @When("the user click User Group dropdown")
    public void the_user_click_user_group_dropdown() {
        usersPage.userGroupDropdown.click();
    }

    @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String> expectedList) {
        Assert.assertEquals(usersPage.actualList(), expectedList);
    }

}
