Feature: API-Address-Get City State 

@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify to Retrive City and State of the users address
	Given "PLCCAddressCityAndState" endpoint for getting city and State of users address
	Then Verify response status code as 200 message for plcc changes 
		
@C-PLCC @Regression @All @API @CR-Manju 
 Scenario: Verify API Address Validation Service of a profile
    Given "PLCCAddressURL" with "PLCCAddressPostRequest" endpoint for address validation of a profile
    Then Verify response status code as 200 message for plcc changes

@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify to Retrive City and State for inavlid address
	Given "PLCCInvalidAddressCityAndState" endpoint for getting city and State for invalid address
	Then user expect response status as 400	
	
@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify to Retrive City and State for inavlid url for address
	Given "PLCCInvalidURLAddressCityAndState" endpoint for getting city and State for invalid url for address
	Then user verify response status code as 404
	
	
	
	