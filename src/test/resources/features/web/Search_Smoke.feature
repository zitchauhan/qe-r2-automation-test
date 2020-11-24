Feature: Perform Search smoke test

  @RegressionP2  @TC-OMNI-12567
  Scenario Outline: Verify Search for cloth search items 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to view Search Box on Homepage 
	Then User enter the "<data>" text for search
	And User click on the search icon
	And User expands category Filter and Select option
	And User expands PRICE Filter and Select Option
	Then User should be able to sort by brand A to Z 

  Examples:	
	|data|
  |men cloths|
    
  @RegressionP2   @TC-OMNI-12568
  Scenario Outline: Verify Search for bundle search items 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to view Search Box on Homepage 
	Then User enter the "<data>" text for search
	And User click on the search icon
	And User expands category Filter and Select option
	Then navigate to sort by and navigate to best selling 

  Examples:	
	|data|
  |Bundle|
    
 
 