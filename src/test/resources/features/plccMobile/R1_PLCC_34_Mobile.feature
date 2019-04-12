Feature: Landing Page

@C-PLCC @Regression @All @PLCC-34 @CR-Smeetha @Mobile 
Scenario: Verify user is able to navigate to PLCC landing page  
    Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user click on expand all Academy services
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the navigation of Footer Links -Services Section
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user click on expand all Academy services
	When user expect element ShopGiftCards to be present 
	Then user click on ShopGiftCards and navigates to ShopGiftCards Page

@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the navigation of Footer Links -Services Section
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user click on expand all Academy services
	When user expect element ShopGiftCards to be present 
	Then user click on ShopGiftCards and navigates to ShopGiftCards Page
	
@C-PLCC @Regression @All @PLCC-34 @CR-Smeetha @Mobile 
Scenario: Verify the display of elements available under Hero Banner on PLCC landing page
	Given user launches the browser and navigates to "ASO_HOME" page plcc
	And user click on expand all Academy services
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect Landing page to be present 
	And user expect element ApplyNow_Btn to be present 
	And user expect element ManageYourCardLink to be present