Feature: PLCC : Landing Page

@C-PLCC @Regression @All @PLCC-39 @CR-VS 
Scenario: Verify URL Redirect links from CBCC to PLCC-Landing Page by clicking on Academy Credit Card link for logged in use
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	And user expect Landing page to be present 