package rest_Logging;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Log_Body_or_Header {
	 @Test
	  public void Log_body() {
		  given()
		  		.baseUri("https://restcountries.com/v3.1").
		  	when()
		  		.get("/alpha/US").
		  	then()
		  		.log().body();
	  }
	 
	
}
