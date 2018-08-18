Feature: Verify  Customer Registration/ Sign Up 

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10148 @CR-RK 
Scenario: Verify the available fields on the Sign Up page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on 'Sign In' link from global header 
	And clicks on 'Sign Up' link from Sign In page 
	Then user should land on the Sign Up page to create a new account 
	And user will check whether the following fields are displayed 
	
@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10149 @CR-RK 
Scenario Outline: Verify user is able to create an account with all valid data 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on 'Sign In' link from global header 
	And clicks on 'Sign Up' link from Sign In page 
	And user enter first "<fname>" 
	And user enter last "<lname>" 
	And user enter email "<address>" 
	And user enter create "<password>" 
	And user click optin checkbox 
	And clicks on Sign Up Button 
	#	And user should see the successfull message
	#	And there should be a 'Let's Shop' button
	#	And user should be able to view 'My Account' in global header
	
	Examples: 
	| fname | lname	| address|password|
	|Rashika|Kowtikwar|rashika.kowtikwar@academy.com|academy@123|
		
@R2_Web @R2_Regression @R2_All @P-Highest @C-MyAccount @KER-4249 @ZYP_MYACCOUNT_K4249-10163 @CR-RK 
Scenario Outline: Verify the user is able to sign with the new created account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on 'Sign In' link from global header 
	And user enter the valid emailaddress "<emailaddress>" 
	And user enter the valid password "<password>" 
	And user click on signin button 
	Then user should get logged in successfully 
			
	Examples: 
	| emailaddress|password|
	|rashika.kowtikwar@academy.com|academy@123|
				
				
				
				
	