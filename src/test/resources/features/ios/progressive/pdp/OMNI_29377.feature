Feature: Verify card amount component on Gift card PDP page 

@Sprint04 @OMNI-29377  @TC-OMNI-29377_01 
Scenario Outline:  Validate card amount component is dispalyed on Gift card detail page 
	Given User launches the application 
	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP 
	And User sees Product title
	Then User sees card amount section

Examples:
	|product|
	|Happy_Birthday_Academy_Gift_Card|
	|Academy_Bulk_Gift_Card|
	

@Sprint04 @OMNI-29377  @TC-OMNI-29377_02 	 		
Scenario Outline: Validate user can select other card amount options from the available list
Given User launches the application 
	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP 
	And User sees Product title
	Then User see details and description
	Then User sees card amount section
	Then User tap on the card amount option as "$100"
	
	
Examples:
	|product|
	|Happy_Birthday_Academy_Gift_Card|
	|Academy_Bulk_Gift_Card|
	

@Sprint04 @OMNI-29377  @TC-OMNI-29377_03  @TestRun		
Scenario Outline: Validate user is able to enter the card amount in amount field when user tap on Other option
Given User launches the application 
	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP 
	And User sees Product title
	Then User see details and description
	Then User sees card amount section
	When User tap on the card amount option as "Other"
	Then User see the instruction message
	Then User see the Enter Amount field
	Then User see default amount value as preselected  card amount 
	
	Examples:
	|product|
	|Happy_Birthday_Academy_Gift_Card|
	|Academy_Bulk_Gift_Card|
	
	
@Sprint04 @OMNI-29377  @TC-OMNI-29377_04 	
Scenario Outline: Validate an error message when enter amount is more than $1500
Given User launches the application 
	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP 
	And User sees Product title
	Then User see details and description
	Then User sees card amount section
	When User tap on the card amount option as "Other"
	Then User see the instruction message
	Then User see the Enter Amount field
	Then User Enter an amount as "$2000"
	Then User see an error message as "Gift Card Amount should be between 1 and 1500"
	
	Examples:

	|product|
	|Happy_Birthday_Academy_Gift_Card|
	|Academy_Bulk_Gift_Card|
	
	

@Sprint04 @OMNI-29377  @TC-OMNI-29377_05 	
Scenario Outline: Validate the an erro message persist when user return back by tapping on other card amount option
Given User launches the application 
	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP 
	And User sees Product title
	Then User see details and description
	Then User sees card amount section
	When User tap on the card amount option as "Other"
	Then User see the instruction message
	Then User see the Enter Amount field
	Then User Enter an amount as "$2000"
	Then User see an error message as "Gift Card Amount should be between 1 and 1500"
	When User tap on the card amount option as "$100"
	When User tap on the card amount option as "Other"
	Then User see an error message as "Gift Card Amount should be between 1 and 1500"
	
	Examples:
	|product|
	|Happy_Birthday_Academy_Gift_Card|
	|Academy_Bulk_Gift_Card|
	

	
		
		
