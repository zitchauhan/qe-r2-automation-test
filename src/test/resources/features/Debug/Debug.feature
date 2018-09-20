Feature: Debug Testing
	
 	
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4030 
@ZYP_CART_K4030-11502 @CR-SK 
Scenario: Verify the primary default shipping options should be utilized while quick checkout	 
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 	
	And user clicks on sign in link from burger menu
	And user logs in as "UserWithSavedAddressAndPayment"
	And User searches a product "SKUForWhiteGlove" and navigates to PDP 

