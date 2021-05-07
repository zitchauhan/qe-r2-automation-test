
Feature: PDP add to wish list 
     
  @Sprint4 @ST-OMNI-20880 @TC-OMNI-37326
	Scenario: logged in user is able to add item inexisting wishlist 
		Given User launches the application
		And User continues as "guest user" on onboarding page
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		#And User continues as "guest user" on onboarding page
		#And User continues as guest user
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		#And User is on "LogIn" screen
		When User enters "emailwithexistingwithlist" on login screen 
		And User enters "password" on login screen 
		#And User taps on "LogIn" button on login screen 
		#Then User Logs into the application
		Then User taps on "account" button on login screen 
		When User taps on shop in bottom nav
		#Then User sees the homepage
	  #When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    And user click on "buttonaddtowishlist" on PDP
    Then user click on "Add to Wish list"  button on cart page
    Then user click on "existingwishlist" on wish list page
    Then i Choose to validate that "buttonaddtowishlist" Shown on PDP
    
    
    @Sprint4 @ST-OMNI-20880 @TC-OMNI-37327
	Scenario: Guest user is able to add item in wish list from PDP
	Given User launches the application
		And User continues as "guest user" on onboarding page
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		When User taps on shop in bottom nav
		#Then User sees the homepage
	  #When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    And user click on "buttonaddtowishlist" on PDP
    Then user see "Wish list" page
    Then user click on "login" on wish list page
    When User enters "email" on login screen 
		And User enters "password" on login screen 
		#And User taps on "LogIn" button on login screen 
		Then user see "Wish list" page
		Then User taps on "Add Wishlist" icon
	  Then User sees "Add Wish list" screen 
	  And User enters wishlist name
	  And User sees "Add Wishlist" button enabled
	  Then User taps on "Add Wishlist" button 
	  Then i Choose to validate that "buttonaddtowishlist" Shown on PDP
    
   