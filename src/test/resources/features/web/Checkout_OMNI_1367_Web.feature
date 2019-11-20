Feature: Allow the shipping method price and shipping price under the order summary in checkout to calculate correctly 
         when the cart is modified

@OMNI-1367 @C-Order @Regression @CR-NS @C-Checkout	
Scenario: Verify Shipping price in the shipping method and order summary matches when the shipping method is upgraded 
          and the cart was modified

	Given user launches the browser and navigates to "ASO_HOME" page 
	And user enters "SKUIdOfProductGr25" in the searchbox  
	And user click on ship it button
	And user click on continue shopping 
	And User searches a product "productName" and navigates to PDP 
	And user click on ship it button	
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page
	And user verify shipping charges on order summary is as per shipping methods 
	And user modifies shipping method
	When user clicks on Go to payment CTA
	And user verify shipping charges on order summary is as per shipping methods
	#And user clicks on mini cart Icon
	And User clicks on the minicart icon and navigated to minicart
	And User searches a product "dsv_sku" and navigates to PDP 
	And user click on ship it button	
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user verify shipping charges on order summary is as per shipping methods 
	
@OMNI-1367 @C-Order @Regression @CR-NS @C-Checkout	
Scenario: Verify Shipping price in the shipping method and order summary matches when the shipping method is upgraded 
          and the quanity updated on cart

	Given user launches the browser and navigates to "ASO_HOME" page 
	And user enters "SKUIdOfProductGr25" in the searchbox  
	And user click on ship it button
	And user click on continue shopping 
	And User searches a product "productName" and navigates to PDP 
	And user click on ship it button	
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user click on checkout button in Cart page 
	And user enter First name "FirstName" 
	And user enter Last name "LastName" 
	And user enter Phone number "PhoneNumber" 
	And user enter Address "Address" 
	And user enter Zipcode "zipcode" 
	Then user click on Go To Shipping Method button in Checkout page
	And user verify shipping charges on order summary is as per shipping methods 
	And user modifies shipping method
	When user clicks on Go to payment CTA
	And user verify shipping charges on order summary is as per shipping methods
	#And user clicks on mini cart Icon
	And User clicks on the minicart icon and navigated to minicart
	When user increases products quantity 
	And user click on checkout button in Cart page 
	And user verify shipping charges on order summary is as per shipping methods 
	
		
	