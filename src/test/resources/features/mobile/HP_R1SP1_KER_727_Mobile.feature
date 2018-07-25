Feature: [UI] [Mobile]To verify user can view 'My Account' from a drop down account summary upon successful log in

  @Homepage @Mobile @Regression @KER-727 @ZYP-7419
  Scenario Outline: To Verify the signout from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    Then User clicks on the burger menu
    Then click on singout

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @HP @Mobile @Regression @KER-727 @KER-7420
  Scenario Outline: To verify user can view 'My Account' from a drop down account summary upon successful log in
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    Then verify user to navigate to account summary page

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @HP @Mobile @Regression @KER-727 @KER-7421
  Scenario Outline: To Verify the Sign-in functionality for invalid email address
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify the validation message as incorrect

    Examples: 
      | username         | password |
      | qaz222@gmail.com | qazlee   |

  @HP @Mobile @Regression @KER-727 @KER-7422
  Scenario Outline: To Verify the Sign-in functionality for invalid  password
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify the validation message as incorrect

    Examples: 
      | username       | password   |
      | qaz2@gmail.com | qazlee1000 |

  @HP @Mobile @Regression @KER-727 @KER-7423
  Scenario: Verify the Signin functionality for empty email address and empty password
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    And click sign in
    Then verify enter email and password message to come

  @HP @Mobile @Regression @KER-727 @KER-8434
  Scenario: Verify the forgot your password functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    When user to be able to click forget password
    When user to enter email
    Then verify user to click submit button

  ############
  @HP @Mobile @Regression @KER-727 @KER-8554
  Scenario Outline: To Verify user is able to Sign In with Valid user name and password by clicking in Sign In Link
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify user to navigate to account summary page

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @HP @Mobile @Regression @KER-727 @KER-8557
  Scenario Outline: Verify the Personal Information details from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify personal information form My Account

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @HP @Mobile @Regression @KER-727 @KER-8558
  Scenario Outline: Verify the Address Book details from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify Address book form My Account

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @HP @Mobile @Regression @KER-727 @KER-8559
  Scenario Outline: Verify the Wishlists details from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify , WishList form My Account

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |
