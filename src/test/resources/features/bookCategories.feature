Feature: Book Categories
  As a students, I should be able to search books with different categories.

  Background:
    Given the user on login page
    When the user login as a student
    When the user click the book categories dropdown


  @bookCategories
  Scenario:
    Then User should be able to see all categories
      | ALL                     |
      | Action and Adventure    |
      | Anthology               |
      | Classic                 |
      | Comic and Graphic Novel |
      | Crime and Detective     |
      | Drama                   |
      | Fable                   |
      | Fairy Tale              |
      | Fan-Fiction             |
      | Fantasy                 |
      | Historical Fiction      |
      | Horror                  |
      | Science Fiction         |
      | Biography/Autobiography |
      | Humor                   |
      | Romance                 |
      | Short Story             |
      | Essay                   |
      | Memoir                  |
      | Poetry                  |

    @searchCategory
    Scenario:
    Then user should be able to filter the "Biography/Autobiography"
