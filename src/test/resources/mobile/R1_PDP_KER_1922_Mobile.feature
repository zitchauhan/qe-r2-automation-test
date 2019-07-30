Feature: [UI] - Verify the Zoom functionality of an image in PDP Page for Mobile

  @1HR @Regression  @C-PDP  @Mobile @All @ZYP_PDP_K1922-3425 @KER-1922 @CR-AG  @1HR 
  Scenario: Verify the Zoom functionality of an image in PDP Page for Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    And User navigates to L3
    Then user clicks on the product card and navigates to PDP of the product
    And user should be able to see PDP mention in the current url
    Then user clicks on the product image to zoom
    Then user clicks on the cross button to close the zoomed image 
   