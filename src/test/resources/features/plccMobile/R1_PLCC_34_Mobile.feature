Feature: Landing Page

@C-PLCC @Regression @All @PLCC-34 @CR-Smeetha  @Mobile 
Scenario: Verify user is able to navigate to PLCC landing page  
    Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user click on expand all Academy services
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	
