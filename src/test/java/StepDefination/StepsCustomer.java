package StepDefination;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import PageObject.NewCustomerCreation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepsCustomer {
	
	
	public WebDriver driver;
	public NewCustomerCreation lp;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");	
     	
		driver = new ChromeDriver(); 
     	
		lp = new NewCustomerCreation(driver);
     	
     	driver.manage().window().maximize();	
	   
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		
		driver.get(url);
		
	   	}

	@Then("User enters Username  and Password")
	public void user_enters_Username_and_Password(DataTable user) {
		
	List<Map<String, String>> users = user.asMaps(String.class,String.class);
		   
     for(Map<String,String> data:users) {
			
	    lp.setUserName(data.get("Username"));
		lp.setPassword(data.get("Password"));
    }	
	}

	@Then("User clicks on submit btn")
	public void user_clicks_on_submit_btn() {
		
	 lp.clickLogin();
	 
	}

	@Then("User clicks on customer link")
	public void user_clicks_on_customer_link() {
		
		lp.ClickCustomerBtn();
	   
	}

	@Then("User clicks on add new customer link")
	public void user_clicks_on_add_new_customer_link() {
	
	lp.ClickAddNewCustomer();
	}
	
	

	@Then("User enters details of customer")
	
   public void user_enters_details_of_customer(DataTable table) throws InterruptedException {
		
   List<Map<String, String>> data = table.asMaps(String.class,String.class);
   
   for(Map<String,String> data1:data) {
	
	lp.EnterNewDetailsofCustomer(data1.get("Email"),data1.get("Password"),data1.get("Firstname"),data1.get("Lastname"),data1.get("Dateofbirth"),data1.get("Companyname"),data1.get("Admincomment"));
  
	Thread.sleep(9000);
	
    lp.ClickOnSaveBtn();
    
    Thread.sleep(8000);
    
    lp.ClickAddNewCustomer();
   }
   }
	
	@Then("User save the details")
	public void user_save_the_details() {
		
	//	lp.ClickOnSaveBtn();
	}

	@Then("User cliks on logout link")
	public void user_cliks_on_logout_link() {

	lp.clickLogout();
	
	}

	@Then("Close browser")
	public void close_browser() {
	
	driver.quit();

}
}