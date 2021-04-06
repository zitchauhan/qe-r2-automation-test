 Feature: Change Store - Store Details - No product added to cart
 
 @Sprint2 @ST-OMNI-29011 @TC-32948
   Scenario: Verify when user taps on Details link next to default store 
    Given User launches the application
    And User continues as guest user
	Then User taps on account in bottom nav
	And User sees the account page
	Then User taps on Find Store link
    And User taps on details link of store 1
    Then User sees address on deatils page
    And User sees phone no on details page
    And User sees the store hours on details page
    Then User verifies Make my store button is "disabled"
    Then User taps on "address" on store details page
    Then User sees "Copy address" option on store details page
    #And User sees "Open in google map" option on store details page
    And User sees "Open in maps" option on store details page
    And User sees "cancel" option on store details page
    Then User taps on "cancel" on store details page
    Then User taps on "make my store" on store details page
    
     @Sprint2 @ST-OMNI-29011 @TC-32949
   Scenario: Verify when user taps Details link corresponding to a new store 
     Given User launches the application
    And User continues as guest user
	Then User taps on account in bottom nav
	And User sees the account page
	Then User taps on Find Store link
    And User taps on details link of store 2
    Then User sees address on deatils page
    And User sees phone no on details page
    And User sees the store hours on details page
    Then User verifies Make my store button is "enabled"
    Then User taps on "address" on store details page
    Then User sees "Copy address" option on store details page
    #And User sees "Open in google map" option on store details page
    And User sees "Open in maps" option on store details page
    And User sees "cancel" option on store details page
    Then User taps on "cancel" on store details page
    Then User taps on "make my store" on store details page
    
   @Sprint2 @ST-OMNI-29011 	@TC-32953
   Scenario: Verify MAKE MY STORE button is disabled when user has made a store selection and tapped - MAKE MY STORE in the change store process	
    Given User launches the application
    And User continues as guest user
	Then User taps on account in bottom nav
	And User sees the account page
	Then User taps on Find Store link
	Then User selects the store 3
	Then User taps on Find Store link
    And User taps on details link of store 3
    Then User sees address on deatils page
    And User sees phone no on details page
    And User sees the store hours on details page
    Then User verifies Make my store button is "enabled"
    Then User taps on "make my store" on store details page	 
    And User taps on details link of store 3	
    Then User verifies Make my store button is "disabled"