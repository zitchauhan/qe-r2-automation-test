Feature: B06-150 - BOPIS PDP Store Selection

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3613 @ZYP_CART_K3613-10727 @CR-RK
Scenario: Verify that user should be able to click select store in header & open the Find Store modal 
	Given user launches the browser and navigates to "ASO_HOME" page
	When clicks on the Select Store link in the header
	Then user should be able to see the Find a Store modal prompting up

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3613 @ZYP_CART_K3613-10759 @CR-RK
Scenario: Verify that the user should be able to search the store details by entering ZIP code
	Given user launches the browser and navigates to "ASO_HOME" page
	When clicks on the Select Store link in the header
	Then user enters ZIP "FindStoreZipcode" code manually in the search input bar
	And Clicks submit button
	And store results should get displayed on the basis of ZIPCode entered
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3613 @ZYP_CART_K3613-10758 @CR-RK	
	Scenario: Verify that the user should be displayed with an  error message when there is no store within 250 miles (or configured value)
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne SOF
    Then user clicks on one of the subcategory and navigates to LTwo SOF
    Then user clicks on one of the product category and navigates to LThree SOF
	Then User is navigated to pdp page
	And clicks on the Change Pickup Location link
	Then user should be able to see the Find a Store modal
	Then user enter "WrongzipCode" in Find a Store Model
	And user click on submit button
	Then verify Static error message


@R2_Web @R2_Regression @R2_All @P-Highest @C-Bopis @KER-3613 @ZYP_BOPIS_K3613-10728 @CR-RK
Scenario: Verify that user should be able to open the Find Store modal from PDP for BOPIS
Given user launches the browser and navigates to "ASO_HOME" page 
When user clicks on one of the category and navigates to LOne SOF
    Then user clicks on one of the subcategory and navigates to LTwo SOF
    Then user clicks on one of the product category and navigates to LThree SOF
	Then User is navigated to pdp page
	And clicks on the Change Pickup Location link
	Then user should be able to see the Find a Store modal
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Bopis @KER-3613 @ZYP_BOPIS_K3613-10759 @CR-RK        
Scenario: Verify that  the user should be able to  search the store details by entering ZIP code
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne SOF
    Then user clicks on one of the subcategory and navigates to LTwo SOF
    Then user clicks on one of the product category and navigates to LThree SOF
	Then User is navigated to pdp page
	And clicks on the Change Pickup Location link
	Then user should be able to see the Find a Store modal
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then verify the components in Find a Store Model

	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3613 @ZYP_CART_K3613-10769 @CR-RK 	
Scenario: Verify that user should be able to see proper  message while adding to cart for the product which is not available for pickup
Given user launches the browser and navigates to "ASO_HOME" page 
And user clicks on SignIn link from global header
	Then Verify below Sub/Main Module of My Account
	|# Verify following elements in Sign in/login page	|
	|SignInPage_SignIn_btn								|
	|SignInPage_SignUp_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User navigates to L2 Mens clothing
   Then user clicks on one of the subcategory and navigates to LTwo
   And user is able to see the product category name in section title
   Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails