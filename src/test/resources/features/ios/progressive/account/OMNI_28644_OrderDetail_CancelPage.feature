Feature: Validate Adress book placeholder in Account screen

  @ST-OMNI-28644 @TC-OMNI-28644_01 
 Scenario: As an ASO Mobile App user,
  I want to see the Cancel order button on order detail page
    Given User launches the application
    And User Logs into the application
    And User taps on account in bottom nav
    When User taps on Order button
    Then User sees Order page with order list 
    When User taps on OrderId
    Then User sees order detail page
    Then User sees CancelOrder Button with chevron
    
    
    
    
    
    @ST-OMNI-28644 @TC-OMNI-28644_02 
 Scenario: As an ASO Mobile App user,
  I want to see cancel order alert confirmation screen with message is  displayed when I tap on the cancel Order button
    Given User launches the application
    And User Logs into the application
    And User taps on account in bottom nav
    When User taps on Order button
    Then User sees Order page with order list 
    When User taps on OrderId
    Then User sees order detail page
    When User taps on cancel Order button
    Then User sees the alert confirmation screen 
    Then User sees the alert message as "This action cannot be undone."
    Then User sees Yes button on alert confrimation screen
    Then User sees No button on alert confirmation screen
    
    
      @ST-OMNI-28644 @TC-OMNI-28644_03 
 Scenario: As an ASO Mobile App user,
  I want to confirm that order has been cancelled when i tap on  Yes button from alert confirmation screen
    Given User launches the application
    And User Logs into the application
    And User taps on account in bottom nav
    When User taps on Order button
    Then User sees Order page with order list 
    When User taps on OrderId
    Then User sees order detail page
    When User taps on cancel Order button 
    Then User sees Yes button on alert confrimation screen
    When User taps on Yes Order button
    Then User sees Cancelled sucessfull message as "This order has been cancelled. "
    Then User sees order detail page 
    
    
     @ST-OMNI-28644 @TC-OMNI-28644_04 
 Scenario: As an ASO Mobile App user,
  I want to see order cancellation screen when i tap on No button from alert confirmation screen
    Given User launches the application
    And User Logs into the application
    And User taps on account in bottom nav
    When User taps on Order button
    Then User sees Order page with order list 
    When User taps on OrderId
    Then User sees order detail page
    When User taps on cancel Order button 
    Then User sees No button on alert confirmation screen
    When User taps on No Order button
    Then User sees Order cancellation confirmation screen
    Then User sees the back button
    
     @ST-OMNI-28644 @TC-OMNI-28644_05 
    Scenario: As an ASO Mobile App user,
  I want to navigate to  previous screen when i tap on back button
    Given User launches the application
    And User Logs into the application
    And User taps on account in bottom nav
    When User taps on Order button
    Then User sees Order page with order list 
    When User taps on OrderId
    Then User sees order detail page
    When User taps on cancel Order button 
    Then User sees No button on alert confirmation screen
    When User taps on No Order button
    Then User sees Order cancellation confirmation screen
    When User taps on back button from Order cancellation confirmation screen
   Then User sees order detail page
   
   @ST-OMNI-28644 @TC-OMNI-28644_06 @TestRun
    Scenario: As an ASO Mobile App user,
  I want to Order cancellation error if any issue occure from the OMS
    Given User launches the application
    And User Logs into the application
    And User taps on account in bottom nav
    When User taps on Order button
    Then User sees Order page with order list 
    When User taps on OrderId
    Then User sees order detail page
    When User taps on cancel Order button 
    Then User sees Yes button on alert confrimation screen
    When User taps on Yes Order button
    Then User see an error message as "The cancellation could not be processed.Please try again."
    
    
    