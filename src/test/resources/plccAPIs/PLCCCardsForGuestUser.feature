Feature: Get PLCC card for Guest users

@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify to Retrive PLCC card for Guest users
	Given "PLCCCardForGuestUser" endpoint for getting plc card for guest user
	Then Verify response status code as 200 message for plcc changes
	
@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify to Retrive invalid PLCC card for Guest users
	Given "PLCCInvalidCardForGuestUser" endpoint for getting invalid plc card for guest user
	Then user expect response status as 400
	
	
	

	
	
	
	
	