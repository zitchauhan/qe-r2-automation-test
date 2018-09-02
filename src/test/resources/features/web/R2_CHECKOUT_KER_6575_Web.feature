Feature: B04-350 - Display Simple Header on Checkout Page

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-8639 @ZYP_CHECKOUT_K6575-8639 @CR-MS
Scenario: Verify user clicks on the mini cart Icon should navigates user to the cart page.
	    Given user launches the browser and navigates to "ASO_HOME" page  
		When user clicks on one of the category and navigates to LOne
	    Then user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    Then user clicks on one of the product category and navigates to LThree
		Then User is navigated to pdp page
		Then user click on Add to Cart Button
		Then user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		And user will click on Checkout button and navigates to Checkout page
		And user clicks on mini cart Icon in checkout page
	    Then user should navigates to the CartPage "CartTitle"
	    
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6575 @ZYP_CHECKOUT_K6575-8638 @CR-DPK
Scenario: Verify user clicks on the mini cart Icon should navigates user to the cart page.
	    Given user launches the browser and navigates to "ASO_HOME" page  
		When user clicks on one of the category and navigates to LOne
	    Then user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    Then user clicks on one of the product category and navigates to LThree
		Then User is navigated to pdp page
		Then user click on Add to Cart Button
		Then user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		And user will click on Checkout button and navigates to Checkout page
		Then user should see the mini cart Icon with no. of items in cart notifier		    
	    
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-8637 @ZYP_CHECKOUT_K6575-8637 @CR-MS
Scenario: Verify when user click on the Logo should navigate user to Home Page
        Given user launches the browser and navigates to "ASO_HOME" page  
		When user clicks on one of the category and navigates to LOne
	    Then user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    Then user clicks on one of the product category and navigates to LThree
		Then User is navigated to pdp page
		Then user click on Add to Cart Button
		Then user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		And user will click on Checkout button and navigates to Checkout page
		And user clicks on Academy sports Logo
		Then user should navigate user to the HomePage "HomeTitle"
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-8633 @ZYP_CHECKOUT_K6575-8633 @CR-DPK	
Scenario:  Verify user should see Academy Business Logo on left top corner in the header
	    Given user launches the browser and navigates to "ASO_HOME" page  
		When user clicks on one of the category and navigates to LOne
	    Then user clicks on one of the subcategory and navigates to LTwo
	    And user is able to see the product category name in section title
	    Then user clicks on one of the product category and navigates to LThree
		Then User is navigated to pdp page
		Then user click on Add to Cart Button
		Then user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		And user will click on Checkout button and navigates to Checkout page
		Then user should able to see Academy Business Logo	