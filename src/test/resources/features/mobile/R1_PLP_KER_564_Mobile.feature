Feature: Faceted Navigation - Refresh products whenever the filters values changed


 @Mobile @Regression @KER-564  @ZYP_PLP_K564-5543 @C-PLP @CR-RKA
Scenario: Verify Faceted Navigation - Refresh products whenever the filters values changed for Desktop
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu 
	Then User navigates to L2 from home page for shoe catagory 
	Then User clicks on the filter flyout 
	And User expands all Filter Options 
	Then User select the brand facet product from L3 
	Then User veriy brand facet 
	Then User clicks on the burger menu 
	Then User clicks on the filter flyout 
	And User expands all Filter Options 
	Then User Verify color facet 
	Then User clicks on the burger menu 
	Then User Verify Pagination of page 
	Then User clicks on ASO logo 
	When user enters "productName" in the search box 
	Then User clicks on the filter flyout 
	And User expands all Filter Options 
	Then User select the brand facet product from L3 
	Then User veriy brand facet 
	Then User clicks on the burger menu 
	Then User clicks on ASO logo 
	When user enters "productName" in the search box 
	Then User clicks on the filter flyout 
	And User expands all Filter Options 
	Then User Verify color facet 
	Then User clicks on the burger menu 
	Then User clicks on ASO logo 
	When user enters "productName" in the search box 
	Then User Verify Pagination of page 
	
    
    