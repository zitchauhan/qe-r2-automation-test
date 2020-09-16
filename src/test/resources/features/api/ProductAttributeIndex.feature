Feature: To Validate Product Attribute Index APi Services


   
  Scenario Outline: : Validate the Product Attribute Index Specification json schema
    Given "<ProductAttributeSpecificationUrl>" endpoint for Index Specification for get call having application key "api.algoliakey" and id "api.algoliaid"
    And validate jsonSchema "DemoMyIndex" for Product Attribute Index Specification

    Examples: 
      | ProductAttributeSpecificationUrl |
      | /1/indexes/DemoMyIndex  |
      
    
  Scenario Outline: : Validate the Product Attribute Index Specification json schema for post 
    Given "<ProductAttributeSpecificationUrl>" endpoint for Product Attribute Index Specification for post call having application key "api.algoliakey" and id "api.algoliaid"
    And validate jsonSchema "DemoMyIndexQuerySchema" for Product Attribute Index Specification

    Examples: 
      | ProductAttributeSpecificationUrl |
      | /1/indexes/DemoMyIndex/query  |   
      
      
   Scenario Outline: Verify for status code 200 for GET call
   Given "<ProductAttributeSpecificationUrl>" endpoint for Index Specification for get call having application key "api.algoliakey" and id "api.algoliaid"
   Then Verify response status code as 200 for Algolia API

  Examples: 
      | ProductAttributeSpecificationUrl |
      | /1/indexes/DemoMyIndex  |
      
      
   Scenario Outline: : Verify for status code 200 for POST call
   Given "<ProductAttributeSpecificationUrl>" endpoint for Product Attribute Index Specification for post call having application key "api.algoliakey" and id "api.algoliaid"
   Then Verify response status code as 200 for Algolia API

   Examples: 
      | ProductAttributeSpecificationUrl |
      | /1/indexes/DemoMyIndex/query  |  
      
         
 
   Scenario Outline: Validate for status code 400 for Bad Request
    Given "<ProductAttributeSpecificationUrl>" endpoint for Product Attribute Index Specification for post 400 having application key "api.algoliakey" and id "api.algoliaid"
    Then Verify response status code as 400 
    And Verify the response message "No content in POST request"
    Examples: 
      | ProductAttributeSpecificationUrl |
      | /1/indexes/DemoMyIndex/query  |
      
      

   
  Scenario Outline: Verify for status code 404 for Not Found
    Given "<ProductAttributeSpecificationUrl>" endpoint for Index Specification for get call having application key "api.algoliakey" and id "api.algoliaid"
    Then Verify response status code as 404
  Examples: 
      | ProductAttributeSpecificationUrl |
      | /1/indexes/DemoMIndex  |



   Scenario Outline: Verify for status code 401 for Unauthorized
    Given "<ProductAttributeSpecificationUrl>" endpoint for Index Specification for get call having application key "api.algoliakey" and id "api.algoliaid"
    And Verify the response message ""
    Examples: 
      | ProductAttributeSpecificationUrl |
      | /1/indexes/DemoMyIndex  |

     
    
   Scenario Outline: Verify for status code 403 for Forbidden
     Given "<ProductAttributeSpecificationUrl>" endpoint for Product Attribute Index Specification for get call for 403 having application key "api.algoliakey" and id "api.algoliaid"
     Then Verify response status code as 403
     And Verify the response message "Invalid Application-ID or API key"
      Examples: 
      | ProductAttributeSpecificationUrl |
      | /1/indexes/DemoMyIndex  |

  
   
  
  Scenario Outline: : Validate that the response is obtained from the correct server
     Given "<ProductAttributeSpecificationUrl>" endpoint for Product Attribute Index Specification for post call having application key "api.algoliakey" and id "api.algoliaid" 
    Then Verify server "api.algoliaserver" in response header
    
    Examples: 
      | ProductAttributeSpecificationUrl |
      | /1/indexes/DemoMyIndex/query  |  
  
 
  


  