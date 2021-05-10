Feature: Order Confirmation Screen - Notification, eDelivery & Order Summary Tile

  @Sprint6 @ST-OMNI-34375 @TC-OMNI-37307
  Scenario Outline: As a user I should be able to place order STH and should be redirected to order confirmation screen
    Given User launches the application
    And User logs into the application as "<user_name>"
    And User has an empty cart
    When User adds product "<product_name>" using search
    And User is on the cart screen
    And User taps on checkout button
    Then User sees the checkout screen
    # TODO: Work in progress
    When User has placed an Order
    Then User sees elements on order confirmation screen
    |Shipping Address Tile|
    |Home Delivery Tile|
    |User First Name |
    |User Last Name |
    |shipping address|
    
    Examples:
    | user_name     | product_name                        |
    | guest         | Columbia Sportswear Men's Pfg       |
  
 

  @Sprint6 @ST-OMNI-34375 @TC-OMNI-37308
  Scenario Outline: User is able to move to order confirmation page and is able to see, SLA, package and other labels for STH order
  Given User launches the application
    And User logs into the application as "<user_name>"
    And User has an empty cart
    When User adds product "<product_name>" using search
    And User is on the cart screen
    And User taps on checkout button
    Then User sees the checkout screen
    # TODO: Work in progress
    When User has placed an Order
    Then User sees elements on order confirmation screen
    |sla message|
    |packages label|
    |items count |
    |delivery method |
    |shipping address|
    
    Examples:
    | user_name     | product_name                        |
    | guest         | Columbia Sportswear Men's Pfg       |
    
    
