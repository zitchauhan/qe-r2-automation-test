Feature: API-Load Customer Data based on Prescreen Id 

@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify to Retrive Customer Data based on PrescreenID
	Given "PLCCCustomerDataBasedonPrescreenID" endpoint for getting cutomer data based on prescreenID
	#Then Verify response status code as 201 
	
@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify to response status 400 for invalid Prescreen code
	Given "PLCCInvalidPrescreenID" endpoint for Invalid prescreenID
	#Then Verify response status 400 for plcc
	
	
@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify to response status 404 for invalid url with prescreenID
	Given "PLCC404InvalidPrescreenID" endpoint for Invalid url with prescreenID
	#Then Verify response status 404 for plcc	
	
	
	