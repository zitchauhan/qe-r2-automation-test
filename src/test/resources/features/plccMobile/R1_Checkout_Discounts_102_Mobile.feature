Feature: PLCC: Checkout - Payment Using PLCC

Background: Common Pre-requisite steps 
        Given user launches the browser and navigates to "ASO_HOME" page 
        When user click on burger menu 
        And user click on My Account link of mobile
        And user enter Email address in sign-in page "Email_Promotions" 
        And user enter password in sign-in page "password" 
        And user click on Signin-button 
        Then user navigates to ASO-Home page

	
@C-PLCC @Regression @All @PLCC-103 @CR-Smeetha @Mobile	
Scenario: Verify user is able to get Annual offer of $15 off by providing the promo code
 	When user enters "skuIdGr150" in the search box plcc for mobile
    And user click on search icon for mobile
    And user click on Add to Cart button  
 	And usr click on view cart and navigates to cart page
 	Then user navigates to cart page
# 	And user increases quantity "ItemQuantity" of product
 	And user click on add promo code link on cart page
 	And user element expect promo code section to be present
 	And user enter promocode "promocodeA" on cart page
 	And click on submit promo code button
 	And user clicks on checkout button on cart page
 	When user handles adding new card "ValidPLCCCard" if already card is saved
 	And user click on REVIEW ORDER button
 	And user expect discount text to be present
 	Then user expect fifteen dollars discount 
	When user click on edit my cart link 
	And user click on remove promo card link
	Then user click on remove from cart 