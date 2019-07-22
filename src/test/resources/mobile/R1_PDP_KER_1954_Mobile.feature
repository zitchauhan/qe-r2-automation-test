Feature:  [Mobile]Components: PDP - Ratings & Reviews

   @Regression @Mobile @All @KER-1954 @C-PDP @ZYP_PDP_K1954-4138 @CR-RKA @1HR
   Scenario: To verify user is able to view Product details with No Reviews
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
  Then User to navigate to review  
    Then User to verify Be the first to review this product       
   
    @Regression @Mobile @All @KER-1954 @C-PDP @ZYP_PDP_K1954-4140 @CR-RKA
    Scenario: To verify user is able to write Reviews
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
  Then User to navigate to review  
    Then User to verify Be the first to review this product       
    Then User to click on be the first to review and write review 
    
    
    
    @Regression @Mobile @All @KER-1954 @C-PDP @ZYP_PDP_K1954-4141 @CR-RKA
    Scenario: To verify user is able to write Reviews
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
   Then User to select the product where review is present  
    Then User to navigate to review
    Then User be able to write review     
    
     @Regression @Mobile @All @KER-1954 @C-PDP @ZYP_PDP_K1954-3992 @CR-RKA @1HR
   Scenario:  To verify user is able to view Product details with Reviews 
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
   Then User to select the product where review is present  
    Then User to navigate to review
    Then User be able to write review     
    Then User to be able to sort review  
   Then User go for pagination 
   