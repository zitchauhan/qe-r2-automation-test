Feature: PDP - Delivery Options - Availability & Messaging - SOF

	@Sprint05 @OMNI-31084 @TC-OMNI-35814
    Scenario: Validate that user gete Free store pick up heading and store details on SOF PDP when item is available 
  	Given User launches the application
  	When User Clicks On MaY Be Later
    And User continues as guest user
 Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    # will use any sku which is available for store pickup 
    And User search for the "115481781"
    #Then User sees all products related to search Keyword  
    And I choose to navigate to PDP 
    #Then i Choose to validate that "Store Delivery Heading" Shown on PDP under Store Section
     Then i Choose to validate that "Avalability Geeen" Shown on PDP under Store Section
     #Then i Choose to validate that "OOS red label" Shown on PDP under Store Section
     #Then i Choose to validate that "Not Available" Shown on PDP under Store Section
    Then i Choose to validate that "Free Store pickup Heading" Shown on PDP under Store Section
      #Then i Choose to validate that "Find Availability on other Store CTA" Shown on PDP under Store Section
      Then i Choose to validate that "Store address " Shown on PDP under Store Section
      Then i Choose to validate that "Store phone" Shown on PDP under Store Section
      Then i Choose to validate that "Store timing" Shown on PDP under Store Section
      #Then i Choose to validate that "Notify me when available label" Shown on PDP under Store Section
      Then i Choose to validate that "Select A Store button" Shown on PDP under Store Section
      Then i Choose to validate that "Change Store button" Shown on PDP under Store Section
      
      
      @Sprint05 @OMNI-31084 @TC-OMNI-35816
    Scenario: Validate that user gete store delivry heading and availability message when item is available 
    Given User launches the application
  	When User Clicks On MaY Be Later
    And User continues as guest user
 Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    # will use any sku which is available for store delivery
    And User search for the "115481781"
    #Then User sees all products related to search Keyword  
    And I choose to navigate to PDP
    Then i Choose to validate that "Store Delivery Heading" Shown on PDP under Store Section
     Then i Choose to validate that "Avalability Geeen" Shown on PDP under Store Section
     Then i Choose to validate that "Store address " Shown on PDP under Store Section
      Then i Choose to validate that "Store phone" Shown on PDP under Store Section
      Then i Choose to validate that "Store timing" Shown on PDP under Store Section
      Then i Choose to validate that "Select A Store button" Shown on PDP under Store Section
      Then i Choose to validate that "Change Store button" Shown on PDP under Store Section
      
      @Sprint05 @OMNI-31084 @TC-OMNI-35818
    Scenario: Validate that user gete OOS message is displayed when Item is not available for Store delivery
    Given User launches the application
  	When User Clicks On MaY Be Later
    And User continues as guest user
 Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    # will use any sku which is oos for store delivery
    And User search for the "115481781"
    #Then User sees all products related to search Keyword  
    And I choose to navigate to PDP
    Then i Choose to validate that "Store Delivery Heading" Shown on PDP under Store Section
    Then i Choose to validate that "OOS red label" Shown on PDP under Store Section
     Then i Choose to validate that "Find Availability on other Store CTA" Shown on PDP under Store Section
     #Then i Choose to validate that "Avalability Geeen" Shown on PDP under Store Section
     Then i Choose to validate that "Store address " Shown on PDP under Store Section
      Then i Choose to validate that "Store phone" Shown on PDP under Store Section
      Then i Choose to validate that "Store timing" Shown on PDP under Store Section
      Then i Choose to validate that "Select A Store button" Shown on PDP under Store Section
      Then i Choose to validate that "Change Store button" Shown on PDP under Store Section
      