Feature: Landing Page 	

Background:  Common Pre-requisite steps
Given user launches the browser and navigates to "ASO_HOME" page 
When user click on AcademyCreditCard link in the footer section of ASO-Home page 
Then user expect Landing page to be present 
And user expect element FPO Apply Order section to be present 


@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the navigation of Footer Links -T&C Links
#	When user expect element PrivacyPolicy to be present 
#	Then user click on PrivacyPolicy link in the footer section of ASO-Home page
#	And user expect PrivacyPolicy page to be present 
#	And user click on browser back button
#	And user expect element TermsAndCondition to be present 
#	When user click on TermsAndCondition link in the footer section of ASO-Home page
#	Then user expect TermsAndConditions page to be present 
#	And user click on browser back button 
#	And user expect element CaliforniaTransparencyinSupplyChainAct to be present
	And user click on California Transparency in Supply Chain Act(SB 657) link and navigates to CaliforniaTransparencyinSupplyChainAct page
	
	