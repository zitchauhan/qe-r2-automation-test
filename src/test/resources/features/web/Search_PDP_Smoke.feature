Feature: PDP Scenarios based on searching the products
  

   @RegressionP2
  Scenario: Search for a regular product and verify URL,Image,Reviews,Rating,Attributes and Details&Specs on the PDP page
  Given user launches the browser and navigates to "ASO_HOME" page
 		When user enters "SearchPDP" in the search box
    Then user should be able to see PDP mention in the current url
    And user should be able to see Image of the product
    And user should be able to see the search term in the product title
    And user should see different attribute and size of the product
    And user should see details and specs
    And user should be able to see the rating
    And user should be able to see the reviews
    
    
   @RegressionP2
  Scenario: Search a Bundle product and verify URL,Title of the searched item and attributes on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "SKUForBundleProductsSmoke" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see the search term in the product title for Bundle Product
   And user should see different attribute and size of the Bundle Product


   @RegressionP2
  Scenario: Search a Baits product and verify URL,Ratings,Review,Color and Title of the searched item on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   When User searches a product "SKUForBaitProduct" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see the search term in the product title for Baits Product
   And user should be able to see Color
   And user should be able to see the rating
   And user should be able to see the reviews
   
   
   @RegressionP2
   Scenario: Search a DSV product and verify URL,Image,Attributes on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "dsv_sku" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see Image of the product
   And user should be able to see the search term in the DSV product title
   And user should see different attribute and size of the product
    
   
   @RegressionP2
   Scenario: Search a Gift card and verify URL,Image,Attributes on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "SKUForGiftCard" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see Image of the product
   And user should be able to see the search term in the GiftCard title
   
   
  @RegressionP2
   Scenario: Search for a ammo product by SKU and verify the SKU,ammo disclaimer and item value on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "ammoSKU" and navigates to PDP
   Then user should be able to see the SKU Id
   And user verify the ammo legal disclaimer on PDP
   And user should be able to see the item value
   
   
   @RegressionP2
   Scenario: Search for a White Glove Product and verify URL,Image and Title on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   And User searches a product "SKUForWhiteGlove" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see Image of the product
   And user should be able to see the search term in the White Glove product title
   
   
   @P2 @SearchRemoved
   Scenario: Search for a product and verify addcart button,breadcrumb and product details on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   When user enters "SearchPDP" in the search box
   Then user should be able to see the breadcrumb on thr pdp page
   And user should see details and specs
   
   
   @P2 @SearchRemoved
   Scenario: Search for a product and verify ratings and reviews on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   When user enters "SearchPDP" in the search box
   Then user should be able to see the rating
   And user should be able to see the reviews
   
   
   @P2 @SearchRemoved
   Scenario: Navigate to a product pdp page and verify the Home Delivery Option on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   When user navigates to PLP of any product
   Then user clicks on the product card and navigates to PDP of the product
   And user should be able to see PDP mention in the current url
   And user should be able to see the HomeDelivery Option
   
   
  @P2 @SearchRemoved 
   Scenario: Navigate to a product pdp page and verify the Select Store Option on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   When user navigates to PLP of any product
   Then user clicks on the product card and navigates to PDP of the product
   And user should be able to see PDP mention in the current url
   And user should be able to see the Store Option
   
   
   @RegressionP2
   Scenario: Navigate to a product pdp page and verify the Question and Answer section on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   When user navigates to PLP of any product
   Then user clicks on the product card and navigates to PDP of the product
   And user should see the Question and Answer section
   
   
   @RegressionP2
  Scenario Outline: Verify whether the grid with relevant items displayed when the user search a Brand
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to view Search Box on Homepage 
	Then User enter the "<brand>" text for search
	And User click on the search icon
	Then Verify the Brand name in Breadcrumb

  Examples:	
  |brand|
  |Nike|
 
 
 @RegressionP2
 Scenario Outline: Verify whether the grid with relevant items displayed when the user search a category
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to view Search Box on Homepage 
	Then User enter the "<category>" text for search
	And User click on the search icon
	Then Verify the category name in Breadcrumb

  Examples:	
  |category|
  |Sports|
  
  
  @RegressionP2
 Scenario Outline: Verify whether the grid with hot deal items displayed when the user search for Hot Deals
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User should be able to view Search Box on Homepage 
	Then User enter the "<data>" text for search
	And User click on the search icon
	Then Verify the Hot Deal in Breadcrumb

  Examples:	
  |data|
  |hotdeals|
  
  
  @P2 @SearchRemoved
  Scenario: User clicks on Category type and navigates to PLP page showing all selected category products, able to navigate selecting category only, without selecting any sub-category regarding that category)
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP page of Hot Deals
    Then user should be able to see Hot Deals mention in the current url
    Then Verify the Hot Deal in Breadcrumb
    
  
   @RegressionP3
  Scenario: User should be able to select a category or sub-category and navigates from PLP page as well
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates till PLP of Baits SKU
    Then Verify that the PLP page of baits is displayed
    And user click on soft Baits
    Then Verify that the PLP page of the Soft Baits is displayed
    
    
    
    @RegressionP3
  Scenario: User clicks on Category type and navigates to PLP page and validate the Bread-crumbs i.e. Academy/(Selected Category)
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP page of Hot Deals
    Then Verify the Hot Deal in Breadcrumb
     
    
    @RegressionP3
  Scenario: Validate the Title listed on PLP page post selecting a category or sub-category(below Bread-crumbs)
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates till PLP of Baits SKU
    Then Verify that the PLP page of baits is displayed
    And Verify that the title for baits is displayed
    And user click on soft Baits
    Then Verify that the PLP page of the Soft Baits is displayed
    And Verify that the title for soft baits is displayed
    
    
  @P2 @SearchRemoved
  Scenario: Validate that User will navigate to clothing category PLP after clicking on See All option below category levels
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP page of clothing
    Then Verify the clothing in Breadcrumb
   
   
  @RegressionP3 @PDP
  Scenario: Validate that Brands category will navigate the user to the list of all brands and selecting any brand will navigate to the corresponding PLP page
    Given user launches the browser and navigates to "ASO_HOME" page 
    When user navigates till PLP of Brands
    Then Verify that selected PLP of Brand should be displayed
    
    
  @RegressionP2
  Scenario: Verify whether the grid with only selected Deals is displayed when the user filters using deals in left hand panel
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP page of clothing
    Then user expand Deals from Left Nav and select Price Drop Filter
    And Verify that Price Drop Filter is applied
    
    
    @RegressionP2 @TC-OMNI-13462
   Scenario Outline: Verify guest user can place Gift card order using CC as tender type
     Given user launches the browser and navigates to "ASO_HOME" page 
     When User searches a product "SKUForGiftCard" and navigates to PDP
     And user click on Add to Cart Button
     And user click on view cart
     And user clicks on checkout button on cart page
  	 And user adds shipment address on checkout page for "guest" user
	 And user selects shipment method on check out page for "guest" user
	 And user add "<Payment Type>" details in payment method for "guest" user
#	 And Verify the Category level promotion is applied and displayed on Order Summary section  
	 And user clicks on place order on checkout page 
	 Then verify user is able to successfully place the order
	   Examples: 
		    |Payment Type	    |
		    |Credit Card - VISA	|
			
		
	@RegressionP2
   Scenario Outline: Verify guest user can place DSV order using CC as tender type
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "dsv_sku" and navigates to PDP
   And user click on ship it button
   And user click on viewcart button
   Then user navigates to Cart Page
   And user clicks on checkout button on cart page
   And user adds shipment address on checkout page for "guest" user
   And user selects shipment method on check out page for "guest" user
   And user add "<Payment Type>" details in payment method for "guest" user
   #And Verify the Category level promotion is applied and displayed on Order Summary section
   And user clicks on place order on checkout page 
   Then verify user is able to successfully place the order
	Examples: 
		|Payment Type	|
		|Credit Card - VISA	|
		
		
	@RegressionP2 
	Scenario: User hovers a mouse on one Category on the page and validate that category text should fly-out
	Given user launches the browser and navigates to "ASO_HOME" page
    When user mouse on one category on the page
    Then Verify the category text in the fly out
    