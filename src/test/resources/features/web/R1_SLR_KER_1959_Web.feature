Feature: Components: Results section Title - SRP & Null SRP 

@C-SLR @Web @All @Regression @KER-1959 @ZYP_SLR_K1959-4217 @Rerun @1HR @CR-AG 
Scenario: To verify display of zero search result message on Null Search Results page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to see Search Box on Homepage 
	Then User enter the invalid SKU search "<data>" 
	And User click on search icon 
	
@C-SLR @Web @All @Regression @KER-1959 @ZYP_SLR_K1959-4295 @Rerun @1HR @CR-AG @RegressionP4 @TC-OMNI-12566
Scenario: [SOLR] - To verify display of null search result message on Search Results page when product is not available 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to see Search Box on Homepage 
	Then User enter the invalid SKU search "<data>" 
	And User click on search icon 
