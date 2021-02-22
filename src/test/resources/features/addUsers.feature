Feature: Add users
  As a librarian, I should be able to add users from users page.

  Background:
    Given the user on login page
    When the user login as a librarian

    @addUsers
    Scenario:
      When Librarian add users with all valid info
      Then Librarian able to close the add users window with close button
      Then Librarian able to edit user info

