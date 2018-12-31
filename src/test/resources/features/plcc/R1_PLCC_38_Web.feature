Feature: Landing Page 

Background: 
Given user launches the browser and navigates to "ASO_HOME" page 
	
@Regression @Web @All @C-Vidya @PLCC-38 
Scenario: Verify the display of Academy Credit Card link in footer section of the application 
	And user expect element AcademyCreditCard link to be present 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	
@Regression @Web @All @C-Vidya @PLCC-38 
Scenario: Verify the system behavior when user clicks on "Academy Credit Card" link 
	And user expect element AcademyCreditCard link to be present 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present