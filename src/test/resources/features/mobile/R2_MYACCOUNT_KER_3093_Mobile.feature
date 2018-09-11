Feature: [Mobile]Verify Add Gift Card in Account 

@R2_Mobile @R2_Regression   @KER-3093  @ZYP_K3093-10308 @CR-RKA 
Scenario: Verify that user is able to see the Add new Gift card on empty Wallet 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
Then User clicks on the burger menu
Then user click on My Account and navigate to payment	  
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in payments page "Gift cart section"	|
		|PaymentPage_YouHaveNoGiftcardsListed_label		|
		|PaymentPage_AddNewGiftCard_btn					|
	
	
	@R2_Mobile @R2_Regression   @KER-3093  @ZYP_K3093-10309 @CR-RKA 
Scenario: Verify that user is able to see the Add new Gift card on empty Wallet 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
Then User clicks on the burger menu
Then user click on My Account and navigate to payment
	When user clicks on Add New Gift Card button 
Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments "Gift card section"	|
		|AddGiftCardPage_GiftCardNumber_txt									|
		|AddGiftCardPage_PIN_txt											|
		|AddGiftCardPage_Cancel_txt											|
		|AddGiftCardPage_Add_txt											|
	

 @R2_Mobile @R2_Regression   @KER-3093  @ZYP_K3093-10313 @CR-RKA
Scenario: Verify that user is able to see info tooltip against PIN field 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
Then User clicks on the burger menu
Then user click on My Account and navigate to payment
	When user clicks on Add New Gift Card button
	Then Verify below Sub/Main Module of My Account 
		|#Verify following elements in Payments "Gift card section tooltip"	|
		|AddGiftCardPage_Pin_toolTip|

########################		
		
#@R2_Web @R2_Regression @R2_All @P-High @C-MyAccount @KER-3093
#@ZYP_CART_K3093-10418 @CR-SK 
#Scenario: Verify that user is able to add a new gift card in My Account 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And user clicks on SignIn link from global header 
#	And user logs in as "RawUser" 
#	Then user click on My Account and navigate to payment
#	When user clicks on Add New Gift Card button 
#	And user enter valid "Valid16DigitGiftCardNumber" in Gift Card Number text field 
#	And user enter valid "Valid8DigitGiftCardPIN" in Gift Card PIN text field 
#	And clicks on Add button to add gift card 
#	And clicks on Add button to add gift card 
#	Then user should be able to see "Valid16DigitGiftCardNumber" Gift card
#	And user should be able to see available balance
#	And there should be a Remove link with cross icon
#########################	
	@R2_Mobile @R2_Regression   @KER-3093  @ZYP_K3093-10416 @CR-RKA
	Scenario: Verify that user returns to the empty Wallet on Cancel
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
Then User clicks on the burger menu
Then user click on My Account and navigate to payment
	When user clicks on Add New Gift Card button
	Then user click on cancel Gift card button  
	Then Verify below Sub/Main Module of My Account
   |#Verify following elements in Payments "Gift card section" |
   |PaymentPage_YouHaveNoGiftcardsListed_label		|
   |PaymentPage_AddNewGiftCard_btn					|

@R2_Mobile @R2_Regression   @KER-3093  @ZYP_K3093-10420 @CR-RKA
Scenario: Verify that user gets the error message on entering in-store credit gift card entry
Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
Then User clicks on the burger menu
Then user click on My Account and navigate to payment
	When user clicks on Add New Gift Card button
	Then user enter the Wrong Gift card and click on Add button 
 Then Verify the message on the page
   |#Verify following error Msg in Gift card section |
   |The combination of Gift Card Number and PIN is incorrect. Please try again.|
   
@R2_Mobile @R2_Regression   @KER-3093  @ZYP_K3093-10421 @CR-RKA
Scenario: Verify that user gets the error message on entering incorrect GC number
Given user launches the browser and navigates to "ASO_HOME" page 
Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
Then User clicks on the burger menu
Then user click on My Account and navigate to payment
	When user clicks on Add New Gift Card button
	Then user enter the Wrong Gift card and click on Add button 
 Then Verify the message on the page
   |#Verify following error Msg in Gift card section |
  |The combination of Gift Card Number and PIN is incorrect. Please try again.|

@R2_Mobile @R2_Regression   @KER-3093  @ZYP_K3093-10422 @CR-RKA
Scenario: Verify that user gets the error message on entering incorrect PIN
Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user logs in as "RawUser" 
	Then user click on My Account and navigate to payment
	When user clicks on Add New Gift Card button
	Then user enter the Wrong Gift card and click on Add button 
 Then Verify the message on the page
   |#Verify following error Msg in Gift card section |
   |Invalid Gift Card and PIN combination|

@R2_Mobile @R2_Regression   @KER-3093  @ZYP_K3093-10424 @CR-RKA
Scenario: Verify that user gets the error message on entering ZERO balance GC number
Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then user should able to click on Signin button
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
Then User clicks on the burger menu
Then user click on My Account and navigate to payment
	When user clicks on Add New Gift Card button
  Then user fill the Zero balance gift card number and pin 
Then Verify the message on the page
   |#Verify following MSG in Gift card section |
   |The Gift Card has a balance of $0.00 and cannot be used|


#@R2_Web @R2_Regression   @KER-3093  @ZYP_K3093-10425 @CR-RKA
#Scenario: Verify that user gets the error message on entering invalid/non-existing GC number
##Given user launches the browser and navigates to "ASO_HOME" page 
##	And user clicks on SignIn link from global header 
##	And user logs in as "RawUser" 
##	Then user click on My Account and navigate to payment
##	When user clicks on Add New Gift Card button
# 
#  Then user fill the Existing gift card number and pin 
#
##Then Verify the message on the page
##   |#Verify following MSG in Gift card section |
#     ||














#	
#	#		"Scenario: Verify that user is able to see the Add New Gift Card form
#	#Given User is logged in My Account on academy.com
#	#And User has empty wallet with no Gift Card (GC) added
#	#When User clicks on Payments tab in side navigation
#	#And clicks on Add New Gift Card button on the empty wallet
#	#Then user should be able to see the Add New Gift Card form in the same Gift Card section
#	#And Gift Card form should have the following fields:
#	#- Gift Card Number field
#	#- PIN field
#	#- Cancel CTA
#	#- Add CTA"