package com.libraryCT.step_definitions;

import com.libraryCT.pages.base.UserStatusFeaturePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class UserStatusFeature_StepDefinition {

    UserStatusFeaturePage userStatusFeaturePage =new UserStatusFeaturePage();
    @When("the user click Status dropdown")
    public void the_user_click_status_dropdown() {userStatusFeaturePage.clickUser();

    }


    @Then("the user should see the following options")
    public void the_user_should_see_the_following_options(List<String> expectedUserStatus) {

        Assert.assertEquals(userStatusFeaturePage.userStatus(),expectedUserStatus);


    }
}
