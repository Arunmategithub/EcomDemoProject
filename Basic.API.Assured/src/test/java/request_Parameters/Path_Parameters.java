package request_Parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Path_Parameters {
  @Test
  public void Path_Parameters() {
	  given()
	  		.baseUri("https://restcountries.com/v3.1")
	  		.pathParam("currency", "usd").
	  	when()
	  		.get("/currency/{currency}").
	  	then()
	  		.log().all()
	  		.statusCode(200);
  }
}
