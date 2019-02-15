Feature: Landing Page 	

Background:  Common Pre-requisite steps
Given user launches the browser and navigates to "ASO_HOME" page 
When user click on AcademyCreditCard link in the footer section of ASO-Home page 
Then user expect Landing page to be present 
And user expect element FPO Apply Order section to be present


@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the navigation of Footer Links -Social Media Links	 
	And user expect element FaceBook to be present 
	When user click on Facebook icon
	Then user navigates to Facebook Page and validate facebook url
	And user close the newly opened tab
    And user expect element Pinterest to be present 
    When user click on Pinterest icon
    Then user navigates to Pinterest Page and validate pinterest page url
    And user close the newly opened tab
	
#	And user expect element YouTube to be present 
#   And user expect element Instagram to be present 