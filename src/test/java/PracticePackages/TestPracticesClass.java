package PracticePackages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPracticesClass {
	
	
	
	WebDriver driver;
	@Test
	public void App_Setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dvaidya\\Downloads\\chromedriver.exe");
		//System.getProperty("webdriver.chrome.driver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//input[@name='q']")).sendKeys("Testing");;
		List<WebElement> lst =driver.findElements(By.xpath(".//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("list of element:"+ lst.size());
		
		for(int i=0; i<lst.size();i++) 
		{
			System.out.println("Name of element:"+ lst.get(i).getText());
			
			if(lst.get(i).getText().contains("testing eggs"))
			{
				lst.get(i).click();
				break;
			}
		}
	}
	
	
		
	//@Test(enabled=false)
	public void ArraytoarrayList1()
	{
		
		String [] simplearray = {"din","vih","pri"};
		
		ArrayList<String> arryList = new ArrayList<>(Arrays.asList(simplearray));
		arryList.add("mega");
		
		System.out.println("New array list"+ arryList);
		System.out.println("New array list"+ arryList.get(3));
	}

	//@Test
	public void ArraytoArraylist() {
		
		String [] myArray = {"vih","Meg","Pri","din"};
		
	   ArrayList<String> myArrayList = new ArrayList<String>();
	   Collections.addAll(myArrayList, myArray);
	   myArrayList.add("ush");
	   System.out.println("List of array"+ myArrayList);
		
	}
	
	
}
