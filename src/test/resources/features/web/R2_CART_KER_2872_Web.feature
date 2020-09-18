Feature: Verify BOPIS PDP Store Selection 

#****************Venkat**************
@RegressionP2 
Scenario: Verify whether the user is able to change the store location successfully from store locatoor modal invoked in PDP 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user verify the results based on entering zipcode 
	Then verify the components in Find a Store Model
	Then user Select Store Location In PLP
	Then User searches a product "BOPIS_SOF_Product" and navigates to PDP 
	Then User is navigated to pdp page 
	Then user Verify Store Locator in PDP	
	
# *************** End Venkat **************** 
	

@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8706 @CR-DPK @C-BOPIS @P1 @RegressionP1
Scenario: Verify that user is able to open the Find Store modal from the header 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	And user verify Find a Store popup 
	
	
@R2_Web @R2_NonRegression @R2_All @P1 @1HR_R2 @CB-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8710 @CR-DPK @C-BOPIS 
Scenario: Verify that the user should be able to search the store details by entering ZIP code 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user verify the results based on entering zipcode 
	
	
	
@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8717 @CR-DPK @C-BOPIS 
Scenario: Verify the components user see on the 'Find a Store' modal with search input location 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then verify the components in Find a Store Model 
	
	
	
@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8718 @CR-DPK @C-BOPIS 
Scenario: Verify that user is able to see the 'View Next 5 stores' button, if stores are available 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user verify the results based on entering zipcode 
	And user should be able to see the View Next five Stores button 
	
	
@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2872 @ZYP_CART_K2872-8719 @CR-DPK @C-BOPIS 
Scenario: Verify the user is able to see the store address of any of the listed store in 'Find a Store' modal through store accordion 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user click on plus icon in Store Address drawer 
	And user should be able to see the store Details including its address, phone number, Driving Directions link, Store Open days/hours 
	And user verify minus icon in Store Address drawer 
	
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2872
@ZYP_CHECKOUT_K2872-8725 @CR-DPK @C-BOPIS @P1
Scenario: Verify My Store functionality and modal close behavior 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user click on plus icon in Store Address drawer 
	And user click on Make My store button 
	And user verify Find a Store popup is closed 
	
	
@R2_Web @R2_All @P-High_B @C-PLP @KER-2872 @ZYP_CART_K2872-10617 @C-BOPIS 
Scenario: Verify that user is able to see the Change Location link on PLP BOPIS filter page 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "Postal_Code" 
	And User Navigates L2 form Homepage Header 
	When user lands on the PLP page with Filter Drawer 
	And user is able to see Change Pickup Location link in PLP 
	
	
@R2_Web @R2_All @P-High_B @C-PLP @KER-2872 @ZYP_CART_K2872-10618 @C-BOPIS @RegressionP2
Scenario: Verify that user is able to open the Find Store modal from PLP for BOPIS filter 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "Postal_Code" 
	And User Navigates L2 form Homepage Header 
	When user lands on the PLP page with Filter Drawer 
	And clicks on the Change Pickup Location link in PLP 
	And user verify Find a Store popup 
	
	
@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2872
@ZYP_CART_K2872-10619 @CR-DPK @C-BOPIS 
Scenario: Verify that user is able to see the Change Location link on PDP 
    Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user clicks on one of the category and navigates to LOne SOF
	#    Then user clicks on one of the subcategory and navigates to LTwo SOF
	#    Then user clicks on one of the product category and navigates to LThree SOF
	Then User searches a product "SOFSKUNumber" and navigates to PDP 
	Then User is navigated to pdp page 
	And user is able to see Change Pickup Location link 
	
	
@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2872
@ZYP_CART_K2872-10620 @CR-DPK @C-BOPIS @RegressionP2
Scenario: Verify that user is able to open the Find Store modal from PDP for BOPIS 
	Given user launches the browser and navigates to "ASO_HOME" page 
	#	When user clicks on one of the category and navigates to LOne SOF
	#    Then user clicks on one of the subcategory and navigates to LTwo SOF
	#    Then user clicks on one of the product category and navigates to LThree SOF
	Then User searches a product "SOFSKUNumber" and navigates to PDP 
	Then User is navigated to pdp page 
	And clicks on the Change Pickup Location link 
	And user verify Find a Store popup 
	
	
