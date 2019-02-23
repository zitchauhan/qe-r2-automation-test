$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/plcc/trail.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8918800,
  "status": "passed"
});
formatter.before({
  "duration": 7903600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Background:  Common Pre-requisite steps"
    },
    {
      "line": 4,
      "value": "#\tGiven user launches the browser and navigates to \"ASO_HOME\" page"
    },
    {
      "line": 5,
      "value": "#\tWhen user click on My Account link"
    },
    {
      "line": 6,
      "value": "#\tAnd  user click on Sign Up link"
    },
    {
      "line": 7,
      "value": "#\tThen user expect element First Name to be present"
    },
    {
      "line": 8,
      "value": "#\tAnd user enter First Name \"First_Name\""
    },
    {
      "line": 9,
      "value": "#\tAnd user expect element Last Name to be present"
    },
    {
      "line": 10,
      "value": "#\tAnd user enter Last Name \"Last_Name\""
    },
    {
      "line": 11,
      "value": "#\tAnd user expect element Email Address to be present"
    },
    {
      "line": 12,
      "value": "#\tAnd user enter Email Address \"Email_Address\""
    },
    {
      "line": 13,
      "value": "#\tAnd user expect element Create Password to be present"
    },
    {
      "line": 14,
      "value": "#\tAnd user enter Password \"Create_Password\""
    },
    {
      "line": 15,
      "value": "#\tAnd user expect element Add Address for Faster Checkout checkbox to be present"
    },
    {
      "line": 16,
      "value": "#\tWhen user select Add Address for Faster Checkout checkbox"
    },
    {
      "line": 17,
      "value": "#\tThen user expect element Address to be present"
    },
    {
      "line": 18,
      "value": "#\tAnd user enter Address \"Address\""
    },
    {
      "line": 19,
      "value": "#\tAnd user expect element Zip Code to be present"
    },
    {
      "line": 20,
      "value": "#\tAnd user enter Zip Code \"Zip_Code\""
    },
    {
      "line": 21,
      "value": "#\tAnd user expect element City to be present"
    },
    {
      "line": 22,
      "value": "#\tAnd user expect element State to be present"
    },
    {
      "line": 23,
      "value": "#\tAnd user expect element Phone number to be present"
    },
    {
      "line": 24,
      "value": "#\tAnd user enter Phone Number \"Phone_Number\""
    },
    {
      "line": 25,
      "value": "#\tAnd user expect element SIGN UP to be present"
    },
    {
      "line": 26,
      "value": "#\tAnd user click on SIGN UP"
    }
  ],
  "line": 30,
  "name": "Verify the Address in MyAccount section",
  "description": "",
  "id": "registration;verify-the-address-in-myaccount-section",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@C-PLCC"
    },
    {
      "line": 29,
      "name": "@Regression"
    },
    {
      "line": 29,
      "name": "@All"
    },
    {
      "line": 29,
      "name": "@PLCC-42"
    },
    {
      "line": 29,
      "name": "@CR-VS"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 31,
      "value": "#\tWhen user expect element User Select Address to be present"
    },
    {
      "line": 32,
      "value": "#\tThen user click on User Select Address"
    },
    {
      "line": 33,
      "value": "#\tWhen user click on My Account link"
    },
    {
      "line": 34,
      "value": "#    And user click on Address Book in MyAccount link"
    },
    {
      "line": 35,
      "value": "#    And user expect element Address Book to be present"
    },
    {
      "line": 36,
      "value": "#    And user expect element Add New Address link to be present"
    }
  ],
  "line": 37,
  "name": "user expect element for first name and Last name text",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 3838700,
  "status": "passed"
});
formatter.after({
  "duration": 179700,
  "status": "passed"
});
});