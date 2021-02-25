Feature: User status features

  Background:
    Given the user on login page
    When the user login as a librarian

    @statusFeature
  Scenario: verify user status
    When the user click users module
    And the user click Status dropdown
    Then the user should see the following options

      | ACTIVE   |
      | INACTIVE |
