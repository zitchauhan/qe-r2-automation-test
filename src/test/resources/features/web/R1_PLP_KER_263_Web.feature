Feature: [UI] To verify user able to see the Section title on L1, L2 & L3 page

  @Web @All @Regression @1HR  @C-PLP @KER-263  @ZYP_PLP_K263-2813 @1HR
  Scenario: To verify user able to see the Section title on L1, L2 & L3 page
     Given user launches the browser and navigates to "ASO_HOME" page
     Then user clicks on one of the category and navigates to LOne page
     And user is able to see the product category name in section title.
     Then user clicks on one of the subcategory and navigates to LTwo page
     And user is able to see the product category name in section title.
     Then user clicks on one of the product category and navigates to LThree page
     And user is able to see the product category name in section title.