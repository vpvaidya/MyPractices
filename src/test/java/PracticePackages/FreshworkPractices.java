package PracticePackages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.DataTable;
import junit.framework.Assert;

public class FreshworkPractices {
	
	WebDriver driver;
		
	/*@FindBy(how= How.XPATH,using=".//*[@class='button button-submit button--solid button--block']")
	private WebElement signUpButton;*/
		
	
	@BeforeClass
	public void App_Setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dvaidya\\Downloads\\chromedriver.exe");
		//System.getProperty("webdriver.chrome.driver");
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/freshsales-crm/signup/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	
	public void  SignUp_Validation()  throws Exception
	{
		driver.findElement(By.xpath(".//*[@class='button button-submit button--solid button--block']")).click();
		Thread.sleep(5000);
		
		List<WebElement> manadatoryList=driver.findElements(By.xpath(".//*[@class='error-wrapper']"));
				
		String[] manList = {"First name is required111","Last name is required","Please enter an email","Tell us where you work","Give your account a domain name",""};
		
	//	loop:
		for(WebElement we:manadatoryList)  
        {  
			
           List<String> genderList = new ArrayList<String>();
            for (WebElement G : manadatoryList ) {
                genderList.add(G.getText()); 
                System.out.println("Below Elements list ele "+ genderList.add(G.getText()));
                
                
            }
	/*		
         for (int i=0; i<manList.length; i++)
         {
             if (we.getText().equals(manList[i]))
             {
             System.out.println("Matched");
             //break loop;
            
             } else {
            	 
                 System.out.println(" Not Matched");
            	 
             }
          }
*/
        }  
		
      }
		
	
@AfterClass
	public void close_browser()
	{
	   driver.quit();
	      
	
	}
}
