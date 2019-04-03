Feature: Landing Page_Mobile for Mobile

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	When user click on burger menu 
	And user click on My Account link of mobile
	And user enter Email address in sign-in page "Email_Generic" 
	And user enter password in sign-in page "passwordPlcc" 
	And user click on Signin-button 
	Then user navigates to ASO-Home page
	And user click on expand all Academy services
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present

@C-PLCC @Mobile @Regression @All @PLCC-37 @CR-Manju @Mobile
Scenario: Verify the system behavior when user enters valid 12 digits, numeric prescreen code and clicked on Accept offer button
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	And user click on ACCEPT OFFER
	And user expect element STEP 1 :PRESCREEN ACCEPTANCE present
	
	 
 