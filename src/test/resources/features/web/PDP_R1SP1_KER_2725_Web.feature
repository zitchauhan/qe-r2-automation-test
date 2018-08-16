Feature: To verify Components: PDP - Product Details

 @C-PDP @Web @Regression @KER-2725 @ZYP_PDP_K2725-3412 @C-HP @CR-RKA @1HR
   Scenario: To verify user is able to view the Product Details on PDP
   Given user launches the browser and navigates to "ASO_HOME" page
   Then user click on cta in Shop Collection
 
   Then Verify the Promotional Eyebrow appears above the Product Name
   Then Navigate to PLP and select one product with clearance
   And  Verify Product Name is avilaible
   And Verify Product Price is available 
   Then Verify review star is displayed
   Then Verify review Link is available and clickable   
#   And Verify Promotional Messaging displayed for the selected product

   
    
   
   