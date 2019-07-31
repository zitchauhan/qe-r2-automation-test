Feature: Home Page Search Category & Grid

@Dev 
Scenario Outline: From Home Page perform Keyword and SKU Search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the SKU search "<data>"
    And User click on search icon
    And user should be able to see PDP mention in the current url
    And user verifies the entered SKU id
    Then User closes the web application
    Examples:
    |data|
    |112766238|
    |nike mens compression|
    

@Dev
Scenario: Navigate to L1 Category Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne page 
	Then scroll down and verfiy Featured Categories 
	
 @Regression @Web @All @C-PLP @KER-5271 @ZYP_PLP_K5271-6391 @CR-AKK @Dev
Scenario: Navigate to L2 Category Page
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L2 from home page 
	Then scroll down and verfiy Featured Categories 
	
 @Regression @Web @All @C-PLP @KER-5271 @ZYP_PLP_K5271-6392 @CR-AKK @Dev
Scenario: Navigate to L3 Category Page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L3 from home page 
	Then scroll down and verfiy Featured Categories 
	
@Web @Regression @KER-710 @ZYP_HP_K710-3656 @C-HP @CR-SG @Dev1
Scenario: Filter products in grid by Brand Name  
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "SearchForSort" in the searchbox 
	Then navigate to sort by and navigate to best selling 
	And user select the brand "brandName" 	
    