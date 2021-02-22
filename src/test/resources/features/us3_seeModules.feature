Feature: can see all modules

  Background:
    Given the user on login page

  @studentModules
  Scenario:
    When the user login as a student
    Then student should see modules
    |Books          |
    |Borrowing Books|


  @liberianModules
  Scenario:
    When the user login as a librarian
    Then liberian should see modules
      | Dashboard       |
      | Users           |
      | Books           |
