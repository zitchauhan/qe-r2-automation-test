Feature: Landing Page 

@Regression @Web @All @C-Vidya @PLCC-34 
Scenario: Verify user is able to navigate to PLCC landing page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present
	And user expect element Benefits section to be present
	And user expect element prescreen section to be present
	
@Regression @Web @All @C-Vidya @PLCC-34 
Scenario: Verify the display of Header components on PLCC landing page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present
	And user expect element Benefits section to be present
	And user expect element prescreen section to be present
	And user expect element AcademyLogo to be present 
	And user expect element FindAStoreLink to be present 
	And user expect element ShopTab to be present 
	And user expect element Search Input Field to be present 
	And user expect element Deals Tab to be present 
	And user expect element My Account Link to be present 
	And user expect element WeeklyAd Link to be present 
	
@Regression @Web @All @C-Vidya @PLCC-34 
     Scenario: Verify the display of Hero Banner  on PLCC landing page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present 
	And user expect element ApplyNow_Btn to be present 
	And user expect element ManageYourCardLink to be present 
	And user expect element PLCCCreditCardImage to be present 
	
@Regression @Web @All @C-Vidya @PLCC-34  
Scenario: Verify the display of Footer components on PLCC landing page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present
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
	
@Regression @Web @All @C-Vidya @PLCC-34  
Scenario: Verify the navigation of Footer Links -ThisIsAcademy Section
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present
	And user expect element ThisIsAcademy to be present 
	When user expect element Our History to be present
	Then user click on Our History and navigates to Our History Page
	When user expect element Careers to be present
	When user expect element PressReleases to be present
	When user expect element Investors to be present
	
@Regression @Web @All @C-Vidya @PLCC-34  
Scenario: Verify the navigation of Footer Links -NeedHelp Section
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present
	When user expect element NeedHelp to be present
	And user expect element CheckOrder to be present 
	When user expect element ReturnPolicy to be present 
	Then user expect element ProductRecall to be present 
	When user expect element Rebates to be present 
	And user expect element PhoneNumberL to be present
	And user expect element CustomerCare to be present
	
@Regression @Web @All @C-Vidya @PLCC-34  
Scenario: Verify the navigation of Footer Links -Services Section
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present
	And user expect element Services to be present
	And user expect element ShopGiftCards to be present 
	And user expect element CheckGiftCradBalance to be present 
	And user expect element AcademyCreditCard to be present 
	And user expect element StoreServicesLink to be present
	
@Regression @Web @All @C-Vidya @PLCC-34  
Scenario: Verify the navigation of Footer Links - General
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present
    And user expect element FindInStoreFooter to be present 
	And user expect element SignUpForMoreDeals to be present 
	And user expect element ChatNoW to be present 
	 
@Regression @Web @All @C-Vidya @PLCC-34  
Scenario: Verify the navigation of Footer Links -Social Media Links	 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present
	And user expect element FaceBook to be present 
	And user expect element Pinterest to be present 
	And user expect element YouTube to be present 
	And user expect element Instagram to be present 
	
@Regression @Web @All @C-Vidya @PLCC-34  
Scenario: Verify the navigation of Footer Links -T&C Links
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present
	And user expect element PrivacyPolicy to be present 
	And user expect element TermsAndCondition to be present 
	And user expect element CaliforniaTransparencyinSupplyChainAct to be present 
	And user expect element © 2018 Academy Sports + Outdoors. All Rights Reserved to be present
	
@Regression @Web @All @C-Vidya @PLCC-34 
Scenario: Verify the navigation of Footer Links -Additional Links
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user click on AcademyCreditCard link in the footer section of ASO-Home page 
	Then user expect element FPO Apply Order section to be present
	And user expect element Sitemap to be present 
	And user expect element ProductIndex to be present 
	And user expect element ShoppingIndex to be present 
	And user expect element BrandsIndex to be present  