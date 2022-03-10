package xml_JSON_schema_validation;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import org.testng.annotations.Test;

public class JSON_schema_validation {

	@Test
	public void json_schema_validation() {
		 given()
	  		.baseUri("https://api.openweathermap.org/data/2.5")
	  		.queryParam("q", "London,uk")
	  		.queryParam("appid", "cc4f5603265d4b52cf4113cd1db8307b")
	  		.queryParam("mode", "xml")
	  		.headers("User-Agent", "PostmanRuntime/7.29.0")
	  		.headers("Connection", "keep-alive").
	   when()											
		  		.get("/weather"). 
 	then()
		  		.log().all() 
		  		.statusCode(200);
	}

}
