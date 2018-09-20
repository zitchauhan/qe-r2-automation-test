Feature: [Web]E01-200 - Forgotten Password - Create New Password

  @R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-6654 @ZYP_MYACCOUNT_K6654-10175 @CR-RKA
  Scenario: Verify the password requirement rules
  Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user logs in as "EmailAddressForChangePassword" 
	And user navigates to profile in my account 
	And user click on change password icon
	And user enters current password 
	And user enters new password  
	Then Verify below Sub/Main Module of My Account 
	|#verify  new password dot is display|
	|ChangePassworPage_NewPassword_txt			|
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-6654 @ZYP_MYACCOUNT_K6654-10177 @CR-RKA
	Scenario: Verify the user is able to see the password strength info bubble
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user logs in as "EmailAddressForChangePassword" 
	And user navigates to profile in my account 
	And user click on change password icon
	And user enters current password 
	And user enters new password  
	Then user click on anywhere in change password 
	Then Verify below Sub/Main Module of My Account 
	|#verify the tooltip in change your password|
	|ChangePasswordPage_toolTip_Btn                                 |

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-6654 @ZYP_MYACCOUNT_K6654-10178 @CR-RKA
Scenario: Verify the user gets the error message on entering the password not meeting the requirements of min. characters

Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user logs in as "EmailAddressForChangePassword" 
	And user navigates to profile in my account 
	And user click on change password icon
	And user enters current password 
   Then user enter password of four digit 
   And user clicks on Update button 
   Then Verify the message on the page
   |#Verify the following MSG is display when password is less then 8 caharacter|
   |Password must be at least 8 characters long|
   
   @R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-6654 @ZYP_MYACCOUNT_K6654-10179 @CR-RKA
   Scenario: Verify the user enters the valid password and resets the password successfully
Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user logs in as "EmailAddressForChangePassword" 
	And user navigates to profile in my account 
	And user click on change password icon 
	And user enters current password 
	And user enters new password 
	And user clicks on Update button 
	Then Verify below Sub/Main Module of My Account 
		|#verify following elements in Payments page in My Account|
		|ProfilePage_ChangePassword_btn|

 @R2_Web @R2_Regression @R2_All @P-Highest @1HR @C-MyAccount @KER-6654 @ZYP_MYACCOUNT_K6654-10180 @CR-RKA
Scenario: Verify the user is able to sign with the new password
Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user logs in as "EmailAddressForChangePassword" 
	And user navigates to profile in my account 
	And user click on change password icon 
	And user enters current password 
	And user enters new password 
	And user clicks on Update button 
    When user sign out from the website 
    And  clicks on SignIn button in home page 
	And user logs in as "EmailAddressForChangePassword" 
     Then Verify below Sub/Main Module of My Account 
		|#verify user to be able to login with change password |
		|ProfilePage_ChangePassword_btn|

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-6654 @ZYP_MYACCOUNT_K6654-10181 @CR-RKA
Scenario: Verify the user is not able to sign with the old password
Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user enter the valid emailaddress "EmailAddress" 
	And  user enter the valid password "IncorrectPassword"
	And  user click on signin button 
	    Then Verify the message on the page
	    |#verify user is not able to sign in with wrong password|
	    |The combination of Email Address and Password is incorrect. Please try again.|
	 
	 
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-6654 @ZYP_MYACCOUNT_K6654-10182 @CR-RKA   
Scenario: Verify the user gets the error message on entering the password not meeting the requirements of same as email address
	Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user logs in as "EmailAddressForChangePassword" 
	And user navigates to profile in my account 
	And user click on change password icon 
	Then user enter the wrong current password 
	And user enters new password 
	And user clicks on Update button 
	##Only verification msg is required currently not displayed
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-6654 @ZYP_MYACCOUNT_K6654-10184 @CR-RKA
	Scenario: Verify user can set the new password same as old password of 8 digits
	 Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user logs in as "EmailAddressForChangePassword" 
	And user navigates to profile in my account 
	And user click on change password icon 
	And user enters current password 
	Then user enter the old password as new password 
	And user clicks on Update button 
    Then Verify the message on the page
    |#Verify following MSG should be displayed if old and current password is same|
    |For maximum security, please enter a Password different from the previous one|
	

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-6654 @ZYP_MYACCOUNT_K6654-10185 @CR-RKA  
	Scenario: Verify user not allowed to set the new password same as old password of 6 digits
 Given  user launches the browser and navigates to "ASO_HOME" page 
	And  clicks on SignIn button in home page 
	And user logs in as "EmailAddressForChangePassword" 
	And user navigates to profile in my account 
	And user click on change password icon 
	And user enters current password 
   Then user enter the six digit password 
   And user clicks on Update button 
   Then Verify the message on the page
   |#Verify following MSG is displaying|
   |Password must be at least 8 characters long|
	
	