Feature: Validate the Ratings and Review on PDP Page

@Sprint6 @TC-OMNI-37633 @ST-OMNI-22056 @1
Scenario: validate The User can see and write the Ratings and Review
Given User launches the application
   And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<VariantType>"
    And user click on Product
    Then user Scroll down and click on rating and review
    Then User sees the All rating and review on rating and review page
    And User clicks on Write a review Button
    Then User sees the Review Page
    And User Enter the Rating 3
    And User Enter the "ReviewTitle"  Value "ReviewTitleValue" on Review page
    And User Enter the "ReviewDetails"  Value "ReviewDetailsValue" on Review page
    And User Enter the "Recommendation"  Value "Yes" on Review page
    And User Enter the "Fit"  Value "FitValue" on Review page
   And User Enter the "NickName"  Value "NickNameValue" on Review page
    And User Enter the "Location"  Value "LocationValue" on Review page
   And User Enter the "Email"  Value "EmailValue" on Review page
   And User Enter the "sweepstackDropdown"  Value "sweepstackDropdownValue" on Review page
   And User Enter the "AcademyEmployee"  Value "AcademyEmployeeValue" on Review page
   And User Enter the "friendRecommendation"  Value "friendRecommendationValue" on Review page
    Then user click on the checkbox "SweepstackTermsCondition"
    Then user click on the checkbox "TermCondition"
    Then User click on Post Review button
   Then user redirected to Ratings & Review details page
   
    @Sprint6 @TC-OMNI-37634 @ST-OMNI-22056
 Scenario: user is on WRITE A REVIEW screen, WHEN user taps on back button, THEN user is redirected to previous screen
    
    Given User launches the application
   And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<VariantType>"
    And user click on Product
    Then user Scroll down and click on rating and review
    Then user redirected to Ratings & Review details page
    And User clicks on Write a review Button
    Then User sees the Review Page
    And User taps on back button
    Then user redirected to Ratings & Review details page
    
  @Sprint6 @TC-OMNI-37635 @ST-OMNI-22056  
 Scenario: validate the Review Details Page and its component 
 
 Given User launches the application
   And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<VariantType>"
    And user click on Product
    Then user Scroll down and click on rating and review
    Then User sees the All rating and review on rating and review page
    And User sees the "SortOption" on Review Details Page
    And User sees the "UserName" on Review Details Page
    And User sees the "PostedTime" on Review Details Page
    And User sees the "StarRating" on Review Details Page
    And User sees the "ReviewTitle" on Review Details Page
    And User sees the "VerifiedPurchaserMark" on Review Details Page
    And User sees the "yesIRecommend" on Review Details Page
    And User sees the "Helpfullquestion" on Review Details Page
     And user sees the yes "Active" No "Active" And Report "Active" at Helpfull review qn
     Then user click on "yes" on Helpfull Review qn
     And user sees the yes "DeActive" No "DeActive" And Report "Active" at Helpfull review qn
     Then user click on "No" on Helpfull Review qn
      And user sees the yes "DeActive" No "DeActive" And Report "Active" at Helpfull review qn
    @Sprint6 @TC-OMNI-37636 @ST-OMNI-22056   
 Scenario: user is on Review screen & taps on back button, THEN user is redirect to PDP page 
  Given User launches the application
   And User Clicks On MaY Be Later
    And User continues as guest user
    Then User sees the homepage
    When User Sees the Search Box
    Then User clicks on the Search Box
    And User search for the "<VariantType>"
    And user click on Product
    Then user Scroll down and click on rating and review
   Then user redirected to Ratings & Review details page
    Then User sees the All rating and review on rating and review page
    
 
 
    
    
   