Feature: Place Order

@R2_Web @R2_Regression @P-High @C-Checkout @KER-2915 @ZYP_CART_K2915-8190 @CR-AG 
Scenario: verify if user should be able to submit the order on the checkout page
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user fill the PO box in shipping address 
	And user click on Go To Shipping Method button in Checkout page
	Then user click on go to payment present in shipping method
	And user verifies master card entery in the card fields
	Then user fill email address in payment
	Then user clicks on the Review order button
	And user able to see the button place order
	And user check order confirmation status in order summary page
	
	@R2_Web @R2_Regression @P-High @C-Checkout @KER-2915 @ZYP_CART_K2915-8191 @CR-AG 
Scenario: Verify if user received an oder confirmation email after successfully submitting the order
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user fill the PO box in shipping address 
	And user click on Go To Shipping Method button in Checkout page
	Then user click on go to payment present in shipping method
	And user verifies master card entery in the card fields
	Then user fill email address in payment
	Then user clicks on the Review order button
	And user able to see the button place order
	And user check order confirmation status in order summary page
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Your confirmation email is on its way|
    
    	@R2_Web @R2_Regression @P-Highest @C-Checkout @KER-2915 @ZYP_CART_K2915-8192 @CR-AG 
Scenario: Verify if Order status is updated in 'My account'
    Given user launches the browser and navigates to "ASO_HOME" page 
    And user clicks on SignIn link from global header
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
    And user click on signin button
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	Then user clicks on the Review order button
	And user able to see the button place order
	And user check order confirmation status in order summary page
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Your confirmation email is on its way|
    #User navigation to myorders page yet to make
    
        	@R2_Web @R2_Regression @P-Low @C-Checkout @KER-2915 @ZYP_CART_K2915-8193 @CR-AG 
Scenario: Verify if Order status is updated in 'My account'
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user fill the PO box in shipping address 
	And user click on Go To Shipping Method button in Checkout page
	Then user click on go to payment present in shipping method
	Then user enters wrong card detail in payment section
	Then user fill email address in payment
	Then user clicks on the Review order button
	And user able to see the button place order
	And user check order confirmation status in order summary page
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Your confirmation email is on its way|
    #Unable to get any error msgs
    
    
        
 @R2_Web @R2_Regression @P-High @C-Checkout @KER-2915 @ZYP_CART_K2915-8194 @CR-AG 
Scenario: Verify if user can see legal disclaimer while placing the order
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user fill the PO box in shipping address 
	And user click on Go To Shipping Method button in Checkout page
	Then user click on go to payment present in shipping method
	Then user enters wrong card detail in payment section
	Then user fill email address in payment
	Then user clicks on the Review order button
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |By placing this order, I accept Academy's|
    |Terms and Conditions|
    |Privacy Policy|

            
 @R2_Web @R2_Regression @P-Low @C-Checkout @KER-2915 @ZYP_CART_K2915-8195 @CR-AG 
Scenario: Verify if user can click the legal disclaimner Terms and Conditions is clickable
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user fill the PO box in shipping address 
	And user click on Go To Shipping Method button in Checkout page
	Then user click on go to payment present in shipping method
	Then user enters wrong card detail in payment section
	Then user fill email address in payment
	Then user clicks on the Review order button
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |By placing this order, I accept Academy's|
    |Terms and Conditions|
    |Privacy Policy|
    And user clicks on the Terms and condition link and navigate to respective page
    
@R2_Web @R2_Regression @P-Low @C-Checkout @KER-2915 @ZYP_CART_K2915-8196 @CR-AG 
Scenario: Verify if user can click the legal disclaimner Privacy policy is clickable
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user fill the PO box in shipping address 
	And user click on Go To Shipping Method button in Checkout page
	Then user click on go to payment present in shipping method
	Then user enters wrong card detail in payment section
	Then user fill email address in payment
	Then user clicks on the Review order button
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |By placing this order, I accept Academy's|
    |Terms and Conditions|
    |Privacy Policy|
    And user clicks on the Privacy policy link and navigate to respective page