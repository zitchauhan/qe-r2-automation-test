Feature: BOPIS Alternate Pickup Person


@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-4764 @ZYP_CHECKOUT_K4764-10820 @CR-AKK
Scenario: Verify customer must be able to select and Me + Alternate Pickup Person from Who Is Picking Up Dropdown during checkout
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And  user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then Verify below Sub/Main Module of Checkout Page
	|# Me+Alternate pick person should get selected |
	|MePickUp_Drpdwn|
	
@R2_Mobile @R2_Regression @R2_All @P-High @1HR_R2 @C-Checkout @KER-4764 @ZYP_CHECKOUT_K4764-10821 @CR-AKK	
 Scenario: Verify after selecting Me + Alternate Pickup Person during checkout Alternate Pickup Person fields must display
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button 
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And  user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then Verify the message on the page
	|#Then given below fields should display for the details of Alternative pickup person|
		|Alternate's First Name|
		|Alternate's Last Name |
		|Alternate's Email Address|
		|Alternate's Phone Number |
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-4764 @ZYP_CHECKOUT_K4764-10822 @CR-AKK	
 Scenario: Verify after selecting Me + Alternate Pickup Person during checkout Alternate Pickup Person fields must display
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button  
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And  user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then Verify the message on the page
	|#Then given below fields should display for the details of Alternative pickup person|
		|Alternate's First Name|
		|Alternate's Last Name |
		|Alternate's Email Address|
		|Alternate's Phone Number |	
	And user enter the Store Pickup Alternates FirstName "PickupFirstName"
	And user enter the Store Pickup Alternates LastName "PickupLastName"
	And user enter the Store Pickup Alternates Email "PickupEmail"
	And user enter the Store Pickup Alternates PhoneNumber "PickupPhoneNumnber"
	Then user click on confirm button
	
	
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-4764 @ZYP_CHECKOUT_K4764-10823 @CR-AKK	
Scenario: Verify Mandatory fields for alternative pick up person details
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button   
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And  user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then Verify the message on the page
	|#Then given below fields should display for the details of Alternative pickup person|
		|Alternate's First Name|
		|Alternate's Last Name |
		|Alternate's Email Address|
		|Alternate's Phone Number |
	And user click on confirm button
	Then Verify below Sub/Main Module of Checkout Page
	|# verify the error message |
	|ErrorMsgRequired|
		
@R2_Mobile @R2_Regression @R2_All @P-High @C-Checkout @KER-4764 @ZYP_CHECKOUT_K4764-10831 @CR-AKK		
Scenario: Verify No alternate pickup person may be entered for restricted products
Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User navigates to LThree 
	And user clicks on the product card and navigates to PDP 
	And user click on Add to cart button  
	Then user is navigated to Add to cart Notification popup  
	And user will click on View Cart button 
	And user will verify in-store pick up radio button is selected with "FindAsStoreZIPCode" 
	And  user will click on Checkout button and navigates to Checkout page
	When user click on edit shipping pickup
	And user select me + alternate pickup person
	Then Verify below Sub/Main Module of Checkout Page   
	|# Me+Alternate pick person should get selected |
	|MePickUp_Drpdwn|

		 
	
	