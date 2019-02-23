Feature: Verify Automatic Store Locator for Unauthenticated User 

@R2_Web @R2_Regression @R2_All @1HR_R2 @P-Highest @1HR_R2 @C-Cart @KER-2871 @ZYP_CART_K2871-9989 @CR-SK 
Scenario:  Verify that unauthenticated user is able to see the nearest store location and store details in the header on Home page
	Given user launches the browser and navigates to "ASO_HOME" page
	When user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user is able to see nearest store location "FindStoreZipcodeNearestStore"