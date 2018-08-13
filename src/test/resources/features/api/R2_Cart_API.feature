Feature: To Verify Get Cart Details API service without sign-in

@AutomationSanity @R2_AS1   @R2_AAST-01   @R2_C-CART   @CR-VK  
Scenario Outline: TC_1 - Verify Add to Cart without sign-in details
    Given "<AddToCartSummaryUrl>" and post request "<addtocartRequestJson>" endpoint for Add to Cart with Guest user
    Then Verify response status code as 200

    
    Examples: 
      |  AddToCartSummaryUrl | addtocartRequestJson | 
      |  /api/cart/sku       | AddToCartPostRequest | 


@AutomationSanity  @R2_AS1   @R2_AAST-02   @R2_C-CART   @CR-VK
Scenario Outline: TC_2 -  Verify Add to Cart json schema
    Given "<AddToCartSummaryUrl>" and post request "<addtocartRequestJson>" endpoint for Add to Cart with Guest user
    And validate jsonSchema "KER-3524-AddtoCartSchema"
    
    
    Examples: 
      |  AddToCartSummaryUrl | addtocartRequestJson | 
      |  /api/cart/sku       | AddToCartPostRequest |


@AutomationSanity  @R2_AS1   @R2_AAST-03   @R2_C-CART   @CR-VK
Scenario Outline: TC_3 - Verify Add to Cart required property values
    Given "<AddToCartSummaryUrl>" and post request "<addtocartRequestJson>" endpoint for Add to Cart with Guest user
    Then read the API json response
    And Validate the Add to Cart API Requried Property Value are not Null
      | itemCount          |
      | orderTotal         |
      | message            |
      | totalQuantityAdded |
      | totalCartQuantity  |
      | checkoutURL        |
      | cartURL            |
    
    Examples: 
      |  AddToCartSummaryUrl | addtocartRequestJson | 
      | /api/cart/sku       | AddToCartPostRequest |
      
         
@AutomationSanity  @R2_AS1   @R2_AAST-04   @R2_C-CART   @CR-VK 
Scenario Outline: TC_4 - verify Get Cart without sign-in details
	Given "<GetCartUrl>" endpoint for getting cart
	Then Verify response status code as 200 
    And validate jsonSchema "KER-725-MinicartSchema"
    
Examples: 
       | GetCartUrl |
       | /api/cart/ |
       
       
 @AutomationSanity  @R2_AS1   @R2_AAST-05   @R2_C-CART   @CR-VK     
Scenario Outline: TC_5 - verify Get Cart Summary without sign-in details
	Given "<GetCartUrl>" endpoint for getting cart summary
	Then Verify response status code as 200 
   
    
Examples: 
       | GetCartUrl |
       | /api/cart/ |
       
       

@AutomationSanity  @R2_AS1   @R2_AAST-06   @R2_C-CART   @CR-VK
Scenario Outline: TC_6 - verify View Cart without sign-in details
	Given "<ViewCartUrl>" endpoint for viewing cart details
	Then Verify response status code as 200 
    
    
Examples: 
       | ViewCartUrl |
       | /api/cart/ |       