Feature: B06-250 - BOPIS Order Details Page Impact
  
  //Bopis Place Order functionality is not working

  @C-BOPIS @R2_Web @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10933 @Order @CR-MS
  Scenario: 
    Verify that for Authenticated user Cancel Order CTA is displayed for orders having BOPIS items

    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on SignIn link from global header
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    Then User searches a product "SKUForBopisProduct" and navigates to PDP
    And user click on Add to Cart Button
    And user will click on View Cart button
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
    Then user click on checkout button
    Then user click on review order button
    And user able to see the button place order
    And user navigates from Order successful page to Orders in my account
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_View_Details_Btn                                 |
    When user click on view Details
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_Note_Txt                                         |

  @C-BOPIS @R2_Web @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10931 @Order @CR-MS @1HR_R2 @C1-MessageB
  Scenario: Verify the details in In-Store Pickup Instructions section
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on SignIn link from global header
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    Then User searches a product "SKUForBopisProduct" and navigates to PDP
    And user click on Add to Cart Button
    And user will click on View Cart button
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
    Then user click on checkout button
    Then user click on review order button
    And user able to see the button place order
    And user navigates from Order successful page to Orders in my account
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_View_Details_Btn                                 |
    When user click on view Details
    Then Verify the message on the page
      | #Verify following elements in my account order details |
      | IN STORE PICKUP INSTRUCTIONS                           |

  @C-BOPIS @R2_Web @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10928 @CR-MS
  Scenario: Verify that user is able to view BOPIS order details before pickup
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on SignIn link from global header
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user click on MyAccount
    When user click on Orders link
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_View_Details_Btn                                 |

  @C-BOPIS @R2_Web @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10936 @CR-MS
  Scenario: Verify the details in order details section
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on SignIn link from global header
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user click on MyAccount
    When user click on Orders link
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_View_Details_Btn                                 |
    When user click on view Details
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_Payment_txt                                      |
      | Order_Payment_Section                                  |

  @C-BOPIS @R2_Web @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10934 @Order @CR-MS
  Scenario: Verify that user is able to view BOPIS order details before pickup
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on SignIn link from global header
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    And User searches a product "SKUForBopisProduct" and navigates to PDP
    And user click on Add to Cart Button
    And user will click on View Cart button
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
    And user click on checkout button in Cart page
    Then user click on review order button
    And user able to see the button place order
    And user navigates from Order successful page to Orders in my account
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_View_Details_Btn                                 |
    When user click on view Details
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_Bopis_View_Store_Btn                             |
      | MyAccount_OrderDetailsPage_OrderNumber                 |
      | MyAccount_OrderPage_OrderPlacedOnDate_txt              |
      | Order_Bopis_In_Store_Pickup_txt                        |
      | Order_Bopis_Pickup_txt                                 |
      | Order_Bopis_Store_Hours_txt                            |

  @C-BOPIS @R2_Web @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10930 @Order @CR-MS
  Scenario: Verify the details in In Store Pickup section
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on SignIn link from global header
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    And User searches a product "SKUForBopisProduct" and navigates to PDP
    And user click on Add to Cart Button
    And user will click on View Cart button
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
    And user click on checkout button in Cart page
    Then user click on review order button
    And user able to see the button place order
    And user navigates from Order successful page to Orders in my account
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_View_Details_Btn                                 |
    When user click on view Details
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_Bopis_In_Store_Pickup_txt                        |
      | Order_Bopis_Pickup_txt                                 |
      | Order_Bopis_Store_Hours_txt                            |
      | Order_Bopis_Pickup_Information_Person_Details_Txt      |

  @C-BOPIS @R2_Web @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10929 @Order @CR-MS
  Scenario: Verify the details in order details section
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on SignIn link from global header
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    And User searches a product "SKUForBopisProduct" and navigates to PDP
    And user click on Add to Cart Button
    And user will click on View Cart button
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
    And user click on checkout button in Cart page
    Then user click on review order button
    And user able to see the button place order
    And user navigates from Order successful page to Orders in my account
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_View_Details_Btn                                 |
    When user click on view Details
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_Bopis_InStore_Pickup_Msg                         |
      | MyAccount_OrderDetailsPage_OrderNumber                 |
      | MyAccount_OrderPage_OrderPlacedOnDate_txt              |
      | Order_Bopis_View_Store_Btn                             |
      | Order_Bopis_In_Store_Pickup_txt                        |
      | Order_Bopis_Pickup_txt                                 |
      | Order_Bopis_Item_Img                                   |
      | Order_Bopis_Item_Details                               |

  @C-BOPIS @R2_Web @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10935 @Order @CR-MS
  Scenario: Verify the details in Order Summary section
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on SignIn link from global header
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    And User searches a product "SKUForBopisProduct" and navigates to PDP
    And user click on Add to Cart Button
    And user will click on View Cart button
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
    And user click on checkout button in Cart page
    Then user click on review order button
    And user able to see the button place order
    And user navigates from Order successful page to Orders in my account
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_View_Details_Btn                                 |
    When user click on view Details
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | MyAccount_OrderDetailsPage_SubTotalAmount              |
      | Order_Taxes_Price                                      |
      | Order_OrderTotal                                       |
      | Order_Bopis_In_Store_Pickup_txt                        |
      | MyAccount_OrderDetailsPage_SubTotalAmount              |
      | Order_Bopis_Print_Receipt_lnk                          |
