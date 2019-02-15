Feature: Registration 


@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify for status code 400 for Bad Request 
	Given "CategoryDetailFor400" endpoint for Category 
	Then Verify Error response status code as 400 for Category 
	

	
	