Feature: Login and dashboard page access
  Agile Story: As a librarian, I want to login and access to the dashboard page

  Scenario: Login as librarian 13
    Given Librarian is on the Login page
    When Librarian enter username "librarian13@library"
    And Librarian enter password "libraryUser"
    And Librarian click the Sign In button
    Then Librarian should be on the dashboard page