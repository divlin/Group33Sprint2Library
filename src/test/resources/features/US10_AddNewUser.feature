@wip
Feature:Librarian add new users dialog

  Agile story: As a user, I want to add new users to the app.

  Scenario: As librarian i want to verify that I can add new user
    Given Librarian is on the login page
    And Librarian click on user module
    When Librarian click on the Add Users
    Then dialog fields must have matching placeholder


      | fullname | Full Name |
      | email    | Email     |
      | password | Password  |
      | address  | null      |
