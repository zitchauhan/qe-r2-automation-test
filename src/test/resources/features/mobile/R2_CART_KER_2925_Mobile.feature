Feature: Place Order

@R2_Mobile @R2_Regression @P-High @C-Checkout @KER-2925 @ZYP_CART_K2925-8190 @ZYP_CART_K2925-8191 @ZYP_CART_K2925-8192 @ZYP_CART_K2925-8194 @ZYP_CART_K2925-11126 @CR-AG @1HR_R2
Scenario Outline: verify if user should be able to submit the order on the checkout page
 Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
	Then Verify the message on the page
    |# Following Message should show on the page|
    |By placing this order, I accept Academy's|
    |Terms and Conditions|
    |Privacy Policy|
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order 
	Then Verify the message on the page 
		|# Message for successful order is displayed		|
		|THANKS FOR SUBMITTING YOUR ORDER!					|
		|Your confirmation email is on its way|
    And user click on MyAccount
	And user click on Orders link
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
	And user click on view Details
    Then user able to see the same order ID in My order section
	Examples: 
		|Payment Type	|
		|Credit Card - VISA	|


#   	@R2_Mobile @R2_Regression @P-Highest @C-Checkout @KER-2925 @ZYP_CART_K2925-8192 @CR-AG 
#Scenario: Verify if Order status is updated in 'My account'
#    Given user launches the browser and navigates to "ASO_HOME" page 
#    And user clicks on SignIn link from global header
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#    And user click on signin button
#	When User searches a product "productName" and navigates to PDP
#	And user click on Add to Cart Button 
#	And user click on checkout button
#	Then user fill email address in payment
#	Then user clicks on the Review order button
#	And user able to see the button place order
#	And user check order confirmation status in order summary page
#	Then Verify the message on the page
#    |# Following Error Message should show on the page|
#    |Your confirmation email is on its way|
#    And user click on MyAccount
#	And user click on Orders link
#	Then Verify below Sub/Main Module of My Account
#    |#Verify following elements in my account order details|
#    |Order_View_Details_Btn|
#	And user click on view Details
#    Then user able to see the same order ID in My order section


      ################ Below one has to enter wrong payment details which will accept the payment but reject in order confirmation page ########
#    @R2_Mobile @R2_Regression @P-Low @C-Checkout @KER-2925 @ZYP_CART_K2925-8193 @CR-AG 
#Scenario: Verify if Order status is updated in 'My account'
#    Given user launches the browser and navigates to "ASO_HOME" page 
#	When User searches a product "productName" and navigates to PDP
#	And user click on Add to Cart Button 
#	And user click on checkout button
#	And user fill the PO box in shipping address 
#	And user click on Go To Shipping Method button in Checkout page
#	Then user click on go to payment present in shipping method
#	And user verifies master card entery in the card fields
#	Then user fill email address in payment
#	Then user clicks on the Review order button
#	And user able to see the button place order
#	And user check order confirmation status in order summary page
#	Then Verify the message on the page
#    |# Following Error Message should show on the page|
#    |Your confirmation email is on its way|
#    #Unable to get any error msgs
#    
 ###########################################################################################   
        
# @R2_Mobile @R2_Regression @P-High @C-Checkout @KER-2925 @ZYP_CART_K2925-8194 @CR-AG 
#Scenario: Verify if user can see legal disclaimer while placing the order
#    Given user launches the browser and navigates to "ASO_HOME" page 
#	When User searches a product "productName" and navigates to PDP
#	And user click on Add to Cart Button 
#	And user click on checkout button
#	And user fill the PO box in shipping address 
#	And user click on Go To Shipping Method button in Checkout page
#	Then user click on go to payment present in shipping method
#	And user verifies master card entery in the card fields
#	Then user fill email address in payment
#	Then user clicks on the Review order button
#	Then Verify the message on the page
#    |# Following Message should show on the page|
#    |By placing this order, I accept Academy's|
#    |Terms and Conditions|
#    |Privacy Policy|

            
  @R2_Mobile @R2_Regression @P-Low @C-Checkout @KER-2925 @ZYP_CART_K2925-8195 @CR-AG 
Scenario Outline: Verify if user can click the legal disclaimer Terms and Conditions is clickable
    Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
#	And user fill the PO box in shipping address 
#	And user click on Go To Shipping Method button in Checkout page
#	Then user click on go to payment present in shipping method
#	And user verifies master card entery in the card fields
#	Then user fill email address in payment
#	Then user clicks on the Review order button
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |By placing this order, I accept Academy's|
    |Terms and Conditions|
    |Privacy Policy|
    And user clicks on the Terms and condition link and navigate to respective page
Examples: 
		|Payment Type	|
		|Credit Card - VISA	|
    
@R2_Mobile @R2_Regression @P-Low @C-Checkout @KER-2925 @ZYP_CART_K2925-8196 @CR-AG 
Scenario Outline: Verify if user can click the legal disclaimer Privacy policy is clickable
 Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	And user adds shipment address on checkout page for "guest" user
	And user selects shipment method on check out page for "guest" user
	And user add "<Payment Type>" details in payment method for "guest" user
