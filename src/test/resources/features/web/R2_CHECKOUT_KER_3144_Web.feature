Feature: B05-400- State level shipping restrictions 

@R2_Web @Regression @R2_All @P-Medium @C-Checkout @KER-3144 
@ZYP_CHECKOUT_K3144-9624 @CR-GK @1HR_R2 @C1-Message
Scenario: Verify if user cannot add AK/HI/ PR address in the shipping details section on Checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
#	And user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And User navigates to Shipping Method section 
	And User clicks on edit CTA 
	And user click on Add a new Shipping Address button in the shipping address drop down 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ShippingRestrictedZipCode" 
	And user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|# Following error Message should show on the page	|
		|We are unable to ship to AK, HI and PR. Please change your shipping address.	|
		
		
@R2_Web @Regression @R2_All @P-Medium @C-Checkout @KER-3144 
@ZYP_CHECKOUT_K3144-9648 @CR-GK @C1-Message
Scenario: verify if proper validation message is displayed if user already has products in his cart and tries to add a restricted address 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
#	And user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And User navigates to Shipping Method section 
	And User clicks on edit CTA 
	And user click on Add a new Shipping Address button in the shipping address drop down 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ShippingRestrictedZipCode" 
	And user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|# Following error Message should show on the page	|
		|We are unable to ship to AK, HI and PR. Please change your shipping address.	|
		
		
@R2_Web @Regression @R2_All @P-Medium @C-Checkout @KER-3144 
@ZYP_CHECKOUT_K3144-9649 @CR-GK @C1-Message
Scenario: verify if proper validation message is displayed if user already has address selected and tries to add products to his cart by violates the State-Product rules 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user clicks on one of the category and navigates to LOne 
	And user clicks on one of the subcategory and navigates to LTwo 
	And user clicks on one of the product category and navigates to LThree 
	And User is navigated to pdp page 
	#	And user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user is navigated to order summary page 
	And User navigates to Shipping Method section 
	And User clicks on edit CTA 
	And user click on Add a new Shipping Address button in the shipping address drop down 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ShippingRestrictedZipCode" 
	And user click on Go To Shipping Method button in Checkout page 
	Then Verify the message on the page 
		|# Following error Message should show on the page	|
		|We are unable to ship to AK, HI and PR. Please change your shipping address.	|
		
		
@R2_Web @Regression @R2_All @P-Medium @C-Checkout @KER-3144 
@ZYP_CHECKOUT_K3144-9638 @CR-GK @C1-Message
Scenario: Verify user receive error message after adding a shipping address with AK/HI/PR in My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on My account link 
	And user lands on My Account page and click on adress 
	And user Clicks on Add New Address link 
	And user enter First name "FirstName" in address book 
	And user enter Last name "LastName" in address book 
	And user enter Phone number "PhoneNumber" in address book 
	And user enter Address "Address" in address book 
	And user enter Zipcode "ShippingRestrictedZipCode" 
	And clicks on Add New Address button 
	Then Verify the message on the page 
		|# Following error Message should show on the page	|
		|We are unable to ship to AK, HI and PR. Please change your shipping address.	|
		
		
	