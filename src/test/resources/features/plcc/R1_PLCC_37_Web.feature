Feature: Registration 

Background: 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present
	
@Regression @Web @All @C-VidyaSiddaramappa @PLCC-37 @PLCC-141 
Scenario: Verify the system behavior when user enters invalid prescreen code on PLCC landing page
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Valid_PrescreenCode_1"
	 #And user expect Prescreen Modal is to be present 
	
@Regression @Web @All @C-VidyaSiddaramappa @PLCC-37 @PLCC-141 
Scenario: Verify the system behavior when user enters invalid prescreen code on PLCC landing page
	And user expect Preescreen Code Text Field is to be present
	And user enter Preescreen Code "Invalid-PrescreenCode_1"
	 And user expect Preescreen Error Code is to be present 
	 
	 
 