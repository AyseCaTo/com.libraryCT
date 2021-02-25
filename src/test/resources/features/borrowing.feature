Feature: Borrowing Books
  As a user, I should able to see my borrowing books.
  Background:
    Given the user on login page
  @borrow
  Scenario:
    When the user login as a student
    When the user click Borrowing Books module
    Then the user should see the following column names:
      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned ?       |

