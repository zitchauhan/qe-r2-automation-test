Feature: To verify Name, Title,price,Product attributes and their behavior

@Web @CR-Anirudh @PDPFacelift
  Scenario: To verify URL, Image, Attributes ,Add to cart button section by navigation Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    When user enters "NormalSKU" in the search box
    And user sets up cookie
	Then user navigates to new pdp page url "NormalSKU"
    And user verifies star rating is present
    And user should be able to see the name of the product in title
    Then user should be able to see price of the product
    Then user should see different attribute and size of the product
 #   And user should be able to see Add to cart button and quantity section
     And user should be able to see add to cart buttons
#    Then user should be able to see inventory status of the product   

@Web @CR-Anirudh @PDPFaceLift   
	Scenario: To verify Sticky behavior of Title, Price and Star ratings,Product attribute buttons
	Given user launches the browser and navigates to "ASO_HOME" page
     When user enters "BOPIS_Product" in the search box
    And user should be able to see the sku and item numbers for the given image
	And user sets up cookie
	Then user navigates to new pdp page url "BOPIS_Product"
	Then user scrolls down to verify sticky behavior
	Then user verify sticky behavior for title price and star rating


@Web @CR-Anirudh @PDPFaceLift 
	Scenario: To verify Sticky behavior of AddToCart buttons
	Given user launches the browser and navigates to "ASO_HOME" page
     When user enters "BOPIS_Product" in the search box
    And user should be able to see the sku and item numbers for the given image
	And user sets up cookie
	Then user navigates to new pdp page url "BOPIS_Product"
	Then user scrolls down to verify sticky behavior
	Then user is able to see Add to cart button
	
	
@Web @CR-Anirudh @PDPFaceLift 
	Scenario: To verify non Sticky behavior of save and clearance tag
	Given user launches the browser and navigates to "ASO_HOME" page
     When user enters "SkuWIthClearanceBadge" in the search box
    #And user should be able to see the sku and item numbers for the given image
	And user sets up cookie
	Then user navigates to new pdp page url "SkuWIthClearanceBadge"
	Then user scrolls down to verify sticky behavior
	Then user verify save and clearance badge disappears on scrolldown 