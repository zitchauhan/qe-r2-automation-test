Feature: BOPIS - taxes should update correctly on change of the store on cart page

@Web @Regression @dummy
Scenario: Verify taxes should be updated correctly onchange of the store on cart page
	Given user launches the browser and navigates to "YEXT" page 
	And User signs into YEXT
	And User selects the entity
	And Modify store hour details
	