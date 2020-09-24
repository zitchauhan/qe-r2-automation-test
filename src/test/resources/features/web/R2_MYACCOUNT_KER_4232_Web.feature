Feature: E02-100 - My Account, Address Book 

# ******* Venkat *************

@temp111  @RegressionP2
Scenario Outline:  Edit Non Default Shipping Address and Verify
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "UserWithDefaultAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user lands on My Account page and click on adress 
	Then user Clicks on Add New Address link 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in address page|
		|AddressPage_FirstName_txt				   	|
		|AddressPage_LastName_txt					|
		|AddressPage_PhoneNumber_txt				|
		|AddressPage_Address_txt 					|
		|AddressPage_ZipCode_txt			   		|
		|AddressPage_City_txt						|
		|AddressPage_State_txt						|
	When user enter First name "FirstName" in address book 
	And user enter Last name "LastName" in address book 
	And user enter Phone number "PhoneNumber" in address book 
	And user enter Address "Address" in address book 
	And user enter Zipcode "zipcode" in address book 
	And clicks on Add New Address button 
	Then user edits non default shipping Address and verify "<data1>", "<data2>", "<data3>", "<data4>", "<data5>"
    Examples:
		|data1    |data2    |data3      |data4  |data5     |		 
		|FNameEdit|LNameEdit|AddressEdit|60660  |9087653217|
	
# ******* Venkat End *********



