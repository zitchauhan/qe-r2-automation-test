Feature:  Shipping Methods - White Glove Service


@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6760 @ZYP_CHECKOUT_K6760-8941 @CR-SG 
Scenario: Verify that the Authorized user is able to view the default services available for WG items
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Grills Outdoor cooking
	And user clicks on one of the subcategory of Grills Outdoor
	And user select the product
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	Then user verify the default service available for WG items
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6760 @ZYP_CHECKOUT_K6760-8943 @CR-SG 
Scenario: Verify that the Authorized user is able to view the all White Glove service available for WG items 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Grills Outdoor cooking 
	And user clicks on one of the subcategory of Grills Outdoor 
	And user select the product 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	Then user verify the default service available for WG items
	Then User click on the edit button in Shipping method
	And user verify the WG services available
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6760 @ZYP_CHECKOUT_K6760-9176 @CR-SG 
	Scenario: Verify that the Authorized user is able to view the details of Bulk Carrier Service -Threshold for WG items
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Grills Outdoor cooking 
	And user clicks on one of the subcategory of Grills Outdoor 
	And user select the product 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	Then user verify the default service available for WG items
	Then User click on the edit button in Shipping method
	And user select the Scheduled Delivery WG service
	And user click on go to payment present in shipping method
	Then user verify the Schedule service available for WG items
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6760 @ZYP_CHECKOUT_K6760-11312 @CR-SG 
	Scenario: Verify If an order has multiple WG items, each item would be charges separately for each selected WG Ship method
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Grills Outdoor cooking 
	And user clicks on one of the subcategory of Grills Outdoor 
	And user select the product 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	Then user verify the default service available for WG items
	Then User click on the edit button in Shipping method
	And user select the Scheduled Delivery WG service
	And user click on go to payment present in shipping method
	Then user verify the Schedule service available for WG items
	
@R2_Web @R2_Regression @R2_All @P-Medium @C-Checkout @KER-6760 @ZYP_CHECKOUT_K6760-9178 @CR-SG 
	Scenario: Verify If an order has multiple WG items, each item would be charges separately for each selected WG Ship method
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on SignIn link from global header 
	And user enter the valid emailaddress "EmailAddress" 
	And user enter the valid password "Password" 
	And user click on signin button 
	And User navigates to L2 Grills Outdoor cooking 
	And user clicks on one of the subcategory of Grills Outdoor 
	And user select the product 
	And User is navigated to pdp page 
	And user click on Add to Cart Button 
	And user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And user will click on Checkout button 
	Then user verify the default service available for WG items
	Then User click on the edit button in Shipping method
	And user select the Room of choice Delivery WG service
	And user click on go to payment present in shipping method
	Then user verify the Room of choice service available for WG items
	
	
	