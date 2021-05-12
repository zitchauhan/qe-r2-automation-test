Feature: PD - Gift Card - ATC Enable/Disable + OOS

  @Sprint06 @ST-OMNI-29409
  Scenario Outline: : Varify PD Gift Cards / eGift Cards are out of Stock
    Given User launches the application
    When User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
   #When User Sees the Search Box
   # Then User clicks on the Search Box
    And User Search for the "<product>"
    And I choose to navigate to PDP
    When inventory is not available
    Then Verify display Out of Stock as per design

    Examples: 
      | product   |
      | eGiftCard |
      | gitcard   |

#
#Feature: Verify product detail for FireArms/Ammunitions and be redirected to the appropriate .com page
#
  #	@Sprint01 @TC-OMNI-2
    #Scenario Outline:: validate PDP for FireArms/Ammunitions
  #	Given User launches the application
  #	When User Clicks On MaY Be Later
    #And User continues as guest user
 #   Then User sees the homepage
    #When User Sees the Search Box
    #Then User clicks on the Search Box
    #And User search for the "<product>"
#   Then User sees all products related to search Keyword  
    #And I choose to navigate to PDP 
    #Then I choose to verify "App_store_guidelines" in PDP Page
   # Then User scrolls down to the bottom
    #Then User scrolls down to the bottom in "6" swipe
    #Then I choose to verify "important_Product_and_Safety_Information" in PDP Page
    #And I choose click on "Purchase on Button" in PDP page
    #Then I choose to verify user navigated to PDP on Web
 #Examples: 
     #|    product            |	
     #|    eGiftCard          | 
   # |    ammunitionProd     | 
 #
      