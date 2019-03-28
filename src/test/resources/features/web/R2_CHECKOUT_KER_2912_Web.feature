Feature: B03-685- Display Estimated Delivery Dates on PDP and Cart 

@R2_Web @Regression @R2_All @P-Low @C-Checkout @KER-2912 
@ZYP_CHECKOUT_K2912-10761 @CR-GK 
Scenario: Verify that user is able to see transparent estimated delivery dates on pdp and cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	Then Verify below Sub/Main Module of PDP 
		|# Verify following elements in PDP page |
		|EstArrival_txt|
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|# Verify following elements in Cart page "Your Cart "|
		|EstArrival_txt|
		
		
@R2_Web @Regression @R2_All @P-Low @C-Checkout @KER-2912 
@ZYP_CHECKOUT_K2912-10763 @CR-GK @1HR_R2
Scenario: Verify that user is able to see delivery dates on checkout and post transactional pages
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User searches a product "productName" and navigates to PDP 
	#And user click on Add to Cart Button 
	And user click on ship it button 
#	And user is navigated to Add to cart Notification popup 
#	And user click on checkout from ATC pop up
	And user click on viewcart button
	Then user navigates to Cart Page
	And user clicks on checkout button on cart page 
	And  user enter First name "FirstName" 
	And  user enter Last name "LastName" 
	And  user enter Phone number "PhoneNumber" 
	And  user enter Address "AVSAddress" 
	And  user enter Zipcode "zipcode" 
	And  user click on Go To Shipping Method button in Checkout page 
	And  user selects the suggested address instead of entered address 
	And  clicks on Use Selected Address button 
	And user clicks on edit shipping method cta 
	Then  Verify below Sub/Main Module of Checkout Page 
		|#%%   Verify below in checkout page shipping method drawer %%|
		|checkout_ShippingMethod_ShippingMethodType_btn	|
	And user click on go to payment present in shipping method 
	Then  Verify below Sub/Main Module of Checkout Page 
		|#%%   Verify below in checkout page shipping method drawer %%|
		|checkout_ShippingMethod_ShippingDetails		|
		
		