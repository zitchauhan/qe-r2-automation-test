Feature: Landing Page 

Background: 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present 
	
@C-PLCC @Regression @All @PLCC-36 @CR-VS 
Scenario: Verify the display of container information on PLCC landing page 
	And user expect element Benefit1Image to be present 
	And user expect element Benefit2Image to be present 
	And user expect element Benefit3Image to be present 
	And user expect element Benefit1Text to be present 
	And user expect element Benefit2Text to be present 
	And user expect element Benefit3Text to be present 
	And user expect element OfferText1 to be present 
	And user expect element OfferText2 to be present 
	And user expect element OfferText3 to be present 