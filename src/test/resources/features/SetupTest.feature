Feature: This feature is to setup the framework

  Scenario: Validate top left corner Tek logo
    #Given Open browser and navigate to retail app
    Then Validate top left corner is TEKSCHOOL
    #Then Close browser

  Scenario: Validate logo and Sign in button
    Then Validate top left corner is TEKSCHOOL
    Then Validate Sign in button is Enabled


