Feature: Debug Testing 

 @AutomationSanityR1 @AS1 @MAST-24 @AutomationSanity
  Scenario: TC_28-Verify Navigation from L3 to Homepage by clicking on ASO logo
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
#    And user navigate to L3 page
    Then User is able to see the ASO_Logo
    Then User clicks on ASO logo
    Then User should be navigated to Home_Page