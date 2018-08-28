Feature: Verify Add Gift Card in Account 

@R2_Web @R2_Regression @R2_All @P-Highest @C-My_Account @KER-3093 @ZYP_CART_K3093-10308 @CR-SK 
Scenario: Verify that user is able to see the Add new Gift card on empty Wallet
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user logs in as "RawUser"
	When user clicks on payment tab
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in payments page	|
		|PaymentPage_YouHaveNoGiftcardsListed_label		|
		|PaymentPage_AddNewGiftCard_btn					|
		

@R2_Web @R2_Regression @R2_All @P-High @C-My_Account @KER-3093 @ZYP_CART_K3093-10309 @CR-SK 
Scenario: Verify that user is able to see the Add New Gift Card form
	Given user launches the browser and navigates to "ASO_HOME" page
	And user clicks on SignIn link from global header
	And user logs in as "RawUser"
	And user clicks on payment tab
	When user clicks on Add New Gift Card button
	Then Verify below Sub/Main Module of My Account
		|#Verify following elements in Payments > Add New Gift card section	|
		|AddGiftCardPage_GiftCardNumber_txt									|
		|AddGiftCardPage_PIN_txt											|
		|AddGiftCardPage_Cancel_txt											|
		|AddGiftCardPage_Add_txt											|

		
		
#		"Scenario: Verify that user is able to see the Add New Gift Card form
#Given User is logged in My Account on academy.com
#And User has empty wallet with no Gift Card (GC) added
#When User clicks on Payments tab in side navigation
#And clicks on Add New Gift Card button on the empty wallet
#Then user should be able to see the Add New Gift Card form in the same Gift Card section
#And Gift Card form should have the following fields:
#- Gift Card Number field
#- PIN field
#- Cancel CTA
#- Add CTA"