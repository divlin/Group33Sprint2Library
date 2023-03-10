#Feature: Selecting Different Numbers of Rows in User Records Table
#
#
#
#
#    Scenario:Show records for <10> options
#    Given the librarian is on the login page and logged succes
#    And Librarian click on the "User" link
#    When I select Show <15> records
#    Then show records value should be <50>
#    And the users table must display <100> records

Feature:
    User Story4: As a user, I want to select different number of raws to see users records

    @B28G33-121
    Scenario Outline: Show records for <count> options
        Given Librarian is already logged in
        And Librarian click on "Users" link
        When Librarian select Show <count> records
        Then show records value needs to be <count>
        And users table must display <count> records
        Examples:
            | count |
            | 5     |
            | 10    |
            | 15    |
            | 50    |
            | 100   |





