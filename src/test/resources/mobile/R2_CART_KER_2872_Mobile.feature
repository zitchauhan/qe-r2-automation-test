Feature: Verify BOPIS PDP Store Selection

@R2_Mobile  @R2_All @P-High_B @CB-Cart @KER-2872 @ZYP_CART_K2872-8706 @CR-DPK
Scenario: Verify that user is able to open the Find Store modal from the header
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu 
    And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"


@R2_Mobile @R2_Regression @R2_All @P1 @1HR_R2  @C-Cart @KER-2872 @ZYP_CART_K2872-8710 @CR-DPK
Scenario: Verify that the user should be able to search the store details by entering ZIP code
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu 
    And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user verify the results based on entering zipcode
		
@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2872 @ZYP_CART_K2872-8717 @CR-DPK
Scenario: Verify the components user see on the 'Find a Store' modal with search input location
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu
	 And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then verify the components in Find a Store Model	

@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2872 @ZYP_CART_K2872-8718 @CR-DPK
Scenario: Verify that user is able to see the 'View Next 5 stores' button, if stores are available
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu 
	And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	And user should be able to see the View Next five Stores button	
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2872 @ZYP_CART_K2872-8719 @CR-DPK
Scenario: Verify the user is able to see the store address of any of the listed store in 'Find a Store' modal through store accordion
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user click on plus icon in Store Address drawer
	And user should be able to see the store Details including its address, phone number, Driving Directions link, Store Open days/hours
	And user verify minus icon in Store Address drawer	

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-8725 @CR-DPK
Scenario: Verify My Store functionality and modal close behavior
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu 
	And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user click on plus icon in Store Address drawer
	And user click on Make My store button	
	And user verify Find a Store popup is closed	
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2872 @ZYP_CART_K2872-10617 @CR-DPK
Scenario: Verify that user is able to seethe Change Location link on PLP BOPIS filter page
 Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu 
	And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user click on plus icon in Store Address drawer
	And user click on Make My store button
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2872 @ZYP_CART_K2872-10618 @CR-DPK
Scenario: Verify that user is able to open the Find Store modal from PLP for BOPIS filter
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu 
	And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user click on plus icon in Store Address drawer
	And user click on Make My store button	 

@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2872 @ZYP_CART_K2872-10619 @CR-DPK	
	Scenario: Verify that user is able to see the Change Location link on PDP
	Given user launches the browser and navigates to "ASO_HOME" page
	 When user enters "SOFSKUNumber" in the search box	
	And user is able to see Change Pickup Location link		
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2872 @ZYP_CART_K2872-10620 @CR-DPK	
	Scenario: Verify that user is able to open the Find Store modal from PDP for BOPIS
	Given user launches the browser and navigates to "ASO_HOME" page
	 When user enters "SOFSKUNumber" in the search box
	And clicks on the Change Pickup Location link
	And user verify Find a Store popup	
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2872 @ZYP_CART_K2872-10621 @CR-DPK
Scenario: Verify the user is able to view the 'Change Location' under In-store Pick Up on Cart in Product Blade
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	#Then user click on Add to Cart Button
	And user click on ship it button
	And user will click on View Cart button 
	Then verify Change Location link
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2872 @ZYP_CART_K2872-10622 @CR-DPK
Scenario: Verify that user view 'Find a Store' modal from Cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	#Then user click on Add to Cart Button
	And user click on ship it button 
	And user will click on View Cart button 
	And click on Change Location link
	Then Find in Store modal should get open
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-10624 @CR-DPK
Scenario: Verify user is able to see the BOPIS availability against the listed stores for the products added in cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	And User Navigates L2 form Homepage Header 
	And User clicks on product in PLP 
	Then User clicks on the burger menu 
	And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore" 
	Then user click on plus icon in Store Address drawer 
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails			

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-10647 @CR-DPK
Scenario: Verify that user is not able to see the 'View Next 5 stores' button, if more stores are not available
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	And user should be able to see the View Next five Stores button	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-10652 @CR-DPK
Scenario: Verify the system behaviour on click of 'View Next 5 Stores' CTA
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user verify the results based on entering zipcode
	And user should be able to see the View Next five Stores button	
	And user click on View Next five Stores button
	And user verify the all the results 	

