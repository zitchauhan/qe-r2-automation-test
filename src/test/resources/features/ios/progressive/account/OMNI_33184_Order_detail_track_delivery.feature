Feature: Verify the  feature of order cancellation confirmation screen

@Sprint-6 @ST-OMNI-33184 
Scenario: As an ASO Mobile App login user, 
	I want to confirm that order has been cancelled when i tap on  Yes button from alert confirmation screen
	Given User launches the application 
	And User continues as guest user 
	And User is on "LogIn" screen 
	When User enters "email" on login screen 
	And User enters "password" on login screen 
	And User taps on "LogIn" button on login screen 
	Then User Logs into the application 
	And User taps on account in bottom nav 
	When User taps on Order button 
	Then User sees Order page with order list 
	When User taps on OrderId 
	Then User sees order detail page 
	Then User sees track Delivery button
	When User taps on track Delivery button
	Then User navigated to Narvar Tracking screen

@Sprint-6 @ST-OMNI-33184 	
	Scenario: As an ASO Mobile App Guest user, 
	I want to confirm that order has been cancelled when i tap on  Yes button from alert confirmation screen
	Given User launches the application 
	And User continues as guest user 
	And User taps on account in bottom nav 
	When User taps on Order button 
	Then User sees order lookup
	When User enter Order id as "730931037"
	When User enter zip code  as "72601"
	And  User tap on check button
	Then User sees order detail page 
	Then User sees track Delivery button
	When User taps on track Delivery button
	Then User navigated to Narvar Tracking screen
	