Feature: Add users
  As a librarian, I should be able to add users from users page.

  Background:
    Given the user on login page
    When the user login as a librarian

    @addUsers
    Scenario:Librarian should add user
      When User click on user button
      Then Librarian add user

      @close
      Scenario: Librarian should close the window
        When Librarian click on users link
        Then Librarian can close the pop-up window

        @edit
        Scenario: Librarian should able to edit user information
          When Librarian click the edit user button
          Then Librarian can change the information
