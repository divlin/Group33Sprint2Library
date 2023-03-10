Feature: Search users by ID


  @B28G33-89
  Scenario: As a user, I should be able to search users by ID.
    Given user is already logged in
    When user click the "Users" link
    And user write "843" as an id number into the search box
    Then user should be able to see below information
    |User ID  |843      |
    |Full Name|Mike Mike|
    |Email    |hi@hello0|
