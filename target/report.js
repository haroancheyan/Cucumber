$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/TvPurchase.feature");
formatter.feature({
  "name": "Tv Purchase",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_launch_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user abel to login flipkart credentials",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_abel_to_login_flipkart_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Tv list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Haroan"
    }
  ]
});
formatter.step({
  "name": "user search Tv and choose by one dim list",
  "rows": [
    {
      "cells": [
        "LG TV",
        "SAMSUNG TV",
        "SONY TV"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TvPurchaseSteps.user_search_Tv_and_choose_by_one_dim_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add Tv to add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "TvPurchaseSteps.user_add_Tv_to_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_validates_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_launch_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user abel to login flipkart credentials",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_abel_to_login_flipkart_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Tv map",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Haroan"
    }
  ]
});
formatter.step({
  "name": "user search Tv and choose by one dim map",
  "rows": [
    {
      "cells": [
        "phone1",
        "LG TV"
      ]
    },
    {
      "cells": [
        "phone2",
        "SAMSUNG TV"
      ]
    },
    {
      "cells": [
        "phone3",
        "SONY TV"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TvPurchaseSteps.user_search_Tv_and_choose_by_one_dim_map(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add Tv to add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "TvPurchaseSteps.user_add_Tv_to_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_validates_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});