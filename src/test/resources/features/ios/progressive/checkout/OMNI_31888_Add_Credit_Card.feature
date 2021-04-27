Feature: Feature for adding new credit card for Signed-In and Guest user
T
  @Sprint5 @ST-OMNI-31888 @TC-OMNI-35915
  Scenario: As an ASO mobile app signed-in user
  I want to see add credit card screen should display with all the required input field on tapping on add credit card button 
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card number field on credit card screen 
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    Then User sees Save For Future checkbox as default selected
    Then User sees Billing address section
    Then User sees option as Shipping address as billing address
    Then User sees option as Add new billing address
    Then User sees save credit card button as disabled
    Then User sees back button on credit card screen 
    
    
    
    @Sprint5 @ST-OMNI-31888  @TC-OMNI-35916
  Scenario: As an ASO mobile app signed-in user
  I want to see the valid credit card image when i enter first two digit of card number 
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    When User enter "41" in "CardNumber" field
    Then User sees card image in card number input field
   
   
   @Sprint5 @ST-OMNI-31888 @TC-OMNI-35917
    Scenario: As an ASO mobile app signed-in usr 
  I want to see an error message when i enter invalid credit card number
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
   When User enter "4111 1113 2424 2325" in "CardNumber" field
   Then User sees invalid card error message
   
    
   @Sprint5 @ST-OMNI-31888 @TC-OMNI-35918
    Scenario: As an ASO mobile app signed-in usr 
  I want to see the Save Credit Card button as enabled once i have entered valid credit cards detail
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
   Then User sees save credit card button as enabled
  
  @Sprint5 @ST-OMNI-31888 @TC-OMNI-35919
    Scenario: As an ASO mobile app signed-in usr 
  I want to see the Billing cards detail when i select Add Billing section after enter valid credit card detail
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
    Then User sees save credit card button as enabled
    When user tap on Add billing address  
    Then i choose to enter "ccfirstname" on aso card page 
	Then i choose to enter "ccLastname" on aso card page 
	Then i choose to enter "ccAddress" on aso card page
	Then i choose to enter "ccaprtname" on aso card page
	And i choose to enter "cczipcode" on aso card page
	Then i choose to enter "entercccity" on aso card page
	And i choose to enter "ccmobilenumber" on aso card page
	
	
	 @Sprint5 @ST-OMNI-31888 @TC-OMNI-35920
    Scenario: As an ASO mobile app signed-in usr 
  I want to see the alert pop up message when user tap on the back button 
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
    Then User sees save credit card button as enabled
    When User taps on back button
    Then User sees alertPopup with message
    Then User sees Continue button on alert popup
    Then User Sees Cancel button on alert popup
    
  
     @Sprint5 @ST-OMNI-31888 @TC-OMNI-35921
    Scenario: As an ASO mobile app signed-in usr 
  I want to navigate to previous screen when user tap on the continue button from the alert pop-up
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
    Then User sees save credit card button as enabled
    When User taps on back button
    Then User sees alertPopup with message
    Then User sees Continue button on alert popup
    When User taps on "Continue" button from alert popup
    Then User sees Add Credit card button
    
    
     @Sprint5 @ST-OMNI-31888 @TC-OMNI-35922
    Scenario: As an ASO mobile app signed-in user 
  I want to retain on same screen with the entered data  when user tap on the Cancel button from the alert pop-up
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
    Then User sees save credit card button as enabled
    When User taps on back button
    Then User sees alertPopup with message
    When User taps on "Cancel" button from alert popup
    Then User sees Add Credit card button
    Then User sees credit card information on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
   
   
   @Sprint5 @ST-OMNI-31888 @TC-OMNI-35923
    Scenario: As an ASP mobile app signed-in user
    I want to navigate to Payment screen when i tap on Save credit card button once i filled all 
    the detail and no error present on add credit card screen
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
    Then User sees save credit card button as enabled
    When User taps on save credit card button
    Then User is on Payment screen page
  
     @Sprint5 @ST-OMNI-31888 @TC-OMNI-35924
    Scenario: As an ASP mobile app guest user
    I want to navigate to Payment screen when i tap on Save credit card button once i filled all 
    the detail and no error present on add credit card screen
    Given User launches the application
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
    Then User sees save credit card button as enabled
    When User taps on save credit card button
    Then User is on Payment screen page
    
     @Sprint5 @ST-OMNI-31888 @TC-OMNI-35925
     Scenario: As an ASP mobile app signed-in user with saved address 
    I want to see the saved address list  
    the detail and no error present on add credit card screen
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
    Then User sees save credit card button as enabled
    Then User sees saved address in billing section 
 
    @Sprint5 @ST-OMNI-31888 @TC-OMNI-35926
    Scenario: As an ASP mobile app signed-in user with saved address 
    I want to navigate to Payment screen when i tap on Save credit card button once i filled all 
    the detail and no error present on add credit card screen
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
    Then User sees save credit card button as enabled
    Then User sees saved address in billing section 
    When User taps on saved address 
    When User taps on save credit card button
    Then User is on Payment screen page
  
  
    @Sprint5 @ST-OMNI-31888  @TC-OMNI-35927
    Scenario: As as ASP mobile app signed-in user with saved address in account 
   I want to see Save For Future option as unselected default
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
    Then User sees save credit card button as enabled
    Then User sees saved address in billing section 
    Then User sees Save For Future checkbox as default un-selected
    
  
  @Sprint5 @ST-OMNI-31888  @TC-OMNI-35928
   Scenario: As an ASP mobile app signed-in user
   I want to see the field level error messages on billing address fields.
    Given User launches the application
    And User Logs into the application
    And User taps on home in bottom nav
    And User Sees the Search Box
    And User clicks on the Search Box
    And User search for the "WhiteGlove"
    And user click on Product
    And User selects home delivery option
    And User taps on add to cart button
    When User taps on view cart button
    Then User is navigated To Cart Screen
    When User sees the checkout button
    And User taps on checkout button
    Then User sees Shipping Method label
    When User taps on Add Credit card button 
    Then User sees credit card information on credit card screen
    Then User sees accepcted card image on credit card screen
    Then User sees card holder name field on credit card screen
    Then User sees card expiry field on credit card screen
    Then User sees CVV field on credit card screen
    When User enter "Alex Morgan" in "CardHolderName" field
    When User enter "4111 1111 1111 1111" in "CardNumber" field
    When User enter "09/25" in "CardExpiry" field
    When User enter "123" in "CVV" field
    Then User sees save credit card button as enabled
    When user tap on Add billing address
    When User taps on save credit card button
    Then User see an error message for "First Name"
    Then User see an error message for "Last Name"
    Then User see an error message for "ZIP Code"
    Then User see an error message for "State"
    Then User see an error message for "Phone"
      
  
  
  
  
  
  
  
  
  
  
  
    
    


 

