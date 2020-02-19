Feature: Validate Add To Cart Modal
   
 #   @Web @PDPFaceLift @CR-Anirudh 
#Scenario:  Validate Product Name,Price,Image,view cart and continue shopping button
#	Given user launches the browser and navigates to "ASO_HOME" page
#	When user enters "BOPIS_Regular_Product" in the searchbox
#	#When User searches a product "BOPIS_Regular_Product" and navigates to PDP 
 #   #When user navigates to PLP of any product
   #Then user clicks on the product card and navigates to PDP of the product
 #   And user sets up cookie
#	Then user navigates to new PDP page URL
#    And user should be able to see PDP mention in the current url
#    And user verifies product Image
#    And user verifies title present
#    Then user should be able to see price of the product
#    And user click on ship it button
#    And user click on continue shopping
#	And user should be able to see PDP mention in the current url
#	And user click on ship it button
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button
#	And user verifies page navigated to cart page
	
#	@Web @PDPFaceLift @CR-Anirudh 
#Scenario: verify user should be on pdp page on clicking continue shopping
#Given user launches the browser and navigates to "ASO_HOME" page
#	When user enters "BOPIS_Regular_Product" in the searchbox
#	#When User searches a product "BOPIS_Regular_Product" and navigates to PDP 
 #   #When user navigates to PLP of any product
#    #Then user clicks on the product card and navigates to PDP of the product
#    And user sets up cookie
#	Then user navigates to new PDP page URL
#    And user should be able to see PDP mention in the current url
#    And user verifies product Image
#    And user verifies title present
#    Then user should be able to see price of the product
#    And user click on ship it button
#    And user click on continue shopping
#	And user should be able to see PDP mention in the current url
	
	
#	@Web @PDPFaceLift @CR-Anirudh 
#Scenario:  Validate user is able to navigate to cart page
#	Given user launches the browser and navigates to "ASO_HOME" page
#	When user enters "BOPIS_Regular_Product" in the searchbox
#	#When User searches a product "BOPIS_Regular_Product" and navigates to PDP 
#    #When user navigates to PLP of any product
#    #Then user clicks on the product card and navigates to PDP of the product
#    And user sets up cookie
#	Then user navigates to new PDP page URL
#    And user should be able to see PDP mention in the current url
#    And user click on ship it button
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button
#	And user verifies page navigated to cart page
	
	
#		@Web  @PDPFaceLift @CR-Anirudh 
#Scenario:  Validate user is able to navigate to cart and then select pickup option
#	Given user launches the browser and navigates to "ASO_HOME" page
#	When user enters "BOPIS_Regular_Product" in the searchbox
#	#When User searches a product "BOPIS_Regular_Product" and navigates to PDP 
#    #When user navigates to PLP of any product
#    #Then user clicks on the product card and navigates to PDP of the product
#    And user sets up cookie
#	Then user navigates to new PDP page URL
#    And user should be able to see PDP mention in the current url
#    And user click on ship it button
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button
#	And user verifies page navigated to cart page
#	Then user select in store pickup option 
#	
#		@Web @PDPFaceLift @CR-Anirudh 
#Scenario:  Validate pickup is selected on clicking pick up button
#	Given user launches the browser and navigates to "ASO_HOME" page
#	When user enters "BOPIS_Regular_Product" in the searchbox
#	#When User searches a product "BOPIS_Product" and navigates to PDP 
 #   #When user navigates to PLP of any product
  #  #Then user clicks on the product card and navigates to PDP of the product
#    And user sets up cookie
#	Then user navigates to new pdp page url "BOPIS_Product"
#    And user should be able to see PDP mention in the current url
 #   And user click on pickup button
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button
#	And user verifies page navigated to cart page
#	Then user select in store pickup option 
#	And user verifies pickup button is already selected
	
	
#	@Web @PDPFaceLift @CR-Anirudh 
#Scenario:  Validate user is unable to change to pickup online only items
#	Given user launches the browser and navigates to "ASO_HOME" page
#	When user enters "BOPIS_Regular_Product" in the searchbox
#	#When User searches a product "OnlineOnly" and navigates to PDP 
#   #When user navigates to PLP of any product
#   #Then user clicks on the product card and navigates to PDP of the product
 #   And user sets up cookie
#	Then user navigates to new pdp page url "OnlineOnly"
#    And user should be able to see PDP mention in the current url
#    And user click on ship it button
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button
#	And user verifies page navigated to cart page
#	Then user select in store pickup option 
#	And user verifies not elegible for online msg
	
#	@Web @PDPFaceLift @CR-Anirudh 
#Scenario:  Validate out of stock msg when product goes OOS
#	Given user launches the browser and navigates to "ASO_HOME" page
#	When user enters "BOPIS_Regular_Product" in the searchbox
#	#When User searches a product "SKUForOOSAfterPickup" and navigates to PDP 
 #   #When user navigates to PLP of any product
 #   #Then user clicks on the product card and navigates to PDP of the product
#    And user sets up cookie
#	Then user navigates to new pdp page url "SKUForOOSAfterPickup"
#    And user should be able to see PDP mention in the current url
#    And user click on pickup button
#	And user is navigated to Add to cart Notification popup
#	And user will click on View Cart button
#	Then user verifies OOS msg
#	
#	@Web @PDPFaceLift @CR-Anirudh 
#Scenario:  verify message is displayed when quantity more than available is entered
#	Given user launches the browser and navigates to "ASO_HOME" page
#	When user enters "BOPIS_Regular_Product" in the searchbox
#	#When User searches a product "BOPIS_LimitedStock" and navigates to PDP 
 #   #When user navigates to PLP of any product
 #   #Then user clicks on the product card and navigates to PDP of the product
 #   And user sets up cookie
#	Then user navigates to new pdp page url "BOPIS_LimitedStock"
#    And user should be able to see PDP mention in the current url
#    And user click on pickup button
#	And user is navigated to Add to cart Notification popup 
#	And user will click on View Cart button
#	And user verifies page navigated to cart page	
#	And user increases quantity "MoreThanAvailableQuantity" of product
#	And user expects max qty error
	
#	  @Web @PDPFaceLift @CR-Anirudh 
#Scenario: Verify that user can see product recommendations
#	Given user launches the browser and navigates to "ASO_HOME" page 
#	When user enters "RecommendationPresent" in the searchbox
#	#And User searches a product "RecommendationPresent" and navigates to PDP
#	And user sets up cookie
 #   Then user navigates to new pdp page url "RecommendationPresent"
  #  Then user verifies product recommendations are present
    
  #@Web @PDPFaceLift @CR-Anirudh 
#Scenario: Verify that user can see error when user enters quantity more than permitted
 #   	Given user launches the browser and navigates to "ASO_HOME" page 
  #  	When user enters "SKUForGiftCard" in the searchbox
	##And User searches a product "SKUForGiftCard" and navigates to PDP
#	And user sets up cookie
#    Then user navigates to new pdp page url "SKUForGiftCard"
#    Then user Inputs quatity "GC_moreThanMaxQty" and verifies error message
	