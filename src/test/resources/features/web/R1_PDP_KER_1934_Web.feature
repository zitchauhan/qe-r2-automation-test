Feature: To Verify the Alternative Color Views on PLP 


@Regression @Web @All @C-PDP @KER-1934 @ZYP_PDP_K1934-3788 @CR-RKA 
Scenario: Product Defining Attributes and Selection 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to PLP of any product 
	
@Regression @Web @All @C-PDP @KER-1934 @ZYP_PDP_K1934-3974 @CR-RKA 
Scenario: Validate the Clearance section in PDP page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to PLP of any product 
	Then Navigate to PLP and select one product with clearance 
	
@Regression @Web @All @C-PDP @KER-1934 @ZYP_PDP_K1934-4035 @CR-RKA 
Scenario: Validate to view inventory availability visually in PDP page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user navigates to PLP of any product 
	Then User select the product from PDP page 
	Then user check the SKU for availabe or non available item 