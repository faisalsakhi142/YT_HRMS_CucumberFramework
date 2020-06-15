package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

import testbase.BaseClass;

public class Add_EmployeeElements extends CommonMethods {

@FindBy(xpath="//ul[@id='sidenav']/li[11]/a")
public WebElement Membership;

@FindBy (id="btnAddMembershipDetail")
public WebElement addBtn;

@FindBy (id="membership_membership")
public WebElement addMembership;

@FindBy (id="membership_subscriptionPaidBy")
public WebElement paidBy;

@FindBy (id="membership_subscriptionAmount")
public WebElement amount;

@FindBy (id="membership_currency")
public WebElement currency;

@FindBy (id="membership_subscriptionCommenceDate")
public WebElement commenceDate;

@FindBy (id="membership_subscriptionRenewalDate")
public WebElement renewalDate;

@FindBy (id="btnSaveMembership")
public WebElement saveBtn;


public Add_EmployeeElements() {
	PageFactory.initElements(BaseClass.driver, this);
}
	
}
