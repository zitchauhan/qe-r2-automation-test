#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Registration or Sign Up 

Scenario Outline: Validate Address 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on "<signInCta>" 
	Then user navigates to "SIGNUP_PAGE" 
	When user check "<addAddressCheckBox>" 
	And user enter "<firstname_input>" 
	And user enter "<lastname_input>" 
	And user enter "<email_input>" 
	And user enter "<signup-passwordfield>" 
	And user enter "<addressTxtField>" 
	And user enter "<zipCodeTxtField>" 
	And user enter "<cityTxtField>" 
	And user select "<state>" 
	And user select "<phoneNumberTxtField>" 
	And user clicks on "<btnsignup_btn>" 
	And user check "<profile-signup-promotional-msg>" 
	And user clicks on "<btnsignup_btn>" 
	#AVS Validation happens
	Then user navigates to "ASO_HOME" 
	
	Examples: 
		|firstname_input|lastname_input|email_input   |signup-passwordfield|addressTxtField  |zipCodeTxtField|state   |phoneNumberTxtField|
		|Test           |QA            |test@gmail.com|Test@123            |Cross Over Street|32810          |Florida |0123456789         |
		
Scenario Outline: Validate AVS response 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on "<signInCta>" 
	Then user navigates to "SIGNUP_PAGE" 
	When user check "<addAddressCheckBox>" 
	And user enter "<firstname_input>" 
	And user enter "<lastname_input>" 
	And user enter "<email_input>" 
	And user enter "<signup-passwordfield>" 
	And user enter "<addressTxtField>" 
	And user enter "<zipCodeTxtField>" 
	And user enter "<cityTxtField>" 
	And user select "<state>" 
	And user select "<phoneNumberTxtField>" 
	And user clicks on "<btnsignup_btn>" 
	And user check "<profile-signup-promotional-msg>" 
	And user clicks on "<btnsignup_btn>" 
	#AVS Validation happens
	Then user navigates to "<addressSuggestioModal>" 
	And "<suggestedAddress>" is present 
	And expect "<suggestedAddress>" text equal to "Cross Over Street" 
	When user select <suggestedAddress> 
	#Then make this address as default address 
	And user navigates to "<playBallMsg>" 
	
	Examples: 
		|firstname_input|lastname_input|email_input   |signup-passwordfield|addressTxtField  |zipCodeTxtField|state   |phoneNumberTxtField|
		|Test           |QA            |test@gmail.com|Test@123            |Cross Over Street|32810          |Florida |0123456789         |
		
Scenario Outline: Validate AVS response 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on "<signInCta>" 
	Then user navigates to "SIGNUP_PAGE" 
	When user check "<addAddressCheckBox>" 
	And user enter "<firstname_input>" 
	And user enter "<lastname_input>" 
	And user enter "<email_input>" 
	And user enter "<signup-passwordfield>" 
	And user enter "<addressTxtField>" 
	And user enter "<zipCodeTxtField>" 
	And user enter "<cityTxtField>" 
	And user select "<state>" 
	And user select "<phoneNumberTxtField>" 
	And user clicks on "<btnsignup_btn>" 
	And user check "<profile-signup-promotional-msg>" 
	And user clicks on "<btnsignup_btn>" 
	#AVS Validation happens
	Then user navigates to "<addressSuggestioModal>" 
	And "<suggestedAddress>" is present 
	And expect "<suggestedAddress>" text equal to "Cross Over Street" 
	When user select <suggestedAddress> 
	#Then make this address as default address 
	When user select <youEnteredAddress> 
	#Then make this address as default address 
	Examples: 
		|firstname_input|lastname_input|email_input   |signup-passwordfield|addressTxtField  |zipCodeTxtField|state   |phoneNumberTxtField|
		|Test           |QA            |test@gmail.com|Test@123            |Cross Over Street|32810          |Florida |0123456789         |
		
		
Scenario Outline: Validate AVS timeout errors 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on "<signInCta>" 
	Then user navigates to "SIGNUP_PAGE" 
	When user check "<addAddressCheckBox>" 
	And user enter "<firstname_input>" 
	And user enter "<lastname_input>" 
	And user enter "<email_input>" 
	And user enter "<signup-passwordfield>" 
	And user enter "<addressTxtField>" 
	And user enter "<zipCodeTxtField>" 
	And user enter "<cityTxtField>" 
	And user select "<state>" 
	And user select "<phoneNumberTxtField>" 
	And user clicks on "<btnsignup_btn>" 
	And user check "<profile-signup-promotional-msg>" 
	And user clicks on "<btnsignup_btn>" 
	And user wait for xyzsecs 
	And user select <youEnteredAddress> 
	#Then make this address as default address 
	Examples: 
		|firstname_input|lastname_input|email_input   |signup-passwordfield|addressTxtField  |zipCodeTxtField|state   |phoneNumberTxtField|
		|Test           |QA            |test@gmail.com|Test@123            |Cross Over Street|32810          |Florida |0123456789         |
		