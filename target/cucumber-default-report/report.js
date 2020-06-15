$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Add_Membership.feature");
formatter.feature({
  "name": "Add Membership",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@mvn"
    }
  ]
});
formatter.scenario({
  "name": "add  memberships to any employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@mvn"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EmployeeMultipleDependents.i_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should go to Employee List from PIM",
  "keyword": "And "
});
formatter.match({
  "location": "steps.EmployeeMultipleDependents.i_should_go_to_Employee_List_from_PIM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should enter employees \"Faisal Sakhi\" and \"10392\" and click on search",
  "keyword": "And "
});
formatter.match({
  "location": "steps.EmployeeMultipleDependents.i_should_enter_employees_and_and_click_on_search(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the name from the list",
  "keyword": "And "
});
formatter.match({
  "location": "steps.EmployeeMultipleDependents.click_on_the_name_from_the_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Memberships and click on Add",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Add_Membership.click_on_Memberships_and_click_on_Add()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Java User in Membership",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Add_Membership.select_Java_User_in_Membership()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Company in Subscription Paid By and enter \"2000\" as Subscription Amount",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Add_Membership.select_Company_in_Subscription_Paid_By_and_enter_as_Subscription_Amount(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select United States Dollar as Currency",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Add_Membership.select_United_States_Dollar_as_Currency()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Subscription Commence Date \"2020-Jan-01\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Add_Membership.enter_Subscription_Commence_Date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Subscription Renewal Date \"2020-May-01\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Add_Membership.enter_Subscription_Renewal_Date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Add_Membership.click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "add  memberships to any employee");
formatter.after({
  "status": "passed"
});
});