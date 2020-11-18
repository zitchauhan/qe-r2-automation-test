Feature: [Desktop]Bundles - Add to Cart Notification

   @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4811 @CR-RKA  @RBeta
  Scenario: Verify when a user clicks the Add to Cart button and successfully adds the selected components to cart
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4812 @CR-RKA @1HR
  Scenario: Verify the Bundle Price in ATC notification
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4813 @CR-RKA
  Scenario: Verify the View Cart functionality in Bundle ATC notification
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4814 @CR-RKA @RBeta
  Scenario: Verify the Check Out Button functionality in ATC notification for Bundle product for sign in user
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    And user should be able to enter the signin details "Login_username" "Login_pwd"
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-6632 @CR-RKA @RBeta
  Scenario: Verify the Check Out Button functionality in ATC notification for Bundle product-Guest User
  Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-6633 @CR-RKA @1HR @RBeta
  Scenario: Verify Component & Diff Selection for each component
    Given user launches the browser and navigates to "ASO_HOME" page
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	
#This is a rare & complex data scenario to test, should be handled manually HP
#  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4799 @CR-RKA @RBeta
#  Scenario: Verify the Limited Quantity Messaging in Add to Cart Notification for Bundles
#    Given user launches the browser and navigates to "ASO_HOME" page
#    Then User navigates till PLP of multiple sku package 
#	And user click on football helmets
#	And User click on the product image of sku package 
#	Then verfiy the product details and features 
	


  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4805 @CR-RKA @1HR @RBeta
  Scenario: Verify the bundle Image in ATC notification
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	
	
	
	@RegressionP2 
	Scenario: Verify whether the PDP along with all elements is displayed properly when navigated to a Bundle product PDP
  #Given user launches the browser and navigates to "ASO_HOME" page
  Given user launches the browser and navigates to "ASO_HOME" page 
	#Then User navigates till PLP of multiple sku package 
	#And user click on football helmets
	#And User click on the product image of sku package  
  When User searches a product "SKUForBundleProductsSmoke" and navigates to PDP
  Then user should be able to see PDP mention in the current url
  And user should be able to see the search term in the product title for Bundle Product
  And user should see different attribute and size of the Bundle Product
  And user should see details and specs for Bundle Product
 
	
	
   @RegressionP2
   Scenario: Verify whether the PDP along with all elements is displayed properly when navigated to a Bait product PDP
   Given user launches the browser and navigates to "ASO_HOME" page
   When user navigates till PLP of Baits SKU
   #And user click on soft Baits
   And user click on first Baits product
   #When User searches a product "SKUForBaitProduct" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   #And user should be able to see the search term in the product title for Baits Product
   And user should be able to see the sku and item numbers for the given image
   And user should be able to see Color
   And user should be able to see the rating
   And user should be able to see the reviews
   Then verfiy the product details and features 
	
	
	@RegressionP2 @TC-OMNI-13427 @PDP
   Scenario: Verify whether the PDP along with all elements is displayed properly when navigated to a White Glove product PDP
   Given user launches the browser and navigates to "ASO_HOME" page
   And User searches a product "SKUForWhiteGlove" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see Image of the product
   And user should be able to see the search term in the White Glove product title
   And user should be able to see Color
   And user should be able to see the sku and item numbers for the given image
   And user should be able to see the rating
   And user should be able to see the reviews
   And user should see details and specs
   Then user clicks should be able to see QandA section
   Then verfiy the Ask a question button
   
   
   
   @RegressionP2
   Scenario: Verify whether the PDP along with all elements is displayed properly when navigated to a dropship product PDP
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "dsv_sku" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see Image of the product
   And user should be able to see the search term in the DSV product title
   And user should see different attribute and size of the product
   And user should be able to see the rating
   And user should be able to see the reviews
   And user should be able to see the sku and item numbers for the given image
   And user should see details and specs
   Then user clicks should be able to see QandA section
   Then verfiy the Ask a question button
   
   
   @RegressionP2
   Scenario: Verify whether the PDP along with all elements is displayed properly when navigated to a gift card product PDP
   Given user launches the browser and navigates to "ASO_HOME" page 
   #When User searches a product "SKUForGiftCard" and navigates to PDP
   When user Navigate to the shop Gift Card from footer
   And user click on the available Gift Card
   Then user should be able to see PDP mention in the current url
   And user should be able to see Image of the product
   And user should be able to see the sku and item numbers for the given image
   Then user clicks should be able to see QandA section
   Then verfiy the Ask a question button
   
   
   
   
   @RegressionP2
   Scenario: Verify whether the PDP along with all elements is displayed properly when navigated to a bulk gift card product PDP
   Given user launches the browser and navigates to "ASO_HOME" page 
   #When User searches a product "SKUForGiftCard" and navigates to PDP
   When user Navigate to the shop Gift Card from footer
   And user click on the available Bulk Gift Card
   Then user should be able to see PDP mention in the current url
   #And user should be able to see Image of the product
   And user should be able to see the sku and item numbers for the given image
   Then user clicks should be able to see QandA section
   Then verfiy the Ask a question button
   
   
   
   @RegressionP2 @TC-OMNI-13429 @PDP
   Scenario: Verify whether the PDP along with all elements is displayed properly when navigated to a Special Order Firearm PDP
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "BOPIS_SOF_Product" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see Image of the product
   And user should be able to see the search term in the SOF Item title
   Then user clicks should be able to see QandA section
   Then verfiy the Ask a question button
   
   
   @RegressionP2 @TC-OMNI-13433 @PDP
   Scenario: Verify whether the PDP along with all elements is displayed properly when navigated to a clearance product PDP
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "ClearenceItemSKU" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see Image of the product
   And user should be able to see the search term in the Clearence Item title
   And user should be able to see the sku and item numbers for the given image
   Then user clicks should be able to see QandA section
   Then verfiy the Ask a question button
   
   
   @RegressionP2 @TC-OMNI-13434 @PDP
   Scenario: Verify whether the PDP along with all elements is displayed properly when navigated to a hot deal product PDP
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "HotDealItemSKU" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see Image of the product
   And user should be able to see the search term in the Hot Deal Item title
   And user should be able to see the sku and item numbers for the given image
   Then user clicks should be able to see QandA section
   Then verfiy the Ask a question button
   

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4807 @CR-RKA @RBeta
  Scenario: Verify the Bundle Product Name in ATC notification
  Given user launches the browser and navigates to "ASO_HOME" page
  Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	