@R2_Mobile @R2_Regression @R2_All @P1 @1HR_R2  @C-Cart @KER-2872 @ZYP_CART_K2872-10661 @CR-DPK
Scenario: Verify if the user can search the store details by entering City & state
	Given user launches the browser and navigates to "ASO_HOME" page
	Then User clicks on the burger menu 
	 And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user verify the results based on entering zipcode

@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-10665 @CR-DPK
Scenario: Verify the user is able to see the store address of any of the listed store in 'Find a Store' modal with search input location through Store accordion
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	 And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user click on plus icon in Store Address drawer
	And user should be able to see the store Details including its address, phone number, Driving Directions link, Store Open days/hours
	And user click on minus icon in Store Address drawer
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-10681 @CR-DPK
Scenario: Verify the system behavior on clicking 'Driving Directions' in store details drawer
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	 And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user click on plus icon in Store Address drawer
	And user should click on Driving Direction
	Then user should be redirected to the Google Maps in new tab/window	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-10715 @CR-DPK
Scenario: Verify the "Make My Store" CTA behavior for manually searched and input location
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	 And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user click on all plus icon in Store Address drawer
	And user verify Make My store button	
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2872 @ZYP_CART_K2872-10724 @CR-DPK
Scenario: Verify user is displayed with an error message when there is no store within 250 miles (or configured value)
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
    And user select store with "WrongzipCode" and "FindStoreZipcodeNearestStore"
	Then verify Static error message
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-10726 @CR-DPK
Scenario: Verify user is able to see the BOPIS availability on store details drawer for the products added in cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
    Then User clicks on the burger menu
    And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user click on plus icon in Store Address drawer
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails	
	
@R2_Mobile @R2_Regression @R2_All @P2 @C-Cart @KER-2872 @ZYP_CART_K2872-11548 @CR-DPK
Scenario: Verify the user is able to view the 'Change Location' under In-store Pick Up on Cart in Product Blade
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
	#Then user click on Add to Cart Button
	And user click on ship it button
	And user will click on View Cart button   
	And user navigate to Cart page 
	Then Verify below Sub/Main Module of Cart Page
	|# Verify following elements in Cart page "Your Cart item details "|
		|Image_ITemInCart| 
		|CartProductName_Link   |
		|color_input_txt       |
		|Size_input_txt|
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-11552 @CR-DPK
Scenario: Verify user is able to see the inventory against the listed stores for the product not added to cart and modal opened from PDP
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
    Then User clicks on the burger menu
    And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user click on plus icon in Store Address drawer
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CART_K2872-11554 @CR-DPK
Scenario: Verify user is able to see the inventory on store details drawer for the PDP not added to cart
	Given user launches the browser and navigates to "ASO_HOME" page 
	And User clicks on the burger menu 
	 And User Navigates L2 form Homepage Header 
     And User clicks on product in PLP
    Then User clicks on the burger menu
    And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	Then user click on plus icon in Store Address drawer
	And user should be able to see the BOPIS availability as Cart Items available/Not available for Pickup with product image thumbnails	
	
	
@R2_Mobile @R2_Regression @R2_All @P-Low @C-Cart @KER-2872 @ZYP_CHECKOUT_K2872-12582 @CR-DPK
Scenario: Verify find a store Modal closes On Select "Close X" and If a user selects anywhere outside the modal
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	 And user select store with "FindStoreZipcode" and "FindStoreZipcodeNearestStore"
	And user verify Find a Store popup
	Then Close X Find a store Modal 	
	
	
	
	
	
