Feature: User group category features

  Background:
    Given the user on login page
    When the user login as a librarian



  @category
  Scenario: Verify user categories
    When the user click users module
    And the user click User Group dropdown
    Then the user should see the following options:
        | ALL       |
        | Librarian |
        | Students  |
