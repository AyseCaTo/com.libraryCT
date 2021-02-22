package com.libraryCT.step_definitions;

import com.libraryCT.pages.AddUsersPage;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUsers_StepDefinitions {

    AddUsersPage addUsersPage = new AddUsersPage();

    @When("Librarian add users with all valid info")
    public void librarian_add_users_with_all_valid_info() {
       addUsersPage.ableToAddUser();
    }




    @Then("Librarian able to close the add users window with close button")
    public void librarian_able_to_close_the_add_users_window_with_close_button() {
       addUsersPage.ableToClose();
    }
    @Then("Librarian able to edit user info")
    public void librarian_able_to_edit_user_info() {
       addUsersPage.ableToEdit();
    }

}
