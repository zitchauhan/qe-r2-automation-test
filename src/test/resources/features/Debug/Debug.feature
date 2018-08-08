Feature: Debug Testing

 @AutomationSanity @AS1 @WAST-2
  Scenario: TC_2-Login and Logout
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user should able to click on Signin button
    And user should be able to enter the signin details<"mondayacademy@mailinator.com"><"pass1234">
    Then user sign out from the website