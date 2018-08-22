Feature: E02-100 - My Account, Address Book


#@R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-4232 @ZYP_CART-K4232-9194 @CR-MS
#     Scenario Outline: Verify Authenticated user can Manage Address Book - View existing Address details
#     Given user launches the browser and navigates to "ASO_HOME" page 
#     And clicks on SignIn button in home page
#     When user enters valid "<emailAddress>" and "<password>" clicks on Login
#     Then user lands on My Account page and click on adress
#	 Then user Clicks on Add New Address link
#	 And user views First Name field is displayed 
#	 And user views Last Name field is displayed
#	 And user views Phone Number field is displayed
#	 And user views Address field is displayed
#	 And user views Zip Code field is displayed
#	 And user views City field is displayed
#	 And user views State field is displayed
#	 
#     Examples:
#     |emailAddress       |password|
#     |msreddy939@gmail.com|Dairy@99|	 
#	 
#@R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-4232 @ZYP_CART-K4232-9191 @CR-MS
#     Scenario Outline: Verify Authenticated user can Manage Address Book - View existing Address details
#	 Given user launches the browser and navigates to "ASO_HOME" page 
#     And clicks on SignIn button in home page
#     When user enters valid "<emailAddress>" and "<password>" clicks on Login
#     Then user lands on My Account page and click on adress
#	 Then user Clicks on Add New Address link
#     And user enters addressfields firstName "<FirstName>" lastName "<LastName>" PhoneNumber "<PhoneNumber>" Address "<Address>" ZipCode "<ZipCode>"
##	 And user selects state
##	 And clicks on Add New Address button
##	 Then the new address gets saved
##	 
#	 Examples:
#     |emailAddress|password||FirstName|LastName|PhoneNumber|Address|ZipCode|City|
#     |msreddy939@gmail.com|Dairy@99||sreee|kant|1234567898|sadee|10001|Newyork|
     
     
# @R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-4232 @ZYP_CART-K4232-9196 @CR-SK
# Scenario: Verify Authenticated user can Manage Address Book - Edit Address details 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And clicks on SignIn button in home page
#	And user enters valid "<emailAddress>" and "<password>" clicks on Login
#	And user lands on My Account page and click on adress
	
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
	
	
#	When user Clicks on "Address Book" link And  clicks on "Edit" Link
#	Then update address form is displayed with(First Name, Last Name, Phone Number, Address(User cannot add AK/HI/ PR address in the address book), Company name, Apt Number, P.O Box number, Zip Code, City,State)
#	And user clicks on "Update" button 
#	And user verifies the updated address    
     
     

     
     
     
     
     
     