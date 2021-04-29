Feature: Search

  Scenario: Search Dresses

    Given The user is in the index page
    When The user enters dresses in the search bar
    And The user clicks the search button
    Then The dresses page appears