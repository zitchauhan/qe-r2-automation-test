Feature: [UI] - To Verify the Footer Email link functionality

  @Mobile @All @C-HP @Regression @KER-1400 @ZYP_HP_K1400-10973 @CR-SG @1HR @RBeta
  Scenario: -To Verify the Footer Email link functionality 
      Given user launches the browser and navigates to "ASO_HOME" page
      Then User will verify the presence of sign up for more deals
      And User click on sign up for more deals and verify the modal
      Then user enter the data and click on submit
      And user verify the success message
 