$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('assignment2\WriteReview.feature');
formatter.feature({
  "line": 1,
  "name": "Write Review for Health Insurance",
  "description": "",
  "id": "write-review-for-health-insurance",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 15,
  "name": "User should be able to navigate to the Wallet Hub profile, write a review for Health Insurance and validate it",
  "description": "",
  "id": "write-review-for-health-insurance;user-should-be-able-to-navigate-to-the-wallet-hub-profile,-write-a-review-for-health-insurance-and-validate-it;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User navigates to the URL for Wallet Hub",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be able to hover and click on the fifth rating star",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be abe to select the insurance type \"Health Insurance\" and write a review \"this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review\" for the company",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User should be able to click on the Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is on the login page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be able to provide the username \"namrata.juhi@gmail.com\" and password \"Pass@1234\" to login",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User should be able to verify the review \"this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review\" is posted",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.User_opens_the_browser()"
});
formatter.result({
  "duration": 5978913262,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.User_navigates_to_the_URL_for_Wallet_Hub()"
});
formatter.result({
  "duration": 10635555956,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.User_should_be_able_to_hover_and_click_on_the_fifth_rating_star()"
});
formatter.result({
  "duration": 5317247844,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Health Insurance",
      "offset": 49
    },
    {
      "val": "this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review",
      "offset": 87
    }
  ],
  "location": "StepDefinition.User_should_be_abe_to_write_a_review_for_the_company(String,String)"
});
formatter.result({
  "duration": 1639935266,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.User_should_be_able_to_click_on_the_Submit_button()"
});
formatter.result({
  "duration": 5092221946,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.User_is_on_the_login_page()"
});
formatter.result({
  "duration": 39261900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "namrata.juhi@gmail.com",
      "offset": 45
    },
    {
      "val": "Pass@1234",
      "offset": 83
    }
  ],
  "location": "StepDefinition.User_should_be_able_to_provide_the_username_and_password_to_login(String,String)"
});
formatter.result({
  "duration": 10554488793,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review this is a test review",
      "offset": 42
    }
  ],
  "location": "StepDefinition.User_should_be_able_to_verify_the_review_is_posted(String)"
});
formatter.result({
  "duration": 64954082,
  "status": "passed"
});
});