@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2872
@ZYP_CART_K2872-10621 @CR-DPK @C-BOPIS 
Scenario: Verify the user is able to view the 'Change Location' under In-store Pick Up on Cart in Product Blade 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "SOFSKUNumber" and navigates to PDP 
	#	Then user click on Add to Cart Button
	#	And user will click on View Cart button 
	And user click on ship it button 
	And user click on viewcart button 
	And verify Change Location link 
	
	
@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2872
@ZYP_CART_K2872-10622 @CR-DPK @C-BOPIS 
Scenario: Verify that user view 'Find a Store' modal from Cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User searches a product "SKUForBopisProduct" and navigates to PDP 
	#	Then user click on Add to Cart Button
	#	And user will click on View Cart button 
	And user click on ship it button 
	And user click on viewcart button 
	When user clicks on Find a Store 
	Then Find in Store modal should get open 
	
	
@R2_Web @R2_All @P-Low @CB-Cart @KER-2872 @ZYP_CART_K2872-10624 @C-BOPIS 
Scenario: Verify user is able to see the BOPIS availability against the listed stores for the products added in cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox 
	#	Then user click on Add to Cart Button
	#	And user will click on View Cart button 
	And user click on ship it button 
	And user click on viewcart button 
	Then user select in store pickup option 
	And user click on change location link in order summery cart page 
	Then User is able to see Find a Store Modal 
	And user collapse the store name 
	Then user verify BOPIS availability in inventory as number of Cart items available for pick up or Not available against each listed store 
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2872
@ZYP_CHECKOUT_K2872-10647 @CR-DPK @C-BOPIS 
Scenario: Verify that user is not able to see the 'View Next 5 stores' button, if more stores are not available 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "zipcodeWithMax5Stores" in Find a Store Model 
	And user click on submit button 
	Then user should not be able to see the 'View Next 5 Stores' button" 
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2872
@ZYP_CHECKOUT_K2872-10652 @CR-DPK 
Scenario: Verify the system behaviour on click of 'View Next 5 Stores' CTA 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "City-State" in Find a Store Model 
	And user click on submit button 
	Then user verify the results based on entering zipcode 
	And user should be able to see the View Next five Stores button 
	And user click on View Next five Stores button 
	And user verify the all the results 
	
	
	
@R2_Web @R2_NonRegression @R2_All @1HR_R2 @CB-Cart @KER-2872
@ZYP_CHECKOUT_K2872-10661 @CR-DPK @C-BOPIS 
Scenario: Verify if the user can search the store details by entering City & state 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "City-State" in Find a Store Model 
	And user click on submit button 
	Then user verify the results based on entering zipcode 
	
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2872
@ZYP_CHECKOUT_K2872-10665 @CR-DPK @C-BOPIS 
Scenario: Verify the user is able to see the store address of any of the listed store in 'Find a Store' modal with search input location through Store accordion 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user click on plus icon in Store Address drawer 
	And user should be able to see the store Details including its address, phone number, Driving Directions link, Store Open days/hours 
	And user click on minus icon in Store Address drawer 
	
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2872
@ZYP_CHECKOUT_K2872-10681 @CR-DPK @C-BOPIS 
Scenario: Verify the system behavior on clicking 'Driving Directions' in store details drawer 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user click on plus icon in Store Address drawer 
	And user should click on Driving Direction 
	Then user should be redirected to the Google Maps in new tab/window 
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2872
@ZYP_CHECKOUT_K2872-10715 @CR-DPK @C-BOPIS 
Scenario: Verify the "Make My Store" CTA behavior for manually searched and input location 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user click on all plus icon in Store Address drawer 
	And user verify Make My store button 
	
@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2872
@ZYP_CHECKOUT_K2872-10724 @CR-DPK @C-BOPIS 
Scenario: Verify user is displayed with an error message when there is no store within 250 miles (or configured value) 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "WrongzipCode" in Find a Store Model 
	And user click on submit button 
	Then verify Static error message 
	
	
