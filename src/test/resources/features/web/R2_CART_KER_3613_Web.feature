Feature: B06-150 - BOPIS PDP Store Selection

#@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-3613 @ZYP_CART_K3613-10727 @CR-RK
#Scenario: Verify that user should be able to click select store in header & open the Find Store modal 
#	Given user launches the browser and navigates to "ASO_HOME" page
#	When clicks on the Select Store link in the header
#	Then user should be able to see the Find a Store modal prompting up
#
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3613 @ZYP_CART_K3613-10759 @CR-RK
Scenario: Verify that the user should be able to search the store details by entering ZIP code
	Given user launches the browser and navigates to "ASO_HOME" page
	When clicks on the Select Store link in the header
	Then user enters ZIP "FindStoreZipcode" code manually in the search input bar
	And Clicks submit button
	And store results should get displayed on the basis of ZIPCode entered
	
#	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3613 @ZYP_CART_K3613-10758 @CR-RK	
#	Scenario: Verify that the user should be displayed with an  error message when there is no store within 250 miles (or configured value)
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on one of the category and navigates to LOne SOF
#    Then user clicks on one of the subcategory and navigates to LTwo SOF
#    Then user clicks on one of the product category and navigates to LThree SOF
#	Then User is navigated to pdp page
#	And clicks on the Change Pickup Location link
#	Then user should be able to see the Find a Store modal
#	Then user enter "WrongzipCode" in Find a Store Model
#	And user click on submit button
#	Then verify Static error message
	
#@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3613 @ZYP_CART_K3613-10727 @CR-RK		
#Scenario: Verify that user should be able to click "select store" in header & open the Find Store modal 
#Given user launches the browser and navigates to "ASO_HOME" page
#	When clicks on the Select Store link in the header
#	Then user should be able to see the Find a Store modal prompting up
	