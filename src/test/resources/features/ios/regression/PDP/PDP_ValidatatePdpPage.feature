Feature: Validate functionality of PDP page 
@OMni666
Scenario: Validate the Pdp Page
Given User launches the application
And User Clicks On MaY Be Later
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
	Then User Change the variants of "SizeAndColor" to "Large" , "White" , "N/a"
	And user click on Home Delivery
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
	
	
	 @TC_OMNI_26900_1 
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
	When User selects home delivery option
	And User taps on add to cart button
    Then I choose to verify "SizeVariantProduct"
	
	
	
	
  
 
    