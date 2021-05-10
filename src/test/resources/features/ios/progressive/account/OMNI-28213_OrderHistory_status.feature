Feature: Verify the  feature of order history and status

@Sprint-6 @ST-OMNI-28213 
Scenario: As an ASO Mobile App login user, 
	I want to see the order tile option on order screen page
	Given User launches the application 
	And User continues as guest user 
	And User is on "LogIn" screen 
	When User enters "email" on login screen 
	And User enters "password" on login screen 
	And User taps on "LogIn" button on login screen 
	Then User Logs into the application 
	And User taps on account in bottom nav 
	When User taps on Order button 
	Then User sees "Can’t find your order" with chevron button in order tile section
	Then User sees "Add a store receipt" with chevron button in order tile section

@Sprint-6 @ST-OMNI-28213 	
Scenario: As an ASO Mobile App login user, 
	I want to see the order listing tile option on order screen page
	Given User launches the application 
	And User continues as guest user 
	And User is on "LogIn" screen 
	When User enters "email" on login screen 
	And User enters "password" on login screen 
	And User taps on "LogIn" button on login screen 
	Then User Logs into the application 
	And User taps on account in bottom nav 
	When User taps on Order button 
	Then User sees "All Order" filter in order listing tile section
	Then User sees "In Store" filter in order listing tile section 
	Then User sees "On line" filter in order listing tile section
	Then User sees "Total Order count" in order listing tile section
	Then User sees "Sorted By Most Recent" in order listing tile section
	
@Sprint-6 @ST-OMNI-28213 	
Scenario: As an ASO Mobile App login user, 
	I want to see the order component tile options on order screen page
	Given User launches the application 
	And User continues as guest user 
	And User is on "LogIn" screen 
	When User enters "email" on login screen 
	And User enters "password" on login screen 
	And User taps on "LogIn" button on login screen 
	Then User Logs into the application 
	And User taps on account in bottom nav 
	When User taps on Order button 
	Then User sees "Order Status" order component tile section
	Then User sees "Order detail" order component tile section
	Then User sees "Order Number" order component tile section
	Then User sees "Order Date" order component tile section
	Then User sees "Order Total" order component tile section

@Sprint-6 @ST-OMNI-28213 	
Scenario: As an ASO Mobile App login user, 
	I want to redirected to order look up when i tap on Can not find your order button
	Given User launches the application 
	And User continues as guest user 
	And User is on "LogIn" screen 
	When User enters "email" on login screen 
	And User enters "password" on login screen 
	And User taps on "LogIn" button on login screen 
	Then User Logs into the application 
	And User taps on account in bottom nav 
	When User taps on Order button 
	Then User sees "Can’t find your order" with chevron button in order tile section
	When User taps on the  "Can’t find your order" button
	Then User sees "OrderLookup" page
	
	
	@Sprint-6 @ST-OMNI-28213 	
Scenario Outline: As an ASO Mobile App login user, 
	I want to apply the filters
	I want to see the order listing tile option on order screen page
	Given User launches the application 
	And User continues as guest user 
	And User is on "LogIn" screen 
	When User enters "email" on login screen 
	And User enters "password" on login screen 
	And User taps on "LogIn" button on login screen 
	Then User Logs into the application 
	And User taps on account in bottom nav 
	When User taps on Order button 
	Then User sees "All Order" filter in order listing tile section
	Then User sees "In Store" filter in order listing tile section 
	Then User sees "On line" filter in order listing tile section
	When User taps on the  <FilterType> button
	Then User sees "Order List" page
Examples:
    |FilterType|
    |"All Order"|
    |"In Store"|
    |"On line"|
    
	@Sprint-6 @ST-OMNI-28213  
Scenario: As an ASO Mobile App login user, 
	I want to see the order component tile options on order screen page
	Given User launches the application 
	And User continues as guest user 
	And User is on "LogIn" screen 
	When User enters "email" on login screen 
	And User enters "password" on login screen 
	And User taps on "LogIn" button on login screen 
	Then User Logs into the application 
	And User taps on account in bottom nav 
	When User taps on Order button 
	Then User sees "Order Status" order component tile section
	When User taps on the  "Order Number" button
	Then User see order detail page
	
	@Sprint-6 @ST-OMNI-28213
	Scenario: As an ASO Mobile App login user who has never placed any order 
	I want to redirected to order look up when i tap on Can not find your order button
	Given User launches the application 
	And User continues as guest user 
	And User is on "LogIn" screen 
	When User enters "emailwithregisteredNoOrder" on login screen 
	And User enters "password" on login screen 
	And User taps on "LogIn" button on login screen 
	Then User Logs into the application 
	And User taps on account in bottom nav 
	When User taps on Order button 
	Then User sees "Can’t find your order" with chevron button in order tile section
	When User taps on the  "Can’t find your order" button
	Then User sees "No order existing" page
	
	@Sprint-6 @ST-OMNI-28213
	Scenario: As an ASO Mobile App guest user 
	I want to redirected to order look up when i tap on Order button
	Given User launches the application 
	And User continues as guest user 
	And User taps on account in bottom nav 
	When User taps on Order button 
	Then User sees "Can’t find your order" with chevron button in order tile section
	Then User sees "OrderLookup" page
	
