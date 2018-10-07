Feature: E03-150 - Order Cancellation Order Cancellation by Guest Customer

  @R2_Mobile  @R2_All @P-High_Order @C-Order @CC-MyAccount_Order   @KER-4019 @ZYP_MYACCOUNT_K4019-10648 @CR-SG
  Scenario: Verify that order is gets cancelled if Guest user clicks on Yes, Cancel my Order CTA on confirmation modal
    Given user launches the browser and navigates to "ASO_HOME" page
    When User searches a product "productName" and navigates to PDP
    And user click on Add to Cart Button
    And user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    And user click on checkout button in Cart page
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "AVSAddress"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    And user selects the suggested address instead of entered address
    And clicks on Use Selected Address button
    And user click on go to payment present in shipping method
    And user fill the credit card detail in payment
    And user fill the email address for shipment and click on review order btn
    And user able to see the button place order
    Then user able to see order number
    And User navigates to Check Oder status Page
    Then System Generate ordernumber "GeneratedOrdernumber" and "zipcode"
    And User clicks on Check button
    Then Order Details page should be displayed
    When User Clicks on Cancel Order link
    And user click on yes cancle my order button
    Then Verify that the order cancellation confirmation page is displayed
    And user should be able to see cancellation message
    And Refund details should be displayed
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_Back_To_Order_Lnk                                |

  @R2_Mobile  @R2_All @P-High_Order @C-Order @CC-MyAccount_Order   @KER-4019 @ZYP_MYACCOUNT_K4019-10650 @CR-SG
  Scenario: Verify that Guest User is able to navigate back to order details page from cancellation confirmation page
    Given user launches the browser and navigates to "ASO_HOME" page
    When User searches a product "productName" and navigates to PDP
    And user click on Add to Cart Button
    And user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    And user click on checkout button in Cart page
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "AVSAddress"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    And user selects the suggested address instead of entered address
    And clicks on Use Selected Address button
    And user click on go to payment present in shipping method
    And user fill the credit card detail in payment
    And user fill the email address for shipment and click on review order btn
    And user able to see the button place order
    Then user able to see order number
    And User navigates to Check Oder status Page
    Then System Generate ordernumber "GeneratedOrdernumber" and "zipcode"
    And User clicks on Check button
    Then Order Details page should be displayed
    When User Clicks on Cancel Order link
    And user click on yes cancle my order button
    And User clicks on Back to Order details Link on cancellation confirmation page
    Then Order Details page should be displayed
    And Cancel Order CTA should not be displayed

  @R2_Mobile  @R2_All @P-High_Order @C-Order @CC-MyAccount_Order   @KER-4019 @ZYP_MYACCOUNT_K4019-10641 @CR-SG
  Scenario: Verify that for Guest user Cancel Order CTA is displayed for orders in remorse period
    Given user launches the browser and navigates to "ASO_HOME" page
    When User searches a product "productName" and navigates to PDP
    And user click on Add to Cart Button
    And user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    And user click on checkout button in Cart page
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "AVSAddress"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    And user selects the suggested address instead of entered address
    And clicks on Use Selected Address button
    And user click on go to payment present in shipping method
    And user fill the credit card detail in payment
    And user fill the email address for shipment and click on review order btn
    And user able to see the button place order
    Then user able to see order number
    And User navigates to Check Oder status Page
    Then System Generate ordernumber "GeneratedOrdernumber" and "zipcode"
    And User clicks on Check button
    Then Order Details page should be displayed
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_Cancel_lnk                                       |

  @R2_Mobile  @R2_All @P-High_Order @C-Order @CC-MyAccount_Order   @KER-4019 @ZYP_MYACCOUNT_K4019-10642 @CR-SG
  Scenario: Verify that for Guest user Cancel Order CTA is not displayed for fully shipped orders
    Given user launches the browser and navigates to "ASO_HOME" page
    When User searches a product "productName" and navigates to PDP
    And user click on Add to Cart Button
    And user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    And user click on checkout button in Cart page
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "AVSAddress"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    And user selects the suggested address instead of entered address
    And clicks on Use Selected Address button
    And user click on go to payment present in shipping method
    And user fill the credit card detail in payment
    And user fill the email address for shipment and click on review order btn
    And user able to see the button place order
    Then user able to see order number
    And User navigates to Check Oder status Page
    Then System Generate ordernumber "GeneratedOrdernumber" and "zipcode"
    And User clicks on Check button
    Then Order Details page should be displayed
    And Cancel Order CTA should not be displayed

  @R2_Mobile  @R2_All @P-High_Order @C-Order @CC-MyAccount_Order   @KER-4019 @ZYP_MYACCOUNT_K4019-10643 @CR-SG
  Scenario: Verify that for Guest user Cancel Order CTA is NOT displayed for partially shipped orders
    Given user launches the browser and navigates to "ASO_HOME" page
    When User searches a product "productName" and navigates to PDP
    And user click on Add to Cart Button
    And user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    And user click on checkout button in Cart page
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "AVSAddress"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    And user selects the suggested address instead of entered address
    And clicks on Use Selected Address button
    And user click on go to payment present in shipping method
    And user fill the credit card detail in payment
    And user fill the email address for shipment and click on review order btn
    And user able to see the button place order
    Then user able to see order number
    And User navigates to Check Oder status Page
    Then System Generate ordernumber "GeneratedOrdernumber" and "zipcode"
    And User clicks on Check button
    Then Order Details page should be displayed
    And Cancel Order CTA should not be displayed

  @R2_Mobile  @R2_All @P-High_Order @1HR_R2 @C-Order @CC-MyAccount_Order   @KER-4019 @ZYP_MYACCOUNT_K4019-10646 @CR-SG
  Scenario: Verify that order is not cancelled if Guest user clicks on No CTA on confirmation modal
    Given user launches the browser and navigates to "ASO_HOME" page
    When User searches a product "productName" and navigates to PDP
    And user click on Add to Cart Button
    And user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    And user click on checkout button in Cart page
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "AVSAddress"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    And user selects the suggested address instead of entered address
    And clicks on Use Selected Address button
    And user click on go to payment present in shipping method
    And user fill the credit card detail in payment
    And user fill the email address for shipment and click on review order btn
    And user able to see the button place order
    Then user able to see order number
    And User navigates to Check Oder status Page
    Then System Generate ordernumber "GeneratedOrdernumber" and "zipcode"
    And User clicks on Check button
    Then Order Details page should be displayed
    When User Clicks on Cancel Order link
    And User clicks on No Button on confirmation modal
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_Back_To_Order_Lnk                                |
      | Order_Cancel_lnk                                       |
