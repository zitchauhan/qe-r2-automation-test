Feature: PLCC : Landing Page	

Background:  Common Pre-requisite steps
Given user launches the browser and navigates to "ASO_HOME" page plcc
When user click on AcademyCreditCard link in the footer section of ASO-Home page 
Then user expect Landing page to be present 


@C-PLCC @Regression @All @PLCC-35 @CR-VS 
Scenario: Verify the system behavior when user clicks on Apply Now button
When user click on APPLY NOW button 
Then user navigates to Generic Credit Card Application Modal 

@C-PLCC @Regression @All @PLCC-35 @CR-VS 
Scenario: Verify the system behavior when user clicks on Manage your card Link
When user click on manage your card link
#And user switch to the alert popup with "username" and "password"
#And user enter Email address in sign-in page "Email_Generic" 
#And user enter password in sign-in page "passwordPlcc" 
#And user click on Signin-button 
Then user navigates to bank page

