Feature: Users have unique ID


  @B28G33-119


  Scenario: unique user ids
    Given I am on the login page
    And I login as a librarian
    When I click on "Users" link
    Then Each user id should be unique
