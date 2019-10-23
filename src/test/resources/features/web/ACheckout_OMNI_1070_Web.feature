Feature: Verify selecting a shipping method update Order Summary

@OMNI-1070 @C-Order @Regression @CR-NS @C-GlobalHeader
Scenario: Verify order summary update when customer selects an upgrade their shipping method in checkout
    Given user launches the browser and navigates to "ASO_HOME" page	
    And User navigates to L2 Grills Outdoor cooking 
	And user clicks on one of the subcategory of Grills Outdoor 
	And user select the product 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZIPCODE"
	Then user click on Go To Shipping Method button in Checkout page
	And user fetch the order summary details
	#Then user modifies shipping method
	And user upgrade the shipping method from the shipping method dropdown 
	And user verify order summay is updated 



