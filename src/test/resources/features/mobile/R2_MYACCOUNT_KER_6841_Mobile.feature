Feature: E02-250 - Edit Credit/Debit Card in Account

  @R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-6841 @ZYP_MYACCOUNT_K6841-10630 @CR-RKA
  Scenario: Verify that authenticated user is able to view the saved credit/debit cards.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user clicks on SignIn link from global header
   And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then User clicks on the burger menu
    Then user click on My Account and navigate to payment
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in Payments > Add new credit card section |
      | AddCreditCardPage_BillingInformationHeader_txt                       |

  @R2_Mobile @R2_Regression @R2_All @P2 @1HR_R2 @C-MyAccount @KER-6841 @ZYP_MYACCOUNT_K6841-10631 @CR-RKA
  Scenario: Verify that authenticated user is able to edit the saved credit/debit cards
    Given user launches the browser and navigates to "ASO_HOME" page
   Then User clicks on the burger menu
    When user clicks on SignIn link from global header
       And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then User clicks on the burger menu
      Then user click on My Account and navigate to payment
    And user clicks on Edit CTA for a selected card
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in Payments > Add new credit card section |
      | AddCreditCardPage_CreditCardNumber_txt                               |
      | AddCreditCardPage_CardExpiryDate_txt                                 |
      | AddCreditCardPage_CardCVV_txt                                        |
      | AddCreditCardPage_FirstName_txt                                      |
      | AddCreditCardPage_LastName_txt                                       |
      | AddCreditCardPage_Address_txt                                        |
      | AddCreditCardPage_ZipCode_txt                                        |
      | AddCreditCardPage_City_txt                                           |
      | AddCreditCardPage_State_dropdown                                     |
      | AddCreditCardPage_PhoneNumber_txt                                    |
      | AddCreditCardPage_Add_btn                                            |
      | AddCreditCardPage_Cancel_btn                                         |
      | AddCreditCardPage_CVV_toolTip                                        |
 
    And user verify all the form fields are pre-populated

  @R2_Mobile @R2_Regression @R2_All @P2 @C-MyAccount @KER-6841 @ZYP_MYACCOUNT_K6841-10632 @CR-RKA
  Scenario: Verify that Payment Details are not updated if User clicks on Cancel CTA
  Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user clicks on SignIn link from global header
   And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
    Then User clicks on the burger menu
  Then user click on My Account and navigate to payment
   And user clicks on Edit CTA for a selected card
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in Payments > Add new credit card section |
      | AddCreditCardPage_BillingInformationHeader_txt                       |
    And User updates CC/debit card and billing information 
    And User clicks on Cancel CTA
#    And user clicks on Edit CTA for a selected card
#    Then Verify that updated details are not saved
    	 Then Verify below Sub/Main Module of My Account
    	| Verify following elements in Payments after editing and clicking on cancel |
      | AddCreditCardPage_BillingInformationHeader_txt                       |

