Feature:  Inventory and Availability Display
#@C-PDP @Web @Regression @KER-1929 @ZYP_HP_K1929-4317 
#Scenario: To verify Find a Store CTA for LSI message Sold in Stores- Desktop 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then user navigates to PLP of any product
#    Then user clicks on the product card and navigates to PDP of the product
#	And user verify the inventory message "Sold in Store"
#	And below inventory message user see find a store option
#	Then user click on find a store option available on pdp below inventory message
#	Then User is able to see Find a Store Modal


#@C-PDP @Web @Regression @KER-1929 @ZYP_HP_K1929-4317 @RS
#Scenario: To verify Find a Store CTA for LSI message Sold in Stores- Desktop 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then user navigates to PLP of any product
#    Then user clicks on the product card and navigates to PDP of the product
#	And user verify the inventory message "Ships to Store"
#	And below inventory message user see find a store option
#	Then user click on find a store option available on pdp below inventory message
#	Then User is able to see Find a Store Modal
#	

@C-PDP @Web @Regression @KER-1929 @ZYP_HP_K1929-4317 
Scenario: To verify Find a Store CTA for LSI message Sold in Stores- Desktop 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "ShipsToStore" in the search box plcc 
	And user click on search icon 
	And user verify the inventory message "Ships to Store"
	And below inventory message user see find a store option
	Then user click on find a store option available on pdp below inventory message
	Then User is able to see Find a Store Modal

	
	
#@C-PDP @Web @Regression @KER-1929 @ZYP_HP_K1929-4318 
#Scenario: To verify Find a Store CTA for LSI message Limited Stock- Desktop
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then user navigates to PLP of any product 
#	Then user clicks on the product card and navigates to PDP of the product 
#	When clicks on the Select Store link in the header
#	When User select store with "Limited_Stock"
#	And user verify the inventory message "Limited Stock!"
#	And user verify the timing is displayed for store
#	And user verify the "more stores" option is displayed

@C-PDP @Web @Regression @KER-1929 @ZYP_HP_K1929-4318 @RS 
Scenario: To verify Find a Store CTA for LSI message Limited Stock- Desktop
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "Limited_Stock" in the search box plcc 
	And user click on search icon 
#	When clicks on the Select Store link in the header
#	When User select store with "Limited_Stock"
	And user verify the limited Stock message
#	And user verify the timing is displayed for store
#	And user verify the "more stores" option is displayed
	
	
@C-PDP @Web @Regression @KER-1929 @ZYP_HP_K1929-4319
Scenario:  To verify Find a Store CTA for LSI message Not Sold in Stores- Desktop
	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user enters "Not_Sold_in_Store" in the searchbox
	When user enters "Not_Sold_in_Store" in the search box plcc
	And user click on search icon
	And user verify the inventory message "Not Sold In Stores"
	
#@C-PDP @Web @Regression @KER-1929 @ZYP_HP_K1929-4297 
#Scenario: To verify Find a Store CTA for LSI message Available Today- Desktop
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	Then user navigates to PLP of any product 
#	Then user clicks on the product card and navigates to PDP of the product 
#	When clicks on the Select Store link in the header
#	When User select store with "Available_Today"
#	And user verify the inventory message "Available Today"
#	And user verify the timing is displayed for store
#	And user verify the "more stores" option is displayed
	
	
