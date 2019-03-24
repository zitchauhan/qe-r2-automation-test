Feature: View/Select Shipping Address in Checkout 



@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3151
@ZYP_CHECKOUT_K3151-8189 @CR-RK 
Scenario:
Verify if authenticated user can select a shipping address from the dropdown 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	And user lands on My Account page and click on adress 
	Then user Clicks on Add New Address link 
	When user enter First name "FirstName" in address book 
	And user enter Last name "LastName" in address book 
	And user enter Phone number "PhoneNumber" in address book 
	And user enter Address "Address" in address book 
	And user enter Zipcode "zipcode" in address book 
	#And user click on set as default button
	And clicks on Add New Address button 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#	And user click on Add to Cart Button
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user should see the order summary page with the default address 
	
@R2_Web @R2_Regression @R2_All @P-High @1HR_R2 @C-Checkout @KER-3151
@ZYP_CHECKOUT_K3151-8188 @CR-RK 
Scenario:
Verify if authenticated user can  view all the shipping addresses at checkout 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user lands on My Account page and click on adress 
	Then user Clicks on Add New Address link 
	When user enter First name "FirstName" in address book 
	And user enter Last name "LastName" in address book 
	And user enter Phone number "PhoneNumber" in address book 
	And user enter Address "Address" in address book 
	And user enter Zipcode "zipcode" in address book 
	And clicks on Add New Address button 
	And User navigates to LThree 
	Then user clicks on the product card and navigates to PDP 
	#	And user click on Add to Cart Button
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup
	And user click on checkout button
	And user click on edit button in shipping address section 
	And user verifies all the saved addresses in my account should be displayed in the dropdown 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3151
@ZYP_CHECKOUT_K3151-10645 @CR-RK 
Scenario:
Verify for authenticated user default address will always be displayed on top 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user lands on My Account page and click on adress 
	Then user Clicks on Add New Address link 
	When user enter First name "FirstName" in address book 
	And user enter Last name "LastName" in address book 
	And user enter Phone number "PhoneNumber" in address book 
	And user enter Address "Address" in address book 
	And user enter Zipcode "zipcode" in address book 
	#And user click on set as default button
	And clicks on Add New Address button 
	And User navigates to LThree 
	Then user clicks on the product card and navigates to PDP 
	#	And user click on Add to Cart Button
	And user click on ship it button
	Then user is navigated to Add to cart Notification popup
	And user click on checkout button
	And user should see the order summary page with the default address 
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-3151
@ZYP_CHECKOUT_K3151-10651 @CR-RK 
Scenario:
Verify  If the user has already changed/ added an address within an active/ incomplete order, the same would be displayed instead of default address. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#	And user click on Add to Cart Button
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user click on edit button in shipping address section 
	And user click on Add a new Shipping Address button in the shipping address drop down 
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	Then user click on Go To Shipping Method button in Checkout page 
	And user should see the order summary page with the default address 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3151
@ZYP_CHECKOUT_K3151-8023 @CR-RK 
Scenario:
Verify that  authenticated user is able to view default address in dropdown in shipping address section 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#	And user click on Add to Cart Button
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user click on edit button in shipping address section 
	And user verifies the default shipping address in the drop down 
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3151
@ZYP_CHECKOUT_K3151-8024 @CR-RK 
Scenario:
Verify that  authenticated user is able to select address in dropdown in shipping address section 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#	And user click on Add to Cart Button
	And user click on ship it button
	Then user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user click on edit button in shipping address section 
	And user select the shipping address in the drop down 
	And user click on confirm button 
	And user verifies the selected address is displayed in address section 
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-3151
@ZYP_CHECKOUT_K3151-10655 @CR-RK 	
Scenario: Verify The list of addresses will be from newest added to oldest.
Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_SignIn_btn								|
		|SignInPage_SignUp_btn								|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user lands on My Account page and click on adress 
	Then user Clicks on Add New Address link 
	When user enter First name "FirstName" in address book 
	And user enter Last name "LastName" in address book 
	And user enter Phone number "PhoneNumber" in address book 
	And user enter Address "Address" in address book 
	And user enter Zipcode "zipcode" in address book 
	#And user click on set as default button
	And clicks on Add New Address button
	And user click on MyAccount 
	Then user lands on My Account page and click on adress 
	Then user Clicks on Add New Address link 
	When user enter First name "FirstName" in address book 
	And user enter Last name "LastName" in address book 
	And user enter Phone number "PhoneNumber" in address book 
	And user enter Address "Address" in address book 
	And user enter Zipcode "FindAsStoreZIPCode" in address book 
	And clicks on Add New Address button
	And User navigates to L2 Mens clothing 
	Then user clicks on one of the subcategory and navigates to LTwo 
	And user is able to see the product category name in section title 
	Then user clicks on one of the product category and navigates to LThree 
	Then User is navigated to pdp page 
	#	And user click on Add to Cart Button
	And user click on ship it button
	Then user is navigated to Add to cart Notification popup 
	And user click on checkout button 
	And user click on edit button in shipping address section 
	 And user verifies the default shipping address in the drop down
	