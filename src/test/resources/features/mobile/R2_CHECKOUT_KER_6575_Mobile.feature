Feature: B04-350 - Display Simple Header on Checkout Page

@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-6575 @ZYP_CHECKOUT_K6575-8633 @CR-DPK	
Scenario:  Verify user should see Academy Business Logo on left top corner in the header
	    Given user launches the browser and navigates to "ASO_HOME" page  
		Then User clicks on the burger menu
    	And User navigates to L3
    	Then user clicks on the product card and navigates to PDP
		Then user click on Add to Cart Button  
		And user will click on View Cart button 
		And user will click on Checkout button and navigates to Checkout page
		Then user should able to see Academy Business Logo	
		
		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-6575 @ZYP_CHECKOUT_K6575-8637 @CR-DPK
Scenario: Verify when user click on the Logo should navigate user to Home Page
        Given user launches the browser and navigates to "ASO_HOME" page  
		Then User clicks on the burger menu
    	And User navigates to L3
    	Then user clicks on the product card and navigates to PDP
		Then user click on Add to Cart Button  
		And user will click on View Cart button 
		And user will click on Checkout button and navigates to Checkout page
		And user clicks on Academy sports Logo
		Then User is able to see the ASO_Logo
    	Then User should be navigated to Home_Page	
    	
    	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-6575 @ZYP_CHECKOUT_K6575-8638 @CR-DPK
Scenario: Verify user should see the mini cart Icon with no. of items in cart notifier
	    Given user launches the browser and navigates to "ASO_HOME" page  
		Then User clicks on the burger menu
    	And User navigates to L3
    	Then user clicks on the product card and navigates to PDP
		Then user click on Add to Cart Button  
		And user will click on View Cart button 
		And user will click on Checkout button and navigates to Checkout page
		Then user should see the mini cart Icon with no. of items in cart notifier    		

@R2_Mobile @R2_Regression @R2_All @P-High @1HR_R2 @C-Checkout @KER-6575 @ZYP_CHECKOUT_K6575-8639 @CR-DPK
Scenario: Verify user clicks on the mini cart Icon should navigates user to the cart page.
	    Given user launches the browser and navigates to "ASO_HOME" page  
		Then User clicks on the burger menu
    	And User navigates to L3
    	Then user clicks on the product card and navigates to PDP
		Then user click on Add to Cart Button  
		And user will click on View Cart button
		And user will click on Checkout button and navigates to Checkout page
		And user clicks on mini cart Icon in checkout page
	    Then Verify below Sub/Main Module of Cart Page
		 |# Verify following elements in Cart page "Your Cart "|
		|YourCart_Header|
		|Items_txt|
		|TotalYourCart_txt|
	    
		    
	    

	
