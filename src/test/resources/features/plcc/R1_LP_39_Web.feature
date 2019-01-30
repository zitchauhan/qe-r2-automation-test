Feature: Landing Page 

@C-PLCC @Regression @All @PLCC-39 @CR-VS 
Scenario: Verify URL Redirect links from CBCC to PLCC-Landing Page by clicking on Academy Credit Card link for logged in use
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	Then user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_Address_1" 
	And user enter password in sign-in page "Password_1" 
	And user click on Signin-button
	And user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	And user expect Landing page to be present 