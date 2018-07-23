Feature: To Verify the ASO customer should be able to see a Breadcrumb to easily navigate between pages 
 
@Regression @Sanitys @Mobile @All @KER-2339 @ZYP-3366 
Scenario:
Verify user is able to see a Breadcrumb to easily navigate between pages 
Given  user launches the browser and navigates to "ASO_HOME" page
Then User navigates till PLP 
Then User click on the product image 
Then User click on the breadcrumb link for mobile 


@Regression @Sanitys @Mobile @All @KER-2339
Scenario:
Verify user is able to see Academy as anchor for all breadcrumbs(ex. brands) 
Given  user launches the browser and navigates to "ASO_HOME" page 
Then User click on burger menu
Then User click on the brand tab 
Then User click on the nike name
And User verify that brandcrumb is previous page
Then User check for breadcrumb clickable
And User verify the title


@Regression @Sanitys @Mobile @All @KER-2339 
Scenario: Verify user is able to see Academy as anchor for all breadcrumbs 
Given  user launches the browser and navigates to "ASO_HOME" page 
Then User click on burger menu
Then User click on the Find a Store button in burger menu
Then User is able to see Find a Store Modal 
Then User enter the pin code 
Then User click on search button 
And User should able to see the results 
Then User click on see details 
Then User matches the order of breadcrumb 



#    #We have write the step definition   
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
#Then User navigates till PLP
#    Then User click on the product image
#    Then User click on the breadcrumb link
 
