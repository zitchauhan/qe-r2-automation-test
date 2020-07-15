Feature: Verify  Customer Registration/ Sign Up 

@R2_Web @R2_Regression @R2_All @P2 @P2 @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10148 @CR-SK 
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
#		|SignUp_ReceivePromotion_chkBx					|
		|SignUpPage_SignUp_btn							|
		|SignUpPage_AlreadyHaveAnAccount_txt			|
		|SignUpPage_SignInNow_lnk						|


#@R2_Web @R2_Regression @R2_All @1HR_R2 @P1 @P1 @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10149 @CR-SK @C1-Message
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
#	#Then user should be able to sign up successfully
#	And Verify the message on the page
#	    |# Following Message should show on the page|
#	    |Play Ball!							|
#	    |Your academy.com account has been created|
#	    |LET'S SHOP									|

#===========================================Sanity===============================================#

@R2_Web @R2_WAST-02 @P1 @P1Temp @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10149 @AutomationSmokeORIG @C1-Message
Scenario: TC_3- Verify User is able to create an account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	And user enter first "SanityFirstName" 
	And user enter last "SanityLastName" 
	And user enter random email Address 
	And user enter password "NewPassword" 
	Then user should see password masked 
	When clicks on Sign Up Button 
	Then user should be able to sign up successfully 
#	And Verify the message on the page 
#		|# Following Message should show on the page|
#		|CONGRATULATIONS                            |
#		|You have successfully registered with Academy.com|
#		|LET'S SHOP                                       |
#===================================================================================================#

@R2_Web @R2_Regression @R2_All @1HR_R2 @P1 @P1Temp @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10163 @CR-SK
Scenario: Verify the user is able to sign with the new created account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "RawUser" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user should get logged in successfully
	
@R2_Web @R2_Regression @R2_All @1HR_R2 @P1Temp @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10161 @CR-SK
Scenario: Verify the user is able to see the unmasked password 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	When user enter password "Password" 
	Then user should see password masked 
	When clicks on the Show label
	Then user entered password should get unmasked displaying the characters 
	And the label should get toggled to Hide
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10150 @CR-SK @C1-Message
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
	    

@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10151 @CR-SK @C1-Message
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


@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10152 @CR-SK @C1-Message
Scenario: Verify the user gets the error message when Password is left blank
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page
	And user enter first "FirstName"
	And user enter last "LastName"
	And user enter random email Address
	And clicks on Sign Up Button
	Then Verify the message on the page
	    |# Following error Message should show on the page	|
	    #updated by MJR on 16/7/19
	    |Please enter a Password|		    
	
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10153 @CR-SK @C1-Message
Scenario: Verify the user gets the error message when Email address is left blank
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page
	And user enter first "FirstName"
	And user enter last "LastName"
	And user enter password "Password"
	And clicks on Sign Up Button
	Then Verify the message on the page
	    |# Following error Message should show on the page	|
	    |Please enter an Email address						|	
	    

@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10154 @CR-SK @C1-Message
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


@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10156 @CR-SK @C1-Message
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

	    
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10157 @CR-SK @C1-Message
Scenario: Verify the user gets the error message on entering the password not meeting the requirements of minimum characters
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page
	And user enter first "FirstName"
	And user enter last "LastName"
	And user enter random email Address
	And user enter password "5Char"
	And clicks on Sign Up Button
	Then Verify the message on the page
	    |# Following error Message should show on the page	|
	    |Password must be at least 8 characters long		|
	    

@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10158 @CR-SK @C1-Message
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


@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10160 @CR-SK
Scenario: Verify the user entered password gets validated against password rules dynamically
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page
	And user enter first "FirstName"
	And user enter last "LastName"
	And user enter random email Address
	And user enter password "NineCharacters"
	Then password strength should show "Yellow" color
	When user enter password "ForteenCharacters"
	Then password strength should show "Green" color


