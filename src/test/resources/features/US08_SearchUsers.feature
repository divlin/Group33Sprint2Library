Feature: Serach users by ID


  Scenario:As a  user, I should be able to search users by ID.
    Given user is already logged in
    When user click the Users link
    And user write id number into the search box
    Then user should be able to see below information
