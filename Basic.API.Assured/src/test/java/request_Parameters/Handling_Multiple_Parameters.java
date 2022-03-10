package request_Parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
public class Handling_Multiple_Parameters {
  @Test
  public void Handle_Muliple_Parameters() {
	  given()
	  		.baseUri("https://api.openweathermap.org/data/2.5")
	  		.queryParam("q", "London,uk")
	  		.queryParam("appid", "cc4f5603265d4b52cf4113cd1db8307b")
	  		.queryParam("mode", "xml").
	  	when()
	  		.get("/weather").
	  	then()
	  		.log().all()
	  		.statusCode(200);
	  
  }
  
  @Test
  public void Handle_Muliple_Parameters_Hashmap() {
	  
	  HashMap<String, Object> param = new HashMap<String, Object>();
	  param.put("q", "London,uk");
	  param.put("appid", "cc4f5603265d4b52cf4113cd1db8307b");
	  param.put("mode", "xml");
  
	  given()
	  		.baseUri("https://api.openweathermap.org/data/2.5")
	  		.queryParams(param).
	  	
	  	when()
	  		.get("/weather").
	  	then()
	  		.log().all()
	  		.statusCode(200);
}
}
