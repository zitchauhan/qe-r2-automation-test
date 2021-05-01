Feature: Validate functionality of PDP page 

@PDP_Scenario @Regression
Scenario: Validate the Pdp Page
Given User launches the application
And User Clicks On MaY Be Later
 And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SizeAndColor"
    And user click on Product
    And User sees Product title
    And User sees Product Price
     And User Sees the Variant of "SizeAndColor" Product
	And user sees the size chart button
	When user click on size chart button
	Then user sees the size chart 
	When user click on cancel button
	Then user navigate to PDP Page
	Then User Change the variants of "SizeAndColor" to "Large" , "White" , "N/a"
	When User selects Home Delivery checkbox
    And User Sees The PickUp & Delivery Option
    And User Sees the Free Store PickUp Option
    And user Select the Store "west Oakes"
    And User sees the label "Free Store Pick Up"
    And User sees the Sub label "FIND AVAILABILITY BY SELECTING A STORE"
	Then User sees quantity stepper
	When User taps on increment quantity stepper
	Then Quantity is changed to "2"
	When User taps on decrement quantity stepper
	Then Quantity is changed to "1"
	And User sees the Details & Specs
	When User taps on add to cart button
	
	
	 @TC-OMNI-34267 @ST-22047 @Regression
 Scenario:  Verify User able to see Product varient Size and color on PDP Page

   Given User launches the application
   And User Clicks On MaY Be Later
    And User Goes to home page
    Then User sees the homepage
	 When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SizeAndColor"
    And user click on Product
	And user sees the size chart button
	When user click on size chart button
	Then user sees the size chart 
	When user click on cancel button
	Then user navigate to PDP Page
    
    @TC-OMNI-34176 @TC-OMNI-34177 @ST-OMNI-26900  @Regression
    Scenario Outline:  Verify ATC confirmation with Home  Delivery option
    Given User launches the application
    And User Clicks On MaY Be Later
    And User Goes to home page
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<VariantType>"
    And user click on Product
    And User Sees the Variant of "<VariantType>" Product
    Then User Change the variants of "<VariantType>" to "<variantSize>" , "<variantColor>" , "<variantWidth>"
    When User selects Home Delivery checkbox
	When User taps on add to cart button
	Then I choose to verify "<VariantType>"
    Then I choose to verify "Shipping" label in Overlay
	
	  Examples:
	  | VariantType  | variantSize | variantColor| variantWidth|
   	 | color 		 |  		   |  White     |              |
   	     
    
   @Sprint5 @Regression
    Scenario Outline:: validate PDP for FireArms/Ammunitions SOF App to Web Navigation
  	Given User launches the application 
	And User continues as guest user 
    And User is on Log In screen
	Then User sees email address field
    And User sees passwordd field
    Then User enters valid email "verifiedAddressList@yopmail.com"
    And User enters valid password "Password@123"
    And User taps on Login
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<product>"
    And I choose to navigate to PDP 
    Then I choose to verify "App_store_guidelines" in PDP Page
    Then User scrolls down to the bottom in "6" swipe
    And I choose to click on "Purchase Button" in PDP page
    Then I choose to verify user navigated to PDP on Web
 
 Examples: 
     |    product            |	
     |    FireArms           | 
   # |    ammunitionProd     |  
	
	@Sprint5 @Regression
	Scenario: Verify user sees PDP CR - PDP Header and Cart Badge
  Given User launches the application
  And User continues as guest user
  When User Sees the Search Box
  Then User clicks on the Search Box
  And User search for the "SearchKeyword" 
  When I choose to navigate to PDP
  Then User sees product image
  And User sees cart badge on top
  Then User sees quantity stepper
		When User sets qty to "100"
		Then Quantity is changed to "100"
		When User taps on increment quantity stepper
		Then Quantity is changed to "100"
  And User taps on add to cart button 
  And User taps on Continue shopping button
  Then User sees the correct item count on the cart badge as "99+"
 
 @Sprint5 @Regression
  Scenario: Verify user sees no Header on scrolling up in PDP
  Given User launches the application
  And User continues as guest user
  When User Sees the Search Box
  Then User clicks on the Search Box
  And User search for the "SearchKeyword" 
  When I choose to navigate to PDP
  Then User sees product image
  And User scrolls down to the bottom
  And User sees Product title on header
  And User sees cart badge on top
  And User sees back button 
  Then User sees longer product disclaimer with elipses
  When User scrolls up to the top
  Then User sees header will not be displayed 
 
 @Sprint5 @Regression
  Scenario: Verify user sees Cart Badge and navigates to Cart Screen
  Given User launches the application
  And User continues as guest user
  When User Sees the Search Box
  Then User clicks on the Search Box
  And User search for the "SearchKeyword" 
  When I choose to navigate to PDP
  Then User sees product image
  And User sees cart badge on top 
  When User taps on cart badge
  Then User is navigated To Cart Screen
	
	
  
 
    