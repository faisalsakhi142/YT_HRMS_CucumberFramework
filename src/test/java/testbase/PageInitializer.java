package testbase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import elements.Add_EmployeeElements;
import elements.EmployeeMultipleDependentsElements;
import pages.DashboardPageElements;
import pages.LoginPageElements;


public class PageInitializer extends BaseClass{
	public static LoginPageElements login;
	public static DashboardPageElements dashboard;
	public static EmployeeMultipleDependentsElements empMultiDep;
	public static Add_EmployeeElements addMembership;
	public static void initialize() {
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		empMultiDep=new EmployeeMultipleDependentsElements();
		addMembership=new Add_EmployeeElements();
	}
	public static void main(String[] args) {
	
	}
	
	
}
