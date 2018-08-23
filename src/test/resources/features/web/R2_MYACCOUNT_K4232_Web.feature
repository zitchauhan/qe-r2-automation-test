Feature: E02-100 - My Account, Address Book

@R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-4232 @ZYP_MYACCOUNT-K4232-9194 @CR-MS
     Scenario: Verify Authenticated user can Manage Address Book - View existing Address details
     Given user launches the browser and navigates to "ASO_HOME" page 
     And clicks on SignIn button in home page
     And user enter the valid emailaddress "EmailAddress" 
	 And user enter the valid password "Password" 
     And user click on signin button
     And user lands on My Account page and click on adress
	 And user Clicks on Add New Address link
	 Then user views First Name field is displayed 
	 Then user views Last Name field is displayed
	 Then user views Phone Number field is displayed
	 Then user views Address field is displayed
	 Then user views Zip Code field is displayed
	 Then user views City field is displayed
	 Then user views State field is displayed
	
@R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-4232 @ZYP_CART-K4232-9196 @CR-SK
Scenario: Verify Authenticated user can Manage Address Book - Delete Address details - Undo
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page
	And user enters valid "<emailAddress>" and "<password>" clicks on Login
	And user lands on My Account page and click on adress
	When user clicks Remove button
	Then user should see delete notification
	When user clicks on undo link
	Then undo deletion action is performed
     
     

     
     
     
     
     
     