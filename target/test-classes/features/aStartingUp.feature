Feature: Starting up the app
  Background:
    Given user see the welcome screen
  Scenario: Getting to home page
    When user clicks confirm
    Then user can see the home logo


  Scenario: Changing currency
    When user clicks on India english
    Then user can see the currency is in Indian
