Feature: Verify image and video container is displayed in pdp

	@Sprint1 @TC-OMNI-25097 @ST-20861
  Scenario: User sees image container on pdp
  Given User launches the application
  And User continues as guest user
  When User Sees the Search Box
  Then User clicks on the Search Box
  And User search for the "SearchKeyword" 
  When I choose to navigate to PDP
  Then User sees product image