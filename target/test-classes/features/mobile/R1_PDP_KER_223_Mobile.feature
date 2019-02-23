Feature: To Verify the Alternative Color Views on PLP

@Regression @Mobile @All @C-PDP @KER-223  @ZYP_PDP_K223-10341  @Rerun @CR-SG @1HR
Scenario: Verify the ability to view all colors/thumbnails available, in and out of stock options, for a parent product on PLP
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then User navigates to L3 
	And User verifies the alternative available colors 
	
@Regression @Mobile @All @C-PDP @KER-223  @ZYP_PDP_K223-10342  @Rerun @CR-SG
Scenario: Verify the ability manually select a new color option the product image should update to reflect that new color selection
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then User navigates to L3 
	And User verifies the alternative available colors
	Then User update the color manually

@Regression @Mobile @All @C-PDP @KER-223  @ZYP_PDP_K223-10343  @Rerun @CR-SG @1HR
Scenario: Verify the color options to be notated near the product image for easy reference
	Given user launches the browser and navigates to "ASO_HOME" page 
	Then User clicks on the burger menu
	Then User navigates to L3 
	And User verifies the alternative available colors
	Then User sees color options to be notated near the product image

               
               
               
               
               