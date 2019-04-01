Feature: B04-350 - Display Simple Header on Checkout Page

   	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6575 @ZYP_CHECKOUT_K6575-8638 @CR-DPK @1HR_R2
Scenario: Verify user should see the mini cart Icon with no. of items in cart notifier
	    Given user launches the browser and navigates to "ASO_HOME" page  
		And User navigates to L2 Mens clothing
	    Then user clicks on one of the subcategory and navigates to LTwo
	    Then user clicks on one of the product category and navigates to LThree
		#Then user click on Add to Cart Button
		And user click on ship it button
		And user will click on View Cart button 
		And user will click on Checkout button and navigates to Checkout page
		Then user should see the mini cart Icon with no. of items in cart notifier    		

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-6575 @ZYP_CHECKOUT_K6575-8639 @CR-DPK
Scenario: Verify user clicks on the mini cart Icon should navigates user to the cart page.
	    Given user launches the browser and navigates to "ASO_HOME" page  
		And User navigates to L2 Mens clothing
	    Then user clicks on one of the subcategory and navigates to LTwo
	    Then user clicks on one of the product category and navigates to LThree
		#Then user click on Add to Cart Button
		And user click on ship it button
		And user will click on View Cart button 
		And user will click on Checkout button and navigates to Checkout page
		And user clicks on mini cart Icon in checkout page
	    Then Verify below Sub/Main Module of Cart Page
		|# Verify following elements in Cart page "Your Cart "|
		|YourCart_Header|
		|Items_txt|
		|TotalYourCart_txt|
			    
		    
	    

	
