Feature: To verify gallery components 

@Web @PDPFaceLift @CR-Anirudh 
  Scenario: To verify URL, Image, Attributes ,Add to cart button section by navigation Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
 #   When user navigates to PLP of any product
 #   Then user clicks on the product card and navigates to PDP of the product
	When user enters "SKUForAltImage" in the searchbox
    And user sets up cookie
	Then user navigates to new PDP page URL
    And user should be able to see PDP mention in the current url
    Then user verifies product Image
    And user should be able to see Alternate images
  
    
   @Web @PDPFaceLift @CR-Anirudh 
   Scenario: To verify video is present at the last
    Given user launches the browser and navigates to "ASO_HOME" page 
	When user enters "SKUWithVideoAvailable" in the searchbox
	And user sets up cookie
	Then user navigates to new PDP page URL
	And user verifies video plays in full screen mode 
	
	
	 @Web @PDPFaceLift @CR-Anirudh 
   Scenario: To verify image is update when clicked on alternate image
    Given user launches the browser and navigates to "ASO_HOME" page 
    When user enters "SKUForAltImage" in the searchbox
    And user sets up cookie
	Then user navigates to new PDP page URL
	Then user should see image is updated on selecting alternate image
	
	
	@Web @PDPFaceLift @CR-Anirudh 
	 Scenario: To verify corresponding image is update when clicked on color team pattern or flavor
    Given user launches the browser and navigates to "ASO_HOME" page 
   When user enters "SKUForMultiColor" in the searchbox
    And user sets up cookie
	Then user navigates to new PDP page URL
	Then user should see image is updated on selecting alternate image
	And user verifies image is updated on selecting different colour