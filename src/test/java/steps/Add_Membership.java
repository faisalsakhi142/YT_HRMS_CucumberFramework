package steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_Membership extends CommonMethods {

//	@Given("I logged with valid admin credentials")
//	public void i_logged_with_valid_admin_credentials() {
//		sendText(login.username, ConfigsReader.getProperty("username"));
//		sendText(login.password, ConfigsReader.getProperty("password"));
//		click(login.loginBtn);
//		wait(3);
//	  
//	}
//
//	@And("I should go to Employee List from PIM")
//	public void i_should_go_to_Employee_List_from_PIM() {
//	jsClick(dashboard.PIM);
//	jsClick(dashboard.empListPage);
//	wait(3);
//	}
//
//	@And("I should enter employees {string} and {string} and click on search")
//	public void i_should_enter_employees_and_and_click_on_search(String string, String string2) {
//		sendText(empMultiDep.employeeName, string);
//		sendText(empMultiDep.employeeId, string2);
//		click(empMultiDep.searchbtn);
//		wait(3);
//	  
//	}
//
//	@And("click on the name from the list")
//	public void click_on_the_name_from_the_list() {
//		System.out.println(empMultiDep.employeeDetail.getText());
//	click(empMultiDep.employeeDetail);
//	wait(2);
//	}
	
	@And("click on Memberships and click on Add")
	public void click_on_Memberships_and_click_on_Add() {
	  jsClick(addMembership.Membership);
	  wait(2);
	  jsClick(addMembership.addBtn);
	}

	@When("select Java User in Membership")
	public void select_Java_User_in_Membership() {
		  selectDdValue(addMembership.addMembership, "Java User");
		  wait(2);
	}

	@And("select Company in Subscription Paid By and enter {string} as Subscription Amount")
	public void select_Company_in_Subscription_Paid_By_and_enter_as_Subscription_Amount(String string) {
		 selectDdValue(addMembership.paidBy, "Company");
		 sendText(addMembership.amount, string);
	}

	@And("select United States Dollar as Currency")
	public void select_United_States_Dollar_as_Currency() {
		selectDdValue(addMembership.currency, "United States Dollar");
	}

	@And("enter Subscription Commence Date {string}")
	public void enter_Subscription_Commence_Date(String string) {
	   sendText(addMembership.commenceDate, string);
	}

	@When("enter Subscription Renewal Date {string}")
	public void enter_Subscription_Renewal_Date(String string) {
	 sendText(addMembership.renewalDate, string);
	 wait(2);
	}

	@Then("click on save button")
	public void click_on_save_button() {
	  jsClick(addMembership.saveBtn);
	  wait(2);
	}



	
}
