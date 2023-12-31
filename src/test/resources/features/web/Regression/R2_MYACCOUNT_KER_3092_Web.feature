Feature: E02-250- View Gift Card Details in Account 

@R2_Web @R2_Regression @R2_All @C-MyAccount @KER-3092
@ZYP_MYACCOUNT_K3092-10463 @CR-RKA 
Scenario: Verify The user must be able to input a valid email Id in checkout page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	Then user remove the gift card 
	Then Verify below Sub/Main Module of My Account 
		|#verify Add gift cart button is displaying after click on remove BTN|
		|PaymentPage_AddedGiftCards_txtList				|
		
		
@R2_Web @ZYP_MYACCOUNT_K3092-10462 @RegressionP2 @MyAccount @TC-OMNI-13379
Scenario: verify whether the user is able to delete a gift card from payment page
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "Login_username" 
	And user enter the valid password "Login_pwd" 
	And user click on signin button 
	Then user click on My Account and navigate payment
	Then user remove the GC 
	Then Verify below Sub/Main Module of My Account 
		|#verify Add gift cart button is displaying after click on remove BTN|
		|PaymentPage_AddedGiftCards_txtList		|
		
@R2_Web @R2_Regression @R2_All @P2 @C-MyAccount @KER-3092
@ZYP_MYACCOUNT_K3092-10459 @CR-RKA 
Scenario: Verify user is able to see the list of GCs with both 13 and 16 digit on the Payment page under My Account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	Then user click on My Account and navigate to payment 
	Then user filling the gift card detail
	Then Verify below Sub/Main Module of My Account 
		|#verify Remove giftcard is displayed after Adding gift cart |
		|PaymentPage_RemoveGiftCards_btnList|
		
		
		
