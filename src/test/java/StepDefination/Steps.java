/*package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");	
     	
		driver = new ChromeDriver(); 
     	
     	lp = new LoginPage(driver);
     	
     	driver.manage().window().maximize();	
	   
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		
		driver.get(url);
		
	   	}

	@Then("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		
	
		lp.setUserName(username);
		lp.setPassword(password);
		
	}

	@Then("User clicks on submit btn")
	public void user_clicks_on_submit_btn() {
		
	 lp.clickLogin();
	 
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String Title) {
		
		String tt=driver.getTitle();
		Assert.assertEquals(Title, tt);
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
*/