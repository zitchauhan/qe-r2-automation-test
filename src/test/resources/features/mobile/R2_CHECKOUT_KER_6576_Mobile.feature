Feature: B04-350 - Display Simple Header on Checkout Page


	
@R2_Mobile @R2_Regression @R2_All @P-Highest @1HR_R2  @C-Checkout @KER-6576 @ZYP_CHECKOUT_K6576-8739 @CR-RK	
Scenario:  Verify the Elements present in Checkout footer
	    Given user launches the browser and navigates to "ASO_HOME" page  
	    And User clicks on the burger menu 
		And User navigates to LThree 
		And user clicks on the product card and navigates to PDP 
		Then user click on Add to Cart Button
		Then user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		And user will click on Checkout button and navigates to Checkout page
		Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout page"We Accept"|
		|Visa_img|
		|MasterCard_img|
		|Paypal_img|
		|AmericanExpress_img|
		|Discover_img|
		Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout footer_Lnk|
		|CheckoutFooterLegalLinkPrivacyPolicy_Lnk|
		|CheckoutFooterChatNowLink_lnk|
		|CheckoutFooterContactNumberLink_mobile_Lnk|
		|CheckoutFooterLegalLinkTermsConditions_lnk|
		|CheckoutFooterLegalLinkCaliforniaProposition65_Lnk|
		
		
		@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-6576 @ZYP_CHECKOUT_K6576-8742 @CR-RK
		Scenario:  Verify that user is able to open Privacy Policy Page from checkout page footer
	    Given user launches the browser and navigates to "ASO_HOME" page  
		And User clicks on the burger menu 
		And User navigates to LThree 
		And user clicks on the product card and navigates to PDP 
		Then user click on Add to Cart Button
		Then user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		And user will click on Checkout button and navigates to Checkout page
		Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout footer_Lnk|
		|CheckoutFooterLegalLinkPrivacyPolicy_Lnk|
		And user click on Privacy Policy link in checkout page
		Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout footer_Lnk|
		|CheckoutFooterLegalLinkPrivacyPolicy_Txt|
		
		
		@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-6576 @ZYP_CHECKOUT_K6576-8744 @CR-RK
		Scenario:  Verify that user is able to open Terms & Conditions Page from checkout page footer
	    Given user launches the browser and navigates to "ASO_HOME" page  
		And User clicks on the burger menu 
		And User navigates to LThree 
		And user clicks on the product card and navigates to PDP 
		Then user click on Add to Cart Button
		Then user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		And user will click on Checkout button and navigates to Checkout page
		Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout footer_Lnk|
		|CheckoutFooterLegalLinkTermsConditions_lnk|
		And user click on Terms and Conditions link in checkout page
		Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout footer_Lnk|
		|CheckoutFooterLegalLinkTermsConditions_Txt|
			
			
		@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-6576 @ZYP_CHECKOUT_K6576-8747 @CR-RK
		Scenario:  Verify that user is able to open Prop 65 Page from checkout page footer
	    Given user launches the browser and navigates to "ASO_HOME" page  
		And User clicks on the burger menu 
		And User navigates to LThree 
		And user clicks on the product card and navigates to PDP 
		Then user click on Add to Cart Button
		Then user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		And user will click on Checkout button and navigates to Checkout page
		Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout footer_Lnk|
		|CheckoutFooterLegalLinkCaliforniaProposition65_Lnk|
		And user click on Prop link in checkout page
		Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout footer_Lnk|
		|CheckoutFooterLegalLinkCaliforniaProposition65_Txt|
		
		
		@R2_Mobile @R2_Regression @R2_All @P-Low @C-Checkout @KER-6576 @ZYP_CHECKOUT_K6576-8741 @CR-RK
		Scenario:  Verify that user is able to open chat modal from checkout page footer
	    Given user launches the browser and navigates to "ASO_HOME" page  
		And User clicks on the burger menu 
		And User navigates to LThree 
		And user clicks on the product card and navigates to PDP
		Then user click on Add to Cart Button
		Then user is navigated to Add to cart Notification popup  
		And user will click on View Cart button 
		And user navigate to Cart page
		And user will click on Checkout button and navigates to Checkout page
		Then Verify below Sub/Main Module of Checkout Page 
		|# Verify following elements in Checkout footer_Lnk|
		|CheckoutFooterChatNowLink_lnk|
		#And user click on Chat modal link in checkout page