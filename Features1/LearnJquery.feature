Feature: LearnJquery Chapters and Recently Updated Links feature

  # <-- comments declaration in feature file
  @tag @tag1
  Scenario: Chapters link test scenario and Updated links test scenario
    Given user is already on Jquery page
    When user goes to the LearnJquery website
    Then user click the chapters link and user get the navigated page url and page title and user get back to the home page
    Then user click the Recently Updated link and user get the navigated page url and page title and user get back to the home page
    Then browser close
