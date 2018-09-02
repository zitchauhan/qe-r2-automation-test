Feature: B06-150 - BOPIS PDP Store Selection

@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-10727 @ZYP_CART_K3613-10727 @CR-MS
Scenario: Verify that user should be able to click select store in header & open the Find Store modal 
	Given user launches the browser and navigates to "ASO_HOME" page
	When clicks on the Select Store link in the header
	Then user should be able to see the Find a Store modal prompting up

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-10759 @ZYP_CART_K3613-10759 @CR-MS
Scenario: Verify that the user should be able to search the store details by entering ZIP code
	Given user launches the browser and navigates to "ASO_HOME" page
	When clicks on the Select Store link in the header
	Then user enters ZIP "zip" code manually in the search input bar
	And Clicks submit button
	And store results should get displayed on the basis of ZIPCode entered