Feature: View/Select Shipping Address in Checkout 

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3163 @ZYP_CHECKOUT_K3163-9407 @CR-AKK 
 Scenario: Verify if user can land on checkout page
   Given user launches the browser and navigates to "ASO_HOME" page
	And User navigates to L2 Mens clothing
   Then user clicks on one of the subcategory and navigates to LTwo
   And user is able to see the product category name in section title
   Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup
	And user will click on View Cart button 
    And user navigate to Cart page
	And user click on checkout button in Cart page
    When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "InvalidZipcode" 
	Then user click on Go To Shipping Method button in Checkout page
	Then verify error message is dispayed 