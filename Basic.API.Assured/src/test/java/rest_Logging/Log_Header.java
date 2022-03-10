package rest_Logging;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Log_Header {
	 @Test
	  public void Log_Header() {
		  given()
		  		.baseUri("https://restcountries.com/v3.1").
		  	when()
		  		.get("/alpha/US").
		  	then()
		  		.log().headers();
	  }
}
