Feature: Back in Stock Notifications on the PDP - Email


@Web  @C-PDP @Regression @KER-2334 @ZYP_PDP_K2334-3422 @CR-RKA @RBeta
Scenario: To verify BIS Notifications on the PDP - Single email notification
Given user launches the browser and navigates to "ASO_HOME" page
 When user enters "OutOfStockProduct" in the search box
 Then User select out of stock PDP   
 Then User verify and click on get notified  
 Then Verify customer is able to enter email after clicking on get notified    
          
               
  @Web  @C-PDP @Regression @KER-2334 @ZYP_PDP_K2334-3423 @CR-RKA @RBeta
Scenario:  To verify BIS Notifications on the PDP - Individual signup for each SKU
Given user launches the browser and navigates to "ASO_HOME" page
 When user enters "OutOfStockProduct" in the search box
 Then User select out of stock PDP   
 Then User verify and click on get notified  
 Then User verify get notified for other out of stock item in same PDP 
Then User verify and click on get notified            
               
               