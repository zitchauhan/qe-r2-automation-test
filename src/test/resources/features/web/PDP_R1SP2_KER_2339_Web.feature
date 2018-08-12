Feature: To Verify the ASO customer should be able to see a Breadcrumb to easily navigate between pages 

@Regression @Sanity @Web @All @KER-2339  @ZYP_PDP_K2339-3365 @C-PDP @CR-SG @1HR
Scenario: Verify user is able to see a Breadcrumb to easily navigate between pages 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP 
	Then User click on the product image 
	Then User verify the last breadcrumb in the series should not be an active link 
	Then User click on the breadcrumb last link 
	And User verify the last breadcrumb in the series should not be an active link for last link 
	Then User click on the breadcrumb last second link 
	And User verify the last breadcrumb in the series should not be an active link for second link 

@Regression @Sanity @Web @All @KER-2339 @C-PDP  @ZYP_PDP_K2339-9097 @CR-SG
Scenario: Verify user is able to see Academy as anchor for all breadcrumbs(ex. brands) 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	Then User click on the Shop tab 
	Then User click on the brand btn 
	Then User click on the nike name 
	And User verify that anchor is academy in breadcrumb 

@Regression @Sanity @Web @All @KER-2339 @C-PDP  @ZYP_PDP_K2339-9098 @CR-SG @ZYP_PDP_K1921-3432
Scenario: Verify user is able to see breadcrumb for the subsequent store details page 
	Given  user launches the browser and navigates to "ASO_HOME" page 
	Then User click on the Find a Store button 
	Then User is able to see Find a Store Modal 
	Then User enter the pin code 
	Then User click on search button 
	And User should able to see the results 
	Then User click on see details 
	Then User matches the order of breadcrumb 
	
@Regression @Sanity @Web @All @KER-2339 @C-PDP  @ZYP_PDP_K2339-6685 @CR-SG
Scenario: Verify should be able to see breadcrumb from Search as: Academy> search -search term used-Desktop 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User enters required value in search box to navigate to search Results page 
	Then user verify the search page breadcrumb 
	
@Regression @Sanity @Web @All @KER-2339 @C-PDP  @ZYP_PDP_K2339-6675 @CR-SG
Scenario: [UI]-Verify the breadcrumb on L1 page-Desktop 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L1 
	Then User verify the last breadcrumb in the series should not be an active link 
	Then User click on the breadcrumb last link 
	
	
@Regression @Sanity @Web @All @KER-2339 @C-PDP  @ZYP_PDP_K2339-6678 @CR-SG
Scenario: [UI]-Verify the breadcrumb on L2 page-Desktop 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates to L2 
	Then User verify the last breadcrumb in the series should not be an active link 
	Then User click on the breadcrumb last link 
	
@Regression @Sanity @Web @All @KER-2339 @C-PDP  @ZYP_PDP_K2339-6679 @CR-SG
Scenario: [UI]-Verify the breadcrumb on L3 page-Desktop 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP 
	Then User verify the last breadcrumb in the series should not be an active link 
	Then User click on the breadcrumb last link 
	
@Regression @Sanity @Web @All @KER-2339 @C-PDP  @ZYP_PDP_K2339-6683 @CR-SG
Scenario: [UI]- Verify user should be able to see breadcrumb from store Locator landing page-Desktop 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then user navigates to Store locator from the footer 
    
    @Regression @Sanity @Web @All @KER-2339 @C-PDP  @ZYP_PDP_K2339-6684 @CR-SG
Scenario: [UI]-Verify user should be able to see breadcrumb from store Locator landing page
 Given user launches the browser and navigates to "ASO_HOME" page
    Then user click on find a store in footer
    Then user verify the breadcrub in store locator page
