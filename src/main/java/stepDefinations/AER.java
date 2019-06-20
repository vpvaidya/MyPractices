package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.AERLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AER {
	
	WebDriver driver;
			
	@Given("^user is landing to login page$")
	public void UserIsLandingToLogintoPage()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dvaidya\\Downloads\\chromedriver.exe");
		System.getProperty("webdriver.chrome.driver");
		driver = new ChromeDriver();
		driver.get("http://sndvmdwebawa002.azure.defra.cloud/");
		driver.manage().window().maximize();
		AERLogin Signin= new AERLogin(driver);
		Signin.logintoApps("user", "pass");
				
	}
	
	
	@Then ("^I click on Signin button$")
	public void clickonSignibutton()
	{
		AERLogin Signin= new AERLogin(driver);
		Signin.clickSignInButton();
	}


	

}
