Feature: Debug Testing

 @AutomationSanity @AS1 @WAST-2
  Scenario: TC_2-Login and Logout
    Given user launches the browser and navigates to "ASO_HOME" page
    Then Verify the message on the page
    |# Following Error Message should show on the page|
    |2018 Academy Sports Outdoors. All Rights Reserved|