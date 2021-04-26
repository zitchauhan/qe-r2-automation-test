Feature: Verify PDP CR - PDP Header and Cart Badge

@Sprint5 @TC-OMNI- @ST-OMNI-34006
  Scenario: Verify user sees PDP CR - PDP Header and Cart Badge
  Given User launches the application
  And User continues as guest user
  When User Sees the Search Box
  Then User clicks on the Search Box
  And User search for the "SearchKeyword" 
  When I choose to navigate to PDP
  Then User sees product image
  And User sees cart badge on top
  Then User sees quantity stepper
		When User sets qty to "100"
		Then Quantity is changed to "100"
		When User taps on increment quantity stepper
		Then Quantity is changed to "100"
  And User taps on add to cart button 
  And User taps on Continue shopping button
  Then User sees the correct item count on the cart badge as "99+"
  
  Scenario: Verify user sees PDP CR - PDP Header and Cart Badge
  Given User launches the application
  And User continues as guest user
  When User Sees the Search Box
  Then User clicks on the Search Box
  And User search for the "SearchKeyword" 
  When I choose to navigate to PDP
  Then User sees product image
  And User scrolls down to the bottom
  And User sees Product title on header
  And User sees cart badge on top
  And User sees back button 
  Then User sees longer product disclaimer with elipses
  When User scrolls up to the top
  Then User sees header will not be displayed 
  
  Scenario: Verify user sees PDP CR - PDP Header and Cart Badge
  Given User launches the application
  And User continues as guest user
  When User Sees the Search Box
  Then User clicks on the Search Box
  And User search for the "SearchKeyword" 
  When I choose to navigate to PDP
  Then User sees product image
  And User sees cart badge on top 
  When User taps on cart badge
  Then User is navigated To Cart Screen
  
  
  
	
  