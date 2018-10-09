Feature: [Mobile]B07-250 - Gift Card - Authenticated User Using Saved GC at Checkout


@R2_Mobile @R2_Regression @R2_All @P-Highest @1HR_R2 @C-Checkout @KER-6823 @ZYP_CHECKOUT_K6823-8657 @CR-RKA
Scenario: Verify choose gift card option for authenticated User with 13 and 16 digit Gift Card having 4 or 8 digit PIN
Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
    And user click on signin button
    And User clicks on the burger menu 
    Then user click on My Account and navigate to payment
    When user clicks on Add New Gift Card button  
    Then user fill the gift card in My Account 
    And User clicks on the burger menu 
And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
  Then user click on Add to Cart Button
#  Then user click on checkout from ATC pop up
  And user will click on View Cart button
  And user will click on Checkout button and navigates to Checkout page
  And user click on GiftCard Plus icon in Checkout page
  Then Verify below Sub/Main Module of Checkout Page 
  |#verify in choose gift card dropdown default gift card is showing|
  |ChoosegiftCard_Dd|
  
  
  @R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-6823 @ZYP_CHECKOUT_K6823-8671 @CR-RKA
  Scenario: Verify one gift card applied and Balance is not covered in full
  Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu 
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
    And user click on signin button
    And User clicks on the burger menu 
    Then user click on My Account and navigate to payment
    When user clicks on Add New Gift Card button  
    Then user fill the gift card in My Account 
    And User clicks on the burger menu 
 And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	
  Then user click on Add to Cart Button
  Then user click on checkout from ATC pop up
  And user click on GiftCard Plus icon in Checkout page
Then user click on choose Gift card Dropdown  
Then Verify below Sub/Main Module of Checkout Page
|#verify add new giftcard is displayed |
|AddAnewGiftCard_Txt|

 @R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-6823 @ZYP_CHECKOUT_K6823-11184 @CR-RKA
Scenario: To verify the GC in 'Choose Gift Card' drop down should be disabled for an authenticated user if full balance of the GC utilized in order
Given user launches the browser and navigates to "ASO_HOME" page
	 And User clicks on the burger menu 
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
    And user click on signin button
    And User clicks on the burger menu 
    Then user click on My Account and navigate to payment
    When user clicks on Add New Gift Card button  
    Then user fill the gift card in My Account 
 And User clicks on the burger menu 
And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
Then user change the quantity of item in PDP
Then user click on Add to Cart Button
And user will click on View Cart button
  And user will click on Checkout button and navigates to Checkout page
#  Then user click on checkout from ATC pop up
 And user click on GiftCard Plus icon in Checkout page
Then user click on choose Gift card Dropdown  
Then Verify below Sub/Main Module of Checkout Page
|#verify add new giftcard is displayed |
|AddAnewGiftCard_Txt|

 @R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-6823 @ZYP_CHECKOUT_K6823-8672 @CR-RKA
Scenario: Verify saved another gift card drop down having 13 and 16 digit GC with 4 or 8 digit PIN	

 Given user launches the browser and navigates to "ASO_HOME" page
	 And User clicks on the burger menu 
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
    And user click on signin button
    And User clicks on the burger menu 
    Then user click on My Account and navigate to payment
    When user clicks on Add New Gift Card button  
    Then user fill the gift card in My Account 
Then User clicks on ASO Logo and should be navigated to Home Page
When User searches a product "productName" and navigates to PDP
  Then user click on Add to Cart Button
  Then user click on checkout from ATC pop up
#  And user will click on View Cart button
#  And user will click on Checkout button and navigates to Checkout page
  And user click on GiftCard Plus icon in Checkout page
Then Verify below Sub/Main Module of Checkout Page 
|#verify user is able to see choose gift card Drop down|
|ChoosegiftCard_Dd|


 @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-6823 @ZYP_CHECKOUT_K6823-8673 @CR-RKA
Scenario: Verify No second Saved Gift Card for Authenticated user


Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
    And user click on signin button
    And User clicks on the burger menu
    Then user click on My Account and navigate to payment
    When user clicks on Add New Gift Card button  
    Then user fill the gift card in My Account 
