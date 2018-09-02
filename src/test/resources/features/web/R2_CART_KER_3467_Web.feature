Feature: No Stores Found

@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K3467-8705 @CR-SK 
Scenario: Verify Authenticated user can see the BOPIS item available message in newly selected store
	Given user launches the browser and navigates to "ASO_HOME" page
	When user enters "InvalidZipCode" in Find a store search zip code field
	Then message There are no stores within 250 miles is displayed
	