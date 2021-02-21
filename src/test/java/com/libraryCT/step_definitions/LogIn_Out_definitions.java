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

public class LogIn_Out_definitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("the user on login page")
    public void the_user_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user login as a student")
    public void the_user_login_as_a_student() {
        loginPage.loginAsStudent();
    }

    @Then("the user on  books")
    public void the_user_on_books() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(homePage.booksPageTitle.isDisplayed());
    }

    @When("the user login as a librarian")
    public void the_user_login_as_a_librarian() {
       loginPage.loginAsLibrarian();
    }

    @Then("the user on  Dashboard")
    public void the_user_on_dashboard() {
        BrowserUtils.sleep(3);
       Assert.assertTrue(homePage.dashboardPageTitle.isDisplayed());
    }


}
