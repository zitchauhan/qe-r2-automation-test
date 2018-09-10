Feature: B05-400- State level shipping restrictions 

@R2_Mobile @R2_Regression @R2_All @P-Medium @C-Checkout @KER-3144 
@ZYP_CHECKOUT_K3144-9624 @CR-GK 
Scenario: 
	Verify if user cannot add AK/HI/ PR address in the shipping details section on Checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
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
		
		
@R2_Mobile @R2_Regression @R2_All @P-Medium @C-Checkout @KER-3144 
@ZYP_CHECKOUT_K3144-9648 @CR-GK 
Scenario: 
	verify if proper validation message is displayed if user already has products in his cart and tries to add a restricted address 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
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
		
		
@R2_Mobile @R2_Regression @R2_All @P-Medium @C-Checkout @KER-3144 
@ZYP_CHECKOUT_K3144-9649 @CR-GK 
Scenario: 
	verify if proper validation message is displayed if user already has address selected and tries to add products to his cart by violates the State-Product rules 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
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
		
		
@R2_Mobile @R2_Regression @R2_All @P-Medium @C-Checkout @KER-3144 
@ZYP_CHECKOUT_K3144-9638 @CR-GK 
Scenario: 
	Verify user receive error message after adding a shipping address with AK/HI/PR in My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then user should able to click on Signin button 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User clicks on the burger menu 
	And user lands on My Account page and click on adress 
	Then user Clicks on Add New Address link 
	And user enter First name "FirstName" in address book 
	And user enter Last name "LastName" in address book 
	And user enter Phone number "PhoneNumber" in address book 
	And user enter Address "Address" in address book 
	And user enter Zipcode "ShippingRestrictedZipCode" 
	And clicks on Add New Address button 
	Then Verify the message on the page 
		|# Following error Message should show on the page	|
		|We are unable to ship to AK, HI and PR. Please change your shipping address.	|
		
		
	