Feature: Verify Verients of the PDP product
@Sprint1 @TC-OMNI-29808 @ST-22047
Scenario:  Verify User able to see Product varient Size and color on PDP Page

    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SizeVariantProduct"
    And user click on Product
	And user sees the size varient
	And user sees the color variant
	
	@Sprint1 @TC-OMNI-29808 @ST-22047
Scenario: Verify User able to See Size Chart & selected variants are showing up on cart

    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
	 When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SizeVariantProduct"
    And user click on Product
	And user sees the size chart button
	When user click on size chart button
	Then user sees the size chart 
	When user click on cancel button
	Then user navigate to PDP Page
    When user click on small size
	Then size is changed to "Small"
	When user click on medium size
	Then Size is changed to "Medium"
	And user click on Home Delivery
	When User taps on add to cart button
	And User sees the Variant of selected Product "AdidasTshirt"
 

	
	@Sprint1 @TC-OMNI-29808 @ST-22047
Scenario: Verify user able to see Product variant of golf ball

    Given User launches the application
    And User continues as guest user
    Then User sees the homepage
     When User navigate to Home Page
     When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "FixVariantProduct"
    And user click on Product
     Then user sees the Variant on PDP
     Then User click on the Color Variant
     And user sees the value of variant
     And user click on Home Delivery
	When User taps on add to cart button
	And User sees the Variant of selected Product "golfBall"
     


	
	
	
     
  
	

	
	
	
	
 	


