Feature: Landing Page 	

Background:  Common Pre-requisite steps
Given user launches the browser and navigates to "ASO_HOME" page 
When user click on AcademyCreditCard link in the footer section of ASO-Home page 
Then user expect Landing page to be present 
And user expect element FPO Apply Order section to be present 

@C-PLCC @Regression @All @PLCC-34 @CR-VS 
Scenario: Verify the display of elements available under Header component on PLCC landing page 
	And user expect element Benefits section to be present
	And user expect element prescreen section to be present
	And user expect element AcademyLogo to be present 
	And user expect element FindAStoreLink to be present 
	And user expect element ShopTab to be present 
	And user expect element Search Input Field to be present 
	And user expect element Deals Tab to be present 
	And user expect element My Account Link to be present 
	And user expect element WeeklyAd Link to be present 
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS 
Scenario: Verify the display of body of the  PLCC landing page 
	And user expect element Benefit Images to be present 
	And user expect element Benefit Texts to be present 
	And user expect element OfferTexts to be present 
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS 
Scenario: Verify the display of elements available under Hero Banner on PLCC landing page
	And user expect element ApplyNow_Btn to be present 
	And user expect element ManageYourCardLink to be present 
	And user expect element PLCCCreditCardImage to be present 
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the display of Footer components on PLCC landing page 
	And user expect element ThisIsAcademy to be present 
	And user expect element NeedHelp to be present
	And user expect element PressReleases to be present 
	And user expect element CheckOrder to be present 
	And user expect element ReturnPolicy to be present 
	And user expect element ProductRecall to be present 
	And user expect element Rebates to be present 
	And user expect element PhoneNumberL to be present 
	And user expect element CustomerCare to be present 
	And user expect element Services to be present
	And user expect element ShopGiftCards to be present 
	And user expect element CheckGiftCradBalance to be present 
	And user expect element AcademyCreditCard to be present 
	And user expect element StoreServicesLink to be present 
	And user expect element FindInStoreFooter to be present 
	And user expect element SignUpForMoreDeals to be present 
	And user expect element ChatNoW to be present 
	And user expect element FaceBook to be present 
	And user expect element Pinterest to be present 
	And user expect element YouTube to be present 
	And user expect element Instagram to be present 
	And user expect element PrivacyPolicy to be present 
	And user expect element TermsAndCondition to be present 
	And user expect element CaliforniaTransparencyinSupplyChainAct to be present 
	And user expect element © 2018 Academy Sports + Outdoors. All Rights Reserved to be present
	And user expect element Sitemap to be present 
	And user expect element ProductIndex to be present 
	And user expect element ShoppingIndex to be present 
	And user expect element BrandsIndex to be present  
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the navigation of Footer Links -ThisIsAcademy Section
	And user expect element ThisIsAcademy to be present 
	When user expect element Our History to be present
	Then user click on Our History and navigates to Our History Page
	When user expect element Careers to be present
	And user expect element PressReleases to be present
	Then user expect element Investors to be present
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the navigation of Footer Links -NeedHelp Section
	When user expect element NeedHelp to be present
	And user expect element CheckOrder to be present 
	When user expect element ReturnPolicy to be present 
	Then user expect element ProductRecall to be present 
	And user expect element Rebates to be present 
	And user expect element PhoneNumberL to be present
	And user expect element CustomerCare to be present
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the navigation of Footer Links -Services Section
	And user expect element Services to be present
	And user expect element ShopGiftCards to be present 
	And user expect element CheckGiftCradBalance to be present 
	And user expect element AcademyCreditCard to be present 
	And user expect element StoreServicesLink to be present
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS 
Scenario: Verify the navigation of Footer Links - General
    And user expect element FindInStoreFooter to be present 
	And user expect element SignUpForMoreDeals to be present 
	And user expect element ChatNoW to be present 
	 
@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the navigation of Footer Links -Social Media Links	 
	And user expect element FaceBook to be present 
	And user expect element Pinterest to be present 
	And user expect element YouTube to be present 
	And user expect element Instagram to be present 
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the navigation of Footer Links -T&C Links
	And user expect element PrivacyPolicy to be present 
	And user expect element TermsAndCondition to be present 
	And user expect element CaliforniaTransparencyinSupplyChainAct to be present 
	And user expect element © 2018 Academy Sports + Outdoors. All Rights Reserved to be present
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS 
Scenario: Verify the navigation of Footer Links -Additional Links
	And user expect element Sitemap to be present 
	And user expect element ProductIndex to be present 
	And user expect element ShoppingIndex to be present 
	And user expect element BrandsIndex to be present  