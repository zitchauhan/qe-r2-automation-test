Feature: [Desktop]Bundles - Add to Cart Notification

   @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4811 @CR-RKA  @RBeta
  Scenario: Verify when a user clicks the Add to Cart button and successfully adds the selected components to cart
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy add to cart functionality 
    Then User to verify product is successfully added in cart

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4812 @CR-RKA @1HR
  Scenario: Verify the Bundle Price in ATC notification
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy add to cart functionality 
    Then User Verify Bundle price in ATC notification

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4813 @CR-RKA
  Scenario: Verify the View Cart functionality in Bundle ATC notification
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy add to cart functionality 
    Then User Verify view cart functionality in ATC noticfication

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4814 @CR-RKA @RBeta
  Scenario: Verify the Check Out Button functionality in ATC notification for Bundle product for sign in user
    Given user launches the browser and navigates to "ASO_HOME" page
    When user to click on sing in and navigate to sign in page
    And user should be able to enter the signin details "Login_username" "Login_pwd"
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy add to cart functionality 
    Then User Verify checkout button in ATC notification

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-6632 @CR-RKA @RBeta
  Scenario: Verify the Check Out Button functionality in ATC notification for Bundle product-Guest User
  Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy add to cart functionality 
    Then User Verify checkout button in ATC notification

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-6633 @CR-RKA @1HR @RBeta
  Scenario: Verify Component & Diff Selection for each component
    Given user launches the browser and navigates to "ASO_HOME" page
    Given user launches the browser and navigates to "ASO_HOME" page 
	Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy add to cart functionality 
    Then User Verify Bundle price in ATC notification
    Then User Verify view cart functionality in ATC noticfication
    Then User Verify checkout button in ATC notification

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4799 @CR-RKA @RBeta
  Scenario: Verify the Limited Quantity Messaging in Add to Cart Notification for Bundles
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy add to cart functionality 
    Then verify Sorry the selected item is limited to XYZ order.


  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4805 @CR-RKA @1HR @RBeta
  Scenario: Verify the bundle Image in ATC notification
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy add to cart functionality 
    Then User Verify bundle image in ATC notification

  @Web @C-HP @Regression @KER-3455 @ZYP_PDP_K3455-4807 @CR-RKA @RBeta
  Scenario: Verify the Bundle Product Name in ATC notification
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User navigates till PLP of multiple sku package 
	And user click on football helmets
	And User click on the product image of sku package 
	Then verfiy the product details and features 
	And verfiy add to cart functionality 
    Then User verify name of added product in ATC notification 