@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4232 
@ZYP_MYACCOUNT_K4232-9194 @CR-RK 
Scenario: Verify Authenticated user can Manage Address Book - View existing Address details 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "RawUser" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	And user lands on My Account page and click on adress 
	When user Clicks on Add New Address link 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in address page|
		|AddressPage_FirstName_txt				   	|
		|AddressPage_LastName_txt					|
		|AddressPage_PhoneNumber_txt				|
		|AddressPage_Address_txt 					|
		|AddressPage_ZipCode_txt			   		|
		|AddressPage_City_txt						|
		|AddressPage_State_txt						|
		
		
		
		
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4232 
@ZYP_MYACCOUNT_K4232-9196 @CR-RK 
Scenario: Verify Authenticated user has Address given through SOF 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "SOFemail" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User searches a product "SOFSKUNumber" and navigates to PDP 
	And user selects a store with ZIP "zipCode" 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on view cart button 
	And user navigates to address book in my account 
	Then user Clicks on Add New Address link 
	When user enter First name "FirstName" in address book 
	And user enter Last name "LastName" in address book 
	And user enter Phone number "PhoneNumber" in address book 
	And user enter Address "Address" in address book 
	And user enter Zipcode "zipcode" in address book 
	And user click on set as default button 
	And clicks on Add New Address button 
	And user verifies the First address provided is set as default 
	
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4232 
@ZYP_MYACCOUNT_K4232-9191 @CR-MS @RegressionP2
Scenario: Verify Authenticated user can Manage Address Book - View existing Address details 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user lands on My Account page and click on adress 
	Then user Clicks on Add New Address link 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in address page|
		|AddressPage_FirstName_txt				   	|
		|AddressPage_LastName_txt					|
		|AddressPage_PhoneNumber_txt				|
		|AddressPage_Address_txt 					|
		|AddressPage_ZipCode_txt			   		|
		|AddressPage_City_txt						|
		|AddressPage_State_txt						|
	When user enter First name "FirstName" in address book 
	And user enter Last name "LastName" in address book 
	And user enter Phone number "PhoneNumber" in address book 
	And user enter Address "Address" in address book 
	And user enter Zipcode "zipcode" in address book 
	And clicks on Add New Address button 
	#	 Then the new address gets saved
	
	
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4232 
@ZYP_MYACCOUNT_K4232-9334 @CR-RK 
Scenario: Verify Authenticated user can Manage Address Book - Add new Address details - Validation Messages 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user lands on My Account page and click on adress 
	Then user Clicks on Add New Address link 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in address page|
		|AddressPage_FirstName_txt				   	|
		|AddressPage_LastName_txt					|
		|AddressPage_PhoneNumber_txt				|
		|AddressPage_Address_txt 					|
		|AddressPage_ZipCode_txt			   		|
		|AddressPage_City_txt						|
		|AddressPage_State_txt						|
		|AddressPage_SetAsDefault_chkBox			|
		|AddressPage_AddressBookHeader_txt			|
		|AddressPage_Add_btn						|
		|AddressPage_Cancel_btn						|
	And clicks on Add New Address button 
	Then user views validation message on all fields 
	
	
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4232 
@ZYP_MYACCOUNT_K4232-9333 @CR-RK @RegressionP2
Scenario: Verify Authenticated user can Manage Address Book -Set Default Address 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigates to address book in my account 
	Then user Clicks on Add New Address link 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in address page|
		|AddressPage_FirstName_txt				   	|
		|AddressPage_LastName_txt					|
		|AddressPage_PhoneNumber_txt				|
		|AddressPage_Address_txt 					|
		|AddressPage_ZipCode_txt			   		|
		|AddressPage_City_txt						|
		|AddressPage_State_txt						|
		|AddressPage_SetAsDefault_chkBox			|
		|AddressPage_AddressBookHeader_txt			|
		|AddressPage_Add_btn						|
		|AddressPage_Cancel_btn						|
	When user enter First name "FirstName" in address book 
	And user enter Last name "LastName" in address book 
	And user enter Phone number "PhoneNumber" in address book 
	And user enter Address "Address" in address book 
	And user enter Zipcode "zipcode" in address book 
	And user click on set as default button 
	And clicks on Add New Address button 
	And user verifies the First address provided is set as default 
	
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4232 
@ZYP_MYACCOUNT_K4232-9332 @CR-RK @C1-Message @RegressionP3
Scenario: Verify Authenticated user can Manage Address Book - Delete Address details - Undo 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user lands on My Account page and click on adress 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in address page|
		|MyAccountPage_Address_lnk		| 
	When user clicks Remove button 
	Then Verify the message on the page 
		|# verify the remove quantity message|
		|Undo|
		
		
		
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4232 
@ZYP_MYACCOUNT_K4232-9195 @CR-RK 
Scenario: Verify Authenticated user can -Set Default Address 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user lands on My Account page and click on adress 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in address page|
		|MyAccountPage_Address_lnk		| 
	And user click on set as default button 
	
	
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4232 
@ZYP_MYACCOUNT_K4232-9193 @CR-RK @C1-Message @RegressionP2
Scenario: Verify Authenticated user can Manage Address Book - Delete Address details 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user lands on My Account page and click on adress 
	When user clicks Remove button 
	Then Verify the message on the page 
		|# verify the remove quantity message|
		|Undo|
		
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4232 
@ZYP_MYACCOUNT_K4232-9196 @CR-RK 
Scenario: Verify Authenticated user has Address given through SOF 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "SOFemail" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user navigate and deletes existing items in cart 
	And User searches a product "SOFSKUNumber" and navigates to PDP 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user click on plus icon in Store Address drawer 
	And user click on Make My store button 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user click on view cart button 
	And user click on MyAccount 
	Then user lands on My Account page and click on adress 
	And user verifies the First address provided is set as default 
	
	
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4232 
@ZYP_MYACCOUNT_K4232-12772 @CR-RK 
Scenario: Verify My Account Address Book - Delete only saved address that is Default Address 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
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
	And user click on set as default button 
	And clicks on Add New Address button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in address page|
		|AddressPage_Default_txt					|	
	And user verifies that remove button is not available 
	
@Web @Regression @P1 @CR-MT @RegressionP1
Scenario: Verify My Account Address Book - Changes in the Default Address should be saved 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "UserWithDefaultAddress"
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	Then user lands on My Account page and click on adress
	And user click on edit default address link
	And user enter new First name in address book 
	And clicks on Add New Address button 
	And user should see the new First name