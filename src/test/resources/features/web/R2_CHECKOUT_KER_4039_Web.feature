Feature: [Web]Payment restrictions

  @R2_Web @R2_All @P-High_Order @1HR_R2 @C-Order @CC-Checkout_Order @KER-4039 @ZYP_CHECKOUT_K4039-10454 @CR-RKA
  Scenario: Verify that PayPal and More Options radio buttons are disabled when Gift Card is applied
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    And user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    And user clicks on one of the product category and navigates to LThree
    And User is navigated to pdp page
    #And user click on Add to Cart Button
    And user click on ship it button
    And user click on viewcart button
    Then user click on checkout from ATC pop up
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    Given user selects shipment method on check out page
    When user click on GiftCard Plus icon in Checkout page
    And user enter Gift card Number "Valid16DigitGiftCardNumber"
    And user enter Pin Number "Valid8DigitGiftCardPIN"
    And user click on Apply button
    Then user verify all the paypal and more radio btn is disable
    Then Verify below Sub/Main Module of Checkout Page
      | #verify Radio btn in checkout page |
      | CreditCard_radioBtn                |
      | PayPal_radioBtn                    |

  @R2_Web @R2_All @P-High_Order @C-Order @CC-Checkout_Order @KER-4039 @ZYP_CHECKOUT_K4039-10455 @CR-RKA
  Scenario: Verify that PayPal and More Options radio buttons are enabled when Gift Card is removed
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    And user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    And user clicks on one of the product category and navigates to LThree
    And User is navigated to pdp page
    Then user change the quantity of item in PDP
    #And user click on Add to Cart Button
    And user click on ship it button
    And user click on viewcart button
    Then user click on checkout from ATC pop up
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    Given user selects shipment method on check out page
    When user click on GiftCard Plus icon in Checkout page
    And user enter Gift card Number "Valid16DigitGiftCardNumber"
    And user enter Pin Number "Valid8DigitGiftCardPIN"
    And user click on Apply button
    And user click on remove gift card on checkout page
    Then user click on paypal radiobtn
    Then Verify below Sub/Main Module of Checkout Page
      | #verify Radio btn in checkout page |
      | CreditCard_radioBtn                |
      | PayPal_radioBtn                    |

  @R2_Web @R2_All @P-High_Order @C-Order @CC-Checkout_Order @KER-4039 @ZYP_CHECKOUT_K4039-9876 @CR-RKA
  Scenario: Verify that user can combine Gift Card payment with Credit/Debit Card only
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    And user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    And user clicks on one of the product category and navigates to LThree
    And User is navigated to pdp page
   #And user click on Add to Cart Button
    And user click on ship it button
    And user click on viewcart button
    Then user click on checkout from ATC pop up
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    Given user selects shipment method on check out page
    When user click on GiftCard Plus icon in Checkout page
    And user enter Gift card Number "LowBalanceGiftCard"
    And user enter Pin Number "LowBalanceGiftCardPin"
    And user click on Apply button
    Then Verify below Sub/Main Module of Checkout Page
      | #verify credit card detail is visible# |
      | CreditCardNumber_Input                 |
      | ExpirationDate_Input                   |
      | Cvv_Input                              |

  @R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-4039 @ZYP_CHECKOUT_K4039-9885 @CR-RKA 
  Scenario: Verify that user cannot combine Gift Card payment with any non-Credit/Debit Card only
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    And user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    And user clicks on one of the product category and navigates to LThree
    And User is navigated to pdp page
    #And user click on Add to Cart Button
    And user click on ship it button
    And user click on viewcart button
    Then user click on checkout from ATC pop up
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    Given user selects shipment method on check out page
    Then user click on paypal radiobtn
  	#Then user switch to iframe to verify paypalcheckoutBtn  
    Then Verify below Sub/Main Module of Checkout Page
      | #verify gift card related things are not displayed |
      | PayPalCheckOut_Btn                                 |

  @R2_Web @R2_All @P-High_Order @C-Order @CC-Checkout_Order @KER-4039 @ZYP_CHECKOUT_K4039-9889 @CR-RKA @RegressionP2
  Scenario: Verify that user can use multiple gift cards to make the payment
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    And user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    And user clicks on one of the product category and navigates to LThree
    And User is navigated to pdp page
    #And user click on Add to Cart Button
    And user click on ship it button
    And user click on viewcart button
    Then user click on checkout from ATC pop up
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    Given user selects shipment method on check out page
    When user click on GiftCard Plus icon in Checkout page
    And user enter Gift card Number "LowBalanceGiftCard"
    And user enter Pin Number "LowBalanceGiftCardPin"
    And user click on Apply button
    Then user click on ADD Another Gift Card
    And user enter Gift card Number "Valid16DigitGiftCardNumber"
    And user enter Pin Number "Valid8DigitGiftCardPIN"
    And user click on Apply button
    Then Verify below Sub/Main Module of Checkout Page
      | #verify gift card remove displayed after adding second gift card |
      | btnToRemoveGiftCardOnCheckoutPage                                |

  @R2_Web @R2_All @P-High_Order @C-Order @CC-Checkout_Order @KER-4039 @ZYP_CHECKOUT_K4039-9892 @CR-RKA
  Scenario: Verify that user cannot use more than one credit/debit card for single transaction
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    And user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    And user clicks on one of the product category and navigates to LThree
    And User is navigated to pdp page
    #And user click on Add to Cart Button
    And user click on ship it button
    And user click on viewcart button
    Then user click on checkout from ATC pop up
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    Given user selects shipment method on check out page
    And user enters "DebitCardNumber" details and verify it is getting entered in Credit card section
    Then user enters valid expiry date "ExpDate"
    And user enters valid cvv value "CVV"
    Then user fill email address in payment
    Then user clicks on the submit button
    Then Verify below Sub/Main Module of Checkout Page
      | #verify only billing information is displayed after payment through credit card |
      | BillingInformation_Txt                                                          |

  @R2_Web @R2_Regression @R2_All @P2 @C-Checkout @KER-4039 @ZYP_CHECKOUT_K4039-9920 @CR-RKA
  Scenario: Verify that user cannot combine PayPal payment with any other payment option
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    And user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    And user clicks on one of the product category and navigates to LThree
    And User is navigated to pdp page
    #And user click on Add to Cart Button
    And user click on ship it button
    And user click on viewcart button
    Then user click on checkout from ATC pop up
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    Given user selects shipment method on check out page
    Then user click on paypal radiobtn
    #Then user switch to iframe to verify paypalcheckoutBtn
    Then Verify below Sub/Main Module of Checkout Page
      | #verify only paypal related things are displayed |
#      | PayPalCheckOut_Btn                               |

  @R2_Web @R2_Regression @R2_All @P-Low @C-Checkout @KER-4039 @ZYP_CHECKOUT_K4039-9921 @CR-RKA
  Scenario: Verify that user cannot see More Options payment option in Payment drawer section
    Given user launches the browser and navigates to "ASO_HOME" page
    When User searches a product "productName" and navigates to PDP
    And User is navigated to pdp page
    #And user click on Add to Cart Button
    And user click on ship it button
    And user click on viewcart button
    Then user click on checkout from ATC pop up
    And user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    And user click on Go To Shipping Method button in Checkout page
    Given user selects shipment method on check out page
    Then Verify below Sub/Main Module of Checkout Page
      | #verify the following |
      | CreditCard_radioBtn   |
      | PayPal_radioBtn       |
