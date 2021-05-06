Feature: Verify SOF App to Web Navigation - Logged-in App User


  	@Sprint5 @TC-OMNI-35286 @ST-OMNI-26981
    Scenario Outline:: validate PDP for FireArms/Ammunitions SOF App to Web Navigation
  	Given User launches the application 
	And User continues as guest user 
    And User is on Log In screen
	Then User sees email address field
    And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
    And User enters valid password "Password@123"
    And User taps on Login
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<product>"
    And I choose to navigate to PDP 
    Then I choose to verify "App_store_guidelines" in PDP Page
    Then User scrolls down to the bottom in "6" swipe
    And I choose to click on "Purchase Button" in PDP page
    Then I choose to verify user navigated to PDP on Web
 
 Examples: 
     |    product            |	
     |    FireArms           | 
   # |    ammunitionProd     | 
   