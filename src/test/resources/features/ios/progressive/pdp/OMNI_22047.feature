Feature: Verify Verients of the PDP product
@TC-OMNI- @ST-22047
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
	
	@TC-OMNI-22047
Scenario: Verify User able to See Size Chart 

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
	
	@TC_OMNI_22047
Scenario: Verify that User able to click on different sizes available 

	When user click on small size
	Then size is changed to "Small"
	When user click on medium size
	Then Size is changed to "Medium" 
	
	@TC_OMNI_22047
Scenario: Verify Cart items are showing correct Variants
    And user click on Home Delivery
	When User taps on add to cart button
	Then User taps on View Cart button
	And User sees the Variant of selected Product
	
	@TC_OMNI_22047
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
     And user sees the value of variant
     
     @TC_OMNI_22047
Scenario: Verify Cart items are showing correct Variants
    And user click on Home Delivery
	When User taps on add to cart button
	Then User taps on View Cart button
	And User sees the Variant of selected golf Ball
     
  
	

	
	
	
	
 	


