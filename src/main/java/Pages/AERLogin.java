package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Framework.BasePage;

public class AERLogin extends BasePage {

	public AERLogin(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	String Appurl = "http://sndvmdwebawa002.azure.defra.cloud/";

	@FindBy(how = How.ID, using = "user_id")
	public WebElement Userid;

	@FindBy(how = How.ID, using = "password")
	public WebElement Password;

	@FindBy(how = How.ID, using = "continue")
	public WebElement BtnSignin;

	public void logintoApps(String iusername, String ipassword) 
	{
		Userid.sendKeys(iusername);
		Password.sendKeys(ipassword);

	}
	
	public void clickSignInButton() 
	{
		BtnSignin.click();

	}
}