#	And user fill the PO box in shipping address 
#	And user click on Go To Shipping Method button in Checkout page
#	Then user click on go to payment present in shipping method
#	And user verifies master card entery in the card fields
#	Then user fill email address in payment
#	Then user clicks on the Review order button
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |By placing this order, I accept Academy's|
    |Terms and Conditions|
    |Privacy Policy|
    And user clicks on the Privacy policy link and navigate to respective page
 Examples: 
		|Payment Type	|
		|Credit Card - VISA	|
		   
#  @R2_Mobile @R2_Regression @P-High @C-Checkout @KER-2925 @ZYP_CART_K2925-11126 @CR-AG 
#Scenario: Verify The customer should be taken to order confirmation page after successfully submitting the order
#    Given user launches the browser and navigates to "ASO_HOME" page 
#	When User searches a product "productName" and navigates to PDP
#	And user click on Add to Cart Button 
#	And user click on checkout button
#	And user fill the PO box in shipping address 
#	And user click on Go To Shipping Method button in Checkout page
#	Then user click on go to payment present in shipping method
#	And user verifies master card entery in the card fields
#	Then user fill email address in payment
#	Then user clicks on the Review order button
#	And user able to see the button place order
#	And user check order confirmation status in order summary page
	
	
	@R2_Mobile @R2_Regression @P-High @C-Checkout @KER-2925 @ZYP_CART_K2925-10284 @CR-AG 
  Scenario Outline: Verify In case Partial inventories are available for one or more item(s) in cart, display limited stock message to the user in checkout page.
    Given user launches the browser and navigates to "ASO_HOME" page
    Then user search the data in search box"<data>"
    Then User to select the product
    Then verify Sorry the selected item is limited to XYZ order.

    Examples: 
      | data                                          |
      | Magellan Outdoors Men's Neoprene Wading Boots |  
    

     	@R2_Mobile @R2_Regression @P-Highest @C-Checkout @KER-2925 @ZYP_CART_K2925-10294 @CR-AG 
Scenario: Verify Before clicking 'Place Order', if the user edits shipping address, the same should be updated in the order summary.
    Given user launches the browser and navigates to "ASO_HOME" page 
    And user clicks on the burger menu 
    And user clicks on SignIn link from global header
	And user logs in as "EmailAddress"
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#    And user click on signin button
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	Then user fill email address in payment
	Then user clicks on the Review order button
	And User clicks on edit CTA 
	Then user modify the shipping address
	And user fill the PO box in shipping address 
	And user click on Go To Shipping Method button in Checkout page
    Then user clicks on the Review order button
	And user able to see the button place order
	And user check order confirmation status in order summary page
    And user click on MyAccount
	And user click on Orders link
	Then Verify below Sub/Main Module of My Account
    |#Verify following elements in my account order details|
    |Order_View_Details_Btn|
	And user click on view Details
    Then user able to see the same order ID in My order section
    And user validate the same updated shipping address in my orders page

    
           	@R2_Mobile @R2_Regression @P-Highest @C-Checkout @KER-2925 @ZYP_CART_K2925-10295 @CR-AG 
Scenario: Verify Before clicking 'Place Order', if the user edits shipping method, the same should be updated in the order summary.
    Given user launches the browser and navigates to "ASO_HOME" page 
    And user clicks on the burger menu 
    And user clicks on SignIn link from global header
    And user logs in as "EmailAddress"
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#    And user click on signin button
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	Then user fill email address in payment
	Then user clicks on the Review order button
	And user clicks on edit shipping method cta 
	Then user modifies shipping method
	And user click on Go To Shipping Method button in Checkout page
    Then user clicks on the Review order button
	And user able to see the button place order
	And user check order confirmation status in order summary page
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Your confirmation email is on its way|
 
       @R2_Mobile @R2_Regression @P-Highest @C-Checkout @KER-2925 @ZYP_CART_K2925-10297 @CR-AG 
Scenario: Verify Before clicking 'Place Order', if the user edits payment method, the same should be updated in the order summary. Payment will be authorized to the updated payment method only upon click on Place Order.
    Given user launches the browser and navigates to "ASO_HOME" page 
    And user clicks on the burger menu 
    And user clicks on SignIn link from global header
#	And user enter the valid emailaddress "EmailAddress" 
#	And user enter the valid password "Password" 
#    And user click on signin button
    And user logs in as "EmailAddress"
	When User searches a product "productName" and navigates to PDP
	And user click on Add to Cart Button 
	And user click on checkout button
	Then user fill email address in payment
	Then user clicks on the Review order button
	And user clicks on edit payment cta 
	Then user is able to modify payment method
	And user click on Go To Shipping Method button in Checkout page
    Then user clicks on the Review order button
	And user able to see the button place order
	And user check order confirmation status in order summary page
	Then Verify the message on the page
    |# Following Error Message should show on the page|
    |Your confirmation email is on its way|
    
    