Then User clicks on ASO Logo and should be navigated to Home Page
 When User searches a product "productName" and navigates to PDP
  Then user click on Add to Cart Button
#  Then user click on checkout from ATC pop up
  And user will click on View Cart button
  And user will click on Checkout button and navigates to Checkout page
  And user click on GiftCard Plus icon in Checkout page
Then Verify below Sub/Main Module of Checkout Page 
|#verify user is able to see Gift cart ending digit in choose gift card Dropdown|
|ChoosegiftCard_Dd|

 @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-6823 @ZYP_CHECKOUT_K6823-8675 @CR-RKA
Scenario: Verify +Add another Gift card is Suppressed

Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
    And user click on signin button
    And User clicks on the burger menu
    Then user click on My Account and navigate to payment
    When user clicks on Add New Gift Card button  
    Then user fill the gift card in My Account 
Then User clicks on ASO Logo and should be navigated to Home Page
 When User searches a product "productName" and navigates to PDP

  Then user click on Add to Cart Button
#  Then user click on checkout from ATC pop up
  And user will click on View Cart button
  And user will click on Checkout button and navigates to Checkout page
  And user click on GiftCard Plus icon in Checkout page
Then user click on apply giftcard button 
Then Verify below Sub/Main Module of Checkout Page 
|#verify +add another gift card|
|Plus_AddAnotherGiftCard_Txt|
Then user click on remove gift card  

 @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-6823 @ZYP_CHECKOUT_K6823-8682 @CR-RKA
Scenario: Verify remove all gift cards
Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
    And user click on signin button
    And User clicks on the burger menu
    Then user click on My Account and navigate to payment
    When user clicks on Add New Gift Card button  
    Then user fill the gift card in My Account 
Then User clicks on ASO Logo and should be navigated to Home Page
  When User searches a product "productName" and navigates to PDP
  Then user click on Add to Cart Button
#  Then user click on checkout from ATC pop up
  And user will click on View Cart button
  And user will click on Checkout button and navigates to Checkout page
  And user click on GiftCard Plus icon in Checkout page
Then Verify below Sub/Main Module of Checkout Page 
|#verify user is able to see choose gift card Drop down|
|ChoosegiftCard_Dd|
  
  @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-6823 @ZYP_CHECKOUT_K6823-8658 @CR-RKA
  Scenario: Verify Gift Card Chronology and Balance
  
  Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
    And user click on signin button
    And User clicks on the burger menu
    Then user click on My Account and navigate to payment
    When user clicks on Add New Gift Card button  
    Then user fill the gift card in My Account 
    Then User clicks on ASO Logo and should be navigated to Home Page
  When User searches a product "productName" and navigates to PDP
  Then user click on Add to Cart Button
#  Then user click on checkout from ATC pop up
  And user will click on View Cart button
  And user will click on Checkout button and navigates to Checkout page
  And user click on GiftCard Plus icon in Checkout page
Then Verify below Sub/Main Module of Checkout Page 
|#verify user is able to see chronology and balance in choose gift card|
|ChoosegiftCard_Dd|
  
  
  @R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-6823 @ZYP_CHECKOUT_K6823-8659 @CR-RKA
  Scenario: Verify Gift card drop down supressed
  
  Given user launches the browser and navigates to "ASO_HOME" page
	And User clicks on the burger menu
	And user clicks on SignIn link from global header
	And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
	And user enter the valid password "Password" 
    And user click on signin button
    And User clicks on the burger menu
    Then user click on My Account and navigate to payment
    When user clicks on Add New Gift Card button  
    Then user fill the gift card in My Account 
    Then User clicks on ASO Logo and should be navigated to Home Page
 When User searches a product "productName" and navigates to PDP
  Then user click on Add to Cart Button
#  Then user click on checkout from ATC pop up
  And user will click on View Cart button
  And user will click on Checkout button and navigates to Checkout page
  And user click on GiftCard Plus icon in Checkout page
Then user click on apply giftcard button 
Then Verify below Sub/Main Module of Checkout Page 
|#verify gift card drop down supressed|
|Plus_AddAnotherGiftCard_Txt|
#Then user click on remove gift card 
  
  
  
  