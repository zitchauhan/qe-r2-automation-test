Feature: View/Select Shipping Address in Checkout 

#@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3151 @ZYP_CHECKOUT_K3151-8189 @CR-RK 
#Scenario: Verify if authenticated user can select a shipping address from the dropdown 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then User clicks on the burger menu
#	Then user should able to click on Signin button 
#	Then Verify below Sub/Main Module of My Account
#	|SignInPage_SignIn_btn								|
#	|SignInPage_SignUp_btn								|
#	|SignInPage_EmailAddress_txt			   			| 
#	|SignInPage_Password_txt				   			|
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	Then User clicks on the burger menu
#     Then user lands on My Account page and click on adress
#         Then user Clicks on Add New Address link 
#     Then Verify below Sub/Main Module of My Account
#		|# Verify following elements in address page|
#		|AddressPage_FirstName_txt				   	|
#		|AddressPage_LastName_txt					|
#		|AddressPage_PhoneNumber_txt				|
#		|AddressPage_Address_txt 					|
#		|AddressPage_ZipCode_txt			   		|
#		|AddressPage_City_txt						|
#		|AddressPage_State_txt						|
#		|AddressPage_AddressBookHeader_txt			|
#		|AddressPage_Add_btn						|
#		|AddressPage_Cancel_btn						|
#		When user enter First name "FirstName" in address book
#	And user enter Last name "LastName" in address book
#	And user enter Phone number "PhoneNumber" in address book
#	And user enter Address "Address" in address book
#	And user enter Zipcode "zipcode" in address book
#	#And user click on set as default button
#	 And clicks on Add New Address button
#	Then User clicks on the burger menu
#     And User navigates to LThree
#   	Then user clicks on the product card and navigates to PDP
#	Then user click on Add to Cart Button  
#	Then user is navigated to Add to cart Notification popup
#	And user click on checkout button
#	And user should see the order summary page with the default address
	
	
#@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3151 @ZYP_CHECKOUT_K3151-8188 @CR-RK 
#Scenario: Verify if authenticated user can  view all the shipping addresses at checkout 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then User clicks on the burger menu
#	Then user should able to click on Signin button 
#	Then Verify below Sub/Main Module of My Account
#	|SignInPage_SignIn_btn								|
#	|SignInPage_SignUp_btn								|
#	|SignInPage_EmailAddress_txt			   			| 
#	|SignInPage_Password_txt				   			|
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	Then User clicks on the burger menu
#     Then user lands on My Account page and click on adress
#         Then user Clicks on Add New Address link 
#     Then Verify below Sub/Main Module of My Account
#		|# Verify following elements in address page|
#		|AddressPage_FirstName_txt				   	|
#		|AddressPage_LastName_txt					|
#		|AddressPage_PhoneNumber_txt				|
#		|AddressPage_Address_txt 					|
#		|AddressPage_ZipCode_txt			   		|
#		|AddressPage_City_txt						|
#		|AddressPage_State_txt						|
#		|AddressPage_AddressBookHeader_txt			|
#		|AddressPage_Add_btn						|
#		|AddressPage_Cancel_btn						|
#		When user enter First name "FirstName" in address book
#	And user enter Last name "LastName" in address book
#	And user enter Phone number "PhoneNumber" in address book
#	And user enter Address "Address" in address book
#	And user enter Zipcode "zipcode" in address book
#	And clicks on Add New Address button
#	Then User clicks on the burger menu
#     And User navigates to LThree
#   	Then user clicks on the product card and navigates to PDP
#	Then user click on Add to Cart Button  
#	Then user is navigated to Add to cart Notification popup
#	And user click on checkout button
#	And user click on edit button in shipping address section
#	And user verifies all the saved addresses in my account should be displayed in the dropdown
	
#@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3151 @ZYP_CHECKOUT_K3151-10645 @CR-RK 
#Scenario: Verify for authenticated user default address will always be displayed on top 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then User clicks on the burger menu
#	Then user should able to click on Signin button 
#	Then Verify below Sub/Main Module of My Account
#	|SignInPage_SignIn_btn								|
#	|SignInPage_SignUp_btn								|
#	|SignInPage_EmailAddress_txt			   			| 
#	|SignInPage_Password_txt				   			|
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	Then User clicks on the burger menu
#     Then user lands on My Account page and click on adress
#         Then user Clicks on Add New Address link 
#     Then Verify below Sub/Main Module of My Account
#		|# Verify following elements in address page|
#		|AddressPage_FirstName_txt				   	|
#		|AddressPage_LastName_txt					|
#		|AddressPage_PhoneNumber_txt				|
#		|AddressPage_Address_txt 					|
#		|AddressPage_ZipCode_txt			   		|
#		|AddressPage_City_txt						|
#		|AddressPage_State_txt						|
#		|AddressPage_AddressBookHeader_txt			|
#		|AddressPage_Add_btn						|
#		|AddressPage_Cancel_btn						|
#		When user enter First name "FirstName" in address book
#	And user enter Last name "LastName" in address book
#	And user enter Phone number "PhoneNumber" in address book
#	And user enter Address "Address" in address book
#	And user enter Zipcode "zipcode" in address book
#	#And user click on set as default button
#	 And clicks on Add New Address button
#	Then User clicks on the burger menu
#     And User navigates to LThree
#   	Then user clicks on the product card and navigates to PDP
#	Then user click on Add to Cart Button  
#	Then user is navigated to Add to cart Notification popup
#	And user click on checkout button
#	And user should see the order summary page with the default address	
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-3151 @ZYP_CHECKOUT_K3151-10651 @CR-RK 
Scenario: Verify  If the user has already changed/ added an address within an active/ incomplete order, the same would be displayed instead of default address.
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account
	|SignInPage_SignIn_btn								|
	|SignInPage_SignUp_btn								|
	|SignInPage_EmailAddress_txt			   			| 
	|SignInPage_Password_txt				   			|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
     And User navigates to LThree
   	Then user clicks on the product card and navigates to PDP
	Then user click on Add to Cart Button  
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
	


	