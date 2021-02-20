package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_definitions {

    LoginPage loginPage = new LoginPage();

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

    }

    @When("the user login as a librarian")
    public void the_user_login_as_a_librarian() {
       loginPage.loginAsLibrarian();
    }
    @Then("the user on  Dashboard")
    public void the_user_on_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
