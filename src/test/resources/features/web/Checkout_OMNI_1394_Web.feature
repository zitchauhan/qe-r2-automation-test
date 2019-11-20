Feature: Verify Shipping charge is displaying correctly from cart to checkout for the combination of DSV and 
				 non-DSV items in the cart

@OMNI-1394 @C-Order @Regression @CR-NS @C-Checkout @Web
Scenario:  Checkout - Display appropriate shippping charge in shipping method section and order summary
    Given user launches the browser and navigates to "ASO_HOME" page 
	And user enters "dsv_sku" in the searchbox  
	And user click on ship it button
	And user click on continue shopping 
	And User searches a product "SKUIdOfProductLs15" and navigates to PDP 
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
	And user verify shipping charges on order summary is as per shipping methods 

