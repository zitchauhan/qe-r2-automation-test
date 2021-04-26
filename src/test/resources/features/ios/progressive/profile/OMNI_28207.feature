Feature: Manage Email Subscriptions

  @Sprint4 @ST-OMNI-28207 @TC-OMNI-34202
  Scenario: Verify that a user is able to subscribe for email subscriptions
    Given User launches the application
    And User Logs into the application
    When User navigates to Profile Page
    Then User sees signup for emails text
    When User subscribes for Academy Emails
    # Can be validated only when User receives the email - Manual/API
    Then User receives promotional emails

  @Sprint4 @ST-OMNI-28207 @TC-OMNI-34203
  Scenario: Verify that a user is able to unsubscribe from email subscriptions
    Given User launches the application
    And User Logs into the application
    When User navigates to Profile Page
    Then User sees signup for emails text
    When User unsubscribes for Academy Emails
    # Can be validated only when User doesn't receive the email - Manual/API
    Then User does not receive promotional emails