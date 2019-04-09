Feature: PLCC: Landing Page_Invalid Prescreen Code

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user click on expand all Academy services
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "InvalidValid_PrescreenCode_1"
	And user click on ACCEPT OFFER 

@C-PLCC @Regression @All @PLCC-577 @CR-Manju @Mobile
Scenario: Verify Prescreen Modal when user enter invalid pre screen code
	And user expect element error message for invalid prescreen code to be present