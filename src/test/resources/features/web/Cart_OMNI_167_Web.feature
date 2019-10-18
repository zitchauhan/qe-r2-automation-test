Feature: OMNI-167 Verify discount label is displaying when discount is less than $1

@C-Order @OMNI-167 @Regression @CR-MT @C-Cart
Scenario: Verify less than $1 discount is applied and displayed in order details
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUIdOfProductLs15" and navigates to PDP 
	And user click on ship it button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And verify Order Summary in Cart 
	Then user verifiy Order Total 
	And user view and Applied Promotions/Discounts "Promocode" 
	Then verify Promo code discount is applied

@C-Order @OMNI-167 @Regression @CR-MT @C-Cart
Scenario: To verify if less than $1 discount is applied and displayed in order confirmation page
	Given user launches the browser and navigates to "ASO_HOME" page 
	When User searches a product "SKUIdOfProductLs15" and navigates to PDP 
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




