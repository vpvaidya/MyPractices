package RestAssuredAPI;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// simple we are checking status code of given api
	//@Test
	public void verifyTestStatusCode()
	{
		given().get("http://ergast.com/api/f1/drivers.json").then().statusCode(200);

	}

	// simple we are checking complete response in console with status code of given api
	//	@Test
		public void verifyTestStatusCodewithLog()
		{
			given().get("http://ergast.com/api/f1/drivers.json").
			then().statusCode(200).log().all();

		}
		
		// simple checking data equalTo 
		//	@Test
			public void verifyBodyParameterswithequlTomethod()
			{
				given().get("http://ergast.com/api/f1/drivers.json").
				then().body("MRData.DriverTable.Drivers.givenName", equalTo("Carlo"));

			}
			
	// simple checking data equalTo 
    //we can do like below method also
	//@Test
		public void verifyBodyParameters()
	{
		/*
		 * given().get("http://ergast.com/api/f1/drivers.json").
		 * then().body("MRData.DriverTable.Drivers.givenName", equalTo("Carlo"));
		 */
		given().expect().statusCode(200).body("MRData.DriverTable.Drivers.givenName", equalTo("Carlo")).
		when().get("http://ergast.com/api/f1/drivers.json");
	}
		
		// simple checking data equalTo 
 // @Test
	public void verifyBodyParameterswith_hasItems_method()
		{
			given().get("http://ergast.com/api/f1/drivers.json").
			then().body("MRData.DriverTable.Drivers.givenName", hasItems("carlo","George","Kenny"));

		}
   
 //  @Test
  	public void verifyBodyParameterswith_root_method()
  		{
  			given().get("http://ergast.com/api/f1/drivers.json").
  			then().root("MRData.xmlns.DriverTable.Drivers.find").
  			body("givenName", is("carlo")).body("familyName", is("Abate"));

  		}
  	

@Test
public void extractAndCheckSingleValue() {
         
    given().
    when().
        get("http://ergast.com/api/f1/2016/drivers.json").
    then().
       // assertThat().
        body("MRData.DriverTable.Drivers.familyName[-2]",equalTo("vettel"));
}


//@Test
public void extractAndCheckMultipleValues() {
         
    given().
    when().
        get("http://ergast.com/api/f1/2016/drivers.json").
    then().
        assertThat().
        body("MRData.DriverTable.Drivers.driverId",hasItems("alonso","button"));
}


//@BeforeTest
public void initPath() {
         
    RestAssured.rootPath = "MRData.DriverTable.Drivers";
}



//@Test
public void extractAndCheckMultipleValues1() {
         
    given().
    when().
        get("http://ergast.com/api/f1/2016/drivers.json").
    then().
        assertThat().
        body("driverId",hasItems("alonso","button")).log().all();
}


//@Test
public void extractAndCheckArraySliceSize() {
         
    given().
    when().
        get("http://ergast.com/api/f1/2016/drivers.json").
    then().
        assertThat().
        body("driverId[0..4]",hasSize(5));
}

		
}
