package request_Parameters;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Validating_Response_Header {
	@Test
	  public void Validating_Response_Header() {
		  given()
		  		.baseUri("https://api.openweathermap.org/data/2.5")
		  		.queryParam("q", "London,uk")
		  		.queryParam("appid", "cc4f5603265d4b52cf4113cd1db8307b")
		  		.queryParam("mode", "xml").
		   when()											
			  		.get("/weather"). 
	    	then()
			  		.log().all() 
			  		.statusCode(200)
			  		.header("Connection", "keep-alive");
	  }
}
