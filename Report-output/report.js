$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Eclips%20instalation%20setup/Cucumber_POM/Features/Customer.feature");
formatter.feature({
  "name": "New Customer Creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Creation of New Customer Details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsCustomer.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepsCustomer.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Username  and Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepsCustomer.user_enters_Username_and_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on submit btn",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsCustomer.user_clicks_on_submit_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on customer link",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsCustomer.user_clicks_on_customer_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on add new customer link",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsCustomer.user_clicks_on_add_new_customer_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters details of customer",
  "rows": [
    {
      "cells": [
        "Email",
        "Password",
        "Firstname",
        "Lastname",
        "Dateofbirth",
        "Companyname",
        "Admincomment"
      ]
    },
    {
      "cells": [
        "skg2220@gmail.com",
        "802044",
        "suffha",
        "gargf",
        "07/07/2019",
        "TVSS",
        "Hellow"
      ]
    },
    {
      "cells": [
        "gadesk55@gmail.com",
        "451254",
        "suyaff",
        "joyf",
        "03/08/2019",
        "TTCS",
        "hiiiii"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepsCustomer.user_enters_details_of_customer(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User save the details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsCustomer.user_save_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User cliks on logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsCustomer.user_cliks_on_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsCustomer.close_browser()"
});
formatter.result({
  "status": "passed"
});
});