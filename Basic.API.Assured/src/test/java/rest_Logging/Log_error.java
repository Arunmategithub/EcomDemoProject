package rest_Logging;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Log_error {
	 @Test
	  public void Log_Header() {
		  given()
		  		.baseUri("https://restcountries.com/v3.1").
		  	when()
		  		.get("/alpha/US").
		  	then()
		  		.log().ifError();
		  		//.log().ifStatusCodeIsEqualTo(400)
		  		//.log().ifStatusCodeIsEqualTo(200);
	  }
}
