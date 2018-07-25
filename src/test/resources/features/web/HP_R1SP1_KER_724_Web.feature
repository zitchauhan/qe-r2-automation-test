Feature: To Verify the presence of "Search Box" in the Global Header 

@HP @Web @Regression @KER-724 @ZYP-8430
Scenario: Verify presence of search box with search icon on Home page. 
Given user launches the browser and navigates to "ASO_HOME" page 
Then User should be able to see Search Box
  
@HP @Web @Regression @KER-724 @ZYP-8431
Scenario: Verify presence of search box with search icon on L1 page. 
Given user launches the browser and navigates to "ASO_HOME" page
Then navigates to LOne page
Then User should be able to see Search Box   

 @HP @Web @Regression @KER-724	@ZYP-8433
Scenario: Verify presence of search box with search icon on L2 page. 
 Given user launches the browser and navigates to "ASO_HOME" page
Then navigates to LTwo page
Then User should be able to see Search Box  

 @HP @Web @Regression @KER-724 @ZYP-1975	
Scenario: Verify presence of search box with search icon on L3 page. 
Given user launches the browser and navigates to "ASO_HOME" page
Then navigates to LThree page
Then User should be able to see Search Box
Then verfiy PDP page is display  

 