package steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.*;

public class EmployeeMultipleDependents extends CommonMethods {

	@Given("I logged with valid admin credentials")
	public void i_logged_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		wait(3);
	  
	}

	@Given("I should go to Employee List from PIM")
	public void i_should_go_to_Employee_List_from_PIM() {
	jsClick(dashboard.PIM);
	jsClick(dashboard.empListPage);
	wait(3);
	}

	@Given("I should enter employees {string} and {string} and click on search")
	public void i_should_enter_employees_and_and_click_on_search(String string, String string2) {
		sendText(empMultiDep.employeeName, string);
		sendText(empMultiDep.employeeId, string2);
		click(empMultiDep.searchbtn);
		wait(3);
	  
	}

	@Given("click on the name from the list")
	public void click_on_the_name_from_the_list() {
		System.out.println(empMultiDep.employeeDetail.getText());
	click(empMultiDep.employeeDetail);
	wait(2);
	}

@Given("click on dependents and click on Add")
public void click_on_dependents_and_click_on_Add() {
	 
jsClick(empMultiDep.dependents);
wait(2);
jsClick(empMultiDep.addbtn);
		wait(2);	}

@When("I enter {string}, Relationship and Date Of birth {string}")
public void i_enter_Relationship_and_Date_Of_birth(String string, String string2) {
	  sendText(empMultiDep.name, string);
	  selectDdValue(empMultiDep.relationship, "Child");
	  sendText(empMultiDep.dateofBirth, string2);
	  
wait(2);	  
	}

	@Then("i click on save")
	public void i_click_on_save() {
	   jsClick(empMultiDep.savebtn);
	   wait(1);
	}
	
	
	
	
	
	
}
