package elements;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.utils.CommonMethods;

import testbase.BaseClass;

public class EmployeeMultipleDependentsElements extends CommonMethods {

@FindBy (xpath="//input[@id='empsearch_employee_name_empName']")
public WebElement employeeName;

@FindBy (xpath="//input[@id='empsearch_id']")
public WebElement employeeId;

@FindBy (xpath="//input[@id='searchBtn']")
public WebElement searchbtn;
	
@FindBy (xpath="//a[text()='Dependents']")
public WebElement dependents;


@FindBy (xpath="//input[@id='btnAddDependent']")
public WebElement addbtn;

@FindBy (xpath="//input[@id='dependent_name']")
public WebElement name;

@FindBy (id="dependent_relationshipType")
public WebElement relationship;

@FindBy (xpath="//input[@id='dependent_dateOfBirth']")
public WebElement dateofBirth;

@FindBy (xpath="//input[@id='btnSaveDependent']")
public WebElement savebtn;

@FindBy(linkText="Faisal")
public WebElement employeeDetail;




public EmployeeMultipleDependentsElements () {

	PageFactory.initElements (BaseClass.driver, this);

}

	
	
	
	
}
