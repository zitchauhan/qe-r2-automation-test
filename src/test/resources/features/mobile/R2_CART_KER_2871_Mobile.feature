Feature: Verify Automatic Store Locator for Unauthenticated User 

@R2_Mobile @R2_Regression @R2_All @1HR_R2 @P1 @1HR_R2 @C-Cart @KER-2871 @ZYP_CART_K2871-9989 @CR-SK 
Scenario:  Verify that unauthenticated user is able to see the nearest store location and store details in the header on Home page
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on the burger menu
	When user selects store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	And user clicks on the burger menu
	Then user is able to see nearest store location "FindStoreZipcodeNearestStore"