@R2_Web @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-10726 @C-BOPIS 
Scenario: Verify user is able to see the BOPIS availability on store details drawer for the products added in cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "BOPIS_Product" in the search box 
	#	Then user click on Add to Cart Button
	#	And user will click on View Cart button 
	And user click on ship it button 
	And user click on viewcart button 
	Then User should be able to click on Find Store 
	And Find Store Modal should pop-up 
	When User select store with "BOPIS_Store2" 
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails 
	
	
@R2_Web @R2_NonRegression @R2_All @P-High_B @CB-Cart @KER-2872
@ZYP_CART_K2872-11548 @CR-DPK @C-BOPIS 
Scenario: Verify the user is able to view the 'Change Location' under In-store Pick Up on Cart in Product Blade 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "SOFSKUNumber" in the search box 
	#	Then user click on Add to Cart Button
	#	And user will click on View Cart button 
	And user click on ship it button 
	And user click on viewcart button 
	And verify Change Location link 
	
	
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2872
@ZYP_CART_K2872-11552 @CR-DPK @C-BOPIS 
Scenario: Verify user is able to see the inventory against the listed stores for the product not added to cart and modal opened from PDP 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "SOFSKUNumber" in the search box 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user click on all plus icon in Store Address drawer 
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails 
	
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2872
@ZYP_CART_K2872-11554 @CR-DPK @C-BOPIS 
Scenario: Verify user is able to see the inventory on store details drawer for the PDP not added to cart 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "SOFSKUNumber" in the search box 
	And user click on Find a Store in PDP page 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user click on plus icon in Store Address drawer 
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails 
	
	
@R2_Web @R2_NonRegression @R2_All @P-Low @CB-Cart @KER-2872
@ZYP_CHECKOUT_K2872-12582 @CR-DPK @C-BOPIS 
Scenario: Verify find a store Modal closes On Select "Close X" and If a user selects anywhere outside the modal 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	And user verify Find a Store popup 
	Then Close X Find a store Modal 

#	Need to pass test data which is available for store pick u option	
#@C-BOPIS @R2_Web @R2_All @P1 @CB-Cart @KER-2872 @ZYP_CART_K2872-9982
#Scenario: Verify user can change the store using Find in Store modal 
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user enters "BOPIS_Product" in the searchbox 
##		And user click on Add to Cart Button
#	And user click on ship it button 
#	And user click on view cart 
#	Then user select in store pickup option 
#	Then user click on find a store option 
#	When User select store with "BOPIS_Store2" 
	
	
#=====================Sanity=================================================#
@R2_Web @R2_WAST-21 @P1 @C-Cart @KER-2872 @ZYP_CART_K2872-8710 @AutomationSmokeORIG
Scenario: TC_22-Verify Find a store 
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store 
	Then user enter "zipCode" in Find a Store Model 
	And user click on submit button 
	Then user verify the results based on entering zipcode

	@R2_Web @R2_WAST-24 @P1 @C-Checkout @KER-2926 @AutomationSmokeORIG @CR-HP @HP @HPTest
	Scenario:  TC_24-Verify if unauthenticated user is able to place PAYPAL order
	Given user launches the browser and navigates to "ASO_HOME" page 
	#Then User should be able to click on Find Store 
	#And Find Store Modal should pop-up 
	#When User select store with "BOPIS_Store2" 
	When user enters "BOPIS_Regular_Product" in the searchbox
#	#And user click on Add to Cart Button 
	And user click on ship it button
	And user click on view cart
	#Updated by VSN on 07-22-19 for smoke test fix
	#Then user select in store pickup option 
	And user will click on Checkout button and navigates to Checkout page
	And user adds shipment address on checkout page for "guest" user
	Then user click on go to payment present in shipping method 
	When user clicks on Go to payment CTA
	Then user click on paypal radiobtn
	And user click on paypal checkout button
	#And enter the paypal login "PayPalEmail" "PayPalPassword" 
	Then user switch to iframe and enter the paypal login "PayPalEmail" "PayPalPassword" 
	And user able to see the button place order
	And user is navigated to order confirmation page and captures order number
	
