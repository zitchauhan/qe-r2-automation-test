Feature: PDP BOPIS Messaging & Variations to Customer

@C-BOPIS @R2_Web @Regression @R2_All @P-High_B @1HR_R2 @CB-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10686 @CR-AKK 
Scenario: Verify that the user is able to increase the item quantity on PDP
Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	Then user change the quantity of item in PDP

@C-BOPIS @R2_Web @Regression @R2_All @P-High_B @CB-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10687 
Scenario: Verify that the user is able to decrease the item quantity on PDP
 Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
#	And User should be able to see Search Box on Homepage 
#	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user enters "SKUForBopisProduct" in the search box plcc
	And user click on search icon 
	And user change the quantity of item in PDP
	Then user decrease the quantity of item in PDP 
	
	
@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10688
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
	
@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10691
Scenario: Verify that the user is able to view "Add to Wish list" CTA on PDP
 Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	#And user click on Add to Cart Button 
	And user click on ship it button 
	
@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10703	
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
	
@C-BOPIS @R2_Web @R2_All @P-High_B @CB-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10706	
	Scenario: Verify that the user is able add item to cart if available
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
	|#Item is moved from cart to the wish list |
	|AddToWishList_btn|
	|Total_txt|
	|SubTotal_txt|
	|EstimatedShipping_txt|
	|EstimatedTaxes_txt|
	
@C-BOPIS @R2_Web @Regression @R2_All @P-High_B @CB-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10707 
Scenario: Verify that the user is able add item to cart if items are low in stock 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	When enter the "MoreThanThresholdQuantity" to X 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|We're sorry! Due to limited stock, only part of your order can be fulfilled at this time.|
    
    @C-BOPIS @R2_Web @R2_All @P-High_B @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10708
    Scenario: Verify that the user is not able add item to cart if item goes out of stock 
    Given user launches the browser and navigates to "ASO_HOME" page
	And User should be able to see Search Box on Homepage 
	And user enters "OutOfStockSKUNumber" in the search box 
	And User click on search icon 
	Then verify ship it button is displayed
	
@C-BOPIS @R2_Web @R2_All @P-High_B @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10717
Scenario: Verify customer must see messaging when attempting to add more inventory of an item to their cart than inventory exists at the selected store
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "LimitedAvailabelInventoryBOPIS" and navigates to PDP
	And user change the quantity of item in PDP
	When enter the "MoreThanAvailableQuantity" in PDP page
	#And user click on Add to Cart Button 
	And user click on ship it button 
    Then verify user gets a msg Sorry we only have XYZ of this item available We added those to the cart
	
     @C-BOPIS @R2_Web @R2_All @P-Low @C-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10695
	Scenario: Verify that the user is able to view "Ships To" information on PDP
	Given user launches the browser and navigates to "ASO_HOME" page
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Ship to|
    Then verfiy the Change Zip code link
    
 @C-BOPIS @R2_Web @Regression @R2_All @P-Low @CB-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10699
Scenario: Verify that the user is able to view In-Store Pickup Available in its correct state on PDP
    Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Product" in the searchbox	
	And verfiy the Change Pickup Location link
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Store Pickup Available|
    
@C-BOPIS @R2_Web @Regression @R2_All @P-Low @CB-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-KER-10701
    Scenario: Verify that the user is able to view "In-Store Pickup Available" in its correct state on PDP
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user logs in as "Bopis_Email" 
	When user enters "BOPIS_Product" in the searchbox	
	When User clicks on choose location
	Then verify that Find a Store Modal is displayed
	
@C-BOPIS @R2_Web @Regression @R2_All @P-Low @CB-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-KER-10702
    Scenario: Verify that user sees appropriate message if a product has limited stock for pick-up
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "LimitedStockItemBOPISMail" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP	
	And user verify that limitied stock message "Limited_Stock_Message" is displayed
	
@C-BOPIS @R2_Web @Regression @R2_All @P-Low @CB-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10704
Scenario: Verify that user sees appropriate message If shipping is unavailable for an item
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "ShippingNotAvailableProduct" and navigates to PDP 
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Shipping Not Available|

@C-BOPIS @R2_Web @R2_All @P-Low @CB-Checkout @KER-2869 @ZYP_CHECKOUT_K2869-10705
Scenario: Verify that user sees appropriate message If shipping is unavailable for an item
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "LimitedStockItemBOPISMail" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User should be able to see Search Box on Homepage 
	Then User searches a product "productName" and navigates to PDP 
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Out of Stock|
