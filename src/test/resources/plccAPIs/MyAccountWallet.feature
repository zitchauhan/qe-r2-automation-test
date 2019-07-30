Feature: API-MyAccount Wallet

@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify Login Authentication Token Details of JSON Response
    Given "PLCCloginurl" with "PLCCLoginRequest" endpoint for login authentication for plcc
    Then Verify response status code as 201 for plcc changes
    
 @C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify the Post Response to Add a Credit card for PLCC
	Given "PLCCAddAddressURLr2" endpoint with "PLCCAddCreditCardPostRequest" for adding a credit card for plcc
	Then Verify response status code as 200 message for plcc changes
    
@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify to Retrive All the Credit cards
	Given "PLCCGetAllCreditCards" endpoint for getting all the credit cards
	Then Verify response status code as 200 message for plcc changes
	
	
@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify the Post Response to Update a Credit card for PLCC
	Given "PLCCUpdateAddressURLr2" endpoint with "PLCCUpdateCreditCardPostRequest" for updating a credit card for plcc
	Then Verify response status code as 200 message for plcc changes 
	
@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify the Post Response to Set a Card as default
	Given "PLCCSetCardAsDefaultURLr2" endpoint with "PLCCSetCardAsDefaultPostRequest" for Set a credit card as default
	Then Verify response status code as 200 message for plcc changes 
	
@C-PLCC @Regression @All @API @CR-Manju 
Scenario: Verify the Post Response to Delete a Card 
	Given "PLCCDeleteCardURLr2" endpoint for deleting a credit card 
	Then Verify response status code as 200 message for plcc changes 	

	
	
	
	
	