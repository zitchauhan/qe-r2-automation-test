Feature: [Mobile] My Account, Address Book 


@R2_Mobile @R2_Regression @R2_All @P-Highest @C-Checkout @KER-2926 @ZYP_CHECKOUT_K2926-8100_M @CR-AKK  
Scenario: To Edit cart items from Order summary 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button and navigates to Checkout page 
	When user clicks on Edit My cart in Order Summary 
	Then user should navigates to the CartPage "CartTitle" 
	
@R2_Mobile  @R2_Regression @R2_All @P-Low @C-Checkout @KER-2926 @ZYP_CHECKOUT_K2926-8098_M @CR-AKK 
	Scenario: To view the Order Summary details on the Check out 
		Given user launches the browser and navigates to "ASO_HOME" page 
		And User clicks on the burger menu
    	And User navigates to LThree
   		And user clicks on the product card and navigates to PDP
		And user click on Add to Cart Button  
		And user is navigated to Add to cart Notification popup 
		And user will click on View Cart button 
		And user navigate to Cart page 
		When user will click on Checkout button and navigates to Checkout page 
		And verify the presence of the following in the Order Summary 
		Then Verify below Sub/Main Module of Cart Page
		|# Verify following elements in Cart page"Order Summary"|
		|EstimatedShipping_txt|