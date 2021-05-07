Feature: Order details 
     
  @Sprint6 @ST-OMNI-28212  @TC-OMNI-37297
	Scenario: Validate that guest user is able to see order status 
		Given User launches the application
		And User continues as "guest user" on onboarding page
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		Then User taps on "account" button on login screen 
		When user see "welcome section" on my account page 
		Then user taps on "orders button" on my account page 
		Then User enter "730870007" in order field
    And User enters "77077" in zip code field
    Then User taps on "Check button" On Order Page
    Then user see "Order Details" Page
    #When user see "welcome section" on order detail page
   # Then user taps on "orders button" on order detail page
     When user see "ordernumber" on order detail page
     When user see "orderdate" on order detail page
     When user see "ordertotalbutton" on order detail page
     When user see "cancelorder" on order detail page
     When user see "cancelorder" on order detail page
     When user see "deliveryheading" on order detail page
     When user see "customername" on order detail page
      When user see "shippingaddress" on order detail page
      When user see "orderstatus" on order detail page
     When user see "shippingmethode" on order detail page
     When user see "producttitle" on order detail page
     When user see "productqty" on order detail page
     When user see "productprice" on order detail page
     When user see "skunumber" on order detail page
     
     
     
     
      @Sprint6 @ST-28212 @TC-OMNI-37298
	Scenario: Validate that logged in user is able to see orders
	Given User launches the application
		And User continues as "guest user" on onboarding page
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		Then User taps on "account" button on login screen 
		When user see "welcome section" on my account page 
		Then user taps on "orders button" on my account page 
		When user see "Order heading" on order history page 
		When user see "Order label" on order history page 
		When user see "lookupyourorderbutton" on order history page
		When user see "addastorereciptbutton" on order history page
		When user see "orderpurchagetype" on order history page
		When user see "orderstatusprocessing" on order history page
		When user see "orderstatusdelivered" on order history page
		When user see "ordernumberlabel" on order history page
		When user see "ordernumber" on order history page
		When user see "orderdatelabel" on order history page
		When user see "orderdate" on order history page
		When user see "ordertotallabel" on order history page
		When user see "ordertotal" on order history page
		
     
     
     
     @Sprint6 @ST-28212 @TC-OMNI-37299
	Scenario: Validate that logged in user is able to see orders by order lookup
	Given User launches the application
		And User continues as "guest user" on onboarding page
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		And User is on "LogIn" screen
		When User enters "email" on login screen 
		And User enters "password" on login screen 
		And User taps on "LogIn" button on login screen 
		Then User taps on "account" button on login screen 
		When user see "welcome section" on my account page 
		Then user taps on "orders button" on my account page 
		When user see "Order heading" on order history page 
		When user see "Order label" on order history page 
		When user see "lookupyourorderbutton" on order history page
		When user see "addastorereciptbutton" on order history page
		#When user see "orderpurchagetype" on order history page
		#When user see "orderstatusprocessing" on order history page
		#When user see "orderstatusdelivered" on order history page
		#When user see "ordernumberlabel" on order history page
		#When user see "ordernumber" on order history page
		#When user see "orderdatelabel" on order history page
		#When user see "orderdate" on order history page
		#When user see "ordertotallabel" on order history page
		#When user see "ordertotal" on order history page
		When user tabs on  "lookupyourorderbutton" on order history page
		Then User enter "730870007" in order field
    And User enters "77077" in zip code field
    Then User taps on "Check button" On Order Page
    Then user see "Order Details" Page
    When user see "ordernumber" on order detail page
     When user see "orderdate" on order detail page
     When user see "ordertotalbutton" on order detail page
     When user see "cancelorder" on order detail page
     When user see "cancelorder" on order detail page
     When user see "deliveryheading" on order detail page
     When user see "customername" on order detail page
      When user see "shippingaddress" on order detail page
      When user see "orderstatus" on order detail page
     When user see "shippingmethode" on order detail page
     When user see "producttitle" on order detail page
     When user see "productqty" on order detail page
     When user see "productprice" on order detail page
     When user see "skunumber" on order detail page
	
		
		
    