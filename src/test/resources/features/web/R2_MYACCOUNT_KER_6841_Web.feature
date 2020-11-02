Feature: E02-250 - Edit Credit/Debit Card in Account

  @R2_Web @ZYP_MYACCOUNT_K6841-10630 @RegressionP1 @MyAccount @OMNI-13373
  Scenario:  Verify that authenticated user is able to view the saved credit/debit cards.

    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on SignIn link from global header
    And user enter the valid emailaddress "UserWithSavedAddressAndPayment" 
		And user enter the valid password "Password" 
    And user click on signin button
    Then user click on My Account and navigate to payment
    Then Verify below Sub/Main Module of My Account
      | #Verify following elements in Payments > Add new credit card section |
      | AddCreditCardPage_BillingInformationHeader_txt                       |

  @R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-6841 @ZYP_MYACCOUNT_K6841-10631 @CR-RKA
  Scenario: Verify that authenticated user is able to edit the saved credit/debit cards
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on SignIn link from global header
    And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
    And user click on signin button
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

  @R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-6841 @ZYP_MYACCOUNT_K6841-10632 @CR-RKA
  Scenario: Verify that Payment Details are not updated if User clicks on Cancel CTA
  Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on SignIn link from global header
  	And user enter the valid emailaddress "EmailAddress" 
		And user enter the valid password "Password" 
    And user click on signin button
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

#  #@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-6841
#  #@ZYP_MYACCOUNT_K6841-10978 
#  #Scenario:
#  #	Verify that authenticated user is able to add new credit/debit card
#  #	Given user launches the browser and navigates to "ASO_HOME" page
#  #	When user clicks on SignIn link from global header
#  #	And user enter the valid emailaddress "EmailWithExistingCreditCard"
#  #	And user enter the valid password "Password"
#  #	And user click on signin button
#  #	And user clicks on payment tab
#  #	And user clicks on add new credit card cta
#  #	And user fills the credit/debit form
#  #	And user clicks on add cta
#  
