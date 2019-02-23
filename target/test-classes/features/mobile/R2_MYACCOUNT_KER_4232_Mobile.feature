Feature: E02-100 - My Account, Address Book

   

     @R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4232 @ZYP_MYACCOUNT_K4232-9334 @CR-RK 
Scenario: Verify Authenticated user can Manage Address Book - Add new Address details - Validation Messages 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then User clicks on the burger menu
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
	
	
	@R2_Mobile @R2_Regression @R2_All @P-High @1HR_R2 @C-MyAccount @KER-4232 @ZYP_MYACCOUNT_K4232-9333 @CR-RK 
	Scenario: Verify Authenticated user can Manage Address Book -Set Default Address
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	 Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
     And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
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



@R2_Mobile @R2_Regression @R2_All @P-High @C-MyAccount @KER-4232 @ZYP_MYACCOUNT_K4232-12772 @CR-RK 
	Scenario: Verify My Account Address Book - Delete only saved address that is Default Address
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	Then user should able to click on Signin button 
	 Then Verify below Sub/Main Module of My Account 
		|# Verify following elements in Sign in/login page	|
		|SignInPage_EmailAddress_txt			   			| 
		|SignInPage_Password_txt				   			|
		|SignInPage_SignIn_btn								|
     And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	Then User clicks on the burger menu
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

     
     

     
     
     
     
     
     
     
     
     
     
     