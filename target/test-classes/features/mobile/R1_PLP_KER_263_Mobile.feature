Feature: [UI] To verify user able to see the Section title on L1, L2 & L3 page

  @Mobile @All @1HR  @C-PLP @KER-263  @ZYP_PLP_K263-5176 @Regression
  Scenario: To verify user able to see the Section title on L1, L2 & L3 page
     Given user launches the browser and navigates to "ASO_HOME" page
     Then User clicks on the burger menu
     Then User navigates to L1
     And user is able to see the product category name in section title.
     Then user clicks on one of the subcategory and navigates to LTwo page
     And user is able to see the product category name in section title.
     Then user clicks on one of the product category and navigates to LThree page
     And user is able to see the product category name in section title.
