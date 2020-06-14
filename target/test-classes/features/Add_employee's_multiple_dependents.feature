#Author: Faisal Sakhi

@Reporting @mvn
Feature: Employee Multiple Dependents
Scenario: As an admin I should be able to add employee multiple dependents
Given I logged with valid admin credentials
And I should go to Employee List from PIM
And I should enter employees "Faisal Sakhi" and "10392" and click on search
And click on the name from the list
And click on dependents and click on Add
When I enter "Rohani", Relationship and Date Of birth "1986-Feb-13"
Then i click on save 




