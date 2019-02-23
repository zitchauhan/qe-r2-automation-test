Feature: To Verify the Add To Cart Functionality
          
@Regression @Sanitys @Mobile @All @KER-1961 @C-PLP  @ZYP_PLP_K1961-9261 @CR-SG @RBeta
Scenario: Verify user is able to see previous page as anchor in breadcrumb(ex. brands) 
Given  user launches the browser and navigates to "ASO_HOME" page 
Then User click on burger menu
Then User click on the brand tab 
Then User click on the nike name
And User verify that brandcrumb is previous page
Then User check for breadcrumb clickable
And User verify the title
            
           