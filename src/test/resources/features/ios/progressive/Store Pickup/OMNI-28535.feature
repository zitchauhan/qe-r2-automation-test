Feature: Find Store - Display Store List - No product added to cart
    
   @Sprint2 @ST-OMNI-28535 @TC-OMNI-32913
   Scenario: Verify user is able to see the list of stores when there are stores available within the 250 miles of the mobile location
    Given User launches the application
    And User continues as guest user
	Then User taps on account in bottom nav
	And User sees the account page
	Then User taps on Find Store link
    #Then User navigated to find your nearest store page
    #Then User verifies "allow location services" option is displayed on the screen
    #Then User taps on "allow location services" option
    Then User sees list of stores
    
     @Sprint2 @ST-OMNI-28535 @TC-OMNI-32916
   Scenario: Verify user is able to see the availibility message with store when user navigated from PDP page
    Given User launches the application
    And User continues as guest user
	Then User clicks on the Search Box
    And User search for the "SearchKeyword"
    And user click on Product
	Then User taps on change store link
    #Then User navigated to find your nearest store page
    #Then User verifies "allow location services" option is displayed on the screen
    #Then User taps on "allow location services" option
    Then User sees list of stores
    Then User sees availability message with each store
    
     @Sprint2 @ST-OMNI-28535 @TC-OMNI-32917
   Scenario: Verify the stores not available error message is displayed when there are no stores available within the 250 miles of the mobile location	
	    Given User launches the application
	    #Then User taps on "ALLOW LOCATION SERVICES" option
	     #And User taps on "Allow while using app" option
	    #And User continues as guest user
		Then User taps on account in bottom nav
		And User sees the account page
		Then User taps on Find Store link
	    #Then User navigated to find your nearest store page
	    #Then User verifies "allow location services" option is displayed on the screen
	    #Then User taps on "allow location services" option
	    Then User sees the error message