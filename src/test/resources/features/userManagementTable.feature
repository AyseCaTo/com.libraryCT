Feature: User management table feature

  Background:
    Given the user on login page
    When the user login as a librarian

    @management
  Scenario: user management table columns names
    When the user click users module
    Then the user should see the following management table column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |
