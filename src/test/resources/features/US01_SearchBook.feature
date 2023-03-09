Feature: books search
  @MI
  Scenario: Verify book search results
    Given I am on the login page
    And I login to application as a student
    When I navigate to "Books" page
    And I search for "The Goldfinch"
    Then books table should contain results matching The Goldfinch
      | ISBN.    | 387927210592  |
      | Name     | The Goldfinch |

      | Author   | Donna Tartt   |

      | Category | Drama         |

      | Year     | 2013          |
