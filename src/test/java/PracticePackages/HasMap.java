package PracticePackages;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HasMap {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//App_Setup();
		HashmapLogin();
	}
	//@Test
	public static HashMap<String, String> HashmapLogin()
	{
		HashMap<String, String> usermap = new HashMap<String, String>();
		usermap.put("admin", "adminuser_test@123");
		usermap.put("customer", "dinesh.vaidya@rediffmail.co.in_India@123");
		System.out.println(usermap);
		return usermap;
		
	}
	
	public static void App_Setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dvaidya\\Downloads\\chromedriver.exe");
		//System.getProperty("webdriver.chrome.driver");
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='signin']")).click();;
		
		String adminuser =HashmapLogin().get("admin");
		String [] splintuser= adminuser.split("_");
		
		driver.findElement(By.id("login1")).sendKeys(splintuser[0]);;
		driver.findElement(By.id("password")).sendKeys(splintuser[1]);;
		
	
		
	}
	//@Test
	public void Test()
	{
		
		 String[] exp = {"--Title--","Mr","Mrs","Miss","Ms","Dr","Prof"};
		 System.out.println("Before This is the value"+ Arrays.toString(exp));
		 
		    Arrays.sort(exp);
		    System.out.println("Sorted string array : "+Arrays.toString(exp));
		    
		    
	}
	
	@Test(dataProvider="browserStackData")
	public void Browserstack(Platform platform,String browserName,String browserVersion) throws MalformedURLException
	{
		String username = "dinesh552";
		String accessKey="iSMYgd6bAAQHneb5TpEq";
		String applUrl="https://"+ username+":"+ accessKey+"@hub.browserstack.com/wd/hub";
		
		DesiredCapabilities desCap = new DesiredCapabilities();
		desCap.setPlatform(platform);
		desCap.setBrowserName(browserName);
		desCap.setVersion(browserVersion);
		desCap.setCapability("browserstack.local", "false");	
		desCap.setCapability("browserstack.debug", "true");	
		desCap.setCapability("browserstack.console", "errors");
		desCap.setCapability("browserstack.networkLogs", "true");
		URL url = new URL(applUrl);
		WebDriver driver = new RemoteWebDriver(url, desCap);
		driver.get("https://www.softwaretestingmaterial.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String ExpResult = driver.getCurrentUrl();
		String ActResult = "https://www.softwaretestingmaterial.com/";
		
		Assert.assertEquals("ExpResult not equals to ActResult ", ExpResult, ActResult);
		driver.quit();
		
	}
	
	@DataProvider(name="browserStackData")
	public Object[][] getData()
	{
		
		Object[][] testData =  new Object[][]
		{
			{Platform.MAC,"firefox","57.0"},
			{Platform.WINDOWS,"chrome","62.0"},
			{Platform.WINDOWS,"firefox","57.0"},
			
			
				
		};
		return testData;
		
	}
	
}

