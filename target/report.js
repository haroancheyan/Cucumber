$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/MobilePurchase.feature");
formatter.feature({
  "name": "Mobile Purchase",
  "description": "",
  "keyword": "Feature"
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
  "name": "Mobile",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user search mobile and choose",
  "keyword": "When "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_search_mobile_and_choose()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add mobile to add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_add_mobile_to_add_to_cart()"
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