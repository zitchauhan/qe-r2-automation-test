$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("R1SP1_KER_1603_Categories_CategoryDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Categories - category details",
  "description": "",
  "id": "categories---category-details",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": ": Verify for status code 200",
  "description": "",
  "id": "categories---category-details;:-verify-for-status-code-200",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@Sanity"
    },
    {
      "line": 3,
      "name": "@All"
    },
    {
      "line": 3,
      "name": "@api"
    },
    {
      "line": 3,
      "name": "@KER-1603"
    },
    {
      "line": 3,
      "name": "@ZYP-3052"
    },
    {
      "line": 3,
      "name": "@C-CLP"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "\"CategoryDetail\" endpoint for Category \"\u003cCategoryID\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify response status code as 200 for Category",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "categories---category-details;:-verify-for-status-code-200;",
  "rows": [
    {
      "cells": [
        "CategoryID"
      ],
      "line": 9,
      "id": "categories---category-details;:-verify-for-status-code-200;;1"
    },
    {
      "cells": [
        "15613,15157,15645"
      ],
      "line": 10,
      "id": "categories---category-details;:-verify-for-status-code-200;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": ": Verify for status code 200",
  "description": "",
  "id": "categories---category-details;:-verify-for-status-code-200;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@ZYP-3052"
    },
    {
      "line": 3,
      "name": "@api"
    },
    {
      "line": 3,
      "name": "@Sanity"
    },
    {
      "line": 3,
      "name": "@C-CLP"
    },
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@KER-1603"
    },
    {
      "line": 3,
      "name": "@All"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "\"CategoryDetail\" endpoint for Category \"15613,15157,15645\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify response status code as 200 for Category",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "CategoryDetail",
      "offset": 1
    },
    {
      "val": "15613,15157,15645",
      "offset": 40
    }
  ],
  "location": "R1SP1_CategoryDetailsSD.endpoint_for_Category(String,String)"
});
formatter.result({
  "duration": 5453393600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 31
    }
  ],
  "location": "R1SP1_CategoryDetailsSD.verify_response_status_code_as_for_Category(int)"
});
formatter.result({
  "duration": 3417000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": ": validate CategoryDetails json schema",
  "description": "",
  "id": "categories---category-details;:-validate-categorydetails-json-schema",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@Regression"
    },
    {
      "line": 12,
      "name": "@Sanity"
    },
    {
      "line": 12,
      "name": "@All"
    },
    {
      "line": 12,
      "name": "@api"
    },
    {
      "line": 12,
      "name": "@KER-1603"
    },
    {
      "line": 12,
      "name": "@ZYP-5381"
    },
    {
      "line": 12,
      "name": "@C-CLP"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "\"CategoryDetail\" endpoint for Category \"\u003cCategoryID\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "validate jsonSchema \"CategoryDetailSchema\" for CategoryDetail",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "categories---category-details;:-validate-categorydetails-json-schema;",
  "rows": [
    {
      "cells": [
        "CategoryID"
      ],
      "line": 18,
      "id": "categories---category-details;:-validate-categorydetails-json-schema;;1"
    },
    {
      "cells": [
        "15613,15157,15645"
      ],
      "line": 19,
      "id": "categories---category-details;:-validate-categorydetails-json-schema;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": ": validate CategoryDetails json schema",
  "description": "",
  "id": "categories---category-details;:-validate-categorydetails-json-schema;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@api"
    },
    {
      "line": 12,
      "name": "@Sanity"
    },
    {
      "line": 12,
      "name": "@ZYP-5381"
    },
    {
      "line": 12,
      "name": "@C-CLP"
    },
    {
      "line": 12,
      "name": "@Regression"
    },
    {
      "line": 12,
      "name": "@KER-1603"
    },
    {
      "line": 12,
      "name": "@All"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "\"CategoryDetail\" endpoint for Category \"15613,15157,15645\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "validate jsonSchema \"CategoryDetailSchema\" for CategoryDetail",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "CategoryDetail",
      "offset": 1
    },
    {
      "val": "15613,15157,15645",
      "offset": 40
    }
  ],
  "location": "R1SP1_CategoryDetailsSD.endpoint_for_Category(String,String)"
});
formatter.result({
  "duration": 240390200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CategoryDetailSchema",
      "offset": 21
    }
  ],
  "location": "R1SP1_CategoryDetailsSD.validate_jsonSchema_for_CategoryDetail(String)"
});
formatter.result({
  "duration": 607251700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 22,
  "name": ": Validate the CategoryDetails Requried Property Values",
  "description": "",
  "id": "categories---category-details;:-validate-the-categorydetails-requried-property-values",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@Regression"
    },
    {
      "line": 21,
      "name": "@Sanity"
    },
    {
      "line": 21,
      "name": "@All"
    },
    {
      "line": 21,
      "name": "@api"
    },
    {
      "line": 21,
      "name": "@KER-1603"
    },
    {
      "line": 21,
      "name": "@ZYP-5382"
    },
    {
      "line": 21,
      "name": "@C-CLP"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "\"CategoryDetail\" endpoint for Category \"\u003cCategoryID\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Read the CategoryDetails json response",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Validate the CategoryDetails Requried Property Value are not Null",
  "rows": [
    {
      "cells": [
        "categoryId"
      ],
      "line": 26
    },
    {
      "cells": [
        "name"
      ],
      "line": 27
    },
    {
      "cells": [
        "seoURL"
      ],
      "line": 28
    },
    {
      "cells": [
        "shortDescription"
      ],
      "line": 29
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "# | thumbnail        |"
    }
  ],
  "line": 31,
  "name": "Validate the Category SubCategory Requried Property Value are not Null",
  "rows": [
    {
      "cells": [
        "uniqueID"
      ],
      "line": 32
    },
    {
      "cells": [
        "name"
      ],
      "line": 33
    },
    {
      "cells": [
        "seoURL"
      ],
      "line": 34
    },
    {
      "cells": [
        "shortDescription"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "categories---category-details;:-validate-the-categorydetails-requried-property-values;",
  "rows": [
    {
      "cells": [
        "CategoryID"
      ],
      "line": 38,
      "id": "categories---category-details;:-validate-the-categorydetails-requried-property-values;;1"
    },
    {
      "cells": [
        "15613,15157,15645"
      ],
      "line": 39,
      "id": "categories---category-details;:-validate-the-categorydetails-requried-property-values;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 39,
  "name": ": Validate the CategoryDetails Requried Property Values",
  "description": "",
  "id": "categories---category-details;:-validate-the-categorydetails-requried-property-values;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@ZYP-5382"
    },
    {
      "line": 21,
      "name": "@api"
    },
    {
      "line": 21,
      "name": "@Sanity"
    },
    {
      "line": 21,
      "name": "@C-CLP"
    },
    {
      "line": 21,
      "name": "@Regression"
    },
    {
      "line": 21,
      "name": "@KER-1603"
    },
    {
      "line": 21,
      "name": "@All"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "\"CategoryDetail\" endpoint for Category \"15613,15157,15645\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Read the CategoryDetails json response",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Validate the CategoryDetails Requried Property Value are not Null",
  "rows": [
    {
      "cells": [
        "categoryId"
      ],
      "line": 26
    },
    {
      "cells": [
        "name"
      ],
      "line": 27
    },
    {
      "cells": [
        "seoURL"
      ],
      "line": 28
    },
    {
      "cells": [
        "shortDescription"
      ],
      "line": 29
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "# | thumbnail        |"
    }
  ],
  "line": 31,
  "name": "Validate the Category SubCategory Requried Property Value are not Null",
  "rows": [
    {
      "cells": [
        "uniqueID"
      ],
      "line": 32
    },
    {
      "cells": [
        "name"
      ],
      "line": 33
    },
    {
      "cells": [
        "seoURL"
      ],
      "line": 34
    },
    {
      "cells": [
        "shortDescription"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "CategoryDetail",
      "offset": 1
    },
    {
      "val": "15613,15157,15645",
      "offset": 40
    }
  ],
  "location": "R1SP1_CategoryDetailsSD.endpoint_for_Category(String,String)"
});
formatter.result({
  "duration": 173412000,
  "status": "passed"
});
formatter.match({
  "location": "R1SP1_CategoryDetailsSD.read_the_CategoryDetails_json_response()"
});
formatter.result({
  "duration": 20177300,
  "status": "passed"
});
formatter.match({
  "location": "R1SP1_CategoryDetailsSD.validate_the_CategoryDetails_Requried_Property_Value_are_not_Null(String\u003e)"
});
formatter.result({
  "duration": 6994600,
  "status": "passed"
});
formatter.match({
  "location": "R1SP1_CategoryDetailsSD.validate_the_Category_SubCategory_Requried_Property_Value_are_not_Null(String\u003e)"
});
formatter.result({
  "duration": 61123400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 42,
  "name": "Verify for status code 404 for Not Found",
  "description": "",
  "id": "categories---category-details;verify-for-status-code-404-for-not-found",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 41,
      "name": "@Regression"
    },
    {
      "line": 41,
      "name": "@Sanity"
    },
    {
      "line": 41,
      "name": "@All"
    },
    {
      "line": 41,
      "name": "@api"
    },
    {
      "line": 41,
      "name": "@KER-1603"
    },
    {
      "line": 41,
      "name": "@ZYP-3054"
    },
    {
      "line": 41,
      "name": "@C-CLP"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "\"CategoryDetailFor404\" endpoint for Category \"\u003cCategoryID\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "Verify response status code as 404 for Category",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Verify the response error \"Not Found\" for CategoryDetail",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Verify the response message \"No message available\" for CategoryDetail",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 47,
      "value": "#Then Verify response status code as 404 for Category"
    },
    {
      "line": 48,
      "value": "#And Verify the response error \"Not Found\" for CategoryDetail"
    },
    {
      "line": 49,
      "value": "#Then Verify the response message \"No message available\" for CategoryDetail"
    }
  ],
  "line": 51,
  "name": "",
  "description": "",
  "id": "categories---category-details;verify-for-status-code-404-for-not-found;",
  "rows": [
    {
      "cells": [
        "CategoryID"
      ],
      "line": 52,
      "id": "categories---category-details;verify-for-status-code-404-for-not-found;;1"
    },
    {
      "cells": [
        "15613,15157,15645"
      ],
      "line": 53,
      "id": "categories---category-details;verify-for-status-code-404-for-not-found;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 53,
  "name": "Verify for status code 404 for Not Found",
  "description": "",
  "id": "categories---category-details;verify-for-status-code-404-for-not-found;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 41,
      "name": "@api"
    },
    {
      "line": 41,
      "name": "@Sanity"
    },
    {
      "line": 41,
      "name": "@C-CLP"
    },
    {
      "line": 41,
      "name": "@Regression"
    },
    {
      "line": 41,
      "name": "@KER-1603"
    },
    {
      "line": 41,
      "name": "@ZYP-3054"
    },
    {
      "line": 41,
      "name": "@All"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "\"CategoryDetailFor404\" endpoint for Category \"15613,15157,15645\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "Verify response status code as 404 for Category",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Verify the response error \"Not Found\" for CategoryDetail",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Verify the response message \"No message available\" for CategoryDetail",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "CategoryDetailFor404",
      "offset": 1
    },
    {
      "val": "15613,15157,15645",
      "offset": 46
    }
  ],
  "location": "R1SP1_CategoryDetailsSD.endpoint_for_Category(String,String)"
});
formatter.result({
  "duration": 307872300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "404",
      "offset": 31
    }
  ],
  "location": "R1SP1_CategoryDetailsSD.verify_response_status_code_as_for_Category(int)"
});
formatter.result({
  "duration": 1430500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Not Found",
      "offset": 27
    }
  ],
  "location": "R1SP1_CategoryDetailsSD.verify_the_response_error_for_CategoryDetail(String)"
});
formatter.result({
  "duration": 1941400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No message available",
      "offset": 29
    }
  ],
  "location": "R1SP1_CategoryDetailsSD.verify_the_response_message_for_CategoryDetail(String)"
});
formatter.result({
  "duration": 520900,
  "status": "passed"
});
formatter.scenario({
  "line": 56,
  "name": "Verify for status code 400 for Bad Request",
  "description": "",
  "id": "categories---category-details;verify-for-status-code-400-for-bad-request",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 55,
      "name": "@Regression"
    },
    {
      "line": 55,
      "name": "@Sanity"
    },
    {
      "line": 55,
      "name": "@All"
    },
    {
      "line": 55,
      "name": "@api"
    },
    {
      "line": 55,
      "name": "@KER-1603"
    },
    {
      "line": 55,
      "name": "@ZYP-3053"
    },
    {
      "line": 55,
      "name": "@C-CLP"
    }
  ]
});
formatter.step({
  "line": 57,
  "name": "\"CategoryDetailFor400\" endpoint for Category",
  "keyword": "Given "
});
formatter.step({
  "line": 58,
  "name": "Verify Error response status code as 400 for Category",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "CategoryDetailFor400",
      "offset": 1
    }
  ],
  "location": "R1SP1_CategoryDetailsSD.endpoint_for_Category(String)"
});
formatter.result({
  "duration": 151978000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 37
    }
  ],
  "location": "R1SP1_CategoryDetailsSD.verify_Error_response_status_code_as_for_Category(int)"
});
formatter.result({
  "duration": 587100,
  "status": "passed"
});
formatter.uri("R1SP1_KER_1915_CreateWishlist.feature");
formatter.feature({
  "line": 1,
  "name": "To verify the Create Wishlist API Services",
  "description": "",
  "id": "to-verify-the-create-wishlist-api-services",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": ": Verify create Wishlist with sign-in user for status code 200",
  "description": "",
  "id": "to-verify-the-create-wishlist-api-services;:-verify-create-wishlist-with-sign-in-user-for-status-code-200",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@Sanity"
    },
    {
      "line": 3,
      "name": "@All"
    },
    {
      "line": 3,
      "name": "@api"
    },
    {
      "line": 3,
      "name": "@KER-1915"
    },
    {
      "line": 3,
      "name": "@ZYP-7317"
    },
    {
      "line": 3,
      "name": "@C-PDP"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "API \"\u003cwishlistPostUrl\u003e\" and post request \"\u003cwishlistRequestJson\u003e\" endpoint for Wishlist with Sign-in user \"\u003cUserName\u003e\"\"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify response status code as 200 for Wishlist",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "to-verify-the-create-wishlist-api-services;:-verify-create-wishlist-with-sign-in-user-for-status-code-200;",
  "rows": [
    {
      "cells": [
        "wishlistPostUrl",
        "wishlistRequestJson",
        "UserName",
        "Password"
      ],
      "line": 9,
      "id": "to-verify-the-create-wishlist-api-services;:-verify-create-wishlist-with-sign-in-user-for-status-code-200;;1"
    },
    {
      "cells": [
        "/api/profile/wishlist",
        "WishlistPostRequest",
        "travi@ravi.com",
        "Qwerty@123"
      ],
      "line": 10,
      "id": "to-verify-the-create-wishlist-api-services;:-verify-create-wishlist-with-sign-in-user-for-status-code-200;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": ": Verify create Wishlist with sign-in user for status code 200",
  "description": "",
  "id": "to-verify-the-create-wishlist-api-services;:-verify-create-wishlist-with-sign-in-user-for-status-code-200;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@KER-1915"
    },
    {
      "line": 3,
      "name": "@api"
    },
    {
      "line": 3,
      "name": "@Sanity"
    },
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@ZYP-7317"
    },
    {
      "line": 3,
      "name": "@C-PDP"
    },
    {
      "line": 3,
      "name": "@All"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "API \"/api/profile/wishlist\" and post request \"WishlistPostRequest\" endpoint for Wishlist with Sign-in user \"travi@ravi.com\"\"Qwerty@123\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify response status code as 200 for Wishlist",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "/api/profile/wishlist",
      "offset": 5
    },
    {
      "val": "WishlistPostRequest",
      "offset": 46
    },
    {
      "val": "travi@ravi.com",
      "offset": 108
    },
    {
      "val": "Qwerty@123",
      "offset": 124
    }
  ],
  "location": "R1SP1_KER_1915_Wishlist.and_post_request_endpoint_for_Wishlist_with_Sign_in_user(String,String,String,String)"
});
