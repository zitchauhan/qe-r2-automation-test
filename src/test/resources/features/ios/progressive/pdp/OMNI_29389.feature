Feature: Validate the Error messages when adding Gift card to cart
 @TC-OMNI-35037 @ST-29389
Scenario Outline: validate the gift card error message when enter the amount more than 10,000$
Given User launches the application 
    And User continues as "guest user" on onboarding page
When User Clicks On MaY Be Later
When User Clicks On MaY Be Later
    Then User sees the homepage
	#When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP 
	And User sees Product title
	Then User sees card amount section
	Then User tap on the card Amount option as "100"
	Then User see the instruction message
	Then User see the Enter Amount field
	Then User Enter an amount as "$20000"
	When User taps on add to cart button
	Then User sees the Alert Pop Up
	And user click on cancel button
	When User taps on add to cart button
	Then User sees the Alert Pop Up
	And user click on Open Live Chat 
	Then User sees the Open live chat URL
	
	Examples:

	|product|
	|Happy_Birthday_Academy_Gift_Card|
	|Academy_Bulk_Gift_Card|
	
@Sprint1 @TC-OMNI-35038 @ST-29389	
Scenario Outline: validate the error message when multiple Gift card has added
Given User launches the application 
	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP 
	And User sees Product title
	Then User sees card amount section
	Then User tap on the card amount option as "175$"
	Then User sees quantity stepper
	When User taps on increment quantity stepper
	Then Quantity is changed to "2"
	When User taps on increment quantity stepper
	Then Quantity is changed to "3"
	When User taps on increment quantity stepper
	Then Quantity is changed to "4"
	When User taps on increment quantity stepper
	Then Quantity is changed to "5"
	When User taps on increment quantity stepper
	Then Quantity is changed to "6"
	When User taps on add to cart button
	Then User sees the Alert Pop Up
	And user click on cancel button
	When User taps on add to cart button
	Then User sees the Alert Pop Up
	And user click on Open Live Chat 
	Then User sees the Open live chat URL
	Examples:
	|product|
	|Happy_Birthday_Academy_Gift_Card|
	|Academy_Bulk_Gift_Card|
	
 @TC-OMNI-35040 @ST-29389	
Scenario Outline: Validate the error message when the cart have some amount and user adding more amount on it
Given User launches the application 
	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP 
	And User sees Product title
	Then User sees card amount section
	Then User tap on the card amount option as "$100"
	Then User see the instruction message
	Then User see the Enter Amount field
	Then User Enter an amount as "$9000"
	When User taps on add to cart button
	And User click on continue shopping
	Then User see the Enter Amount field
	Then User Enter an amount as "$2000"
	When User taps on add to cart button
	Then User sees the Alert Pop Up
	And user click on cancel button
	When User taps on add to cart button
	Then User sees the Alert Pop Up
	And user click on Open Live Chat 
	Then User sees the Open live chat URL
	Examples:
	|product|
	|Happy_Birthday_Academy_Gift_Card|
	|Academy_Bulk_Gift_Card|
@Sprint1 @TC-OMNI-35041 @ST-29389	
Scenario Outline: Validate error message when user add quantity more than 50
 Given User launches the application 
	And User Goes to home page 
	When User Sees the Search Box 
	Then User clicks on the Search Box 
	And User search for the "<product>" 
	And I choose to navigate to PDP 
	And User sees Product title
	Then User sees card amount section
	Then User tap on the card amount option as "175$"
		 Then User sees quantity stepper
		When User sets qty to "51"
		Then Quantity is changed to "51"
		When User taps on increment quantity stepper
		Then Quantity is changed to "51"
		When User taps on add to cart button
	Then User sees the Alert Pop Up
	And user click on cancel button
	When User taps on add to cart button
	Then User sees the Alert Pop Up
	And user sees the Bulk gift card button
	And user click on cancel button
	Examples:
	|product|
	|Happy_Birthday_Academy_Gift_Card|
	|Academy_Bulk_Gift_Card|
	

	
	
	
	
	
	