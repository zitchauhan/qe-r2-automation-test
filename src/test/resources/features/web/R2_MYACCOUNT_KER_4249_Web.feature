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


@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10149 @CR-SK 
Scenario: Verify user is able to create an account with all valid data 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	And user enter first "FirstName" 
	And user enter last "LastName" 
	And user enter random email Address
	And user enter password "Password"
	Then user should see password masked 
	When clicks on Sign Up Button
	Then user should be able to sign up successfully
	And Verify the message on the page
	    |# Following Message should show on the page|
	    |CONGRATULATIONS							|
	    |You have successfully registered with Academy.com|
	    |LET'S SHOP									|
	And user should be able to view My Account in global header

@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10163 @CR-SK
Scenario: Verify the user is able to sign with the new created account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "RawUser" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user should get logged in successfully
	
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
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10150 @CR-SK
Scenario: Verify the user gets the error message when First name is left blank
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	And user enter last "LastName"
	And user enter random email Address
	And user enter password "Password" 
	And clicks on Sign Up Button
	Then Verify the message on the page
	    |# Following error Message should show on the page	|
	    |Please enter the First Name|
	    

@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10151 @CR-SK
Scenario: Verify the user gets the error message when Last name is left blank
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page
	And user enter first "FirstName"
	And user enter random email Address
	And user enter password "Password"
	And clicks on Sign Up Button
	Then Verify the message on the page
	    |# Following error Message should show on the page	|
	    | Please Enter a Last Name|


#####Failing - Known Issue KER-12929
#@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10152 @CR-SK
#Scenario: Verify the user gets the error message when Password is left blank
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And clicks on SignUp link from SignIn page
#	And user enter first "FirstName"
#	And user enter last "LastName"
#	And user enter random email Address
#	And clicks on Sign Up Button
#	Then Verify the message on the page
#	    |# Following error Message should show on the page	|
#	    |Please enter a Password							|		    
#	
#	
#####Failing - Known Issue KER-12929
#@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10153 @CR-SK
#Scenario: Verify the user gets the error message when Email address is left blank
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And clicks on SignUp link from SignIn page
#	And user enter first "FirstName"
#	And user enter last "LastName"
#	And user enter password "Password"
#	And clicks on Sign Up Button
#	Then Verify the message on the page
#	    |# Following error Message should show on the page	|
#	    |Please enter an Email address						|	
	    

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10154 @CR-SK
Scenario: Verify the user gets the error message when sign up from existing email ID
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page
	And user enter first "FirstName"
	And user enter last "LastName"
	And user enter "EmailAddress" in signup page
	And user enter password "Password"
	And clicks on Sign Up Button
	Then Verify the message on the page
	    |# Following error Message should show on the page											|
	    |The email address you entered already exists. Type a different email address and try again.|	 


@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10156 @CR-SK
Scenario: Verify the user gets the error message when Email Id format is incorrect
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page
	And user enter first "FirstName"
	And user enter last "LastName"
	And user enter "InvalidEmailAddress" in signup page
	And user enter password "Password"
	And clicks on Sign Up Button
	Then Verify the message on the page
	    |# Following error Message should show on the page					|
	    |Please enter the Email Address in a valid format (ex. abc@xyz.com)	|

	    
######Failing - Known Issue KER-12929
#@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10157 @CR-SK
#Scenario: Verify the user gets the error message on entering the password not meeting the requirements of minimum characters
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And clicks on SignUp link from SignIn page
#	And user enter first "FirstName"
#	And user enter last "LastName"
#	And user enter random email Address
#	And user enter password "5Char"
#	And clicks on Sign Up Button
#	Then Verify the message on the page
#	    |# Following error Message should show on the page	|
#	    |*Minimum 8 characters								|
	    

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10158 @CR-SK
Scenario: Verify the user gets the error message on entering the password same as email address
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page
	And user enter first "FirstName"
	And user enter last "LastName"
	And user enter "UnregisteredEmailAddress" in signup page
	And user enter password "UnregisteredEmailAddress"
	And clicks on Sign Up Button
	Then Verify the message on the page
	    |# Following error Message should show on the page								|
	    |For maximum security, please enter a Password different from your Email Address|

