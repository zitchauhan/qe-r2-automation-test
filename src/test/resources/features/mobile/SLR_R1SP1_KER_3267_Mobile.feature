Feature: Verify the user search for Customer Keyword/SKU Search Mobile

  @C-SLR @Mobile  @Regression @All @KER-3267  @ZYP_SLR_K3267-7290 @Rerun @1HR @CR-AG
  Scenario Outline: Verify the user search for Customer Keyword/SKU Search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the SKU search "<data>"
    And User click on search icon
    Then User is navigated to pdp page
    And user verifies the entered SKU id
    Examples:
    |data|
    |112766238|

  @C-SLR @Mobile  @Regression @All @KER-3267  @ZYP_SLR_K3267-7291 @1HR @CR-AG
   Scenario Outline: Verify the user search for invalid Customer Keyword/SKU Search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the invalid SKU search "<data>"
    And User click on search icon
    Then user verifies the error null search result page
     Examples:
    |data|
    |111111111|
   
    @C-SLR @Mobile  @Regression @All @KER-3267  @ZYP_SLR_K3267-6332 @1HR @CR-AG
  Scenario Outline: Verify the user search for invalid Customer Keyword/SKU Search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the invalid SKU search "<data>"
    And User click on search icon
    Then user verifies the error null search result page
   Examples:
    |data|
    |gjhgjdasdai|

    @C-SLR @Mobile  @Regression @All @KER-3267  @ZYP_SLR_K3267-6330 @Rerun @1HR @CR-AG
  Scenario Outline: Verify the user search for Customer Keyword/SKU Search
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User should be able to see Search Box on Homepage
    Then User enter the SKU search "<data>"
    And User click on search icon
    Then User is navigated to pdp page
    And user verifies the entered SKU id
    Examples:
    |data|
    |ashokgowda|