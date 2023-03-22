Feature: fav feature

  Background:
    Given user is on the home page
  Scenario: testing favs appear in the fav section
    When user searches for a destination "Burnley"
    And user clicks search
    And user favs first item
    Then user sees fav in favourites
