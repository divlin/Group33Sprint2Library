Feature: books search
  @MI
  Scenario: Verify book search results
    Given  student is already logged in
    When student navigate to "Books" page
    And student search for  "Neverland"
    Then books table should contain results matching Neverland
      | ISBN    | ggg                  |
      | Name     | Neverland            |
      | Author   | Me                   |
      | Category | Action and Adventure |
      | Year     | 1983                 |
