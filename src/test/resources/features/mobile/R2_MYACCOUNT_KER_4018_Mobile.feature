Feature: Order Cancellation Guest Customer Order Search 

@R2_Mobile  @R2_All @P-Low @C-Order @CC-MyAccount_Order   @KER-4018 
@ZYP_MYACCOUNT_K4018-10658 @CR-AKK 
Scenario Outline:
Verify that the error message is displayed if Guest user enters invalid Order number or Billing Zip Code 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to Check Oder status Page 
	When user enter "<InvalidOrdernumber>" and "<InvalidBillingZipcode>" 
	And User clicks on Check button 
	Then Verify that error message is displayed 
	Examples: 
		|InvalidOrdernumber|InvalidBillingZipcode |
		|2421424		   | 14124				  |
		
@R2_Mobile  @R2_All @P-Low @C-Order @CC-MyAccount_Order   @KER-4018 
@ZYP_MYACCOUNT_K4018-KER-10653 @CR-AKK 
Scenario:
Verify that the Guest user is able to navigate to check order status page. 
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to Check Oder status Page 
	Then Verify the message on the page 
		|# Following Message should show on the page| 
		|Order Number|
		|Billing Zip Code|
		
@R2_Mobile  @R2_All @P-High_Order @C-Order @CC-MyAccount_Order   @KER-4018 
@ZYP_MYACCOUNT_K4018-10657 @CR-AKK 
Scenario Outline:
Verify that the error message is displayed if Guest user enters order detail not matching with valid order 
	Given user launches the browser and navigates to "ASO_HOME" page 
And User navigates to Check Oder status Page 
When user enter "<InvalidOrdernumber>" and "<ValidBillingZipcode>" 
And User clicks on Check button 
Then Verify that error message is displayed 
Examples: 
	|InvalidOrdernumber|ValidBillingZipcode   |
	|2421424		   | 77450			  	  |
	
	
	@R2_Mobile  @R2_All @P-Low @C-Order @CC-MyAccount_Order   @KER-4018 
	@ZYP_MYACCOUNT_K4018-10654 @CR-AKK 
	Scenario Outline:
	Verify that the Guest user is not able to enter non numerical values in Order number and Billing Zip code fields. 
		Given user launches the browser and navigates to "ASO_HOME" page 
And User navigates to Check Oder status Page 
When user enter "InvalidOrdernumber" and "InvalidBillingZipcode" 
And User clicks on Check button 
Then Verify that error message is displayed 
Examples: 
	|InvalidOrdernumber|InValidBillingZipcode   |
	|ABNNC		   | BAV		  	  |
	
	@R2_Mobile  @R2_All @P-High_Order @C-Order @CC-MyAccount_Order   @KER-4018 
	@ZYP_MYACCOUNT_K4018-10656 @CR-AKK 
	Scenario Outline:
	Verify that the error message is displayed if Guest user enters order detail not matching with valid order 
		Given user launches the browser and navigates to "ASO_HOME" page 
And User navigates to Check Oder status Page 
When user enter "<ValidOrdernumber>" and "<InvalidBillingZipcode>" 
And User clicks on Check button 
Then Verify that error message is displayed 
Examples: 
	|ValidOrdernumber|InValidBillingZipcode   |
	|9052176008		   | 77450			  	  |
	
	
@R2_Mobile  @R2_All @P-Highest @1HR_R2 @C-Order @CC-MyAccount_Order  
@KER-4018 
@ZYP_MYACCOUNT_K4018-10659 @CR-AKK 
Scenario:
Verify that the error message is displayed if Guest user enters order detail not matching with valid order 
Given user launches the browser and navigates to "ASO_HOME" page 
When User searches a product "productName" and navigates to PDP 
And user click on Add to Cart Button 
And user is navigated to Add to cart Notification popup 
And user will click on View Cart button 
And user navigate to Cart page 
And user click on checkout button in Cart page 
And  user enter First name "FirstName" 
And  user enter Last name "LastName" 
And  user enter Phone number "PhoneNumber" 
And  user enter Address "AVSAddress" 
And  user enter Zipcode "zipcode" 
And  user click on Go To Shipping Method button in Checkout page 
And  user selects the suggested address instead of entered address 
And  clicks on Use Selected Address button 
And user clicks on edit shipping method cta 
And user click on go to payment present in shipping method 
And user fill the credit card detail in payment 
And user fill the email address for shipment and click on review order btn 
And user able to see the button place order 
Then user able to see order number 
And User navigates to Check Oder status Page 
Then System Generate ordernumber "GeneratedOrdernumber" and "zipcode" 
	And User clicks on Check button 
	Then Order Details page should be displayed 
	And Billing information associated with order should NOT be displayed 
	
	
@R2_Mobile  @R2_All @P-Highest @1HR_R2 @C-Order @CC-MyAccount_Order  
@KER-4018 
@ZYP_MYACCOUNT_K4018-10660 @CR-AKK 
Scenario:
Verify that Authenticated user is able to view order details if clicks check order status in footer. 
	Given user launches the browser and navigates to "ASO_HOME" page 
Then User clicks on the burger menu 
And user clicks on SignIn link from global header 
And user enter the valid emailaddress "EmailAddress" 
And user enter the valid password "Password" 
And user click on signin button 
And User navigates to Check Oder status Page 
Then system should navigate the authenticated user to Order Details page in my account page 
And the Authenticated user should see all the placed orders in my account order details page 




