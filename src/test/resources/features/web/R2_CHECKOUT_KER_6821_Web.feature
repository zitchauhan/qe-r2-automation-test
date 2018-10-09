Feature: Verfiy Gift Card - Payment Validation in Checkout

  @R2_Web   @R2_All @P-High_Order @C-Order @CC-Checkout_Order @KER-6821 @ZYP_CHECKOUT_K6821-7957 @CR-AKK
  Scenario: Verify the error message when user enters the invalid Gift card number
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
    Then User is navigated to pdp page
    Then user click on Add to Cart Button
    Then user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    Then user click on checkout button in Cart page
    When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page
    And user click on go to payment present in shipping method
    Then user click on GiftCard Plus icon in Checkout page
    And user enter Gift card Number "WrongGiftcardNumber"
    And user enter Pin Number "WrongPinNumber"
    And user click on Apply button
    Then Verify below Sub/Main Module of Checkout Page
      | # user should be displayed with inline error message |
      | InvalidGiftCardNumber_Txt                            |

  @R2_Web  @R2_All @P-Highest @1HR_R2 @C-Order @CC-Checkout_Order @KER-6821 @ZYP_CHECKOUT_K6821-10203 @CR-AKK
  Scenario: Verify the error message when user enters the invalid Gift card number
    Given user launches the browser and navigates to "ASO_HOME" page
    When User searches a product "productName" and navigates to PDP
    Then user click on Add to Cart Button
    Then user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    Then user click on checkout button in Cart page
    When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page
     And user click on go to payment present in shipping method
    When user clicks on Add Gift Card link
    And enter valid Gift Card Number "GiftCardNumber"
    And enters an alphanumeric PIN "PIN"
    Then user should NOT be allowed to input any non-numeric value to the gift card PIN field

  @R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order @KER-6821 @ZYP_CHECKOUT_K6821-10194 @CR-AKK
  Scenario: Verify the error message when user enters valid old Gift card with valid new PIN in Checkout for payment 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User Navigates L2 form Homepage Header 
	And User clicks on product in PLP 
	And user click on Add to Cart Button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then user click on checkout button in Cart page 
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page 
	And user click on go to payment present in shipping method 
	When user clicks on Add Gift Card link 
	And enter valid Gift Card Number "GiftCardNumber" 
	And user enter Pin Number "NewPinNumber" 
	And user click on Apply button 
	Then Verify below Sub/Main Module of Checkout Page 
		| # user should be displayed with inline error message |
		| InvalidGiftCardNumber_Txt                            |

  @R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order @KER-6821 @ZYP_CHECKOUT_K6821-10192 @CR-AKK
  Scenario: Verify the user can enter valid old Gift card in Checkout for payment
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
    Then User is navigated to pdp page
    Then user click on Add to Cart Button
    Then user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    Then user click on checkout button in Cart page
    When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page
    And user click on go to payment present in shipping method
    When user clicks on Add Gift Card link
    And enter valid Gift Card Number "13DigitsGiftCardNumber"
    And user enter Pin Number "4DigitPinNumber"
    And user click on Apply button

  @R2_Web  @R2_All @P-Low @C-Order @CC-Checkout_Order @KER-6821 @ZYP_CHECKOUT_K6821-7960 @CR-AKK
  Scenario: Verify the error message when user enters the Gift card number with insufficient funds
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
    Then User is navigated to pdp page
    Then user click on Add to Cart Button
    Then user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    Then user click on checkout button in Cart page
    When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page
   And user click on go to payment present in shipping method
    When user clicks on Add Gift Card link
    And enter valid Gift Card Number "validGiftCardNumber"
    And user enter Pin Number "OldPinNumber"
    And user click on Apply button
    Then Verify below Sub/Main Module of Checkout Page
      | # user should be displayed with inline error message |
      | InvalidGiftCardNumber_Txt                            |

  @R2_Web  @R2_All @P-High_Order @C-Order @CC-Checkout_Order @KER-6821 @ZYP_CHECKOUT_K6821-10202 @CR-AKK
  Scenario: Verify user is not allowed to enter any non-numeric input to GIft card number
    Given user launches the browser and navigates to "ASO_HOME" page
    And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
    Then User is navigated to pdp page
    Then user click on Add to Cart Button
    Then user is navigated to Add to cart Notification popup
    And user will click on View Cart button
    And user navigate to Cart page
    Then user click on checkout button in Cart page
    When user enter First name "FirstName"
    And user enter Last name "LastName"
    And user enter Phone number "PhoneNumber"
    And user enter Address "Address"
    And user enter Zipcode "zipcode"
    Then user click on Go To Shipping Method button in Checkout page
     And user click on go to payment present in shipping method
    When user clicks on Add Gift Card link
    And enter valid Gift Card Number "AlphanuremericGiftCardNumber"
    And user enter Pin Number "validPinNumber"
    And user click on Apply button
    Then Verify below Sub/Main Module of Checkout Page
      | # user should NOT be allowed to input any non-numeric value to the gift card number field |
      | InvalidGiftCardNumber_Txt                                                                 |
