Feature: PDP BOPIS Messaging & Variations to Customer

@R2_Web @R2_Regression @R2_All @P-High @1HR_R2 @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10686 @CR-AKK
Scenario: Verify that the user is able to increase the item quantity on PDP
Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	Then user change the quantity of item in PDP

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10687 @CR-AKK	
Scenario: Verify that the user is able to decrease the item quantity on PDP
 Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user change the quantity of item in PDP
	Then user decrease the quantity of item in PDP 
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10688 @CR-AKK	
Scenario: Verify that the user is able to view "Add to Wish list" CTA on PDP
 Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	When user clicks on Move to Wish list link "NewWishLink" OR exisiting wishlink
	Then Verify below Sub/Main Module of Cart Page 
	|#Item is moved from cart to the wish list |
	|AddToWishList_btn|
	And user enter the wishlist name 
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10691 @CR-AKK	
Scenario: Verify that the user is able to view "Add to Wish list" CTA on PDP
 Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	Then user click on Add to Cart Button 
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10703 @CR-AKK		
Scenario: Verify that the user is able to increase the item quantity on PDP
 Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user change the quantity of item in PDP
	Then user decrease the quantity of item in PDP
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10706 @CR-AKK	
	Scenario: Verify that the user is able add item to cart if available
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
	|#Item is moved from cart to the wish list |
	|AddToWishList_btn|
	|Total_txt|
	|SubTotal_txt|
	|EstimatedShipping_txt|
	|EstimatedTaxes_txt|
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10707 @CR-AKK	
	Scenario: Verify that the user is able add item to cart if items are low in stock
    Given user launches the browser and navigates to "ASO_HOME" page
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user click on Add to Cart Button 
	And user will click on View Cart button
    When enter the "MoreThanThresholdQuantity" to X  
    Then Verify the message on the page
    |# Following Error Message should show on the page|
    |We're sorry! Due to limited stock only part of your order can be fulfilled at this time.|
    
    @R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10708 @CR-AKK	
    Scenario: Verify that the user is not able add item to cart if item goes out of stock 
    Given user launches the browser and navigates to "ASO_HOME" page
	And User should be able to see Search Box on Homepage 
	And user enters "OutOfStockSKUNumber" in the search box 
	And User click on search icon 
	Then Verify add to cart button not dispalyed 
	
	 @R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10717 @CR-AKK	
	Scenario: Verify customer must see messaging when attempting to add more inventory of an item to their cart than inventory exists at the selected store
	Given user launches the browser and navigates to "ASO_HOME" page
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user change the quantity of item in PDP
	And user click on Add to Cart Button 
	And user will click on View Cart button
    When enter the "MoreThanThresholdQuantity" to X  
    Then Verify the message on the page
    |# Following Error Message should show on the page|
    |We're sorry! Due to limited stock only part of your order can be fulfilled at this time.|
	
     @R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10695 @CR-AKK	
	Scenario: Verify that the user is able to view "Ships To" information on PDP
	Given user launches the browser and navigates to "ASO_HOME" page
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Ship to|
    Then verfiy the Change Zip code link
    
 @R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10699 @CR-AKK	
   Scenario: Verify that the user is able to view In-Store Pickup Available in its correct state on PDP
	Given user launches the browser and navigates to "ASO_HOME" page
#	When user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button 
	And User searches a product "productName" and navigates to PDP 
	And verfiy the Change Pickup Location link
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |In-Store Pickup Available|
    
    
      @R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-KER-10701 @CR-AKK
    Scenario: Verify that the user is able to view "In-Store Pickup Available" in its correct state on PDP
Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	When User clicks on choose location
	Then verify that Find a Store Modal is displayed
	
	 @R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-KER-10704 @CR-AKK
	Scenario: Verify that user sees appropriate message If shipping is unavailable for an item
Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SanitySKUNumber" and navigates to PDP 
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Shipping Not Available|

 @R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-KER-10705 @CR-AKK
	Scenario: Verify that user sees appropriate message If shipping is unavailable for an item
Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Out of Stock|
