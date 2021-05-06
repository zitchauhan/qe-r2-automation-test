Feature: Verify the  feature of order cancellation confirmation screen

@Sprint-6 @ST-OMNI-33836 
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
	When User taps on cancel Order button 
	Then User sees Yes button on alert confrimation screen 
	When User taps on Yes Order button 
	Then User sees order cancellation confirmation screen
	
@Sprint-6 @ST-OMNI-33836	
Scenario: As an ASO Mobile App login user, 
	I want to see the Order cancellation message with date
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
	When User taps on cancel Order button 
	Then User sees Yes button on alert confrimation screen 
	When User taps on Yes Order button 
	Then User sees order cancellation confirmation screen
	Then User sees order cancellation message as "Your order cancellation request has been received"
	Then User sees order cancellation message as "Your Confirmation mail is on its way."
	Then User sees order cancellation date
	
@Sprint-6 @ST-OMNI-33836
	Scenario: As an ASO Mobile App login user, 
	I want to see the product details on order cancellation confirmation screen
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
	When User taps on cancel Order button 
	Then User sees Yes button on alert confrimation screen 
	When User taps on Yes Order button 
	Then User sees order cancellation confirmation screen
	Then User sees product name on cancellation confirmation screen
	Then User sees prodcut image  on cancellationconfirmation screen
	Then User sese product SKU on cancellation confirmation screen
	Then User sees prodcut qty  on cancellationconfirmation screen
	Then User sese product price on cancellation confirmation screen
	
	
	@Sprint-6 @ST-OMNI-33836	
	Scenario: As an ASO Mobile App login user, 
	I want to see the refund label on order cancellation confirmation screen
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
	When User taps on cancel Order button 
	Then User sees Yes button on alert confrimation screen 
	When User taps on Yes Order button 
	Then User sees order cancellation confirmation screen
	Then User sees "Refund message" on cancellation screen
	Then User sees "Refund disclaimer" on cancellation screen
	
	@Sprint-6 @ST-OMNI-33836
	Scenario: As an ASO Mobile App login user, 
	I want to see the refund amount section on order cancellation confirmation screen
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
	When User taps on cancel Order button 
	Then User sees Yes button on alert confrimation screen 
	When User taps on Yes Order button 
	Then User sees order cancellation confirmation screen
	Then User sees "Subtotal" on cancellation screen
	Then User sees "Taxes" on cancellation screen
	Then User sees "Shipping charges" on cancellation screen
	Then User sees "Refund amount" on cancellation screen
	Then User sees "Shipping charges" on cancellation screen
	
	
	
	
	
    