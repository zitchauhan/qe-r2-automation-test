Feature:  Validate the order details of past purchases 
 @TC-OMNI-37786 @ST-OMNI-33197 @Sprint6
Scenario: Validate the order details  screen wth Sign In User
Given User launches the application
		And User continues as "guest user" on onboarding page
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		#And User continues as "guest user" on onboarding page
		#And User continues as guest user
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		#And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		#And User taps on "LogIn" button on login screen 
		#Then User Logs into the application
		Then User taps on "account" button on login screen
		Then user taps on "orders button" on my account page 
		And user click on the listed order "" at Orders Page
		And User sees the component "OrderDetailPageTitle" at order details page
		And User sees the component "OrderLabel" at order details page
		And User sees the component "Date Order Placed" at order details page
		And User sees the component "Order Total" at order details page
		And User sees the component "Home Delivery Bucket" at order details page
		And User sees the component "User Name" at order details page
		And User sees the component "Shipping Address" at order details page
		And User sees the component "order status" at order details page
		And User sees the component "Delivery Service" at order details page
		And User sees the component "Track Package" at order details page
		And User sees the component "Product Thumbnail" at order details page
		And User sees the component "SKU Id" at order details page
		And User sees the component "Quantity" at order details page
		And User sees the component "Product Name" at order details page
		And User sees the component "Price" at order details page
	@TC-OMNI-37787 @ST-OMNI-33197 @Sprint6	
Scenario: Validate the order details screen for guest user
		Given User launches the application
		And User continues as "guest user" on onboarding page
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		#And User continues as "guest user" on onboarding page
		#And User continues as guest user
		Then User taps on "account" button on login screen
		Then user taps on "orders button" on my account page 
		And User Enter the "Order Number" at orders Page
		And User Enter the "BillingZipcode" at orders Page 
		And User click on Check button at orders Page
		And user click on the listed order "" at Orders Page
		And User sees the component "OrderDetailPageTitle" at order details page
		And User sees the component "OrderLabel" at order details page
		And User sees the component "Date Order Placed" at order details page
		And User sees the component "Order Total" at order details page
		And User sees the component "Home Delivery Bucket" at order details page
		And User sees the component "User Name" at order details page
		And User sees the component "Shipping Address" at order details page
		And User sees the component "order status" at order details page
		And User sees the component "Delivery Service" at order details page
		And User sees the component "Track Package" at order details page
		And User sees the component "Product Thumbnail" at order details page
		And User sees the component "SKU Id" at order details page
		And User sees the component "Quantity" at order details page
		And User sees the component "Product Name" at order details page
		And User sees the component "Price" at order details page
		
		 