Feature: Landing Page 	

Background:  Common Pre-requisite steps
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user click on expand all Academy services 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	When user click on APPLY NOW button 

@C-PLCC @Regression @All @PLCC-35 @CR-VS @Mobile 
Scenario: Verify the system behavior when user clicks on Apply Now button
	Then user navigates to Generic Credit Card Application Modal 
	
@C-PLCC @Regression @All @PLCC-35 @CR-VS @Mobile
Scenario: Verify the system behavior when user clicks on Manage your card Link
	Then user navigates to Generic Credit Card Application Modal 
	When user click on manage your card link 
	Then user navigates to bank page 
	
