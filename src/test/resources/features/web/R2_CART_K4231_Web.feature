Feature: Verify Authenticated Customer Store Priority

@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K4231-8894 @CR-SK 
Scenario: Verify Authenticated user able to see the BOPIS items for pickup
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user logs in as "UserWithZeroProductsInCart"
	And user sets up a store for "FindStoreZipcode"
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then user navigate to Cart page

@R2_Web @R2_Regression @R2_All @P-Medium @C-Cart @KER-4231 @ZYP_CART_K4231-8896 @CR-SK 
Scenario: Verify Authenticated user can see the BOPIS item available message in newly selected store
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user logs in as "UserWithZeroProductsInCart"
	And user sets up a store for "FindStoreZipcode"
	And user clicks on one of the category and navigates to LOne
	And user clicks on one of the subcategory and navigates to LTwo
	When user sets up a store for "FindStoreZipcode2"
	And user clicks on one of the category and navigates to LOne
	And user clicks on one of the subcategory and navigates to LTwo
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	Then user should be able to see In-Store Pick up enabled

@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-4231 @ZYP_CART_K4231-8898 @CR-SK 
Scenario: Verify Authenticated user able to see the BOPIS items for pickup
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user logs in as "UserWithZeroProductsInCart"
	And user sets up a store for "FindStoreZipcode"
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page
	Then user should be able to see In-Store Pick up enabled
	
	