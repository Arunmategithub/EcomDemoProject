package authentication_Auth;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Authentication {
  @Test
  public void Authentication_demo() {
	  
	  given()
	  		.baseUri("https://postman-echo.com")
	  		.auth().digest("postman", "password").
	  	when()
	  		.get("digest-auth"). 
	  	then()
	  		.log().all()
	  		.statusCode(200);
  }
}
