package com.libraryCT.step_definitions;

import com.libraryCT.pages.HomePage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDefinitions {

    HomePage homePage = new HomePage();

    @Then("the user logout")
    public void the_user_logout() {
        homePage.logOut();
    }

}
