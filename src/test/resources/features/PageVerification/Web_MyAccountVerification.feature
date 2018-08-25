Feature: Debug


	Scenario: Verify MyAccount
	Then Verify below Sub/Main Module of My Account
		|# Verify following elements in login page|
		|Password				   	|
		|Sign In					|
		|Forgot Your Password		|
		|Sign Up					|
		|Email Address			   	|
		
		|# Verify following elements in forgot password page	|
		|Email Address - Forgot Password Page					|
		|Submit Button - Forgot Password Page					|
		
		|# Verify following elements in address page|
		|First Name				   					|
		|Last Name									|
		|Phone Number								|
		|Address 									|
		|Zip Code			   						|
		|City										|
		|State										|
		
		|#Verify following elements in accounts tab	|
		|No Gift Card listed mesaage				|
		|Add new Gift Card							|
		|Gift Card Number							|
		|PIN										|
		|Cancel										|
		|Add										|
	
	Then Verify below Sub/Main Module of My Account
	Then Verify below Sub-Module of Checkout
	Then Verify below Sub-Module of Order
	Then Verify below Sub-Module of Cart
	Then Verify below Sub-Module of PLP
	Then Verify below Sub-Module of HomePage
	Then Verify below Sub-Module of PDP
	