@SG
Feature: Search functionality on the users page


  Background:

    Given Librarian is on the login page.
    And I click on "Users" link

    @B28G33-114
  Scenario: Search accuracy

    When I search for "test"

    Then table should contain rows with "Tests"


      @B28G33-115
  Scenario: Table columns names

    Then table should have following column names:

      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |


