Feature: Verify Details of PDP for product without any variants

  @Sprint1 @TC-OMNI-24466 @ST-21749
  Scenario: User sees product title and price for a product
  	Given User launches the application
  	And User Logs into the application
  	When User taps on go to pdp button
    Then User sees product "image" on PDP
    Then User sees product "title" on PDP
    Then User sees product "price" on PDP

