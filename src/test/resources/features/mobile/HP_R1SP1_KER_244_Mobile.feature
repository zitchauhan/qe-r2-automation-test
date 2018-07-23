Feature: [UI] - Verify the UI Behavior for Featured Category Component for Desktop

   @Mobile @All @HomePage  @Sanity @Regression @KER-244 @ZYP-5221
  Scenario: To verify user able to see Featured Category Component for Mobile
     Given user launches the browser and navigates to "ASO_HOME" page
     Then user is able to scroll till Featured categroy component
      And user is able to see number of category card displayed in a row
     Then user clicks on one of the category card and navigates to category