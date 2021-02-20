Feature: table with default info
  As a students, I should be able to see tables with default info

  Background:
    Given the user on login page

    @dataTable
  Scenario: Table column names
    When the user login as a student
    Then the user should see the following column names

      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |




