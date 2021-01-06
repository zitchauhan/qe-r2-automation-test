Feature: To verify gallery components 

@Web @PDPFaceLift @CR-Anirudh 
  Scenario: To verify URL, Image, Attributes ,Add to cart button section by navigation Desktop
    Given user launches the browser and navigates to "ASO_HOME" page
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
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
    When user navigates to PLP of any product
    Then user clicks on the product card and navigates to PDP of the product
    And user sets up cookie
	Then user navigates to new PDP page URL
	Then user should see image is updated on selecting alternate image
	
@RegressionP4 @TC-OMNI-13438 @SR-1345
  Scenario: Images gallery is working properly
    Given user launches the browser and navigates to "ASO_HOME" page
    And User searches a product "JacketSKUWithGalleryImages" and navigates to PDP
    Then user verifies product Image is displayed in PDP
    And User should see image is updated on selecting thumbnail images
    
    
    
    
    