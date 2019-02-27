$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/plcc/workAround.feature");
formatter.feature({
  "line": 1,
  "name": "Landing Page",
  "description": "",
  "id": "landing-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5555600,
  "status": "passed"
});
formatter.before({
  "duration": 6829000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Common Pre-requisite steps",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launches the browser and navigates to \"ASO_HOME\" page",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "ASO_HOME",
      "offset": 44
    }
  ],
  "location": "Common_Web_SD_PLCC.user_launches_the_browser_and_navigates_to_page(String)"
});
formatter.result({
  "duration": 9493633200,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#When user click on AcademyCreditCard link in the footer section of ASO-Home page"
    },
    {
      "line": 6,
      "value": "#Then user expect Landing page to be present"
    },
    {
      "line": 7,
      "value": "#And user expect element FPO Apply Order section to be present"
    }
  ],
  "line": 10,
  "name": "Verify the navigation of Footer Links -Social Media Links",
  "description": "",
  "id": "landing-page;verify-the-navigation-of-footer-links--social-media-links",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@C-PLCC"
    },
    {
      "line": 9,
      "name": "@Regression"
    },
    {
      "line": 9,
      "name": "@All"
    },
    {
      "line": 9,
      "name": "@PLCC-34"
    },
    {
      "line": 9,
      "name": "@CR-VS"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#\tAnd user expect element FaceBook to be present"
    },
    {
      "line": 12,
      "value": "#\tWhen user click on Facebook icon"
    },
    {
      "line": 13,
      "value": "#\tAnd user click and navigates to child window"
    },
    {
      "line": 14,
      "value": "#\tThen user navigates to Facebook Page and validate facebook url"
    }
  ],
  "line": 15,
  "name": "user switchback to parent window",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 838493500,
  "status": "passed"
});
formatter.after({
  "duration": 357900,
  "status": "passed"
});
});