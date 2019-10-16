Feature: OMNI-1062, OMNI-167 & OMNI-1070 

@R2_Web @C-Order @CC-Cart_Order @R2_All @P-High_Order @R2 @KER-2940 
@ZYP_CART_K2940-167 @CR-AKK @testCCExternal
Scenario: Verify less than $1 discount is applied and displayed in order details
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "academyLogoArmchairSKU" and navigates to PDP 
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And verify Order Summary in Cart 
	Then user verifiy Order Total 
	And user view and Applied Promotions/Discounts "Promocode" 
	Then verify Promo code discount is applied


@C-Order @CC-Cart_Order @R2_All @P-High_Order @R2 @KER-2940 @ZYP_CART_K2941-167 @CR-AKK @R2_Web
Scenario: To verify if less than $1 discount is applied and displayed in order confirmation page
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "academyLogoArmchairSKU" and navigates to PDP 
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And verify Order Summary in Cart 
	Then user verifiy Order Total 
	And user view and Applied Promotions/Discounts "Promocode" 
	And verify Promo code discount is applied
	And user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page
	And user click on go to payment present in shipping method
	Then user click on GiftCard Plus icon in Checkout page
	And user enter Gift card Number "Valid16DigitGiftCardNumber"
	And user enter Pin Number "Valid8DigitGiftCardPIN" 
	And user click on Apply button
	And user enter the email address for order confirmation
	Then user click on review order button
	And user clicks on place order on checkout page 
	And verify user is able to successfully place the order  
	Then verify discount is displayed

Scenario: Verify Free Shipping and BOPIS Messaging in the Header
	Given user launches the browser and navigates to "ASO_HOME" page
	Then verify Free Shipping and BOPIS Messaging is displayed in the Header
	When user clicks on "first" half of promotion message
	And user lands on free shipping promotional disclaimer page
	When user clicks on "second" half of promotion message
	And user lands on pick up for messaging page
	And when user clicks on select a store link on promtion message
	And Find Store Modal should pop-up

@testCCExternal1
Scenario: Verify order summary update when customer selects an upgrade their shipping method in checkout
    Given user launches the browser and navigates to "ASO_HOME" page	
    And User navigates to L2 Grills Outdoor cooking 
	And user clicks on one of the subcategory of Grills Outdoor 
	And user select the product 
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user will click on View Cart button 
	And user will click on Checkout button and navigates to Checkout page
	When user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "ZIPCODE"
	Then user click on Go To Shipping Method button in Checkout page
	And user upgrade the shipping method from the shipping method dropdown 
	And user verify order summay is updated 