@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-4249
@ZYP_MYACCOUNT_K4249-10162 @CR-SK @C1-Message
Scenario: Verify the user is able to see the password strength info bubble 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	And user enter first "FirstName" 
	And user enter last "LastName" 
	And user enter random email Address
	And user enter password "Password" 
	When user hovers on info icon tooltip of password strength 
	Then Verify the message on the page 
		|# Following error Message should show on the page								|
		|What makes passwords strong?|
		|Choose a password that is at least 8 characters in length and has a minimum of 1 number, 1 upper case letter, 1 lower case letter and 1 special character.|
		
		
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4249
@ZYP_MYACCOUNT_K4249-10166 @CR-SK @C1-Message
Scenario: Verify the user gets the error message when First name filled with any non-alpha character except - or '
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	When user enter first "@#@#es!~%^t" 
	And clicks on Sign Up Button 
	Then Verify the message on the page 
		|# Following error Message should show on the page					|
		|This form field has an unrecognized character	|		
		
		
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-4249
@ZYP_MYACCOUNT_K4249-10170 @CR-SK @C1-Message
Scenario: Verify the user gets the error message when Last name filled with any non-alpha character except - or '
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	When user enter last "Au@#@#es!~%^t" 
	And clicks on Sign Up Button 
	Then Verify the message on the page 
		|# Following error Message should show on the page	|
		|This form field has an unrecognized character	|	
		
		
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10171 @CR-SK @C1-Message
Scenario: Verify the user gets the error message when email address contains '+' as the non-alpha character
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page
	And user enter first "FirstName"
	And user enter last "LastName"
	And user enter "EmailAddress+sd@email.com" in signup page
	And user enter password "Password"
	And clicks on Sign Up Button
	Then Verify the message on the page
	    |# Following error Message should show on the page					|
	    |Please enter the Email Address in a valid format (ex. abc@xyz.com)	|	        
		
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10164 @CR-SK
Scenario: Verify the user does not get the error message when First name filled with empty character
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page
	And user enter first ""
	And user enter last "LastName"
	And user enter random email Address
	And user enter password "Password"
	And clicks on Sign Up Button
	Then Verify the message not displayed on the page
	    |# Following error Message should not show on the page	|
	    |Please enter the First Name							|		

	@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10167 @CR-SK
	Scenario: Verify the user does not get the error message when Last name filled with empty character
		Given user launches the browser and navigates to "ASO_HOME" page 
		When user clicks on SignIn link from global header 
		And clicks on SignUp link from SignIn page
		And user enter first "FirstName"
		And user enter last ""
		And user enter random email Address
		And user enter password "Password"
		And clicks on Sign Up Button
		Then Verify the message not displayed on the page
		    |# Following error Message should not show on the page	|
		    | Please Enter a Last Name								|		    
	    
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10165 @CR-SK
Scenario: Verify the user gets the error message when First name filled with more than 50 characters
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header
	And clicks on SignUp link from SignIn page
	And user enter last "NameHavingMoreThan50Characters"
	Then Verify "First Name" text field does not accept more than 50 characters
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10168 @CR-SK
Scenario: Verify the user gets the error message when last name filled with more than 50 characters
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page
	And user enter last "NameHavingMoreThan50Characters"
	And Verify "Last Name" text field does not accept more than 50 characters	    	
	

@Web @Regression @P1 @CR-MT	
Scenario: Register new user with address information for faster checkout
  	Given user launches the browser and navigates to "ASO_HOME" page
	When user click on My Account link 
	And  user click on Sign Up link
	And user enter First Name "First_Name"
	And user enter Last Name "Last_Name"
	And user enter Email Address "Email_Address" 
	And user enter Password "NewPassword"
	When user select Add Address for Faster Checkout checkbox 
	And user enter Address plcc "Address" 
	And user enter Zip Code "Zip_Code" 
	And user enters Phone Number "Phone_Number" 
	And user click on SIGN UP
	Then user verify success message
		    