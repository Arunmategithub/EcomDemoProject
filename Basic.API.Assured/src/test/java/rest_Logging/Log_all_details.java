package rest_Logging;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Log_all_details {
  @Test
  public void Log_All_Details() {
	  given()
	  		.baseUri("https://restcountries.com/v3.1").
	  	when()
	  		.get("/alpha/US").
	  	then()
	  		.log().all();
  }
}
