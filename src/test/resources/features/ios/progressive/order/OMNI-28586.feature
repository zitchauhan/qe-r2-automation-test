Feature: Order Confirmation Screen - Notification, eDelivery & Order Summary Tile

  @Sprint5 @ST-OMNI-28586
  Scenario Outline: As a User, I should receive confirmations after successful transactions
    Given User launches the application
    And User logs into the application as "<user_name>"
    And User has an empty cart

    When User adds product "<product_name>" using search
    And User is on the cart screen
    And User taps on checkout button
    Then User sees the checkout screen

    # TODO: Work in progress
    When User has placed an Order
    Then User sees Order confirmation screen with "<confirmation_type>" tile
    And User sees Order number message "<order_number_message>"
    And User sees Create Account button on Order Confirmation screen
    And User sees Continue Shopping button on Order Confirmation screen
    And User sees Your Order History button on Order Confirmation screen

    Examples:
    | user_name     | confirmation_type         | product_name                        | order_number_message                   |
    | guest         | Order Number Notification | Columbia Sportswear Men's Pfg       | Your order <<order number>> is all set |
    | guest         | E Delivery Tile           | Academy Classic Gift card           | order confirmation will be emailed to the user shortly, create your account|
#    | guest         | Order Summary Tile        |
#    | jitsingh      | Order Summary Tile        |
#    | jitsingh      | E Delivery Tile           |
#    | jitsingh      | Order Number Notification | Your order <<order number>> is all set |