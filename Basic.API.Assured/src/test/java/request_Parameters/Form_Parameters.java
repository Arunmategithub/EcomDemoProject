package request_Parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Form_Parameters {
  @Test
  public void Form_Parameters() {
	  given()
		.baseUri("https://postman-echo.com")
		.contentType("application/x-www-form-urlencoded;charset=UTF-8")
		.formParam("name", "john")
		.formParam("sirname", "carter").
	when()
		.post("/post").
	then()
		.log().all()
		.statusCode(200);

  }
}
