package request_Parameters;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Headers;

public class Extract_Response_Cookie {
  @Test
  public void Extract_Response_Cookie_demo() {
	  
		 Map<String,String> cookies = given()
			  		.baseUri("https://api.openweathermap.org/data/2.5")
			  		.queryParam("q", "London,uk")
			  		.queryParam("appid", "cc4f5603265d4b52cf4113cd1db8307b")
			  		.queryParam("mode", "xml").
			   when()											
				  		.get("/weather"). 
		    	then()
				  		.log().all() 
				  		.statusCode(200)
				  		.extract().cookies();
			 
			 System.out.println(cookies.get("charset"));
			 	 
	  }
  }

