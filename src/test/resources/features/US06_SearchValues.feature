@SG
Feature: Search functionality on the users page


  Background:

    Given Librarian is on the login page.
    And I click on "Users" link

  Scenario: Search accuracy

    When I search for "test"

    Then table should contain rows with "Tests"


  Scenario: Table columns names

    Then table should have following column names:

      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |


