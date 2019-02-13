Feature: Landing Page 	

Background:  Common Pre-requisite steps
Given user launches the browser and navigates to "ASO_HOME" page 
When user click on AcademyCreditCard link in the footer section of ASO-Home page 
Then user expect Landing page to be present 
And user expect element FPO Apply Order section to be present 

@C-PLCC @Regression @All @PLCC-34 @CR-VS 
Scenario: Verify the navigation of Footer Links - General
    #When user expect element FindInStoreFooter to be present 
    #Then user click on FindInStoreFooter and navigates to FindInStoreFooter Page
	#When user expect element ChatNoW to be present 
	#Then user click on ChatNoW and navigates to ChatNoW Page
	#And user click and navigates to child window
	#And user verify the presence of ChatNow page
	When user expect element SignUpForMoreDeals to be present 
	Then user click on SignUpForMoreDeals and navigates to SignUpForMoreDeals Page
	And user verify presence of getMoreDeals text to be present in the modal
	
	
