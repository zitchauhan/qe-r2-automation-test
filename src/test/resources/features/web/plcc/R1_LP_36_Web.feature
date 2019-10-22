Feature: PLCC : Landing Page Benifits Section

@C-PLCC @Regression @All @PLCC-36 @CR-VS 
Scenario: Verify the display of container information on PLCC landing page
	Given user launches the browser and navigates to "ASO_HOME" page plcc 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present 
	#Images are removed from the website so commenting below steps
	#And user expect element Benefit Images to be present 
	#And user expect element Benefit Texts to be present 
	#And user expect element OfferTexts to be present 