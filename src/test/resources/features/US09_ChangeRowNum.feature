Feature: Manage user info table


  @KT
  Scenario: Change the number of rows in Users page
    Given user is logged in as librarian
    And user clicks the "Users" link
    When user selects Show 50 records
    Then the records value should be 50
    And table must display 50 records