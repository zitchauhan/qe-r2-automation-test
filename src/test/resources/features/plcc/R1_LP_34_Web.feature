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
	And user verify element landing page banner to be present
	And user expect label above plcc card to be present
	
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
	And user expect element 2018 Academy Sports + Outdoors. All Rights Reserved to be present
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
	Then user click on Careers and navigates to Careers Page
	And user click on browser back button
	And user expect Landing page to be present 
	When user expect element PressReleases to be present
	Then user click on PressReleases and navigates to PressReleases Page
	And user click on browser back button
	And user expect Landing page to be present
	When user expect element Investors to be present
	Then user click on Investors and navigates to Investors Page
	
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the navigation of Footer Links -NeedHelp Section
	When user expect element NeedHelp to be present
	And user expect element CheckOrder to be present 
	Then user click on CheckOrder and navigates to CheckOrder Page
	And user click on browser back button
	And user expect Landing page to be present 
	When user expect element ReturnPolicy to be present 
	Then user click on ReturnPolicy and navigates to ReturnPolicy Page
	And user click on browser back button
	And user expect Landing page to be present 
	#When user expect element ProductRecall to be present 
	#Then user click on ProductRecall and navigates to ProductRecall Page
	And user click on browser back button
	And user expect Landing page to be present 
	When user expect element Rebates to be present 
	Then user click on Rebates and navigates to Rebates Page
	And user click on browser back button
	And user expect Landing page to be present 
	And user expect element PhoneNumberL to be present
	When user expect element CustomerCare to be present
	Then user click on CustomerCare and navigates to CustomerCare Page
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the navigation of Footer Links -Services Section
	And user expect element Services to be present
	When user expect element ShopGiftCards to be present 
	Then user click on ShopGiftCards and navigates to ShopGiftCards Page
	And user click on browser back button
	And user expect Landing page to be present 
	When user expect element AcademyCreditCard to be present 
	Then user click on AcademyCreditCard and navigates to AcademyCreditCard Page
	And user click on browser back button
	And user expect Landing page to be present
	#And user expect element StoreServicesLink to be present
	#Then user click on StoreServicesLink and navigates to StoreServicesLink Page
	#And user click on browser back button
	#And user expect Landing page to be present
	#When user expect element CheckGiftCradBalance to be present 
	#Then user click on CheckGiftCradBalance and navigates to CheckGiftCradBalance Page
	
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
	
	 
@C-PLCC @Regression @All @PLCC-34 @CR-Manju  
Scenario: Verify the navigation of Footer Links -Social Media Links	 
	And user expect element FaceBook to be present 
	When user click on Facebook icon
	Then user navigates to Facebook Page and validate facebook url
   	When user click on Pinterest icon
    Then user navigates to Pinterest Page and validate pinterest page url
	When user click on twitter 
	Then user navigates to twitter page and validate twitter page url
	When user click on instagram icon
	Then user navigates to instagram page and validate instagram page url
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS  
Scenario: Verify the navigation of Footer Links -T&C Links
	When user expect element PrivacyPolicy to be present 
	Then user click on PrivacyPolicy link in the footer section of ASO-Home page
	And user expect PrivacyPolicy page to be present 
	And user click on browser back button
	And user expect element TermsAndCondition to be present 
	When user click on TermsAndCondition link in the footer section of ASO-Home page
	Then user expect TermsAndConditions page to be present 
	And user expect element CaliforniaTransparencyinSupplyChainAct to be present 
	And user click on browser back button 
	And user expect element CaliforniaTransparencyinSupplyChainAct to be present
	#And user click on California Transparency in Supply Chain Act(SB 657) link and navigates to CaliforniaTransparencyinSupplyChainAct page
	
@C-PLCC @Regression @All @PLCC-34 @CR-VS 
Scenario: Verify the navigation of Footer Links -Additional Links
	When user expect element Sitemap to be present 
	Then user click on Sitemap and navigates to Sitemap Page
	And user click on browser back button
	When user expect element ProductIndex to be present
	Then user click on ProductIndex and navigates to ProductIndex Page 
	And user click on browser back button
	When user expect element ShoppingIndex to be present
	Then user click on ShoppingIndex and navigates to ShoppingIndex Page 
	And user click on browser back button
	And user click on Outdoors and navigates to Outdoors Page  
	And user click on browser back button
	And user click on Shoes and navigates to Shoes Page
	And user click on browser back button
	And user click on SportsEquipment and navigates to SportsEquipment Page
	And user click on browser back button

	
	
