Feature: Home Page Category Pages

 
@Dev
Scenario: Navigate to L1 Category Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne page 
	Then scroll down and verfiy Featured Categories "L1"
	
@Dev
Scenario: Navigate to L2 Category Page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L2 from home page 
	Then scroll down and verfiy Featured Categories "L2"
	
@Dev
Scenario: Navigate to L3 Category Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 from home page 
	Then scroll down and verfiy Featured Categories "L3"
	
    