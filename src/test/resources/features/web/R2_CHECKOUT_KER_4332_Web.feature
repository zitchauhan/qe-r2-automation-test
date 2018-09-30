Feature: B10-500 - Buy Now on PDP

@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4332 @ZYP_CHECKOUT_K4332-9521 @CR-AKK
Scenario: To Verify user can see the BUY NOW button in PDP
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUNumber" and navigates to PDP
	Then Verify that Enable Buy Now button is displayed on PDP
	
@R2_Web @R2_Regression @R2_All @P-High @C-Checkout @KER-4332 @ZYP_CHECKOUT_K4332-9523 @CR-AKK @1HR_R2
Scenario: Verify user can process the order
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	When User searches a product "SKUNumber" and navigates to PDP 
	When User clicks on Enable Buy Now button
	Then Verify below Sub/Main Module of PDP
    |#Verify following elements in PDP modal popup|
    |Shipping_First_Name_txt|
    |Shipping_Last_Name_txt|