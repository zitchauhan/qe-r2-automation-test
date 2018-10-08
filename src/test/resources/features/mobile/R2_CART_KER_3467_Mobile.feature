Feature: No Stores Found

@C-BOPIS @R2_Mobile @R2_Regression @R2_All @P-High @C-Cart @KER-3467 @ZYP_CART_K3467-8705 @CR-RK 
Scenario: Verify Authenticated user can see the BOPIS item available message in newly selected store
	Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	When user enters "InvalidZipCode" in Find a store search zip code field
	Then message There are no stores within 250 miles is displayed
	