package com.libraryCT.step_definitions;

;
import com.libraryCT.pages.AddUsersPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUsers_StepDefinitions {

   AddUsersPage addUsersPage =new AddUsersPage();


   @When("User click on user button")
   public void user_click_on_user_button() {}
   @Then("Librarian add user")
   public void librarian_add_user() { addUsersPage.ableToAddUser(); }


   @When("Librarian click on users link")
   public void librarian_click_on_users_link() {}
   @Then("Librarian can close the pop-up window")
   public void librarian_can_close_the_pop_up_window() {addUsersPage.ableToClose();
}


    @When("Librarian click the edit user button")
    public void librarian_click_the_edit_user_button() {}
    @Then("Librarian can change the information")
    public void librarian_can_change_the_information() {addUsersPage.ableToEdit();

    }



}
