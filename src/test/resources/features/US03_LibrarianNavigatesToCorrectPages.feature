Feature: Navigate to correct pages

  Agile Story: As a librarian, I should be able to navigate to correct pages.

  Background:
    Given Librarian is already logged in

  @B28G33-96
  Scenario: Librarian navigates to the main page
    Then Librarian should see 3 categories
      | Users          |
      | Books          |
      | Borrowed Books |

  @B28G33-98
  Scenario: Librarian navigates to the User page
    Given Librarian clicks Users from the top main menu
    Then Librarian should see User Management header

  @B28G33-100
  Scenario: Librarian navigate to the Books Page
    Given Librarian clicks Books from the top main menu
    Then Librarian should see Book Management header

  @B28G33-101
  Scenario: Librarian navigate to the main page from Users page
    Given Librarian is already in Users page
    When Librarian clicks DashBoard from the top main menu
    Then Librarian should see 3 categories
      | Users          |
      | Books          |
      | Borrowed Books |

  @B28G33-102
  Scenario: Librarian navigate to the main page from Books page
    Given Librarian is already in Books page
    When Librarian clicks DashBoard from the top main menu
    Then Librarian should see 3 categories
      | Users          |
      | Books          |
      | Borrowed Books |

  @B28G33-103
  Scenario Outline: Librarian navigates back to login page
    Given Librarian is on any "<page>"
    When Librarian clicks log out
    Then Librarian should be in the login page
    Examples:
      | page      |
      | Dashboard |
      | Users     |
      | Books     |

































