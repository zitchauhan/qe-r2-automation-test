Feature: To Verify the ASO customer should be able to see a Breadcrumb to easily navigate between pages 
 
@Regression @1HR @Mobile @All @KER-2339  @ZYP_KK2339-3366 @C-PDP
Scenario: Verify user is able to see a Breadcrumb to easily navigate between pages 
Given user launches the browser and navigates to "ASO_HOME" page
Then User navigates till PLP 
Then User click on the product image 
Then User click on the breadcrumb link for mobile 


@Regression @1HR @Mobile @All @KER-2339 @C-PDP  @ZYP_KK2339-9146 @CR-SG
Scenario: Verify user is able to see Academy as anchor in breadcrumb(ex. brands) 
Given user launches the browser and navigates to "ASO_HOME" page
 Then user enters required value in search box mobile and click on search
 Then user verify the search page breadcrumb in mobile


@Regression @1HR @Mobile @All @KER-2339 @C-PDP  @ZYP_KK2339-6686 @CR-SG
Scenario: Verify user is able to see breadcrumb for the subsequent store details page 
Given  user launches the browser and navigates to "ASO_HOME" page 
Then User click on burger menu
Then User click on the Find a Store button in burger menu
Then User is able to see Find a Store Modal 
Then User enter the pin code 
Then User click on search button 
And User should able to see the results 
Then User click on see details 
Then User matches the order of breadcrumb 

@Regression @1HR @Mobile @All @KER-2339 @C-PDP  @ZYP_KK2339-6676 @CR-SG
Scenario: Verify Breadcumb on L1
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L1
    Then User click on the breadcrumb last link
    
@Regression @1HR @Mobile @All @KER-2339 @C-PDP  @ZYP_KK2339-6677 @CR-SG
Scenario: Verify Breadcumb on L2
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L2
    Then User click on the breadcrumb last link
    
@Regression @1HR @Mobile @All @KER-2339 @C-PDP  @ZYP_KK2339-6681 @CR-SG
Scenario: Verify Breadcumb on L3
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then User navigates to L3
    Then User click on the breadcrumb last link
