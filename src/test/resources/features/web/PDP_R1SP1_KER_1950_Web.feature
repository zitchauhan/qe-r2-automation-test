Feature:  [Web] Components: PDP - Detailed Product Content - Reviews - Name Flyout

 @Regression @Web @All @KER-1950 @C-PDP @ZYP_PDP_K1950-4179 @CR-RKA
   Scenario:  Verify when user hovered over the name displayed in Reviews section, the name flyout is displayed 
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
     Then user verify detail and specs tab and its content is displayed      
     When user clicks on Reviews tab
     Then user do mousehover on review having name  
                           
 