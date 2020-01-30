Feature: Preventing California customers from applying for an Academy Credit Card

  @OMNI-1984
  Scenario: Verify California is removed from the state dropdown in the credit card application
    Given user launches the browser and navigates to "ASO_HOME" page plcc
    Then user navigates to ASO-Home page
    When user click on AcademyCreditCard link in the footer section of ASO-Home page
    Then user expect Landing page to be present
    When user click on APPLY NOW button
    Then user navigates to Generic Credit Card Application Modal
    And user verify California state code is not present in state dropdown

  @OMNI-1984
  Scenario: Verify California is removed from the state dropdown from the pre approval credit card application
    Given user launches the browser and navigates to "ASO_HOME" page plcc
    When user navigates to ASO-Home page
    And user click on AcademyCreditCard link in the footer section of ASO-Home page
    Then user expect Landing page to be present
    And user expect Preescreen Code Text Field is to be present
    And user enter Preescreen Code "Valid_PrescreenCode3"
    And user click on ACCEPT OFFER
    Then user navigates to Generic Credit Card Application Modal
    And user verify California state code is not present in state dropdown

  @OMNI-1984
  Scenario: Verify disclaimer is diplayed for California under the Wisconsin disclaimer on the credit card application
    Given user launches the browser and navigates to "ASO_HOME" page plcc
    Then user navigates to ASO-Home page
    When user click on AcademyCreditCard link in the footer section of ASO-Home page
    Then user expect Landing page to be present
    When user click on APPLY NOW button
    Then user navigates to Generic Credit Card Application Modal
    Then user verify california restriction disclaimer is displayed

	@OMNI-1984
  Scenario: Verify disclaimer is diplayed for California under the Wisconsin disclaimer on the prescreen credit card application
    Given user launches the browser and navigates to "ASO_HOME" page plcc
    When user navigates to ASO-Home page
    And user click on AcademyCreditCard link in the footer section of ASO-Home page
    Then user expect Landing page to be present
    And user expect Preescreen Code Text Field is to be present
    And user enter Preescreen Code "Valid_PrescreenCode3"
    And user click on ACCEPT OFFER
    Then user navigates to Generic Credit Card Application Modal
    Then user verify california restriction disclaimer is displayed on Prescreen form

  @OMNI-1984
  Scenario: verify error message is displayed on adding california zip code on credit card application
    Given user launches the browser and navigates to "ASO_HOME" page plcc
    Then user navigates to ASO-Home page
    When user click on AcademyCreditCard link in the footer section of ASO-Home page
    Then user expect Landing page to be present
    When user click on APPLY NOW button
    Then user navigates to Generic Credit Card Application Modal
    When user enter First Name on credit card Application Modal "FirstNamePlcc"
    Then user enter Last Name on credit card Application Modal "LastNamePlcc"
    And user enter Last four SSN "Last4DigitsOfSSN"
    And user enetr Date of Birth "DOB"
    And user enter Annual Income "AnnualIncome"
    And user enter Street Address "StreetAddress"
    And user enter Suite or Apartment "SuiteOrApartment"
    And user enter City "City"
    And user enter Zip Code on credit card Application Modal "CaliforniaZipCode"
    Then User verify california restriction error message is displayed below ZIP textbox

  @OMNI-1984
  Scenario: verify error message is displayed on adding california zip code on credit card application
    Given user launches the browser and navigates to "ASO_HOME" page plcc
    Then user navigates to ASO-Home page
    When user click on AcademyCreditCard link in the footer section of ASO-Home page
    Then user expect Landing page to be present
    When user click on APPLY NOW button
    Then user navigates to Generic Credit Card Application Modal
    And user enter Zip Code on credit card Application Modal "CaliforniaZipCode"
    Then User verify california restriction error message is displayed below ZIP textbox
