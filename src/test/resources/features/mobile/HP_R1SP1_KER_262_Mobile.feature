Feature: Verify presence of Socail Links from Homepage

  @Regression @Mobile @KER-262  @ZYP_K262-7280 @C-HP @1HR
  Scenario: Verify presence of Socail Links from Homepage
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon

  @Regression @Mobile @KER-262  @ZYP_K262-7281 @C-HP @1HR
  Scenario: Verify presence of Global Element Footer under this is Academy from Homepage
    Given user launches the browser and navigates to "ASO_HOME" page
    And User will click on expand button
    Then User will verify the presence of Our history
    And User will verify the presence of Careers
    Then User will verify the presence of Press Room
    And User will verify the presence of Giving Back

  @1HR @Mobile @C-HP @KER-262  @ZYP_K262-7280 @All @Regression
  Scenario: Verify presence of Global Element Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of Facebook icon
    Then User will verify the presence of twitter icon
    Then User will verify the presence of pinterest icon
    Then User will verify the presence of youtube icon
    Then User will verify the presence of instagram icon

  @1HR @Mobile @C-HP @KER-262  @ZYP_K262-7281 @All @Regression
  Scenario: Verify presence of Global Element Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of FIND A STORE
    Then User will verify the presence of sign up for more deals
    Then User will verify the presence of chat now
    And User will click on expand button
    Then User will verify the presence of Our history
    Then User will verify the presence of Careers
    Then User will verify the presence of Press Room
    Then User will verify the presence of Giving Back
    And User will click on expand button for services
    Then User will verify the presence of Gift Cards
    Then User will verify the presence of Academy Credit Card
    Then User will verify the presence of Store Services
    And User will click on expand button for needhelp
    Then User will verify the presence of Check Order
    Then User will verify the presence of Return Policy
    Then User will verify the presence of Product Recall
    Then User will verify the presence of Rebates
    Then User will verify the presence of Contact Us
    Then User will verify the presence of Customer Care

  @1HR @Mobile @C-HP @KER-262  @ZYP_K262-7283 @All @Regression @1HR
  Scenario: Verify presence of Global Element Header
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User will verify the presence of ASO Logo
    Then User will verify the presence of search
    Then User clicks on the burger menu

  #  Then User will verify the presence of add to cart icon
  @Regression @Mobile @KER-262  @ZYP_K262-4078 @C-HP
  Scenario Outline: Verify the SignUp functionality for new customer
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    When click sign in

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @Regression @Mobile @KER-262  @ZYP_K262-4085 @C-HP @1HR
  Scenario Outline: To Verify the signout from MyAccount
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    When click sign in
    Then User clicks on the burger menu
    Then click on singout

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @Regression @Mobile @KER-262  @ZYP_K262-6468 @C-HP
  Scenario Outline: To verify user can view 'My Account' from a drop down account summary upon successful log in
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify user to navigate to account summary page

    Examples: 
      | username       | password |
      | qaz2@gmail.com | qazlee   |

  @Regression @Mobile @KER-262  @ZYP_K262-4073 @C-HP
  Scenario Outline: Verify the Sign-in functionality for invalid email address
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user to fill username "<username>" and password "<password>"
    And click sign in
    Then verify the validation message as incorrect

    Examples: 
      | username         | password |
      | qaz222@gmail.com | qazlee   |

  @Regression @Mobile @KER-262  @ZYP_K262-4074 @C-HP
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

  @Regression @Mobile @KER-262  @ZYP_K262-4077 @C-HP
  Scenario: Verify the Signin functionality for empty email address and empty password
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    And click sign in
    Then verify enter email and password message to come

  @C-HP @Mobile @Regression @KER-262  @ZYP_K262-4079
  Scenario: Verify the forgot your password functionality
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    When user to be able to click forget password
    When user to enter email
    Then verify user to click submit button

  @C-HP @Mobile @Regression @KER-262  @ZYP_K262-4082 @1HR
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

  @C-HP @Mobile @Regression @KER-262  @ZYP_K262-4083 @1HR
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

  @C-HP @Mobile @Regression @KER-262  @ZYP_K262-2732 @CR-RKA
  Scenario: Mobile-Verify the Sign-In functionality for Guest User
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User clicks on the burger menu
    When user to click on sing in and navigate to sign in page
    Then user verify signup and signin
    When user to be able to click forget password
    When user to enter email
    Then verify user to click submit button

  @C-HP @Mobile @Regression @KER-262  @ZYP_K262-2733 @CR-RKA
  Scenario Outline: Mobile-Verify the Sign-In functionality for Guest User before clicking on search button
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User to verify serch option box is available
    Then User to verify search for any requirement"<data>"

    Examples: 
      | data |
      | pant |

  #			extension of ZYP-2733
  @C-HP @Mobile @Regression @KER-262  @ZYP_K262-9672 @CR-RKA
  Scenario Outline: Mobile-Verify the Sign-In functionality for Guest User after clicking on search button
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User to verify serch option box is available
    Then User to click on search button after putting data"<data>"

    Examples: 
      | data |
      | pant |

  @C-HP @Mobile @Regression @KER-262  @ZYP_K262-2736 @CR-RKA
  Scenario Outline: Verify the global search box functionality for Mobile
    Given user launches the browser and navigates to "ASO_HOME" page
    Then User to verify serch option box is available
    Then User to click on search button after putting data"<data>"
    Then User to navigate to bottom
    Then User to verify magnifying glass icon when scroll down
