#Author: Faisal Sakhi
@smoke @mvn
Feature: Add Membership
Scenario: add  memberships to any employee
Given I logged with valid admin credentials
And I should go to Employee List from PIM
And I should enter employees "Faisal Sakhi" and "10392" and click on search
And click on the name from the list
And click on Memberships and click on Add
When select Java User in Membership
And select Company in Subscription Paid By and enter "2000" as Subscription Amount
And select United States Dollar as Currency
And enter Subscription Commence Date "2020-Jan-01"
And enter Subscription Renewal Date "2020-May-01"
Then click on save button

