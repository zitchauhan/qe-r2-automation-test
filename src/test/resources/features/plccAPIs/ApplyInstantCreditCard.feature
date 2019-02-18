Feature: API-Apply Instant Credit Card

@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify the Post Response to apply instant credit card
	Given "PLCCApplyInstantCardURLr2" endpoint with "PLCCApplyInstantCardPostRequest" for applying instant credit card
	#Then Verify response status code as 201 
	
@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify the Post Response for 400 error applying invalid instant credit card with empty zipcode
	Given "PLCCApplyMissingZipCodeInstantCardURLr2" endpoint with "PLCCApplyMissingZipCodeInstantCardPostRequest" for applying invalid instant credit card
	
	
#@C-PLCC @Regression @All @API @CR-Manju 
#Scenario: Verify the Post Response for 404 error applying invalid instant credit card
#	Given "PLCCApplyInvalidInstantCardInvalidURL" endpoint with "PLCCApplyInvalidInstantCardPostRequest" Not found error for applying invalid instant credit card
	
	
	
	
	
	