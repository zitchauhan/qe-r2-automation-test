Feature: Verify user is able to share product from PDP page of the product using share icon

  	@Sprint06 @TC-OMNI-37706  @TC-OMNI-37707  @TC-OMNI-37708 @ST-OMNI-20882 
    Scenario: Validate share icon is visible to the user on pdp page
  	Given User launches the application
  	And User continues as "guest user" on onboarding page
    #When User Clicks On MaY Be Later
    #When User Clicks On MaY Be Later
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword4"
#   Then User sees all products related to search Keyword  
    And I choose to navigate to PDP
    Then User validates the share icon on PDP page and taps on it
    And User validates share tray is opened with product thumbnail and image
    
    #Then I choose to verify "important_Product_and_Safety_Information" in PDP Page
    #And I choose click on "Purchase on Button" in PDP page
    #Then I choose to verify user navigated to PDP on Web

 
 