Feature: Home Page Grid Filter by Brandname

@MobileAutomationSmoke
Scenario: [Mobile]Verify the product in grid are sorted by Brandname 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "SearchForSort" in the searchbox 
	Then navigate to sort by and navigate to best selling 
	Then User clicks on the filter flyout 
	And user select the brand "brandName" 
	And User Click on apply filter button 
	
    