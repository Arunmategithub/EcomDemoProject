package request_Parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Multi_Value_Parameters {
  @Test
  public void Multi_Para() {
	  given()
		.baseUri("https://restcountries.com/v3.1")
		.queryParam("codes", "US,UZ,IN").
	when()
		.get("/alpha").
	then()
		.log().all()
		.statusCode(200);
	  
  }
}
