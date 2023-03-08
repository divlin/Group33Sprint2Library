Feature: User valid login
  Agile US: As a user, I should be able to Login with valid credentials.

  Scenario Outline: Verify user information email
    Given user is on the login page
    When  I login using "<email>" and "<password>"
    And   I click on Sign in button
    Then  account holder name should be "<name>"


  @B28G33-93
    Examples:
  |email             |password   |name            |
  |student1@library  |libraryUser|Test Student 1  |
  |student2@library  |libraryUser|Test Student 2  |
  |student3@library  |libraryUser|Test Student 3  |
  |student4@library  |libraryUser|Test Student 4  |
  |student5@library  |libraryUser|Test Student 5  |
  |librarian1@library|libraryUser|Test Librarian 1|
  |librarian2@library|libraryUser|Test Librarian 2|
  |librarian3@library|libraryUser|Test Librarian 3|
  |librarian4@library|libraryUser|Test Librarian 4|
  |librarian5@library|libraryUser|Test Librarian 5|

