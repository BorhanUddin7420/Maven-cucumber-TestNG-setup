$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("A_login.feature");
formatter.feature({
  "line": 1,
  "name": "User login credentioal regression test",
  "description": "",
  "id": "user-login-credentioal-regression-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2985245500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Unsuccessful Login with Invalid Username and Valid Password",
  "description": "",
  "id": "user-login-credentioal-regression-test;unsuccessful-login-with-invalid-username-and-valid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter Password \" 1215\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Click LogIn button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User check login alert \"Please enter valid email address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "login_stepDefenation.user_is_on_login_page()"
});
formatter.result({
  "duration": 5009644300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " 1215",
      "offset": 21
    }
  ],
  "location": "login_stepDefenation.user_enter_Password(String)"
});
formatter.result({
  "duration": 85351600,
  "status": "passed"
});
formatter.match({
  "location": "login_stepDefenation.user_Click_LogIn_button()"
});
formatter.result({
  "duration": 95420500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please enter valid email address",
      "offset": 24
    }
  ],
  "location": "login_stepDefenation.user_check_login_alert(String)"
});
formatter.result({
  "duration": 45352500,
  "status": "passed"
});
});