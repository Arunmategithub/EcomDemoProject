package request_Parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Request_Parameters {
  @Test
  public void Request_Parameters() {
	  given()
	  		.baseUri("https://restcountries.com/v3.1")
	  		.param("fullText", true).					//if false only india details display
	  	when()											// if True then shows all india related info
	  		.get("/name/india"). 
	  	then()
	  		.log().all() 
	  		.statusCode(200);
  }
  
  
}
