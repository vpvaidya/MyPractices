$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Workspace/SimpleBDDFramework/src/main/java/Features/LoginwithMaps.feature");
formatter.feature({
  "line": 1,
  "name": "Login to CRM Application with Datatable",
  "description": "",
  "id": "login-to-crm-application-with-datatable",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login to CRM Application",
  "description": "",
  "id": "login-to-crm-application-with-datatable;login-to-crm-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of Page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "sachin.vaidya12@gmail.com",
        "India@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on ligin button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginwithMaps.use_is_already_login_page()"
});
formatter.result({
  "duration": 23490230860,
  "status": "passed"
});
formatter.match({
  "location": "LoginwithMaps.title_of_Page_is_Free_CRM()"
});
formatter.result({
  "duration": 26430256,
  "status": "passed"
});
formatter.match({
  "location": "LoginwithMaps.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 612324906,
  "status": "passed"
});
formatter.match({
  "location": "LoginwithMaps.user_click_on_ligin_button()"
});
formatter.result({
  "duration": 79438780,
  "status": "passed"
});
formatter.match({
  "location": "LoginwithMaps.close_the_browser()"
});
formatter.result({
  "duration": 184534531,
  "status": "passed"
});
});