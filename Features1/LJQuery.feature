Feature: LJQuery Chapters and Recently Updated Links feature

  @tag1 @tag
  Scenario: Chapters link test scenario and Updated links test scenario
    Given user is already on Jquery
    When user goes to the LearnJquery
    Then user click the chapters link and user get the navigated page url and page title and user get back to the home
    Then user click the Recently Updated link and user get the navigated page url and page title and user get back to the home
    Then browse
