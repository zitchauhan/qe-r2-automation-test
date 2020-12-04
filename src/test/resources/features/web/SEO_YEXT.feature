Feature: BOPIS - taxes should update correctly on change of the store on cart page

@Web @Regression @dummy
Scenario: Verify user is able to close/delete the store
	Given user launches the browser and navigates to "YEXT" page 
	And User signs into YEXT
	And User selects the entity
	And Delete the store
	And user launches the browser and navigates to "ASO_HOME" page
	When user selects store with "YextStoreFlorida" and "YextStoreName" 
	And User searches a product "YextSOFSKUNumber" and navigates to PDP
	And Verify store close in PDP page
	
