Feature: B06-250 - BOPIS Order Details Page Impact
  //Bopis Place Order functionality is not working

  @C-BOPIS @R2_Mobile @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10933 @CR-MS
  Scenario: 
    Verify that for Authenticated user Cancel Order CTA is displayed for orders having BOPIS items

    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    Then User searches a product "SKUForBopisProduct" and navigates to PDP
    #And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
    Then verify user can begin checkout
    Then user click on review order button
    And user able to see the button place order
    Then User clicks on the burger menu
    And user click on MyAccount
    And user click on Orders link
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_View_Details_Btn                                 |
    When user click on view Details
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_Note_Txt                                         |

  @C-BOPIS @R2_Mobile @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10931 @CR-MS
  Scenario: Verify the details in In-Store Pickup Instructions section
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    Then User searches a product "SKUForBopisProduct" and navigates to PDP
    #And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
    Then verify user can begin checkout
    Then user click on review order button
    And user able to see the button place order
    Then User clicks on the burger menu
    And user click on MyAccount
    And user click on Orders link
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_View_Details_Btn                                 |
    When user click on view Details
    Then Verify the message on the page
      | #Verify following elements in my account order details |
      | IN STORE PICKUP INSTRUCTIONS                           |

  @C-BOPIS @R2_Mobile @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10928 @CR-MS
  Scenario: Verify that user is able to view BOPIS order details before pickup
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    Then User clicks on the burger menu
    And user click on MyAccount
    When user click on Orders link
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_View_Details_Btn                                 |

  @C-BOPIS @R2_Mobile @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10936 @CR-MS
  Scenario: Verify the details in order details section
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    Then User searches a product "SKUForBopisProduct" and navigates to PDP
    #And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
    Then verify user can begin checkout
    Then user click on review order button
    And user able to see the button place order
    Then User clicks on the burger menu
    And user click on MyAccount
    And user click on Orders link
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_View_Details_Btn                                 |
    When user click on view Details
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in my account order details |
      | Order_Payment_txt                                      |
      | Order_Payment_Section                                  |

  @C-BOPIS @R2_Mobile @R2_All @P-High_B_Order @1HR_R2 @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10934 @CR-MS
  Scenario: Verify that user is able to view BOPIS order details before pickup
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    Then User searches a product "SKUForBopisProduct" and navigates to PDP
   #And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
    Then verify user can begin checkout
    Then user click on review order button
    And user able to see the button place order
    Then User clicks on the burger menu
    And user click on MyAccount
    And user click on Orders link
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

  @C-BOPIS @R2_Mobile @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10930 @CR-MS
  Scenario: Verify the details in In Store Pickup section
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    And User searches a product "SKUForBopisProduct" and navigates to PDP
    #And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
    And user click on checkout button in Cart page
    Then user click on review order button
    And user able to see the button place order
    Then User clicks on the burger menu
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

  @C-BOPIS @R2_Mobile @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10929 @CR-MS
  Scenario: Verify the details in order details section
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    And User searches a product "SKUForBopisProduct" and navigates to PDP
   #And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
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

  @C-BOPIS @R2_Mobile @R2_All @P-High_B_Order @C-NonOrder @CC-MyAccount_Order @KER-4330 @ZYP_MYACCOUNT_K4330-10935 @CR-MS
  Scenario: Verify the details in Order Summary section
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    Then user should able to click on Signin button
    And user enter the valid emailaddress "EmailAddress"
    And user enter the valid password "Password"
    And user click on signin button
    And user navigate and deletes existing items in cart
    And User searches a product "SKUForBopisProduct" and navigates to PDP
   #And user click on Add to Cart Button 
	And user click on ship it button  
	Then user is navigated to Add to cart Notification popup 
	And user click on viewcart button
    When user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode"
    And user click on checkout button in Cart page
    Then user click on review order button
    And user able to see the button place order
    Then User clicks on the burger menu
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
