Feature: Remind to Enable Push Notification

  @Sprint7 @ST-OMNI-28588 @TC-OMNI-37531
  Scenario: Verify User (who has not subscribed to push notifications) gets a reminder on order confirmation screen to enable push notifications to stay on top of future purchases
   Given User launches the application
     And User continues as guest user
    And User taps on Maybe later in Onboarding Screen
    Then User Clicks On MaY Be Later	
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "SearchKeyword" 
    When I choose to navigate to PDP
    Then User sees product image
    And User sees Product title
    And User taps on add to cart button
    And User taps on View Cart button
    Then User is navigated To Cart Screen	
    And User sees the checkout button
    When User taps on checkout button
    And User taps on checkout button
    Then User sees the checkout screen
    # TODO: Work in progress
    When User has placed an Order
    Then User sees Get notifications to track your order button
    Then User taps on Get notifications to track your order button
    And User sees phone setting