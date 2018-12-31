Feature: Landing Page 

@Regression @Web @All @C-Vidya @PLCC-39 
Scenario: Verify URL Redirect links from CBCC to PLCC-Landing Page by clicking on Academy Credit Card link for logged in user 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_1" 
	And user enter password in sign-in page "Password_1" 
	And user click on Signin-button
	And user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present
	And user expect element Benefits section to be present
	And user expect element prescreen section to be present