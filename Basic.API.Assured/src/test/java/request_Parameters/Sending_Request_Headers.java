package request_Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
public class Sending_Request_Headers {
  @Test
  public void Sending_Header_Request() {
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
  
  @Test
  public void Sending_Header_Object() {
	  HashMap<String, Object> headers = new HashMap<String, Object>();
	  		headers.put("User-Agent", "PostmanRuntime/7.29.0");
	  		headers.put("Connection", "keep-alive");
	  given()
	  		.baseUri("https://api.openweathermap.org/data/2.5")
	  		.queryParam("q", "London,uk")
	  		.queryParam("appid", "cc4f5603265d4b52cf4113cd1db8307b")
	  		.queryParam("mode", "xml")
	  		.headers(headers).
	   when()											
		  		.get("/weather"). 
    	then()
		  		.log().all() 
		  		.statusCode(200);
  }
}

