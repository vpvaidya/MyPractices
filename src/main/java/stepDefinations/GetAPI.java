package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.hamcrest.core.Is;

public class GetAPI {
	

@Given("^I want to perform get opreation for \"([^\"]*)\"$")
	public void iwanttoperformgetopreationfor(String url)
	{
		given().contentType(ContentType.JSON);
				
	}
	
	@Then("^I perform get for the series number \"([^\"]*)\"$")
	public void iperformgetfortheseriesnumber(String seriesnumber)
	{
		when().get(String.format("http://ergast.com/api/f1/drivers", seriesnumber)).
		then().
		statusCode(200);
		
		
			
	}
	
	

	
}
