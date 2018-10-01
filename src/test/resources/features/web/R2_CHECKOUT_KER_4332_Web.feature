Feature: B10-500 - Buy Now on PDP


#@R2_Web @R2_Regression @R2_All @P-Highest @C-Checkout @KER-4332 @ZYP_CHECKOUT_K4332-9524 @CR-AKK
#Scenario: Verify user can navigates to Order confirmation page
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	When User searches a product "SKUNumber" and navigates to PDP
#	Then verify the buy now button is clickable
#	Then Verify the message on the page
#    |# Following Error Message should show on the page|
#	|ORDER NUMBER|
	
#	@R2_Web @R2_Regression @R2_All @P-Highest @C-Checkout @KER-4332 @ZYP_CHECKOUT_K4332-9525 @CR-AKK
#Scenario: Verify user can see order placed for selected single SKU on the PDP
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	When User searches a product "SKUNumber" and navigates to PDP
#	Then verify the buy now button is clickable
#	Then Verify the message on the page
#    |# Following Error Message should show on the page|
#	|ORDER NUMBER|
#	And user click on MyAccount
#	And user click on Orders link
#	Then Verify the message on the page
#    |# Following Error Message should show on the page|
#	|ORDERS|
	


#@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4332 @ZYP_CHECKOUT_K4332-9521 @CR-AKK
#Scenario: To Verify user can see the BUY NOW button in PDP
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	When User searches a product "SKUNumber" and navigates to PDP
#	Then Verify that Enable Buy Now button is displayed on PDP

#	@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4332 @ZYP_CHECKOUT_K4332-10316 @CR-AKK
#Scenario: Verify user can see order placed for selected single SKU on the PDP
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	When User searches a product "SKUNumber" and navigates to PDP
#	Then verify the buy now button is clickable
#	Then Verify the message on the page
#    |# Following Error Message should show on the page|
#	|ORDER NUMBER|
#	And user click on MyAccount
#	And user click on Orders link
#	Then Verify the message on the page
#    |# Following Error Message should show on the page|
#	|ORDER PLACED ON|
#	
#@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4332 @ZYP_CHECKOUT_K4332-9523 @CR-AKK @1HR_R2
#Scenario: Verify user can process the order
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user clicks on SignIn link from global header 
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#	And user click on signin button
#	When User searches a product "SKUNumber" and navigates to PDP 
#	When User clicks on Enable Buy Now button
#	Then Verify below Sub/Main Module of PDP
#    |#Verify following elements in PDP modal popup|
#    |Shipping_First_Name_txt|
#    |Shipping_Last_Name_txt|
#    
#   

 	@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4332 @ZYP_CHECKOUT_K4332-10317 @CR-AKK
Scenario: Verify Shipping address and method has no errors or does not require user attention Then user should be navigated to Order confirmation page
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUNumber" and navigates to PDP
	Then verify the buy now button is clickable
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|ORDER NUMBER|
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4332 @ZYP_CHECKOUT_K4332-10318 @CR-AKK
Scenario: Verify Payment information is authorized successfully Then user should be navigated to Order confirmation page
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUNumber" and navigates to PDP
	Then verify the buy now button is clickable
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|ORDER NUMBER|
	
		@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4332 @ZYP_CHECKOUT_K4332-10329 @CR-AKK
Scenario: Verify Academy.com should not consider any persistent item(s) in my cart while placing order using "Buy Now" from PDP
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUNumber" and navigates to PDP
	Then verify the buy now button is clickable
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|ORDER NUMBER|
	And user click on MyAccount
	And user click on Orders link
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|ORDER PLACED ON|
	
	@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4332 @ZYP_CHECKOUT_K4332-10330 @CR-AKK
Scenario: Verify The persistent cart should not be affect and any number of item(s) in the persistent cart should remain as is while placing order using Buy Now from PDP
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUNumber" and navigates to PDP
	Then verify the buy now button is clickable
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|ORDER NUMBER|
	And user click on MyAccount
	And user click on Orders link
	Then Verify the message on the page
    |# Following Error Message should show on the page|
	|ORDER PLACED ON|
	|ORDER NUMBER|
	
	