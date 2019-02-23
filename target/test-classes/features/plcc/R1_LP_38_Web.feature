Feature: Landing Page 

Background:  Common Pre-requisite steps
Given user launches the browser and navigates to "ASO_HOME" page 
	
@C-PLCC @Regression @All @PLCC-38 @CR-VS  
Scenario: Verify the system behavior when user clicks on Academy Credit Card link
	And user expect element AcademyCreditCard link to be present 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
