Feature: Verify BOPIS PDP Store Selection

@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8706 @CR-DPK
Scenario: Verify that user is able to open the Find Store modal from the header
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	And user very Find a Store popup


@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8710 @CR-DPK
Scenario: Verify that the user should be able to search the store details by entering ZIP code
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user verify the results based on entering zipcode
	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8717 @CR-DPK
Scenario: Verify the components user see on the 'Find a Store' modal with search input location
	Given user launches the browser and navigates to "ASO_HOME" page
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then verify the components in Find a Store Model



@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8718 @CR-DPK
Scenario: Verify that user is able to see the 'View Next 5 stores' button, if stores are available
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user verify the results based on entering zipcode
	And user should be able to see the View Next five Stores button	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2872 @ZYP_CART_K2872-8719 @CR-DPK
Scenario: Verify the user is able to see the store address of any of the listed store in 'Find a Store' modal through store accordion
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on plus icon in Store Address drawer
	And user should be able to see the store Details including its address, phone number, Driving Directions link, Store Open days/hours
	And user verify minus icon in Store Address drawer	


@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-8725 @CR-DPK
Scenario: Verify that user is able to see the 'View Next 5 stores' button, if stores are available
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on plus icon in Store Address drawer
	And user click on Make My store button	
	And user very Find a Store popup is closed
	When user clicks on Find a Store
	Then user verify the results based on entering zipcode
	
	
	
@R2_Web @R2_Regression @R2_All @P-high @C-Cart @KER-2872 @ZYP_CART_K2872-10619 @CR-DPK	
	Scenario: Verify that user is able to open the Find Store modal from PDP for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne SOF
    Then user clicks on one of the subcategory and navigates to LTwo SOF
    Then user clicks on one of the product category and navigates to LThree SOF
	Then User is navigated to pdp page
	And user is able to see Change Pickup Location link		
	
	
@R2_Web @R2_Regression @R2_All @P-high @C-Cart @KER-2872 @ZYP_CART_K2872-10620 @CR-DPK	
	Scenario: Verify that user is able to open the Find Store modal from PDP for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on one of the category and navigates to LOne SOF
    Then user clicks on one of the subcategory and navigates to LTwo SOF
    Then user clicks on one of the product category and navigates to LThree SOF
	Then User is navigated to pdp page
	And clicks on the Change Pickup Location link
	And user very Find a Store popup	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2872 @ZYP_CART_K2872-10621 @CR-DPK
Scenario: Verify the user is able to view the 'Change Location' under In-store Pick Up on Cart in Product Blade
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And verify Change Location link	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2872 @ZYP_CART_K2872-10622 @CR-DPK
Scenario: Verify that user view 'Find a Store' modal from Cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	When user will verify in-store pick up radio button is selected with "ZIPCode"
	And click on Change Location link
	Then Find in Store modal should get open	
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-10624 @CR-DPK
Scenario: Verify user is able to see the BOPIS availability against the listed stores for the products added in cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And click on Change Location link
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on all plus icon in Store Address drawer
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails	


@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10647 @CR-DPK
Scenario: Verify that user is not able to see the 'View Next 5 stores' button, if more stores are not available
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipcodeWithMax5Stores" in Find a Store Model
	And user click on submit button
	Then user should not be able to see the 'View Next 5 Stores' button"

@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10652 @CR-DPK
Scenario: Verify if the user can search the store details by entering City & state
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "City-State" in Find a Store Model
	And user click on submit button
	Then user verify the results based on entering zipcode
	And user should be able to see the View Next five Stores button	
	And user click on View Next five Stores button
	And user verify the all the results 	


	
@R2_Web @R2_Regression @R2_All @P-Highest @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10661 @CR-DPK
Scenario: Verify if the user can search the store details by entering City & state
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "City-State" in Find a Store Model
	And user click on submit button
	Then user verify the results based on entering zipcode


@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10665 @CR-DPK
Scenario: Verify the user is able to see the store address of any of the listed store in 'Find a Store' modal with search input location through Store accordion
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on plus icon in Store Address drawer
	And user should be able to see the store Details including its address, phone number, Driving Directions link, Store Open days/hours
	And user click on minus icon in Store Address drawer
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10681 @CR-DPK
Scenario: Verify the user is able to see the store address of any of the listed store in 'Find a Store' modal with search input location through Store accordion
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on plus icon in Store Address drawer
	And user should click on Driving Direction
	Then user should be redirected to the Google Maps in new tab/window	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10715 @CR-DPK
Scenario: Verify the "Make My Store" CTA behavior for manually searched and input location
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on all plus icon in Store Address drawer
	And user verify Make My store button	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10724 @CR-DPK
Scenario: Verify user is displayed with an error message when there is no store within 250 miles (or configured value)
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	Then user enter "WrongzipCode" in Find a Store Model
	And user click on submit button
	Then verify Static error message
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-10726 @CR-DPK
Scenario: Verify user is able to see the BOPIS availability on store details drawer for the products added in cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	And click on Change Location link
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on all plus icon in Store Address drawer
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails	
	
	
@R2_Web @R2_Regression @R2_All @P-High @C-Cart @KER-2872 @ZYP_CART_K2872-11548 @CR-DPK
Scenario: Verify the user is able to view the 'Change Location' under In-store Pick Up on Cart in Product Blade
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	Then user click on Add to Cart Button
	Then user is navigated to Add to cart Notification popup 
	And user will click on View Cart button 
	And user navigate to Cart page 
	Then Verify below Sub/Main Module of Cart Page
	|# Verify following elements in Cart page "Your Cart item details "|
		|Image_ITemInCart| 
		|CartProductName_Link   |
		|color_input_txt       |
		|Size_input_txt|
#		|ShipToMe_radioBtn|
#		|InStorePickup_FREE_radioBtn |
	And verify Change Location link	
	
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-11552 @CR-DPK
Scenario: Verify user is able to see the inventory against the listed stores for the product not added to cart and modal opened from PDP
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	And user click on Find a Store in PDP page
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on all plus icon in Store Address drawer
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails	
			
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-11554 @CR-DPK
Scenario: Verify user is able to see the inventory on store details drawer for the PDP not added to cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User navigates to L2 Mens clothing
    Then user clicks on one of the subcategory and navigates to LTwo
    And user is able to see the product category name in section title
    Then user clicks on one of the product category and navigates to LThree
	Then User is navigated to pdp page
	And user click on Find a Store in PDP page
	Then user enter "zipCode" in Find a Store Model
	And user click on submit button
	Then user click on plus icon in Store Address drawer
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails	
	
	
@R2_Web @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-12582 @CR-DPK
Scenario: Verify find a store Modal closes On Select "Close X" and If a user selects anywhere outside the modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	When user clicks on Find a Store
	And user very Find a Store popup
	Then Close X Find a store Modal 
		
	
