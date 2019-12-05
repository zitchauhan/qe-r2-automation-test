Feature: Verify tax call is triggered or tax updated on store change in checkout page

@Web @Regression @OMNI-1116 @CR-SK @C-Checkout @C-Order
  Scenario: Verify tax update on store change in checkout page
       Given user launches the browser and navigates to "ASO_HOME" page 
       And user selects store with "FindStoreZipcode" and "BOPIS_Store_Selection" 
       And user enters "BOPIS_Regular_Product" in the searchbox  
       And user click on pickup button
       Then user is navigated to Add to cart Notification popup 
       And user will click on View Cart button 
       And user navigate to Cart page 
       And user click on checkout button in Cart page 
       Then get the tax on checkout page "before" refresh 
       And user click on change Location link
       And User select another store "FindAsStoreZIPCodeForTaxChange"
       When user clicks on Go to payment CTA
       Then get the tax on checkout page "after" refresh 
       Then compare the tax
