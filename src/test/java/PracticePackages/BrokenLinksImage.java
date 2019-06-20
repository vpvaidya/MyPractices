package PracticePackages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpConnection;
import org.apache.http.protocol.HttpContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksImage {

	 static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dvaidya\\Downloads\\chromedriver.exe");
		//System.getProperty("webdriver.chrome.driver");
		driver = new ChromeDriver();
		driver.get("https://makemysushi.com/404");
		driver.manage().window().maximize();
		List<WebElement> ihref= driver.findElements(By.tagName("a"));
		ihref.addAll(driver.findElements(By.tagName("img")));
		
		List<WebElement> activeElement = new ArrayList<WebElement>();
		
		System.out.println("Total size of links:" + ihref.size());
		for (int k=0; k<ihref.size();k++) 
		{
			System.out.println("Before Value of aTTRIBUTES:" + ihref.get(k).getAttribute("href"));
		if(ihref.get(k).getAttribute("href")!=null && (! ihref.get(k).getAttribute("href").contains("mailto")))
		{
			activeElement.add(ihref.get(k));
			
     	}
		
	//	System.out.println("After Value of aTTRIBUTES:" + ihref.get(k).getAttribute("href"));
	}
		System.out.println("Print Total size of Active links:" + activeElement.size());
		
		
		for (int J=0; J<activeElement.size();J++) {
			
			//HttpConnection connection = (HttpConnection)new URL(activeElement.get(J).getAttribute("href")).openConnection();
		
	
		HttpURLConnection conn = (HttpURLConnection) new URL(activeElement.get(J).getAttribute("href")).openConnection();
		conn.connect();
		String responce = conn.getResponseMessage();
		conn.disconnect();
		System.out.println("After Value of aTTRIBUTES:" + ihref.get(J).getAttribute("href")+ "-----"+responce );
		
	}
}
}