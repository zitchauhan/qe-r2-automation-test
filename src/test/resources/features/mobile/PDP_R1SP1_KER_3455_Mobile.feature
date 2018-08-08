Feature: [Mobile]Bundles - Add to Cart Notification

  @Mobile  @C-HP @Regression @KER-3455  @ZYP_K3455-10056 @CR-RKA
  Scenario: Verify when a user clicks the Add to Cart button and successfully adds the selected components to cart
      Given user launches the browser and navigates to "ASO_HOME" page
Then User clicks on the burger menu
    Then User navigates to L3
  
Then User select the product from PDP page 
Then User select the avialable item and click on add to cart
Then User to verify product is successfully added in cart



@Mobile  @C-HP @Regression @KER-3455  @ZYP_K3455-10058 @CR-RKA
Scenario: Verify the Bundle Price in ATC notification 
 Given user launches the browser and navigates to "ASO_HOME" page
Then User clicks on the burger menu
    Then User navigates to L3
 
Then User select the product from PDP page 
Then User select the avialable item and click on add to cart 
Then User Verify Bundle price in ATC notification





@Mobile  @C-HP @Regression @KER-3455  @ZYP_K3455-10059 @CR-RKA 
Scenario: Verify the View Cart functionality in Bundle ATC notification
 Given user launches the browser and navigates to "ASO_HOME" page
Then User clicks on the burger menu
    Then User navigates to L3
Then User select the product from PDP page 
Then User select the avialable item and click on add to cart 
Then User Verify view cart functionality in ATC noticfication

@Mobile  @C-HP @Regression @KER-3455  @ZYP_K3455-10061 @CR-RKA 
Scenario Outline: Verify the Check Out Button functionality in ATC notification for Bundle product for sign in user  
 
     Given user launches the browser and navigates to "ASO_HOME" page 
	 Then User clicks on the burger menu
	 When user to click on sing in and navigate to sign in page
	Then user to fill username "<username>" and password "<password>"
	And click sign in 
   Then User clicks on the burger menu
    Then User navigates to L3
   Then User select the product from PDP page 
  Then User select the avialable item and click on add to cart 
   Then User Verify checkout button in ATC notification  
    
   
   
Examples: 
	
		|username       |password|
		|qaz2@gmail.com |qazlee  |
				    

@Mobile  @C-HP @Regression @KER-3455  @ZYP_K3455-10063 @CR-RKA
Scenario: Verify the Check Out Button functionality in ATC notification for Bundle product-Guest User
Given user launches the browser and navigates to "ASO_HOME" page
 Then User clicks on the burger menu
    Then User navigates to L3
Then User select the product from PDP page 
Then User select the avialable item and click on add to cart 
 Then User Verify checkout button in ATC notification  
 
 
 
 @Mobile  @C-HP @Regression @KER-3455  @ZYP_K3455-10064 @CR-RKA
 Scenario: Verify Component & Diff Selection for each component
 Given user launches the browser and navigates to "ASO_HOME" page
 Then User clicks on the burger menu
    Then User navigates to L3
Then User select the product from PDP page 
Then User select the avialable item and click on add to cart 
 Then User to verify product is successfully added in cart
 Then User Verify Bundle price in ATC notification
 Then User Verify view cart functionality in ATC noticfication
 Then User Verify checkout button in ATC notification
  
  
  
  @Mobile  @C-HP @Regression @KER-3455  @ZYP_K3455-10065 @CR-RKA
   Scenario Outline: Verify the Limited Quantity Messaging in Add to Cart Notification for Bundles
 Given user launches the browser and navigates to "ASO_HOME" page
 Then User to click on search button after putting data"<data>"
  Then User to select the product 
  Then verify Sorry the selected item is limited to XYZ order. 
  

 Examples: 
 |data                                           |
 |Magellan Outdoors Men's Neoprene Wading Boots  |
 
    
    @Mobile  @C-HP @Regression @KER-3455  @ZYP_K3455-10066 @CR-RKA
   Scenario: Verify the bundle Image in ATC notification
   Given user launches the browser and navigates to "ASO_HOME" page
Then User clicks on the burger menu
    Then User navigates to L3
Then User select the product from PDP page 
Then User select the avialable item and click on add to cart 
 Then User Verify bundle image in ATC notification
#    4806



   @Mobile  @C-HP @Regression @KER-3455  @ZYP_K3455-10067 @CR-RKA
   Scenario: Verify the Bundle Product Name in ATC notification
   
   Given user launches the browser and navigates to "ASO_HOME" page
 Then User clicks on the burger menu
    Then User navigates to L3
Then User select the product from PDP page 
Then User select the avialable item and click on add to cart 
  Then User verify name of added product in ATC notification  
  
  
  
  
  
  