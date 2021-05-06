Feature: Cancel Order - Confirmation Page

  @Sprint5 @ST-OMNI-33836 @TC-OMNI-35267
  Scenario: Validate User is taken to Order Cancelleation confirmation screen
  	Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "nosavedaddress@yopmail.com"
 		And User enters valid password "Password@123"
 		And User taps on Login
 		And User taps on account in bottom nav
    When User taps on Order button
    Then User sees Order page with order list 
    When User taps on OrderId
    Then User sees order detail page
    When User taps on cancel Order button 
    Then User sees No button on alert confirmation screen
    When User taps on No Order button
    Then User sees Order cancellation confirmation screen
    Then User sees the back button
 		
 	@Sprint5 @ST-OMNI-33836 @TC-OMNI-35268
  Scenario: Validate User sees the necessary details of the order
  	Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "nosavedaddress@yopmail.com"
 		And User enters valid password "Password@123"
 		And User taps on Login
 		And User taps on account in bottom nav
    When User taps on Order button
    Then User sees Order page with order list 
    When User taps on OrderId
    Then User sees order detail page
    When User taps on cancel Order button 
    Then User sees Yes button on alert confrimation screen
    When User taps on Yes Order button
    Then User sees order detail page 
 		Then User sees "Cancellation message" in order Cancellation screen
 		Then User sees "Confirmation email message" in order Cancellation screen
 		Then User sees "Cancellation Date" in order Cancellation screen
 		Then User sees "Product Image" in order Cancellation screen
 		Then User sees "Product name" in order Cancellation screen
 		Then User sees "Sku id" in order Cancellation screen
 		Then User sees "Quantity" in order Cancellation screen
 		Then User sees "Price" in order Cancellation screen
 		Then User sees "Refund message" in order Cancellation screen
 		Then User sees "Refund disclaimer" in order Cancellation screen
 		
 	@Sprint5 @ST-OMNI-33836 @TC-OMNI-35269
 	Scenario: Validate User sees the refund amount details
  	Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "nosavedaddress@yopmail.com"
 		And User enters valid password "Password@123"
 		And User taps on Login
 		And User taps on account in bottom nav
    When User taps on Order button
    Then User sees Order page with order list 
    When User taps on OrderId
    Then User sees order detail page
    When User taps on cancel Order button 
    Then User sees Yes button on alert confrimation screen
    When User taps on Yes Order button
    Then User sees order detail page 
 		Then User sees "Subtotal" in order Cancellation screen
 		Then User sees "Taxes" in order Cancellation screen
 		Then User sees "Shipping charges" in order Cancellation screen
 		Then User sees "Refund amount" in order Cancellation screen
 		Then User sees "Refunded to" in order Cancellation screen
 		
 	@Sprint5 @ST-OMNI-33836 @TC-OMNI-35270
 	Scenario: Validate User is navigated to order details screen on tapping of back button
  	Given User launches the application
    And User continues as guest user
		And User is on Log In screen
		Then User sees email address field
		And User sees passwordd field
    Then User enters valid email "nosavedaddress@yopmail.com"
 		And User enters valid password "Password@123"
 		And User taps on Login
 		And User taps on account in bottom nav
    When User taps on Order button
    Then User sees Order page with order list 
    When User taps on OrderId
    Then User sees order detail page
    When User taps on cancel Order button 
    Then User sees Yes button on alert confrimation screen
    When User taps on Yes Order button
    Then User sees order detail page 
 		When User taps on back button
 		Then User sees order detail page
 		