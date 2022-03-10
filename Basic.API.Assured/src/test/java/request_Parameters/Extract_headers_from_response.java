package request_Parameters;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import io.restassured.http.Headers;

public class Extract_headers_from_response {
	@Test
	  public void Validating_Response_Header() {
		 Headers headers = given()
		  		.baseUri("https://api.openweathermap.org/data/2.5")
		  		.queryParam("q", "London,uk")
		  		.queryParam("appid", "cc4f5603265d4b52cf4113cd1db8307b")
		  		.queryParam("mode", "xml").
		   when()											
			  		.get("/weather"). 
	    	then()
			  		//.log().all() 
			  		.statusCode(200)
			  		.extract().headers();
		 
		 System.out.println(headers.getValue("Content-Type"));
		 System.out.println(headers.getValue("Connection"));
		 System.out.println(headers.getValue("Content-Length"));	 
  }
}
