#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Registration or Sign Up

  @Web @All @C-HP @Regression @PLCC41
  Scenario: Verify Add Address checkbox on registration page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on "<signInCta>"
    Then user navigates to "SIGNUP_PAGE"
    And "<addAddressCheckBox>" is present
    And expect "<addAddressCheckBox>" text equal to "Add address for faster checkout"

  Scenario Outline: Validate Add Address checkbox on registration page
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on "<signInCta>"
    Then user navigates to "SIGNUP_PAGE"
    And "<addAddressCheckBox>" is present
    When user check "<addAddressCheckBox>"
    Then user expects element "<addAddressCheckBox>" to have attribute "checked"
    When user uncheck "<addAddressCheckBox>"
    Then user expect element "<addAddressCheckBox>" to have attribute "notChecked"

    Examples: 
      | Url          |
      | ASO test Url |

  Scenario Outline: Verify Add Address checkbox is not mandatory_checked
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on "<signInCta>"
    Then user navigates to "SIGNUP_PAGE"
    When user check "<addAddressCheckBox>"
    And "<addressModel>" is present
    And "<firstname_input>" is present
    And user enter "<firstname_input>"
    And "<lastname_input>" is present
    And user enter "<lastname_input>"
    And "<email_input>" is present
    And user enter "<email_input>"
    And "<signup-passwordfield>" is present
    And user enter "<signup-passwordfield>"
    And "<addressTxtField>" is present
    And user enter "<addressTxtField>"
    And "<zipCodeTxtField>" is present
    And user enter "<zipCodeTxtField>"
    And "<cityTxtField>" is present
    And user enter "<cityTxtField>"
    And "<state>" is present
    And user select "<state>"
    And "<phoneNumberTxtField>" is present
    And user select "<phoneNumberTxtField>"
    And user clicks on "<btnsignup_btn>"
    And user check "<profile-signup-promotional-msg>"
    And user clicks on "<btnsignup_btn>"
    Then user navigates to "ASO_HOME"

    Examples: 
      | firstname_input | lastname_input | email_input    | signup-passwordfield | addressTxtField   | zipCodeTxtField | state   | phoneNumberTxtField |
      | Test            | QA             | test@gmail.com | Test@123             | Cross Over Street |           32810 | Florida |          0123456789 |

  Scenario Outline: Verify Add Address checkbox is not mandatory_uncheked
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on "<signInCta>"
    Then user navigates to "SIGNUP_PAGE"
    When user uncheck "<addAddressCheckBox>"
    And "<addressModel>" is not present
    #previously entered data should not be cleared
    And user enter "<firstname_input>"
    And user enter "<lastname_input>"
    And user enter "<email_input>"
    And user enter "<signup-passwordfield>"
    And user clicks on "<btnsignup_btn>"
    And user check "<profile-signup-promotional-msg>"
    And user clicks on "<btnsignup_btn>"
    Then user navigates to "ASO_HOME"

    Examples: 
      | firstname_input | lastname_input | email_input    | signup-passwordfield |
      | Test            | QA             | test@gmail.com | Test@123             |

  Scenario Outline: Verify Add Company Name, Apt. Number, etc. (Optional) link
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on "<signInCta>"
    Then user navigates to "SIGNUP_PAGE"
    When user uncheck "<addAddressCheckBox>"
    And user clicks on "<addCompanyNameLink>"
    #doubt: Display link which says “Add Company Name, Apt. Number, etc. (Optional)”: Not clear as once user uncheck address checkbox data will be hidden
    And "<zipCodeTxtField>" is not present
    And "<cityTxtField>" is not present
    And "<state>" is not present
    And "<phoneNumberTxtField>" is not present
    And user clicks on "<btnsignup_btn>"
    Then user navigates to "ASO_HOME"

    Examples: 
      | zipCodeTxtField | state   | phoneNumberTxtField |
      |           32810 | Florida |          0123456789 |

  Scenario: Verify checkbox is unchecked and address fields have data entered
    Given user launches the browser and navigates to "ASO_HOME" page
    When user clicks on "<signInCta>"
    Then user navigates to "SIGNUP_PAGE"
    When user uncheck "<addAddressCheckBox>"
    And user expect element "<addAddressCheckBox>" to equal "Cross Over Street"
    And user expect element "<firstname_input>" to equal "Test"
    And user expect element "<lastname_input>" to equal "QA"
    And user expect element "<email_input>" to equal "Test@gmail.com"
    And user expect element "<signup-passwordfield>" to equal "Test@123"
    And user clicks on "<btnsignup_btn>"
    And user expect element "<zipCodeTxtField>" to equal "32810"
    And user expect element "<cityTxtField>" to equal "orlando"
    And user expect element "<state>" to equal "Florida"
    And user expect element "<phoneNumberTxtField>" to equal "0123456789"
    #Then do no send data to AVS/ADS/WCS
    And user clicks on "<btnsignup_btn>"
