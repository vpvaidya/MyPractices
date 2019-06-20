package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageGenerator {
	
	public static BasePage CurrentPage;
	public WebDriver driver;
	
	//constructor
	public PageGenerator(WebDriver driver)
	{
		this.driver =driver;
	}
	
	public <TPage extends BasePage>TPage Getinstance(Class<TPage> pageClass)
	{
		Object obj = PageFactory.initElements(driver, pageClass);
		
		return pageClass.cast(obj);
	}
	
	
	

}
