$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FT0001_SampleFeature.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Date Added: 29 Mar 2021"
    },
    {
      "line": 3,
      "value": "#Descriotion: Sample Feature Definition Template"
    }
  ],
  "line": 5,
  "name": "Login Application",
  "description": "",
  "id": "login-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Login the application",
  "description": "",
  "id": "login-application;login-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@regression,"
    },
    {
      "line": 7,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User Launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User opens the URL \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter username as \"Admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter password as \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify whether login is successful.",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_Launch_browser()"
});
formatter.result({
  "duration": 2008169300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://opensource-demo.orangehrmlive.com/",
      "offset": 20
    }
  ],
  "location": "LoginSteps.user_opens_the_URL(String)"
});
formatter.result({
  "duration": 5810775800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 21
    }
  ],
  "location": "LoginSteps.i_enter_username_as(String)"
});
formatter.result({
  "duration": 92767600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 21
    }
  ],
  "location": "LoginSteps.i_enter_password_as(String)"
});
formatter.result({
  "duration": 87346700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_Login_button()"
});
formatter.result({
  "duration": 4381887900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_verify_whether_login_is_successful()"
});
formatter.result({
  "duration": 15967500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.close_browser()"
});
formatter.result({
  "duration": 674771400,
  "status": "passed"
});
});