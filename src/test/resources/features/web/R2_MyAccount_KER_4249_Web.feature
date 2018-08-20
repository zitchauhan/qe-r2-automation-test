Feature: Verify  Customer Registration/ Sign Up 

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10148 @CR-RK 
Scenario: Verify the available fields on the Sign Up page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	Then user should land on the Sign Up page to create a new account 
	And user will check whether the following fields are displayed 
	
@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10149 @CR-RK 
Scenario: Verify user is able to create an account with all valid data 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And clicks on SignUp link from SignIn page 
	And user enter first "<FirstName>" 
	And user enter last "<LastName>" 
	And user enter email "<Address>" 
	And user enter password "<Password1>" 
	And user click optin checkbox 
	And clicks on Sign Up Button 
	And user should see the successfull message
	And user should be able to view My Account in global header
	

		
@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10163 @CR-RK 
Scenario: Verify the user is able to sign with the new created account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "<EmailAddress>" 
	And user enter the valid password "<Password>" 
	And user click on signin button 
	Then user should get logged in successfully 
				
				
				
	