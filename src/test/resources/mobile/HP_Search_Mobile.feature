Feature: Home Page Search

@MobileAutomationSmoke 
Scenario Outline: Mobile-Verify the Keyword search from home page 
Given user launches the browser and navigates to "ASO_HOME" page 
Then User to verify serch option box is available 
Then User to verify search for any requirement"<data>" 
Examples: 
	| data |
	| pant |
	
@MobileAutomationSmoke
Scenario: Verify SKU Search from Home Page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "productName" in the searchbox
    And user verifies the entered SKU id
