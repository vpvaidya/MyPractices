package Framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Test {
	
	public int empid;
	//public final static boolean HEADLESS = Boolean.getBoolean("headless");
	
	
	public int  getEmpid()
	{
		return empid;
	}
	
	public void setEmpid(int Empid)
	{
		this.empid= Empid;
		
	}
	
	@FindBy(how=How.XPATH, using="")
	public WebElement userid;
	
	@FindBy(how= How.NAME, using="")
	public WebElement username;
	
	@FindBy(how=How.TAG_NAME, using="")
	public WebElement clickbutton;
	

}
