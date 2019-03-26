Feature: Release issues which were fixed in different releases

#@R2_Web @R2_Regression @R2_All @C-Checkout @Release_issues
#Scenario: AVS & CVV Message validation
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	And User Navigates L2 form Homepage Header 
#	And User clicks on product in PLP 
#	Then user click on Add to Cart Button 
#	And user will click on View Cart button 
#	And user click on checkout button
#	And user adds shipment address on checkout page for "guest" user 
#	And user selects shipment method on check out page for "guest" user 
#	
#	
@R2_Web @R2_Regression @R2_All @C-PLP @Release_issues
Scenario: Check mobile number for special pricing
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user navigates to hunting accessories category
	Then user select the category as scents
	And user check for the product having for special pricing call message on product card
	Then user verify the special pricing number "MobileNumber"
	
@R2_Web @R2_Regression @R2_All @C-PLP @Release_issues @Dummy
Scenario: Verify that 100% promo is workinhg for guest user and user is able to checkout using Gift card
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "itemwithFreeshipping" in the searchbox
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user view and Applied Promotions/Discounts "100%Promo"
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
	Then verify user is able to successfully place the order  
	
	
	
@R2_Web @R2_Regression @R2_All @C-Checkout @Release_issues
Scenario: Verify Age restriction checkbox on checkoutpage for ammo
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "ammoSKU" in the searchbox
	#And user click on Add to Cart Button 
	And user click on ship it button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page
	And user click on go to payment present in shipping method
	And user add "Credit Card" details in payment method for "guest" user 
	Then user verify the age restriction checkbox
	And user clicks on place order on checkout page 
	Then verify user is able to successfully place the order  
	
	
@R2_Web @R2_Regression @R2_All @C-Cart @Release_issues
Scenario: Verify ammo disclaimer should appear in PDP and View cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "ammoSKU" in the searchbox
	And user verify the ammo disclaimer on PDP
	#And user click on Add to Cart Button 
	And user click on ship it button
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user verify the ammo disclaimer on cart
	
	
	
@R2_Web @R2_Regression @R2_All @C-PLP @Release_issues
Scenario: Verify ammo disclaimer should appear in PDP and View cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And user navigates to ammuniation category
	And user verify the PPU in PLP page
	
@R2_Web @R2_Regression @R2_All @C-PDP @Release_issues
Scenario: Verify store name on LSI on PDP is clickable
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "Postal_Code" 
	When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user verify that the store name is clickable
    
@R2_Web @R2_Regression @R2_All @C-HP @Release_issues
Scenario: Verify closed should render for closed store
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "closed_store" 
	And user check that the selected store is closed

 
    

	
