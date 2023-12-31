Feature: [Web]B05-350 Shipping Estimate in Cart
 
@R2_Web @R2_Regression @R2_All @P2 @C-Cart @KER-3511 @ZYP_CART_K3511-7991 @CR-DPK @1HR_R2
Scenario: Verify if authenticated user can view updated estimated shipping when zip code updated on cart page in order summary section.
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user clicks on SignIn link from global header
 	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And User Navigates L2 form Homepage Header 
    And User clicks on product in PLP
	#Then user click on Add to Cart Button
	And user click on ship it button
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user clicks on Change Zip Code link in Estimated shipping section of Order Summary section on Cart page
	And user enters new "Zipcode" in Change ZIP Code modal overlay 
	And user clicks on Submit button
	Then user verifies the estimated shipping cost based on updated zip code.
	
	
	
	@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-3511 @ZYP_CART_K3511-7992 @CR-DPK
	Scenario: Verify if unauthenticated user can view estimated shipping cost based entered zip code
	Given user launches the browser and navigates to "ASO_HOME" page
	And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	#Then user click on Add to Cart Button
	And user click on ship it button
	And user will click on View Cart button 
	When user clicks on Change Zip Code link in Estimated shipping section of Order Summary section on Cart page
	And user enters new "Zipcode" in Change ZIP Code modal overlay 
	And user clicks on Submit button
	Then user verifies the estimated shipping cost based on updated zip code.
	
	

@R2_Web @R2_Regression @C-Cart @P2 @KER-3511 @ZYP_CART_K3511-7989 @CR-RKA 
Scenario: Verify if authenticated user can view estimated shipping based on zip code saved to their account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button
	And user click on MyAccount 
	And user lands on My Account page and click on adress 
	Then user fill the Address book details 
	When User Navigates L2 form Homepage Header 
	And User clicks on product in PLP 
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then Verify below Sub/Main Module of Cart Page 
		|#Verify Estimated Shipping amount is displayed #|
		|EstimatedShippingPrice_Txt|
         
         
         
@R2_Web @R2_Regression @C-Cart @P-Low @KER-3511 @ZYP_CART_K3511-7990 @CR-RKA 
Scenario: Verify if authenticated user can view updated estimated shipping based on updated zip code saved in account 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And clicks on SignIn button in home page 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And user click on MyAccount 
	And user lands on My Account page and click on adress 
	Then user fill the Address book details 
	When User Navigates L2 form Homepage Header 
	And User clicks on product in PLP 
	#And user click on Add to Cart Button
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	Then user change zip code 
	Then Verify below Sub/Main Module of Cart Page 
		|#Verify Estimated Shipping amount is displayed #|
		|EstimatedShippingPrice_Txt|
        
		
	
	

@R2_Web @R2_Regression @R2_All @P-Low  @C-Cart @KER-3511 @ZYP_CART_K3511-12777 @CR-RKA 
Scenario: Verify if geo location is not selected as US
Given user launches the browser and navigates to "ASO_HOME" page 
 When User searches a product "productName" and navigates to PDP
    #And user click on Add to Cart Button
    And user click on ship it button
    And user is navigated to Add to cart Notification popup
    And user will click on View Cart button
Then user click on change zip code and fill the zip code outside the US
 Then Verify below Sub/Main Module of Cart Page
 |#verify the extimated Tax is ZERO|
 |EstimatedTaxes_txt|

@R2_Web @R2_Regression @R2_All @P-Low  @C-Cart @KER-3511 @ZYP_CART_K3511-12776 @CR-RKA
Scenario: Verify if user selected zip code other than US states
Given user launches the browser and navigates to "ASO_HOME" page 
 When User searches a product "productName" and navigates to PDP
    #And user click on Add to Cart Button
    And user click on ship it button
    And user is navigated to Add to cart Notification popup
    And user will click on View Cart button
Then user click on change zip code and fill the zip code outside the US
Then Verify below Sub/Main Module of Cart Page
 |#verify the extimated Tax is ZERO|
 |EstimatedTaxes_txt|
 
 @R2_Mobile @R2_Regression @R2_All @P-Low  @C-Cart @KER-3511 @ZYP_CART_K3511-12758 @CR-RKA
Scenario: verify if proper validation message is displayed if user already has products in his cart and tries to add a Zip code"
Given user launches the browser and navigates to "ASO_HOME" page 
 When User searches a product "productName" and navigates to PDP
    #And user click on Add to Cart Button
    And user click on ship it button
    And user is navigated to Add to cart Notification popup
    And user will click on View Cart button
Then user click on zip code and fill the zip code of restricted state
Then Verify below Sub/Main Module of Cart Page
 |#verify the extimated Tax is ZERO|
 |EstimatedTaxes_txt|
 