#Feature: Validate PDP page for regular and Bulk Gift cards  
   
 #   @Web @PDPFaceLift @CR-Anirudh 
#Scenario: Verify that Product Title, Rating & Review summary & Product image displayed regular GC
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User searches a product "SKUForGiftCard" and navigates to PDP
#	And user sets up cookie
 #   Then user navigates to new pdp page url "SKUForGiftCard"
  #  And user verifies star rating is present
#    Then user verifies title present
#    And user verifies product Image
    
 #   @Web @PDPFaceLift @CR-Anirudh 
#Scenario: Verify that Product Title, Rating & Review summary & Product image displayed bulk GC
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User searches a product "SKUForBulkGiftCard" and navigates to PDP
#	And user sets up cookie
 #   Then user navigates to new pdp page url "SKUForBulkGiftCard"
  #  And user verifies star rating is present
 #   Then user verifies title present
 #   And user verifies product Image
    
     
 #      @Web @PDPFaceLift @CR-Anirudh 
#Scenario: Verify that Product price is not displayed for regular git card
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User searches a product "SKUForGiftCard" and navigates to PDP
#	And user sets up cookie
 #   Then user navigates to new pdp page url "SKUForGiftCard"
 #   And verify user is able to verify color attribute present
 #   And user verifies product price is not available for GC
    
    
 #     @Web @PDPFaceLift @CR-Anirudh 
#Scenario: Verify that Product price is not displayed for gulk git card
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User searches a product "SKUForBulkGiftCard" and navigates to PDP
#	And user sets up cookie
 #   Then user navigates to new pdp page url "SKUForBulkGiftCard"
 #   And verify user is able to verify color attribute present
 #   And user verifies product price is not available for GC
    
  
#     @Web @PDPFaceLift @CR-Anirudh 
#Scenario: Verify max quantity msg with link for BULK GC is displayed for regular GC  
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User searches a product "SKUForGiftCard" and navigates to PDP
#   Then user navigates to new pdp page url "SKUForGiftCard"
 #   And user verifies max quantity msg and link to bulk GC present

    
#     @Web @PDPFaceLift @CR-Anirudh 
#Scenario: Verify max quantity msg with link for BULK GC is displayed for regular GC  
#	Given user launches the browser and navigates to "ASO_HOME" page
#	And User searches a product "SKUForBulkGiftCard" and navigates to PDP 
#	And user sets up cookie
 #  	Then user navigates to new pdp page url "SKUForBulkGiftCard"
#    And user verifies min quantity msg and link to regular GC present
    
#      @Web @PDPFaceLift @CR-Anirudh
#Scenario: Verify that GC has premade card amount
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User searches a product "SKUForGiftCard" and navigates to PDP
#	And user sets up cookie
 #   Then user navigates to new pdp page url "SKUForGiftCard"
  #  And user verifies can select premade card amount 
 #   And User searches a product "SKUForBulkGiftCard" and navigates to PDP
 #   And user verifies can select premade card amount
    
    
 #    @Web @PDPFaceLift @CR-Anirudh  
#Scenario: Verify error message when user inputs quantity more than expected
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User searches a product "SKUForGiftCard" and navigates to PDP
#	And user sets up cookie
 #   Then user navigates to new pdp page url "SKUForGiftCard"
 #   Then user Inputs quatity "GC_moreThanMaxQty" and verifies error message
    
    
 #   @Web @PDPFaceLift @CR-Anirudh  
#Scenario: Verify error message when user inputs quantity less than expected
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User searches a product "SKUForBulkGiftCard" and navigates to PDP
#	And user sets up cookie
 #   And User searches a product "SKUForBulkGiftCard" and navigates to PDP
#    Then user Inputs quatity "GC_lessThanMinQty" and verifies error message
    
      
#      @Web @PDPFaceLift @CR-Anirudh 
#Scenario: Verify that user can input custom amount
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User searches a product "SKUForGiftCard" and navigates to PDP
#	And user sets up cookie
 #   Then user navigates to new pdp page url "SKUForGiftCard"
  #  And user verifies can enter custom amount "custom_GC_amt" on clicking custom amt button  
#    And User searches a product "SKUForBulkGiftCard" and navigates to PDP
 #   And user verifies can enter custom amount "custom_GC_amt" on clicking custom amt button  
    
#     @Web @PDPFaceLift @CR-Anirudh 
#Scenario: Verify default quantity for bulk GC
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	 And User searches a product "SKUForBulkGiftCard" and navigates to PDP
#	And user sets up cookie
#	Then user navigates to new pdp page url "SKUForBulkGiftCard"
 #   And user verifies default quantity for Bulk GC  
	   