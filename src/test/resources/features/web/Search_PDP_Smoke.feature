Feature: PDP Scenarios based on searching the products
  

   
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
    
    
   
  Scenario: Search a Bundle product and verify URL,Title of the searched item and attributes on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "SKUForBundleProductsSmoke" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see the search term in the product title for Bundle Product
   And user should see different attribute and size of the Bundle Product

   
  Scenario: Search a Baits product and verify URL,Ratings,Review,Color and Title of the searched item on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   When User searches a product "SKUForBaitProduct" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see the search term in the product title for Baits Product
   And user should be able to see Color
   And user should be able to see the rating
   And user should be able to see the reviews
   
   
   
   Scenario: Search a DSV product and verify URL,Image,Attributes on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "dsv_sku" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see Image of the product
   And user should be able to see the search term in the DSV product title
   And user should see different attribute and size of the product
    
   
   
   
   
   Scenario: Search a Gift card and verify URL,Image,Attributes on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "SKUForGiftCard" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see Image of the product
   And user should be able to see the search term in the GiftCard title
   
   
  
   Scenario: Search for a ammo product by SKU and verify the SKU,ammo disclaimer and item value on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page 
   When User searches a product "ammoSKU" and navigates to PDP
   Then user should be able to see the SKU Id
   And user verify the ammo legal disclaimer on PDP
   And user should be able to see the item value
   
   
   
   Scenario: Search for a White Glove Product and verify URL,Image and Title on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   And User searches a product "SKUForWhiteGlove" and navigates to PDP
   Then user should be able to see PDP mention in the current url
   And user should be able to see Image of the product
   And user should be able to see the search term in the White Glove product title
   
   
   Scenario: Search for a product and verify addcart button,breadcrumb and product details on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   When user enters "SearchPDP" in the search box
   Then user should be able to see the breadcrumb on thr pdp page
   And user should see details and specs
   
   
   @ddd
   Scenario: Search for a product and verify ratings and reviews on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   When user enters "SearchPDP" in the search box
   Then user should be able to see the rating
   And user should be able to see the reviews
   
   
  
   Scenario: Navigate to a product pdp page and verify the Home Delivery Option on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   When user navigates to PLP of any product
   Then user clicks on the product card and navigates to PDP of the product
   And user should be able to see PDP mention in the current url
   And user should be able to see the HomeDelivery Option
   
   
  
   Scenario: Navigate to a product pdp page and verify the Select Store Option on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   When user navigates to PLP of any product
   Then user clicks on the product card and navigates to PDP of the product
   And user should be able to see PDP mention in the current url
   And user should be able to see the Store Option
   
   
   
   Scenario: Navigate to a product pdp page and verify the Question and Answer section on the PDP page
   Given user launches the browser and navigates to "ASO_HOME" page
   When user navigates to PLP of any product
   Then user clicks on the product card and navigates to PDP of the product
   And user should see the Question and Answer section
   
   
  
 