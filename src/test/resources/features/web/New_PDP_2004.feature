Feature:  PDP Quantity Component


@KER-2004 @ZYP_PDP_K2004-01 @CR-MJR @NewPDP 
Scenario:  Verify the Display of Qty box with text box, + and - symbols
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user sets up Cookie
	Then user navigates to new PDP page URL "SKUForBopisProduct"
	And user is able to see quantity attribute

@KER-2004 @ZYP_PDP_K2004-02 @CR-MJR @NewPDP 
Scenario:  Verify that the user is able to increase and decrease qty by clicking + and -
	Given user launches the browser and navigates to "ASO_HOME" page  
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user sets up Cookie
	Then user navigates to new PDP page URL "SKUForBopisProduct"
	Then user increase the quantity of item in PDP
	user should be able to see the increased quantity
	Then user decrease the quantity of item in PDP
	user should be able to see the decreased quantity
	 
@KER-2004 @ZYP_PDP_K2004-02 @CR-MJR @NewPDP
Scenario:  Verify the Validation of grayed out - when qty is set as 1
 	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user sets up Cookie
	Then user navigates to new PDP page URL "SKUForBopisProduct"
	And user change the quantity of item to "1" in PDP
	And user validate "-" is disabled in PDP
	
@KER-2004 @ZYP_PDP_K2004-02 @CR-MJR @NewPDP
Scenario:  Verify the Validation of grayed out + when qty is set as 999
 	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user sets up Cookie
	Then user navigates to new PDP page URL "SKUForBopisProduct"
	And user change the quantity of item to "999" in PDP
	And user validate "+" is disabled in PDP	
		
@KER-2004 @ZYP_PDP_K2004-02 @CR-MJR @NewPDP	 
Scenario:  Verify if Qty box accepts texts and Special characters
 	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user sets up Cookie
	Then user navigates to new PDP page URL "SKUForBopisProduct"
	And user validate if qty box accepts "texts and special chars"
		
@KER-2004 @ZYP_PDP_K2004-02 @CR-MJR @NewPDP	 
Scenario: Verify if the user able to enter more than restricted qty
 	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP
	And user sets up Cookie
	Then user navigates to new PDP page URL "SKUForBopisProduct"
	And user validate if qty box accepts "restricted qty" 