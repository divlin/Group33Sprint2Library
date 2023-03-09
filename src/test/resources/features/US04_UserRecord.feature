Feature: Selecting Different Numbers of Rows in User Records Table




    Scenario:Show records for <10> options
    Given the librarian is on the login page and logged succes
    And Librarian click on the "User" link
    When I select Show <15> records
    Then show records value should be <50>
    And the users table must display <100> records





