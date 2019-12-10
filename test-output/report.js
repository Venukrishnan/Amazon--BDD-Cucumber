$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/U28166/workspace1213/Amazon_Bdd/src/test/resources/login.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon login test",
  "description": "",
  "id": "amazon-login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2827443850,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Amazon log in test scenario",
  "description": "",
  "id": "amazon-login-test;amazon-log-in-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User opens the Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on Amazon india Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User Enteres username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "The home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "homePageSteps.user_opens_the_Browser()"
});
formatter.result({
  "duration": 12442168117,
  "status": "passed"
});
formatter.match({
  "location": "homePageSteps.user_is_on_Amazon_india_Login_Page()"
});
formatter.result({
  "duration": 2755313635,
  "status": "passed"
});
formatter.match({
  "location": "homePageSteps.user_Enteres_username_and_password()"
});
formatter.result({
  "duration": 10653417403,
  "status": "passed"
});
formatter.match({
  "location": "homePageSteps.user_clicks_login_button()"
});
formatter.result({
  "duration": 20223,
  "status": "passed"
});
formatter.match({
  "location": "homePageSteps.the_home_page_is_displayed()"
});
formatter.result({
  "duration": 54802095,
  "status": "passed"
});
formatter.match({
  "location": "homePageSteps.Close_the_browser()"
});
formatter.result({
  "duration": 63846633,
  "status": "passed"
});
formatter.before({
  "duration": 2789714812,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Amazon product search scenario",
  "description": "",
  "id": "amazon-login-test;amazon-product-search-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User is on the Amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User search for a product",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Product List page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "homePageSteps.user_is_on_the_Amazon_home_page()"
});
formatter.result({
  "duration": 10766751214,
  "status": "passed"
});
formatter.match({
  "location": "homePageSteps.user_search_for_a_product()"
});
formatter.result({
  "duration": 13035173301,
  "status": "passed"
});
formatter.match({
  "location": "homePageSteps.product_List_page_is_displayed()"
});
formatter.result({
  "duration": 69799354,
  "status": "passed"
});
formatter.match({
  "location": "homePageSteps.Close_the_browser()"
});
formatter.result({
  "duration": 80756694,
  "status": "passed"
});
});