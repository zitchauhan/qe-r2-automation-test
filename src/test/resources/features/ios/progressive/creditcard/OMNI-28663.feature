Feature: Apply ASO Credit Card Step 1

  @Sprint6 @ST-OMNI-28663
  Scenario: Verify that a user can apply for an ASO credit card by providing required application details
    Given User launches the application
    And User taps on account in bottom nav

    When User taps on Academy Sports and Outdoors Credit card
    And User is on Academy Credit Card Application Form

    Then User sees first name on Academy Credit Card Application Form
    And User sees last name on Academy Credit Card Application Form
    And User sees middle name on Academy Credit Card Application Form
    And User sees last four ssn on Academy Credit Card Application Form
    And User sees date of birth on Academy Credit Card Application Form
    And User sees annual income on Academy Credit Card Application Form
    And User sees cancel button on Academy Credit Card Application Form
    And User sees "contact information section" on Academy Credit Card Application Form
    And User sees "street address" on Academy Credit Card Application Form
    And User sees "suite or apt number" on Academy Credit Card Application Form
    And User sees "city" on Academy Credit Card Application Form
    And User sees "state" on Academy Credit Card Application Form
    And User sees "zip code" on Academy Credit Card Application Form
    And User sees "email address" on Academy Credit Card Application Form
    And User sees "confirm email address" on Academy Credit Card Application Form
    And User sees "mobile phone number" on Academy Credit Card Application Form
    And User sees "alternate phone number" on Academy Credit Card Application Form


  @Sprint6 @ST-OMNI-28663
  Scenario: Verify that a user can see required error messages for the mandatory fields when left out blank and tap on Next
    Given User launches the application
    And User taps on account in bottom nav

    When User taps on Academy Sports and Outdoors Credit card
    And User is on Academy Credit Card Application Form
    And User taps on Next button on Academy Credit Card Application form

    Then User sees error message for the field on Academy Credit Card Application form
    | first name | First name is required |
    # TODO: include other field names and their required error messages

  @Sprint6 @ST-OMNI-28663
  Scenario Outline: Verify that a user can see required error messages for the mandatory fields when left out blank and tab out
    Given User launches the application
    And User taps on account in bottom nav

    When User taps on Academy Sports and Outdoors Credit card
    And User is on Academy Credit Card Application Form
    Then User sees error message "<error_message>" for the "<field_name>" on Academy Credit Card Application form on tab out

    Examples:
    | field_name | error_message          |
    | first name | First name is required |


  @Sprint6 @ST-OMNI-28663
  Scenario: Verify that the user is able to see zip code error messages while filling aso credit card application
    Given User launches the application
    And User taps on account in bottom nav

    When User taps on Academy Sports and Outdoors Credit card
    And User is on Academy Credit Card Application Form

    And User enters the value "testone" for field "first name" Academy Credit Card Application form
    And User enters the value "testlast" for field "last name" Academy Credit Card Application form
    And User enters the value "1692" for field "last 4 ssn" Academy Credit Card Application form
    And User enters the value "22/10/1980" for field "date of birth" Academy Credit Card Application form
    And User enters the value "100000" for field "annual income" Academy Credit Card Application form
    # TODO data for other fields


    And User enters the value "12" for field "zip code" Academy Credit Card Application form
    And User taps on Next button on Academy Credit Card Application form
    Then User sees the "Please enter valid zip code" for "zip code" field on Academy Credit Card Application form
    # TODO Scenario for email address and mobile number verifications

  @Sprint6 @ST-OMNI-28663
  Scenario: Verify that the user can fill all fields on the Academy Credit Card application form with valid data
    Given User launches the application
    And User taps on account in bottom nav

    When User taps on Academy Sports and Outdoors Credit card
    And User is on Academy Credit Card Application Form

    And User enters "suffix" on Academy Credit Card Application Form
    And User enters "first name" on Academy Credit Card Application Form
    And User enters "last name" on Academy Credit Card Application Form
    And User enters "middle name" on Academy Credit Card Application Form
    And User enters "last 4 ssn" on Academy Credit Card Application Form
    And User enters "date of birth" on Academy Credit Card Application Form
    And User enters "annual income" on Academy Credit Card Application Form
    And User enters "street address" on Academy Credit Card Application Form
    And User enters "suite or apt number" on Academy Credit Card Application Form
    And User enters "city" on Academy Credit Card Application Form
    And User enters "state" on Academy Credit Card Application Form
    And User enters "zip code" on Academy Credit Card Application Form
    And User enters "email addresss" on Academy Credit Card Application Form
    And User enters "confirm email addresss" on Academy Credit Card Application Form
    And User enters "mobile phone number" on Academy Credit Card Application Form
    And User enters "alternate phone number" on Academy Credit Card Application Form

    And User taps on Next button on Academy Credit Card Application form
    Then User sees the consent page of the Academy Credit Card Application form