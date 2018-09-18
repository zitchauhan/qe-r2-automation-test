Feature: B04-250- Guest Checkout Flow 

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8237 @CR-GK 
Scenario: Verify the guest user is able to view the Zipcode on checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And enters the "FindAsStoreZIPCode" zip on the Cart page 
	And click on submit button on calculate shipping model 
	And user click on checkout button in Cart page 
	Then Guest User should be able to see the "FindAsStoreZIPCode" zipcode pre-populated on Checkout page 
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8239 @CR-GK 
Scenario: 
	Verify the guest user is able to view the Checkout Header and Footer on Checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	Then Verify below Sub/Main Module of Checkout Page 
		|#Verify following elements in checkout page|
		|checkout_YouAreCheckingOutAsGuest_txt		|
		|checkout_CheckoutHeader_txt				|
		|CheckOut_CheckOutFooter                    |
		
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8240 @CR-GK 
Scenario: 
	Verify the guest user is able to see the pre-populated City/State with Zipcode 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And enters the "FindAsStoreZIPCode" zip on the Cart page 
	And click on submit button on calculate shipping model 
	And user click on checkout button in Cart page 
	Then Guest User should be able to see the "FindAsStoreZIPCode" zipcode pre-populated on Checkout page 
	And City/State on the basis of the Zipcode should also be pre-populated on Checkout page 
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3165 
@ZYP_CHECKOUT_K3165-8241 @CR-GK 
Scenario: 
	Verify the guest user is able to enter the shipping address details on Checkout page 
	Verify the guest user is able to see the pre-populated City/State with Zipcode 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	Then user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|# Following Error Message should show on the page|
		|Please enter a zip code|
	