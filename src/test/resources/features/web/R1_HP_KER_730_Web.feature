Feature: To Verify the functionality of Find a Store link in the global header

@Web @All @C-HP @Regression @KER-730 @ZYP_HP_K730-2817 
Scenario: As a User when clicked on Find a Store then user should be navigated to Store Locator Modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	Then User closes the web application 
	
@Web @All @C-HP @Regression @KER-730 @ZYP_HP_K730-2848
Scenario: As a user, if I'm selecting a particular Store, then I should see that store as My Store
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "Postal_Code" 
	When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
	
@Web @All @C-HP @Regression @KER-730 @ZYP_HP_K730-2711 @1HR 
Scenario: As a user, if I have a saved/selected store, it should be displayed in the header in place of the Find a Store link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "Postal_Code" 
	Then User should be able to see Selected_Store in the place of Find a Store link 
	Then User closes the web application 
	
@Web @All @C-HP @Regression @KER-730 @ZYP_HP_K730-2820 
Scenario: As a user, if I have a saved/city store, it should be displayed in the header in place of the Find a Store link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	When User select store with "City" 
	Then User should be able to see Selected_Store in the place of Find a Store link 
	Then User closes the web application 
	
	
@Web @All @C-HP @Regression @KER-730 @ZYP_HP_K730-7952 
Scenario: As a user, if I have a saved/state store, it should be displayed in the header in place of the Find a Store link 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	When User select store with "State" 
	Then User should be able to see Selected_Store in the place of Find a Store link 
	Then User closes the web application 
	
	
@Web @All @C-HP @Regression @KER-730 @ZYP_HP_K730-2818 @1HR 
Scenario: As a user, if I have enterted a special character to search a store, I should see correct messages 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	Then User enters "special_character" in Store Locator Modal 
	Then error message should be displayed 
	Then User closes the web application 
	
	
	
@Web @All @C-HP @Regression @KER-730 @ZYP_HP_K730-2819 
Scenario: As a user, if I have enterted a space to serach a store, I should see Zero stores message 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	When User enters space in Store Locator Modal 
	Then error message should be displayed 
	Then User closes the web application 
	
