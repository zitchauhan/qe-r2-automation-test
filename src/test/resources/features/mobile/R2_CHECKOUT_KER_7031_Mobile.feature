Feature: B03-500-SOF Checkout landing and variations

  @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-7031 @ZYP_CHECKOUT_K7031-9590 @CR-MS @1HR_R2
  Scenario: To verify checkout landing variations - shipping drawer hidden for SOF
    Given user launches the browser and navigates to "ASO_HOME" page
    And User clicks on the burger menu
    And user clicks on SignIn link from global header
    And user enter the valid emailaddress "EmailWithoutPaymentDetails"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    Then User searches a product "SOFSKUNumber" and navigates to PDP
    And user click on Add to Cart Button
    And user will click on View Cart button
    And user navigate to Cart page
    When user will click on Checkout button and navigates to Checkout page
    Then user should not be allowed to view shipping method drawer if only SOF items are in the cart

  @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-7031 @ZYP_CHECKOUT_K7031-9588 @CR-MS
  Scenario: To verify checkout landing variations - Guest User
    Given user launches the browser and navigates to "ASO_HOME" page
   Then User searches a product "SOFSKUNumber" and navigates to PDP
    And clicks on the Change Pickup Location link
    And user enter the Zipcode in "zipCode"
    And user click on Add to Cart Button
    And user will click on View Cart button
    And user navigate to Cart page
    When user will click on Checkout button and navigates to Checkout page
    And Verify below Sub/Main Module of Checkout Page
      | # Verify following section SPECIAL ORDER SHIP TO STORE in checkout page |
      | ShipToStoreforSOF_Txt                                                   |

  @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-7031 @ZYP_CHECKOUT_K7031-9589 @CR-MS
  Scenario: To verify checkout landing variations - Authenticated user
    Given user launches the browser and navigates to "ASO_HOME" page
    And User clicks on the burger menu
    And user clicks on SignIn link from global header
    And user enter the valid emailaddress "EmailWithoutPaymentDetails"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
   Then User searches a product "SOFSKUNumber" and navigates to PDP
    And user click on Add to Cart Button
    And user will click on View Cart button
    And user navigate to Cart page
    When user will click on Checkout button and navigates to Checkout page
    And Verify below Sub/Main Module of Checkout Page
      | # Verify following section SPECIAL ORDER SHIP TO STORE in checkout page |
      | ShipToStoreforSOF_Txt                                                   |
