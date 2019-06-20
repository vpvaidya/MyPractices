package stepDefinations;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginwithDatatable {
	
	/*WebDriver driver;

	@Given("^user is already login page$")
	public void use_is_already_login_page() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dvaidya\\Downloads\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dvaidya\\Downloads\\chromedriver.exe");
		System.getProperty("webdriver.chrome.driver");
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com");
		driver.manage().window().maximize();
	}

	@When("^title of Page is Free CRM$")
	public void title_of_Page_is_Free_CRM() {
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals("Cogmento CRM", Title);
	}
	//This two type regular expression we can use
	//\"(.*)\" and \"(.*)\"$"
	//\"([^\"]*)\" and \"([^\"]*)\"$"
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable LoginCredentials) {
		java.util.List<java.util.List<String>> data =  LoginCredentials.raw();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));		
		
	}
	
	@Then("^user click on ligin button$")
	public void user_click_on_ligin_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//div[text()='Login']")).click();;
	    
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	    
	}

*/
	
}
