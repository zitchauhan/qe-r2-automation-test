Feature: Validate functionality of PDP page with Variants
@OMN
Scenario: Validate the Pdp Page
Given User launches the application
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SizeVariantProduct"
    And user click on Product
    And User sees Product title
    And User sees Product Price
    And user sees the color variant
	And user sees the size varient
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
	Then User sees quantity stepper
	When User taps on increment quantity stepper
	Then Quantity is changed to "2"
	When User taps on decrement quantity stepper
	Then Quantity is changed to "1"
	When User taps on add to cart button
	
	
	
	
  
 
    