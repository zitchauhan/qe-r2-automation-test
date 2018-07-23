Feature: To Verify the ASO customer should be able to see a Breadcrumb to easily navigate between pages
 
@Regression @Sanity @Web @All @KER-2339 @ZYP-3365
Scenario: Verify user is able to see a Breadcrumb to easily navigate between pages
   Given  user launches the browser and navigates to "ASO_HOME" page
   Then User navigates till PLP
    Then User click on the product image
    Then User verify the last breadcrumb in the series should not be an active link
    Then User click on the breadcrumb last link
    And User verify the last breadcrumb in the series should not be an active link for last link
Then User click on the breadcrumb last second link
    And User verify the last breadcrumb in the series should not be an active link for second link
    
    @Regression @Sanity @Web @All @KER-2339
Scenario: Verify user is able to see Academy as anchor for all breadcrumbs(ex. brands)
   Given  user launches the browser and navigates to "ASO_HOME" page
    Then User click on the Shop tab
    Then User click on the brand btn
    Then User click on the nike name
    And User verify that anchor is academy in breadcrumb
 
      @Regression @Sanity @Web @All @KER-2339
Scenario: Verify user is able to see Academy as anchor for all breadcrumbs
   Given  user launches the browser and navigates to "ASO_HOME" page
    Then User click on the Find a Store button
    Then User is able to see Find a Store Modal
    Then User enter the pin code
    Then User click on search button
    And User should able to see the results
    Then User click on see details
    Then User matches the order of breadcrumb
    
#  #We have write the step definition   
#  @Regression @Sanity @Web @All @KER-1961 @ZYP-3365  
#  Scenario: Verify user should be able to see breadcrumb for store Locator landing page
#   Given  user launches the browser and navigates to "ASO_HOME" page
#Then User navigates till PLP
#    Then User click on the product image
#    Then User click on the breadcrumb link
#    
#    
#    #We have write the step definition   
#  @Regression @Sanity @Web @All @KER-1961 @ZYP-3365  
#  Scenario: Verify should be able to see breadcrumb for Search as: Academy> search -search term used
#   Given  user launches the browser and navigates to "ASO_HOME" page
#		Then User navigates till PLP
#    Then User click on the product image
#    Then User click on the breadcrumb link