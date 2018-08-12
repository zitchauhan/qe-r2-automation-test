Feature:  [Mobile] Components: PDP - Detailed Product Content - Reviews - Name Flyout



                        
                        
@Regression @Mobile @All @KER-1950 @C-PDP @ZYP_PDP_K1950-4207 @CR-RKA   @1HR
 Scenario: Verify when user hovered over the name displayed in Reviews section, the name flyout is displayed 
 Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
   Then User to select the product where review is present  
    Then User to navigate to review
      Then user do mousehover on review having name
  
 
 @Regression @Mobile @All @KER-1950 @C-PDP @ZYP_PDP_K1950-4139 @CR-RKA    @1HR
 Scenario: To verify user is able to view Product details with No Reviews 
   Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
  Then User to navigate to review  
    Then User to verify Be the first to review this product       
   
 
 