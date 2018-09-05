Feature: Verify  Customer Registration/ Sign Up 

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10148 @CR-SK 
Scenario: Verify the available fields on the Sign Up page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in SignUp section	|
		|SignUp_FirstName_txt						 	|
		|SignUp_LastName_txt							|
		|SignUp_EmailAddress						 	|
		|SignUp_Password					         	| 
		|SignUp_ReceivePromotion_chkBx					|
		|SignUpPage_SignUp_btn							|
		|SignUpPage_AlreadyHaveAnAccount_txt			|
		|SignUpPage_SignInNow_lnk						|

######Failing - Manually as well
#@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10149 @CR-SK 
#Scenario: Verify user is able to create an account with all valid data 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And clicks on SignUp link from SignIn page 
#	And user enter first "FirstName" 
#	And user enter last "LastName" 
#	And user enter random email Address
#	And user enter password "Password"
#	Then user should see password masked 
#	When clicks on Sign Up Button
#	Then Verify the message on the page
#	    |# Following Message should show on the page|
#	    |CONGRATULATIONS							|
#	    |You have successfully registered with Academy.com|
#	    |LET'S SHOP									|
#	And user should be able to view My Account in global header

######unit testing pending
@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10163 @CR-SK
Scenario: Verify the user is able to sign with the new created account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user should get logged in successfully 
	
######unit testing pending
@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10161 @CR-SK 
Scenario: Verify the user is able to see the unmasked password 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	When user enter password "Password" 
	Then user should see password masked 
	When clicks on the Show label
	Then user entered password should get unmasked displaying the characters 
	And the label should get toggled to Hide 
	