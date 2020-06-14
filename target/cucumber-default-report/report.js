$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Add_employee\u0027s_multiple_dependents.feature");
formatter.feature({
  "name": "Employee Multiple Dependents",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Reporting"
    },
    {
      "name": "@mvn"
    }
  ]
});
formatter.scenario({
  "name": "As an admin I should be able to add employee multiple dependents",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Reporting"
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
  "name": "click on dependents and click on Add",
  "keyword": "And "
});
formatter.match({
  "location": "steps.EmployeeMultipleDependents.click_on_dependents_and_click_on_Add()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Rohani\", Relationship and Date Of birth \"1986-Feb-13\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EmployeeMultipleDependents.i_enter_Relationship_and_Date_Of_birth(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on save",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EmployeeMultipleDependents.i_click_on_save()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "As an admin I should be able to add employee multiple dependents");
formatter.after({
  "status": "passed"
});
});