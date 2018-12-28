Feature: Landing Page 

@Regression @Web @All @C-Manju @PLCC-36 
Scenario: Verify the display of Footer components on PLCC landing page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on My Account link 
	And user expect element Email Address to be present 
	And user enter "Email_Address_1" 
	And user enter "Password_1" 
	And user click on Signin-button 
	And user navigates to ASO-Home page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present 
	And user expect element BenefitsInformationContainer1Img to be present 
	And user expect element BenefitsInformationContainer2Img to be present 
	And user expect element BenefitsInformationContainer3Img to be present 
	And user expect element BenefitsInformationContainer1Img to be present 
	And user expect element BenefitsInformationContainer2Img to be present 
	And user expect element BenefitsInformationContainer3Img to be present 
	And user expect element BenefitsInformationContainer1Img to be present 
	And user expect element BenefitsInformationContainer2Img to be present 
	And user expect element BenefitsInformationContainer3Img to be present 