Feature: 15867-STC-SHIP IT

@Shipping @NN 
Scenario: Verify user is able to select STH from PDP page

Given user launches the browser and navigates to "ASO" page 
When User searches a product "productNameSTH" and navigates to PDP
And user click on ship it button
Then verify shipping text in Add to cart popup

@Pickup @NN @Navya
Scenario: Verify user is able to select PICKUP  from  PDP page

Given user launches the browser and navigates to "ASO" page 
When User searches a product  "BOPIS_Regular_Product" and navigates to PDP
And user click on pick up  pdp button
Then verify pick up text in Add to cart popup