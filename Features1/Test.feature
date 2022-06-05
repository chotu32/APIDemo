Feature: JQuery Links Testing

  @tag1 @tag
  Scenario: Testing Links under Jquery portal
    Given user is already on Jquery
    When user goes to the LearnJquery
    Then user click the chapters link and user get the navigated page url and page title and user get back to the home
    Then user click the Recently Updated link and user get the navigated page url and page title and user get back to the home
    Then browse
