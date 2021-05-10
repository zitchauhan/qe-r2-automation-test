Feature: remove item from wish list 

@Sprint4 @ST-OMNI-28642 @TC-OMNI-37353
	Scenario: User is able to login and remove item from existing wish list 
		Given User launches the application
		And User continues as "guest user" on onboarding page
		When User Clicks On MaY Be Later
		When User Clicks On MaY Be Later
		#And User continues as "guest user" on onboarding page
		#And User continues as guest user
		Then User taps on "account" button on login screen 
		Then User taps on "gotologin" button on login screen 
		#And User is on "LogIn" screen
		When User enters "removewishlistemail" on login screen 
		And User enters "password" on login screen 
		#And User taps on "LogIn" button on login screen 
		#Then User Logs into the application
		#Then User taps on "account" button on login screen  
		When User taps on shop in bottom nav
		Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
    #When User taps on add to cart button
    And user click on "homedeliveryradiobutton" on PDP
    And user click on "addtocart" on PDP
    And User taps on View Cart button
    #And User is on "Cart" screen
    Then User scrolls down to the bottom
    Then user click on "Add to Wish list"  button on cart page
    Then user click on "existingwishlist" on wish list page
   # And User sees "item moved to wishlist sucess message" on cart page 
    Then User taps on "account" button on login screen 
    #Then user taps on "wishlist button" on my account page  
    When User taps on Wishlist
    Then user click on "existingwishlist" on wish list page
    And User sees "itemcount" on existing wishlist
    And User sees "producttitle" on existing wishlist
    Then user click on "Removebutton" on existing wishlist
    And User sees "confirmmodal" on existing wishlist
    #And User sees "remove" on existing wishlist
    Then user click on "remove" on existing wishlist
    And User sees "wishlistempty" on existing wishlist
    
    
    
    
    