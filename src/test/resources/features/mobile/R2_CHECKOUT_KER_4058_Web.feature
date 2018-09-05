Feature: [Web]Restricted shipping to PO,APO , FPO boxes

@R2_Web @R2_Regression @KER-4058 @ZYP_CART_K4058-9833 @CR-RKA 
Scenario: Verify user will be prevented from adding restricted products to PO box in shipping address.
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigate to GunStorageAndSafty L_Three   
    Then user select the product from L_Three and navigate to PDP
    And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user click on checkout button in Cart page
	Then user fill the PO box in shipping address and verify error message 