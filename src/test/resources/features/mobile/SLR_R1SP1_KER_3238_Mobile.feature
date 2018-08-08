Feature: verify ability to hide certain categories on homepage, LHN and Category cards on CLP for users directed to ASO page url containing affcode or affcode=42 from Social sites

  @C-SLR @Mobile @Regression  @All @KER-3238  @ZYP_K3238-7617 @Rerun 
  Scenario: Restricted category products are displayed even after the url has the ?affcode=42 added to url
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user navigates to PLP of outdoor
    Then user clicks on the shooting and navigates to PDP of the product
    Then user should be able to see PDP mention in the current url
    And User should add affcode into current url
    Then User should not able to see shooting products
    Then User closes the web application
