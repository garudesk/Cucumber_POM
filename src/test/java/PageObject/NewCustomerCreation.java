package PageObject;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;


public class NewCustomerCreation {
	
	public WebDriver ldriver;
	
	public NewCustomerCreation(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//input[@value='Log in']")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement lnkLogout;
	
	@FindBy(xpath="//a[@href='#']//span[contains(text(),'Customers')]")
	WebElement customer_btn;
	
	@FindBy(xpath="//span[@class='menu-item-title'][contains(text(),'Customers')]")
	WebElement customer_active_btn;
	
	@FindBy(xpath="//a[@class='btn bg-blue']")
	WebElement add_new_btn;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement save_btn;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='Gender_Male']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='DateOfBirth']")
	WebElement dob;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement company;
	
	@FindBy(xpath="//input[@id='IsTaxExempt']")
	WebElement IsTaxExempt_checkbox;
	
	@FindBy(xpath="//input[@name='SelectedNewsletterSubscriptionStoreIds' and @value='1']")
	WebElement Newsletter_checkbox;
	
	@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap']")
	WebElement Customer_roles_dropdown;
	
	@FindBy(xpath="//*[@id='VendorId']")
	WebElement 	Manager_of_vendor_dropdown;
	
	@FindBy(xpath="//input[@id='Active']")
	WebElement active_checkbox;
	
	@FindBy(xpath="//textarea[@id='AdminComment']")
	WebElement admincommet;
	
	
	
	
	public void setUserName(String Use) {
		 
	
		txtEmail.sendKeys(Use);

	}

	public void setPassword(String Pass) {
	
		
		txtPassword.sendKeys(Pass);

		}
	
	public void clickLogin() {
		btnLogin.click();
	}

	
	public void ClickCustomerBtn() {
	
		customer_btn.click();
		customer_active_btn.click();
    
    }
	
	public void ClickAddNewCustomer() {
	
	
		add_new_btn.click();
	
	}
	
	  public void EnterNewDetailsofCustomer(String Email,String Password,String Firstname,String Lastname,String Dateofbirth,String Companyname,String Admincomment) 
	  {

	
		email.sendKeys(Email);
		password.sendKeys(Password);
		firstname.sendKeys(Firstname);
	    lastname.sendKeys(Lastname);
	    gender.click();
	    dob.sendKeys(Dateofbirth);
	    company.sendKeys(Companyname);
	    IsTaxExempt_checkbox.click();
	    Newsletter_checkbox.click();
	    Select select1 = new Select(Manager_of_vendor_dropdown);
	    select1.selectByVisibleText("Not a vendor");
	    active_checkbox.click();
	    admincommet.sendKeys(Admincomment);
	
	
	  }       
	
	public void Customerrolesdropdown(String value) {
	
		Select select = new Select(Customer_roles_dropdown);
	    select.selectByVisibleText(value);
	
	       }
	
	public void Manager_of_vendor_dropdown(String v1) {
	
		 Select select1 = new Select(Manager_of_vendor_dropdown);
		    select1.selectByVisibleText(v1);
	   }
      public void ClickOnSaveBtn() {

	             save_btn.click();
              }
	
          public void clickLogout() {
	            
        	  lnkLogout.click();
           }		

}
