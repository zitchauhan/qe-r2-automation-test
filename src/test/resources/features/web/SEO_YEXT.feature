Feature: YEXT Functionalities

@Web @yext @SEO @Regression
Scenario: YEXT - Close/Delete Functionality
	Given user launches the browser and navigates to "YEXT" page 
	And User signs into YEXT
	And User selects the entity
	And Delete the store
	And Quit Browser
	When user launches the browser and navigates to "ASO_HOME" page
	And user selects store with "YextStoreFlorida" and "YextStoreName1"
	And User searches a product "YextSOFSKUNumber" and navigates to PDP
	Then Verify store close in PDP page
	
@Web @yext @SEO @Regression
Scenario: YEXT - Update Functionality
	Given user launches the browser and navigates to "YEXT" page
	And User signs into YEXT
	And User selects the entity
	And Update store details
	And Quit Browser
	When user launches the browser and navigates to "ASO_HOME" page
	And user selects store with "YextNewLocAddressPin" and "YextStoreName" yext
	And User searches a product "YextSOFSKUNumber" and navigates to PDP
	Then Verify store details in PDP page

@Web @yext @SEO1 @Regression	
Scenario: YEXT - Create Functionality
	Given user launches the browser and navigates to "YEXT" page
	And User signs into YEXT
	And User creates new store location with "YextNewLocCountry","YextNewLocCategory","YextNewLocAddressLine1","YextNewLocAddressLine2","YextNewLocAddressFloor","YextNewLocAddressCity","YextNewLocStateRegion","YextNewLocAddressStateCode","YextNewLocAddressPin","YextNewLocMainPhoneCode","YextNewLocMainPhoneNumber"
	And Quit Browser
	When user launches the browser and navigates to "ASO_HOME" page
	And Navigate to store locator page
	And Navigate to the store page with state "YextNewLocAddressStateCode", city "YextNewLocAddressCity" and store "YextStoreName1"
	Then Verify Store created on ASO Page
	
@Web @yext @SEO @Regression
Scenario: YEXT - Update Functionality in Store Locator page
	Given user launches the browser and navigates to "YEXT" page
	And User signs into YEXT
	And User selects the entity
	And Update store details
	And Quit Browser
	When user launches the browser and navigates to "ASO_HOME" page
	And Navigate to store locator page
	And Navigate to the store page with state "YextCity1", city "YextLocation1" and store "YextStoreName1"
	Then Verify store details in Store Locator page
	