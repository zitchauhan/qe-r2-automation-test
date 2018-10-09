Feature: [Web]Verify Add Gift Card in Account 

@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-3093
@ZYP_MYACCOUNT_K3093-10308 @CR-RKA 
Scenario: Verify that user is able to see the Add new Gift card on empty Wallet 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	Then user click on My Account and navigate to payment 
	Then user deletes all the GiftCards in MyAccount Payment page 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in payments page "Gift cart section"	|
		|PaymentPage_YouHaveNoGiftcardsListed_label		|
		|PaymentPage_AddNewGiftCard_btn					|
		
		
@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-3093
@ZYP_MYACCOUNT_K3093-10309 @CR-RKA @1HR_R2 
Scenario: Verify that user is able to see the Add new Gift card on empty Wallet 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments "Gift card section"	|
		|AddGiftCardPage_GiftCardNumber_txt									|
		|AddGiftCardPage_PIN_txt											|
		|AddGiftCardPage_Cancel_txt											|
		|AddGiftCardPage_Add_txt											|
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-3093
@ZYP_MYACCOUNT_K3093-10313 @CR-RKA 
Scenario: Verify that user is able to see info tooltip against PIN field 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments "Gift card section tooltip"	|
		|AddGiftCardPage_Pin_toolTip|
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-3093
@ZYP_MYACCOUNT_K3093-10416 @CR-RKA 
Scenario: Verify that user returns to the empty Wallet on Cancel 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	Then user click on My Account and navigate to payment
	Then user deletes all the GiftCards in MyAccount Payment page 
	When user clicks on Add New Gift Card button 
	Then user click on cancel Gift card button 
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments "Gift card section" |
		|PaymentPage_YouHaveNoGiftcardsListed_label		|
		|PaymentPage_AddNewGiftCard_btn					|
		
@R2_Web @R2_All @P-Low @C-Order @CC-MyAccount_Order @KER-3093
@ZYP_MYACCOUNT_K3093-10420 @CR-RKA 
Scenario:
Verify that user gets the error message on entering in-store credit gift card entry 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	Then user enter the Wrong Gift card and click on Add button 
	Then Verify the message on the page 
		|#Verify following error Msg in Gift card section |
		|The combination of Gift Card Number and PIN is incorrect. Please try again.|
		
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-3093
@ZYP_MYACCOUNT_K3093-10421 @CR-RKA 
Scenario:
Verify that user gets the error message on entering incorrect GC number 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	Then user click on My Account and navigate to payment 
	Then user deletes all the GiftCards in MyAccount Payment page
	When user clicks on Add New Gift Card button 
	Then user enter the Wrong Gift card and click on Add button 
	Then Verify the message on the page 
		|#Verify following error Msg in Gift card section |
		|Invalid GiftCard Number|
		
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-3093
@ZYP_MYACCOUNT_K3093-10422 @CR-RKA 
Scenario: Verify that user gets the error message on entering incorrect PIN 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	Then user enter the Wrong Gift card and click on Add button 
	Then Verify the message on the page 
		|#Verify following error Msg in Gift card section |
		|Invalid GiftCard Pin|
		
@R2_Web @R2_All @P-Low @C-Order @CC-MyAccount_Order @KER-3093
@ZYP_MYACCOUNT_K3093-10424 @CR-RKA 
Scenario:
Verify that user gets the error message on entering ZERO balance GC number 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	Then user fill the Zero balance gift card number and pin 
	Then Verify the message on the page 
		|#Verify following MSG in Gift card section |
		|The Gift Card has a balance of $0.00 and cannot be used|
		
		
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-3093
@ZYP_MYACCOUNT_K3093-10427 @CR-RKA 
Scenario: Verify that user gets the error message on blank GC number 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	And user enter valid "Valid8DigitGiftCardPIN" in Gift Card PIN text field 
	And clicks on Add button to add gift card 
	Then Verify the message on the page 
		|#verify ther following MSG is displayed|
		|Required|
		
		
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-3093
@ZYP_MYACCOUNT_K3093-10425 @CR-RKA 
Scenario:
Verify that user gets the error message on entering invalid/non-existing GC number 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	Then user enter the Wrong Gift card and click on Add button 
	Then Verify the message on the page 
		|#verify ther following MSG is displayed|
		|Invalid GiftCard Number|
		|Invalid GiftCard Pin|
		
		
@R2_Web @R2_All @P-Low @C-Order @CC-MyAccount_Order @KER-3093
@ZYP_MYACCOUNT_K3093-10429 @CR-RKA 
Scenario: Verify that user gets the error message on blank PIN 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	And user enter valid "Valid16DigitGiftCardNumber" in Gift Card Number text field 
	And clicks on Add button to add gift card 
	Then Verify the message on the page 
		|#verify ther following MSG is displayed|
		|Required|
		
@R2_Web @R2_Regression @R2_All @P-Low @C-MyAccount @KER-3093
@ZYP_MYACCOUNT_K3093-10430 @CR-RKA 
Scenario: Verify that user gets the error message on blank GC# and PIN 

	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	And clicks on Add button to add gift card 
	Then Verify the message on the page 
		|#verify ther following MSG is displayed|
		|Required|
		|Required|
		
		
@R2_Web @R2_All @P-High_Order @C-Order @CC-MyAccount_Order @KER-3093
@ZYP_MYACCOUNT_K3093-10415 @CR-RKA 
Scenario:
Verify that user is able to add a new GC having 16 digit with 4 or 8 digit PIN and old GC having 13 digit with 4 digit PIN in My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	And user enter valid "Valid16DigitGiftCardNumber" in Gift Card Number text field 
	And user enter valid "Valid8DigitGiftCardPIN" in Gift Card PIN text field 
	And clicks on Add button to add gift card 
	Then Verify below Sub/Main Module of My Account 
		|#verify the following|
		|PaymentPage_RemoveGiftCards_btnList			|
		
	When user clicks Remove button 
	
@R2_Web @R2_All @P-Low @C-Order @CC-MyAccount_Order @KER-3093
@ZYP_MYACCOUNT_K3093-10417 @CR-RKA 
Scenario:
Verify that user returns to the empty Wallet on Cancel with existing card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	And user enter valid "Valid16DigitGiftCardNumber" in Gift Card Number text field 
	And user enter valid "Valid8DigitGiftCardPIN" in Gift Card PIN text field 
	And clicks on Add button to add gift card 
	Given user clicks on Add New Gift Card button 
	Then user click on cancel Gift card button 
	Then Verify below Sub/Main Module of My Account 
		|#verify the following|
		|PaymentPage_RemoveGiftCards_btnList			|
		
@R2_Web @R2_All @P-High_Order @C-Order @CC-MyAccount_Order @KER-3093
@ZYP_MYACCOUNT_K3093-10419 @CR-RKA 
Scenario:
Verify that user is able to add a new gift card having 16 digit with 4 or 8 digit PIN in My Account with existing card 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	When user clicks on Add New Gift Card button 
	And user enter valid "Valid16DigitGiftCardNumber" in Gift Card Number text field 
	And user enter valid "Valid8DigitGiftCardPIN" in Gift Card PIN text field 
	And clicks on Add button to add gift card 
	Then Verify below Sub/Main Module of My Account 
		|#verify the following|
		|PaymentPage_RemoveGiftCards_btnList			|
		|PaymentPage_GiftCardHeader_label				|
		|PaymentPage_AddedGiftCards_txtList				|
		
