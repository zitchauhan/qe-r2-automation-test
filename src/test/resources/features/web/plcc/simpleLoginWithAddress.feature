Feature: Login 

@C-PLCC @All @PLCC-50 @CR-VS @AutomationSmoke @Movefile1
Scenario: Verify user is able to login with entered address during registration
	Given user launches the browser and navigates to "ASO_HOME" page plcc 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter Email address in sign-in page "Email_IdentifyCardType" 
	And user enter password in sign-in page "passwordPlcc" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page