Feature: Verify Accurate Shipping Prices at Checkout

@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @1HR_R2 @KER-2911 @ZYP_CHECKOUT_K2911-8229 @CR-DPK
Scenario: Verify if the shipping price on Checkout screen is same as Order Summary on Cart page
	    Given user launches the browser and navigates to "ASO_HOME" page
#	    And User clicks on the burger menu   
#		And User navigates to LThree
#   	Then user clicks on the product card and navigates to PDP
	When User searches a product "productName" and navigates to PDP
		And user click on Add to Cart Button
		And user will click on View Cart button 
		When user views Estimated Shipping in the Item Subtotal
		And user will click on Checkout button and navigates to Checkout page
		Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout page "Order Summary"|
		|Subtotal_txt|
		|Subtotal_price|
		|Estimatedshippint_txt|
		|EstimatedShippingPrice_txt|
		|EstimatedTax_Txt|
		|EstimatedPrice_Txt|
		|Total_price|
		|Total_txt|
		And User should have same Shipping price on Cart Page Order Summary
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-2911
@ZYP_CHECKOUT_K2911-8230 @CR-DPK 
Scenario:
Verify the shipping price for each shipping method for Ship 2 Store items 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then User should be able to click on Find Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on plus icon in Store Address drawer
	And user click on Make My store button	
	And User clicks on the burger menu 
	Then user navigate to GunStorageAndSafty L_Three 
	Then user select the product from L_Three and navigate to PDP 
#	When user clicks on Find a Store 
#	Then user enter "zipCode" in Find a Store Model 
#	And user click on submit button 
#	Then user click on plus icon in Store Address drawer 
#	And user click on Make My store button 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout page "Order Summary"|
		|Subtotal_txt|
		|Subtotal_price|
		|Taxes_Txt|
		|TaxesPrice_Txt|
		|Total_price|
		|Total_txt|
	Then User verify the fixed shipping price value set in DB for the selected shipping method from DB
	
	

		
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-2911 
@ZYP_CHECKOUT_K2911-8231 @CR-DPK 
Scenario: 
	Verify the shipping price for each shipping method for SOF items 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	And user selects a store with ZIP "zipCode" 
	Then User searches a product "SOFSKUNumber" and navigates to PDP 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page 
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout page "Order Summary"|
		|Subtotal_txt|
		|Subtotal_price|
		|Taxes_Txt|
		|TaxesPrice_Txt|
		|Total_price|
		|Total_txt|
	Then User verify the fixed shipping price value set in DB for the selected shipping method from DB


@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-2911
@ZYP_CHECKOUT_K2911-8232 @CR-DPK 
Scenario:
Verify the shipping price for each shipping method for Gift Card items
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "SKUForGiftCard" in the search box 
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout page "Order Summary"|
		|Subtotal_txt|
		|Subtotal_price|
		|Estimatedshippint_txt|
		|EstimatedShippingPrice_txt|
		|EstimatedTax_Txt|
		|EstimatedPrice_Txt|
		|Total_price|
		|Total_txt|
	Then User should retrieve the FREE shipping for the selected shipping method from DB		
	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-2911
@ZYP_CHECKOUT_K2911-8233 @CR-DPK 
Scenario:
Verify the shipping price for each shipping method for White glove items where Shipping Exception table exists
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu
	And User navigates to L2 Grills Outdoor cooking
	And user clicks on one of the subcategory of Grills Outdoor
	And user select the product
	And user click on Add to Cart Button 
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZIPCODE"
	Then user click on Go To Shipping Method button in Checkout page
#	Then User should retrieve the expected shipping price for the selected shipping method from Shipping Exception table in DB
	Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout page "Order Summary"|
		|Subtotal_txt|
		|Subtotal_price|
		|Taxes_Txt|
		|TaxesPrice_Txt|
		|Total_price|
		|Total_txt|	