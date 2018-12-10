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
Scenario: Validate errors providing fields empty value 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on "<signInCta>" 
	Then user navigates to "SIGNUP_PAGE" 
	And "<addAddressCheckBox>" is present 
	When user check "<addAddressCheckBox>" 
	#do not fill any fields
	And user clicks on "<btnsignup_btn>" 
	And "<requiredTxt>" is present 
	#against all empty fields in red
	
Scenario Outline: Validate errors providing invalid zipcode 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on "<signInCta>" 
	Then user navigates to "SIGNUP_PAGE" 
	And "<addAddressCheckBox>" is present 
	When user check "<addAddressCheckBox>" 
	#do not fill any fields
	And user enter "<zipCodeTxtField>" 
	And user clicks on "<btnsignup_btn>" 
	And "<invalidZipError>" is present 
	#against zip code field in red	
	
	Examples: 
		|zipCodeTxtField|
		| 321           |
		
Scenario Outline: Validate errors providing invalid phone number 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on "<signInCta>" 
	Then user navigates to "SIGNUP_PAGE" 
	And "<addAddressCheckBox>" is present 
	When user check "<addAddressCheckBox>" 
	#do not fill any fields
	And user enter "<phoneNumberTxtField>" 
	And user clicks on "<btnsignup_btn>" 
	And "<invalidPhoneNumberError>" is present 
	#against phone number field in red	
	
	Examples: 
		|invalidPhoneNumberError|
		| 3214689               |